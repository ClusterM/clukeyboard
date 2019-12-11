package com.clusterrr.hardwarekeyboard

object ScanCodes {
    val SCANCODE_VOLUME_MUTE = 113
    val SCANCODE_VOLUME_DOWN = 114
    val SCANCODE_VOLUME_UP = 115
    val SCANCODE_MEDIA_NEXT = 163
    val SCANCODE_MEDIA_PLAY_PAUSE = 164
    val SCANCODE_MEDIA_PREVIOUS = 165
    val SCANCODE_SEARCH = 217
    val SCANCODE_DPAD_LEFT = 105
    val SCANCODE_DPAD_RIGHT = 106
    val SCANCODE_DPAD_UP = 103
    val SCANCODE_DPAD_DOWN = 108

    val SCANCODE_ESCAPE = 1
    val SCANCODE_F1 = 59
    val SCANCODE_F2 = 60
    val SCANCODE_F3 = 61
    val SCANCODE_F4 = 62
    val SCANCODE_F5 = 63
    val SCANCODE_F6 = 64
    val SCANCODE_F7 = 65
    val SCANCODE_F8 = 66
    val SCANCODE_F9 = 67
    val SCANCODE_F10 = 68
    val SCANCODE_F11 = 87
    val SCANCODE_F12 = 88
    val SCANCODE_FORWARD_DEL = 111

    val SCANCODE_GRAVE = 41
    val SCANCODE_1 = 2
    val SCANCODE_2 = 3
    val SCANCODE_3 = 4
    val SCANCODE_4 = 5
    val SCANCODE_5 = 6
    val SCANCODE_6 = 7
    val SCANCODE_7 = 8
    val SCANCODE_8 = 9
    val SCANCODE_9 = 10
    val SCANCODE_0 = 11
    val SCANCODE_DEL = 14

    val SCANCODE_TAB = 15
    val SCANCODE_Q = 16
    val SCANCODE_W = 17
    val SCANCODE_E = 18
    val SCANCODE_R = 19
    val SCANCODE_T = 20
    val SCANCODE_Y = 21
    val SCANCODE_U = 22
    val SCANCODE_I = 23
    val SCANCODE_O = 24
    val SCANCODE_P = 25
    val SCANCODE_BACKSLASH = 43
    val SCANCODE_BACKSLASH_LEFT = 86

    val SCANCODE_CAPS_LOCK = 58
    val SCANCODE_A = 30
    val SCANCODE_S = 31
    val SCANCODE_D = 32
    val SCANCODE_F = 33
    val SCANCODE_G = 34
    val SCANCODE_H = 35
    val SCANCODE_J = 36
    val SCANCODE_K = 37
    val SCANCODE_L = 38
    val SCANCODE_ENTER = 28

    val SCANCODE_SHIFT_LEFT = 42
    val SCANCODE_Z = 44
    val SCANCODE_X = 45
    val SCANCODE_C = 46
    val SCANCODE_V = 47
    val SCANCODE_B = 48
    val SCANCODE_N = 49
    val SCANCODE_M = 50
    val SCANCODE_COMMA = 51
    val SCANCODE_PERIOD = 52
    val SCANCODE_SEMICOLON = 39
    val SCANCODE_APOSTROPHE = 40
    val SCANCODE_SHIFT_RIGHT = 54

    val SCANCODE_CTRL_LEFT = 29
    val SCANCODE_SHOW_KEYBOARD = 706
    val SCANCODE_ALT_LEFT = 56
    val SCANCODE_SPACE = 57
    val SCANCODE_LANGUAGE = 122
    val SCANCODE_ALT_RIGHT = 100
    val SCANCODE_MINUS = 12
    val SCANCODE_EQUALS = 13
    val SCANCODE_LEFT_BRACKET = 26
    val SCANCODE_RIGHT_BRACKET = 27
    val SCANCODE_SLASH = 53

    val SCANCODE_PAGE_UP = 104
    val SCANCODE_PAGE_DOWN = 109
    val SCANCODE_MOVE_HOME = 102
    val SCANCODE_MOVE_END = 107

    /**
     * Key code constant: System Request / Print Screen key.
     */
    val SCANCODE_SYSRQ = 84
    /**
     * Scan code constant: Scroll Lock key.
     */
    val SCANCODE_SCROLL_LOCK = 70
    /**
     *  Key code constant: Break / Pause key.
     */
    val SCANCODE_BREAK = 119
    /**
     * Scan code constant: Num Lock key.
     * This key alters the behavior of other keys on the numeric keypad.
     */
    val SCANCODE_NUM_LOCK = 69
    /**
     * Scan code constant: Numeric keypad '0' key.
     */
    val SCANCODE_NUMPAD_0 = 82
    /**
     * Scan code constant: Numeric keypad '1' key.
     */
    val SCANCODE_NUMPAD_1 = 79
    /**
     * Scan code constant: Numeric keypad '2' key.
     */
    val SCANCODE_NUMPAD_2 = 80
    /**
     * Scan code constant: Numeric keypad '3' key.
     */
    val SCANCODE_NUMPAD_3 = 81
    /**
     * Scan code constant: Numeric keypad '4' key.
     */
    val SCANCODE_NUMPAD_4 = 75
    /**
     * Scan code constant: Numeric keypad '5' key.
     */
    val SCANCODE_NUMPAD_5 = 76
    /**
     * Scan code constant: Numeric keypad '6' key.
     */
    val SCANCODE_NUMPAD_6 = 77
    /**
     * Scan code constant: Numeric keypad '7' key.
     */
    val SCANCODE_NUMPAD_7 = 71
    /**
     * Scan code constant: Numeric keypad '8' key.
     */
    val SCANCODE_NUMPAD_8 = 72
    /**
     * Scan code constant: Numeric keypad '9' key.
     */
    val SCANCODE_NUMPAD_9 = 73
    /**
     * Scan code constant: Numeric keypad '/' key (for division).
     */
    val SCANCODE_NUMPAD_DIVIDE = 98
    /**
     * Scan code constant: Numeric keypad '*' key (for multiplication).
     */
    val SCANCODE_NUMPAD_MULTIPLY = 55
    /**
     * Scan code constant: Numeric keypad '-' key (for subtraction).
     */
    val SCANCODE_NUMPAD_SUBTRACT = 74
    /**
     * Scan code constant: Numeric keypad '+' key (for addition).
     */
    val SCANCODE_NUMPAD_ADD = 78
    /**
     * Scan code constant: Numeric keypad '.' key (for decimals or digit grouping).
     */
    val SCANCODE_NUMPAD_DOT = 83
    /**
     * Scan code constant: Numeric keypad ',' key (for decimals or digit grouping).
     */
    val SCANCODE_NUMPAD_COMMA = 159
    /**
     * Scan code constant: Numeric keypad Enter key.
     */
    val SCANCODE_NUMPAD_ENTER = 96

    /**
     * Scan code constant: Menu key.
     */
    val SCANCODE_MENU = 127
    /**
     * Scan code constant: Calculator special function key.
     * Used to launch a calculator application.
     */
    val SCANCODE_CALCULATOR = 140
}