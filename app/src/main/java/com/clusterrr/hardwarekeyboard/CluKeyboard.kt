package com.clusterrr.hardwarekeyboard

import android.inputmethodservice.InputMethodService
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList
import android.provider.Settings
import java.lang.Exception

class CluKeyboard : InputMethodService(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    // Keys mappings
    private val mapping = RussianMappings()

    private var altLanguage = false
    private var fnLock = false
    private var capsLock = false
    private val keysPressed = ArrayList<Int>()

    internal var textViewLanguage: TextView? = null
    internal var switchCapsLock: Switch? = null
    internal var switchFnLock: Switch? = null

    override fun onEvaluateFullscreenMode(): Boolean {
        return false
    }

    override fun onCreateInputView(): View {
        val inputView = layoutInflater.inflate(R.layout.keyboard_layout, null)
        textViewLanguage = inputView.findViewById(R.id.textViewLanguage)
        switchCapsLock = inputView.findViewById(R.id.switchCapsLock)
        switchFnLock = inputView.findViewById(R.id.switchFnLock)
        textViewLanguage!!.setOnClickListener(this)
        switchCapsLock!!.setOnCheckedChangeListener(this)
        switchFnLock!!.setOnCheckedChangeListener(this)
        updateLangage()
        updateFnFixSwitch()
        updateCapsLockSwitch()
        return inputView
    }

    private fun updateLangage(): String {
        var languageName: String? = null
        if (!altLanguage)
            languageName = "EN"
        else
            languageName = mapping.ALT_LANGUAGE_NAME
        if (textViewLanguage != null)
            textViewLanguage!!.text = languageName
        return languageName
    }

    fun toggleLanguage() {
        if (mapping.ALT_LANGUAGE_NAME != null) {
            altLanguage = !altLanguage
            val languageName = updateLangage()
            Toast.makeText(this, languageName, Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateFnFixSwitch() {
        if (switchFnLock == null)
            return
        if (switchFnLock!!.isChecked != fnLock) {
            switchFnLock!!.setOnCheckedChangeListener(null)
            switchFnLock!!.isChecked = fnLock
            switchFnLock!!.setOnCheckedChangeListener(this)
        }
    }

    fun toggleFnLock() {
        if (!fnLock) {
            fnLock = true
            Toast.makeText(this, "FN Lock: on", Toast.LENGTH_SHORT).show()
        } else {
            fnLock = false
            Toast.makeText(this, "FN Lock: off", Toast.LENGTH_SHORT).show()
        }
        updateFnFixSwitch()
    }

    private fun updateCapsLockSwitch() {
        if (switchCapsLock == null)
            return
        if (switchCapsLock!!.isChecked != capsLock)
            switchCapsLock!!.isChecked = capsLock
    }

    private fun shouldUseScanCodes(): Boolean {
        val packageName = currentInputEditorInfo.packageName
        return packageName in mapping.SCANCODE_ONLY_APPS
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        Log.d("keyboard", " down key_code=" + event.keyCode
                + ", scan_code=" + event.scanCode
                + ", device_code=" + event.deviceId
                + ", repeat=" + event.repeatCount
                + ", shift=" + event.isShiftPressed
                + ", ctrl=" + event.isCtrlPressed
                + ", alt=" + event.isAltPressed
        )

        val scanCode = event.scanCode

        // Hide keyboard on back
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            updateInputViewShown()
            val current = isInputViewShown
            if (current) {
                requestHideSelf(0)
                return true
            }
        }

        if (scanCode <= 0 || event.deviceId <= 0)
            return false

        // Handle caps lock to show current status
        if (scanCode == ScanCodes.SCANCODE_CAPS_LOCK) {
            if (!keysPressed.contains(ScanCodes.SCANCODE_CAPS_LOCK)) {
                capsLock = !event.isCapsLockOn
                if (capsLock)
                    Toast.makeText(this, "Сaps Lock: ON", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Caps Lock: off", Toast.LENGTH_SHORT).show()
            }
        } else {
            capsLock = event.isCapsLockOn
        }
        updateCapsLockSwitch()

        // Toggle language
        if (!shouldUseScanCodes() && checkCombinations(mapping.LANGUAGE_KEYS, scanCode)) {
            keysPressed.add(scanCode) // do not repeat
            toggleLanguage()
            return true
        }

        // Toggle FN fix
        if (checkCombinations(mapping.FN_LOCK_KEYS, scanCode)) {
            keysPressed.add(scanCode) // do not repeat
            toggleFnLock()
            return true
        }

        // Toggle GUI
        if (checkCombinations(mapping.SHOW_HIDE_KEYS, scanCode)) {
            keysPressed.add(scanCode) // do not repeat
            toggleVisibility()
            return true
        }

        // Brightness down
        if (checkCombinations(mapping.BRIGHTNESS_DOWN_KEYS, scanCode)) {
            adjustBrightness(-5)
            return true
        }

        // Brightness up
        if (checkCombinations(mapping.BRIGHTNESS_UP_KEYS, scanCode)) {
            adjustBrightness(5)
            return true
        }

        // Add scancode to list of current keys
        if (!keysPressed.contains(scanCode)) {
            keysPressed.add(scanCode)
        }

        // Ignore further actions for FN key
        if (scanCode == mapping.FN_KEY) {
            return true
        }

        // Get mapping for key
        val key = mapping.getKeyMapping(scanCode)
        if (key != null) {

            // Is the FN key hold?
            if (keysPressed.contains(mapping.FN_KEY) xor (fnLock && key.FnFixSupport)) {
                // Does key has some FN-function?
                if (key.FnScanCode != 0 || key.FnKeyCode != 0) {
                    sendKeyCode(event, key.FnKeyCode, key.FnScanCode)
                    return true
                }
            }

            // Does the key have an alternative function?
            if (key.ReplaceKeyCode != 0 || key.ReplaceScanCode != 0) {
                sendKeyCode(event, key.ReplaceKeyCode, key.ReplaceScanCode)
                return true
            }

            // Is it alternative language?
            if (!shouldUseScanCodes() // Workaround for some apps: send scancode only
                    && altLanguage && !event.isAltPressed && !event.isCtrlPressed) {
                val shift = event.isShiftPressed xor (event.isCapsLockOn && !key.AltLanguageIgnoreCapsLock)
                var text: String? = null
                if (!shift)
                    text = key.AltLanguageChar
                else
                    text = key.AltLanguageShiftChar
                // Send keypresses as text
                if (text != null) {
                    sendText(text)
                    return true
                }
            }

            // Do not alter key function
        }

        // Workaround for some apps: send scancode only
        if (shouldUseScanCodes()) {
            sendScanCode(event)
            return true
        }

        // Passthru this key without overrides
        return false
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        Log.d("keyboard", " up key_code=" + event.keyCode
                + ", scan_code=" + event.scanCode
                + ", device_code=" + event.deviceId
                + ", repeat=" + event.repeatCount
                + ", shift=" + event.isShiftPressed
                + ", ctrl=" + event.isCtrlPressed
                + ", alt=" + event.isAltPressed
        )

        val scanCode = event.scanCode

        if (scanCode <= 0 || event.deviceId <= 0)
            return false

        if (keysPressed.contains(scanCode))
            keysPressed.remove(scanCode)

        if (scanCode == mapping.FN_KEY) {
            return true
        }

        val key = mapping.getKeyMapping(scanCode)
        if (key != null) {

            if (keysPressed.contains(mapping.FN_KEY) || fnLock && key.FnFixSupport) {
                if (key.FnScanCode != 0 || key.FnKeyCode != 0) {
                    sendKeyCode(event, key.FnKeyCode, key.FnScanCode)
                    return true
                }
            }

            if (key.ReplaceKeyCode != 0 || key.ReplaceScanCode != 0) {
                sendKeyCode(event, key.ReplaceKeyCode, key.ReplaceScanCode)
                return true
            }

            if (shouldUseScanCodes()) {
                sendScanCode(event)
                return true
            }

            if (altLanguage && !event.isAltPressed && !event.isCtrlPressed) {
                val shift = event.isShiftPressed xor (event.isCapsLockOn && !key.AltLanguageIgnoreCapsLock)
                var text: String? = null
                if (!shift)
                    text = key.AltLanguageChar
                else
                    text = key.AltLanguageShiftChar
                if (text != null) {
                    //sendText(text);
                    return true
                }
            }

        }

        if (shouldUseScanCodes()) {
            sendScanCode(event)
            return true
        }

        return false
    }

    private fun checkCombinations(combinations: Array<IntArray>, scanCode: Int): Boolean {
        for (c in combinations.indices) {
            val combination = combinations[c]
            if (combination.size - 1 != keysPressed.size)
                continue
            var matched = true
            for (k in combination.indices) {
                if (!(scanCode != combination[k] && keysPressed.contains(combination[k]) || scanCode == combination[k] && !keysPressed.contains(combination[k]))) {
                    matched = false
                    break
                }
            }
            if (matched) {
                if (keysPressed.contains(scanCode))
                    keysPressed.add(scanCode)
                return true
            }
        }
        return false
    }

    private fun sendKeyCode(sourceEvent: KeyEvent, keyCode: Int, scanCode: Int) {
        var keyCode = keyCode
        val ic = currentInputConnection

        if (shouldUseScanCodes() && scanCode != 0)
            keyCode = 0
        val event = KeyEvent(sourceEvent.downTime, sourceEvent.eventTime, sourceEvent.action,
                keyCode, sourceEvent.repeatCount, sourceEvent.metaState,
                sourceEvent.deviceId, scanCode,
                0,
                sourceEvent.source)
        ic.sendKeyEvent(event)
    }

    private fun sendScanCode(sourceEvent: KeyEvent) {
        val ic = currentInputConnection
        val event = KeyEvent(sourceEvent.downTime, sourceEvent.eventTime, sourceEvent.action,
                0, sourceEvent.repeatCount, sourceEvent.metaState,
                sourceEvent.deviceId, sourceEvent.scanCode,
                0,
                sourceEvent.source)
        ic.sendKeyEvent(event)
    }

    private fun sendText(text: String) {
        val ic = currentInputConnection
        ic.commitText(text, 1)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.textViewLanguage -> toggleLanguage()
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView.id) {
            R.id.switchCapsLock -> updateCapsLockSwitch()
            R.id.switchFnLock -> toggleFnLock()
        }
    }

    fun toggleVisibility() {
        updateInputViewShown()
        val current = isInputViewShown
        if (!current)
            requestShowSelf(0)
        else
            requestHideSelf(0)
    }

    private fun adjustBrightness(delta: Int) {
        try {
            var brightness = Settings.System.getInt(getContentResolver(),
                    Settings.System.SCREEN_BRIGHTNESS, 0)
            brightness += delta
            Settings.System.putInt(getContentResolver(),
                    Settings.System.SCREEN_BRIGHTNESS, brightness);
        }
        catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
