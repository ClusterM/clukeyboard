package com.clusterrr.hardwarekeyboard

import android.view.KeyEvent

import java.util.HashMap

class RussianMappings : KeyboardMapping() {
    // Name of alternative language
    override val ALT_LANGUAGE_NAME = "RU"
    // FN key
    override val FN_KEY = ScanCodes.SCANCODE_SHOW_KEYBOARD
    // Key combinations to switch languages
    override val LANGUAGE_KEYS = arrayOf(
            intArrayOf(ScanCodes.SCANCODE_LANGUAGE),
            intArrayOf(ScanCodes.SCANCODE_SHIFT_LEFT, ScanCodes.SCANCODE_CTRL_LEFT)
    )
    // Key combinations to enable/disable FN Lock
    override val FN_LOCK_KEYS = arrayOf(
            intArrayOf(ScanCodes.SCANCODE_SHOW_KEYBOARD, ScanCodes.SCANCODE_SPACE)
    )
    // Key combinations to show/hide GUI
    override val SHOW_HIDE_KEYS = arrayOf(intArrayOf(ScanCodes.SCANCODE_SHOW_KEYBOARD, ScanCodes.SCANCODE_TAB))
    // Key combinations to decrease brightness
    override val BRIGHTNESS_DOWN_KEYS = arrayOf(intArrayOf(ScanCodes.SCANCODE_SHOW_KEYBOARD, ScanCodes.SCANCODE_J))
    // Key combinations to increase brightness
    override val BRIGHTNESS_UP_KEYS = arrayOf(intArrayOf(ScanCodes.SCANCODE_SHOW_KEYBOARD, ScanCodes.SCANCODE_K))
    // List of scancode-only applications
    override val SCANCODE_ONLY_APPS = arrayOf(
        "com.microsoft.rdc.android"
    )

    internal var mapping: HashMap<Int, KeyMapping> = object : HashMap<Int, KeyMapping>() {
        init {
            put(ScanCodes.SCANCODE_GRAVE,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_ESCAPE
                            FnScanCode = ScanCodes.SCANCODE_ESCAPE
                            FnFixSupport = true
                            AltLanguageChar = "ё"
                            AltLanguageShiftChar = "Ё"
                        }
                    })
            put(ScanCodes.SCANCODE_1,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F1
                            FnScanCode = ScanCodes.SCANCODE_F1
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_2,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F2
                            FnScanCode = ScanCodes.SCANCODE_F2
                            FnFixSupport = true
                            AltLanguageShiftChar = "\""
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_3,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F3
                            FnScanCode = ScanCodes.SCANCODE_F3
                            FnFixSupport = true
                            AltLanguageShiftChar = "№"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_4,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F4
                            FnScanCode = ScanCodes.SCANCODE_F4
                            FnFixSupport = true
                            AltLanguageShiftChar = ";"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_5,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F5
                            FnScanCode = ScanCodes.SCANCODE_F5
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_6,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F6
                            FnScanCode = ScanCodes.SCANCODE_F6
                            FnFixSupport = true
                            AltLanguageShiftChar = ":"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_7,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F7
                            FnScanCode = ScanCodes.SCANCODE_F7
                            FnFixSupport = true
                            AltLanguageShiftChar = "?"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_8,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F8
                            FnScanCode = ScanCodes.SCANCODE_F8
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_9,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F9
                            FnScanCode = ScanCodes.SCANCODE_F9
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_0,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F10
                            FnScanCode = ScanCodes.SCANCODE_F10
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_MINUS,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F11
                            FnScanCode = ScanCodes.SCANCODE_F11
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_EQUALS,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_F12
                            FnScanCode = ScanCodes.SCANCODE_F12
                            FnFixSupport = true
                        }
                    })
            put(ScanCodes.SCANCODE_Q,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "й"
                            AltLanguageShiftChar = "Й"
                            FnKeyCode = KeyEvent.KEYCODE_BACK
                        }
                    })
            put(ScanCodes.SCANCODE_W,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "ц"
                            AltLanguageShiftChar = "Ц"
                        }
                    })
            put(ScanCodes.SCANCODE_E,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "у"
                            AltLanguageShiftChar = "У"
                        }
                    })
            put(ScanCodes.SCANCODE_R,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "к"
                            AltLanguageShiftChar = "К"
                        }
                    })
            put(ScanCodes.SCANCODE_T,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "е"
                            AltLanguageShiftChar = "Е"
                        }
                    })
            put(ScanCodes.SCANCODE_Y,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "н"
                            AltLanguageShiftChar = "Н"
                        }
                    })
            put(ScanCodes.SCANCODE_U,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "г"
                            AltLanguageShiftChar = "Г"
                        }
                    })
            put(ScanCodes.SCANCODE_I,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "ш"
                            AltLanguageShiftChar = "Ш"
                        }
                    })
            put(ScanCodes.SCANCODE_O,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_NUMPAD_SUBTRACT
                            FnScanCode = ScanCodes.SCANCODE_NUMPAD_SUBTRACT
                            FnFixSupport = false
                            AltLanguageChar = "щ"
                            AltLanguageShiftChar = "Щ"
                        }
                    })
            put(ScanCodes.SCANCODE_P,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_NUMPAD_ADD
                            FnScanCode = ScanCodes.SCANCODE_NUMPAD_ADD
                            FnFixSupport = false
                            AltLanguageChar = "з"
                            AltLanguageShiftChar = "З"
                        }
                    })
            put(ScanCodes.SCANCODE_LEFT_BRACKET,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_NUMPAD_DIVIDE
                            FnScanCode = ScanCodes.SCANCODE_NUMPAD_DIVIDE
                            FnFixSupport = false
                            AltLanguageChar = "х"
                            AltLanguageShiftChar = "Х"
                        }
                    })
            put(ScanCodes.SCANCODE_RIGHT_BRACKET,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_NUMPAD_MULTIPLY
                            FnScanCode = ScanCodes.SCANCODE_NUMPAD_MULTIPLY
                            FnFixSupport = false
                            AltLanguageChar = "ъ"
                            AltLanguageShiftChar = "Ъ"
                        }
                    })
            put(ScanCodes.SCANCODE_A,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "ф"
                            AltLanguageShiftChar = "Ф"
                        }
                    })
            put(ScanCodes.SCANCODE_S,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "ы"
                            AltLanguageShiftChar = "Ы"
                        }
                    })
            put(ScanCodes.SCANCODE_D,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "в"
                            AltLanguageShiftChar = "В"
                        }
                    })
            put(ScanCodes.SCANCODE_F,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "а"
                            AltLanguageShiftChar = "А"
                        }
                    })
            put(ScanCodes.SCANCODE_G,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "п"
                            AltLanguageShiftChar = "П"
                        }
                    })
            put(ScanCodes.SCANCODE_H,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "р"
                            AltLanguageShiftChar = "Р"
                        }
                    })
            put(ScanCodes.SCANCODE_J,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "о"
                            AltLanguageShiftChar = "О"
                        }
                    })
            put(ScanCodes.SCANCODE_K,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "л"
                            AltLanguageShiftChar = "Л"
                        }
                    })
            put(ScanCodes.SCANCODE_L,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_VOLUME_MUTE
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_MUTE;
                            FnFixSupport = false
                            AltLanguageChar = "д"
                            AltLanguageShiftChar = "Д"
                        }
                    })
            put(ScanCodes.SCANCODE_SEMICOLON,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_VOLUME_DOWN
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_DOWN;
                            FnFixSupport = false
                            AltLanguageChar = "ж"
                            AltLanguageShiftChar = "Ж"
                        }
                    })
            put(ScanCodes.SCANCODE_APOSTROPHE,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_VOLUME_UP
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_UP;
                            FnFixSupport = false
                            AltLanguageChar = "э"
                            AltLanguageShiftChar = "Э"
                        }
                    })
            put(ScanCodes.SCANCODE_Z,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "я"
                            AltLanguageShiftChar = "Я"
                        }
                    })
            put(ScanCodes.SCANCODE_X,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "ч"
                            AltLanguageShiftChar = "Ч"
                        }
                    })
            put(ScanCodes.SCANCODE_C,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "с"
                            AltLanguageShiftChar = "С"
                        }
                    })
            put(ScanCodes.SCANCODE_V,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "м"
                            AltLanguageShiftChar = "М"
                        }
                    })
            put(ScanCodes.SCANCODE_B,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "и"
                            AltLanguageShiftChar = "И"
                        }
                    })
            put(ScanCodes.SCANCODE_N,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "т"
                            AltLanguageShiftChar = "Т"
                        }
                    })
            put(ScanCodes.SCANCODE_M,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MEDIA_REWIND
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_REWIND;
                            FnFixSupport = false
                            AltLanguageChar = "ь"
                            AltLanguageShiftChar = "Ь"
                        }
                    })
            put(ScanCodes.SCANCODE_COMMA,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MEDIA_FAST_FORWARD
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_FAST_FORWARD;
                            FnFixSupport = false
                            AltLanguageChar = "б"
                            AltLanguageShiftChar = "Б"
                        }
                    })
            put(ScanCodes.SCANCODE_PERIOD,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MEDIA_PREVIOUS
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_PREVIOUS;
                            FnFixSupport = false
                            AltLanguageChar = "ю"
                            AltLanguageShiftChar = "Ю"
                        }
                    })
            put(ScanCodes.SCANCODE_BACKSLASH,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_INSERT
                            AltLanguageShiftChar = "/"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_BACKSLASH_LEFT,
                    object : KeyMapping() {
                        init {
                            AltLanguageShiftChar = "/"
                            AltLanguageIgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_SLASH,
                    object : KeyMapping() {
                        init {
                            AltLanguageChar = "."
                            AltLanguageShiftChar = ","
                            AltLanguageIgnoreCapsLock = true
                            FnKeyCode = KeyEvent.KEYCODE_MEDIA_NEXT
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_NEXT;
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_SHIFT_RIGHT,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_PLAY_PAUSE;
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_LEFT,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MOVE_HOME
                            FnScanCode = ScanCodes.SCANCODE_MOVE_HOME
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_RIGHT,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MOVE_END
                            FnScanCode = ScanCodes.SCANCODE_MOVE_END
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_UP,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_PAGE_UP
                            FnScanCode = ScanCodes.SCANCODE_PAGE_UP
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_DOWN,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_PAGE_DOWN
                            FnScanCode = ScanCodes.SCANCODE_PAGE_DOWN
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_DEL,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_FORWARD_DEL
                            FnScanCode = ScanCodes.SCANCODE_FORWARD_DEL
                            FnFixSupport = false
                        }
                    })
            put(ScanCodes.SCANCODE_ALT_RIGHT,
                    object : KeyMapping() {
                        init {
                            FnKeyCode = KeyEvent.KEYCODE_MENU
                            FnScanCode = ScanCodes.SCANCODE_MENU
                            FnFixSupport = false
                        }
                    })
        }
    }

    override fun getKeyMapping(scanCode: Int): KeyMapping? {
        return if (mapping.containsKey(scanCode)) mapping[scanCode] else null
    }
}
