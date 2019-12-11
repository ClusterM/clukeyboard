package com.clusterrr.hardwarekeyboard

abstract class KeyboardMapping {
    // Name of alternative language
    open val ALT_LANGUAGE_NAME: String? = null
    // FN key
    open val FN_KEY: Int = -1
    // Key combinations to switch languages
    open val LANGUAGE_KEYS: Array<IntArray> = arrayOf()
    // Key combinations to enable/disable FN Lock
    open val FN_LOCK_KEYS: Array<IntArray> = arrayOf()
    // Key combinations to show/hide GUI
    open val SHOW_HIDE_KEYS: Array<IntArray> = arrayOf()
    // Key combinations to decrease brightness
    open val BRIGHTNESS_DOWN_KEYS: Array<IntArray> = arrayOf()
    // Key combinations to increase brightness
    open val BRIGHTNESS_UP_KEYS: Array<IntArray> = arrayOf()
    // List of scancode-only applications
    open val SCANCODE_ONLY_APPS: Array<String> = arrayOf()
    // Method to get key mapping
    abstract fun getKeyMapping(scanCode: Int): KeyMapping?
}