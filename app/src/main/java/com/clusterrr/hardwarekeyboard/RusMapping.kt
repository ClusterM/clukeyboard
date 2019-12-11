package com.clusterrr.hardwarekeyboard

import android.view.KeyEvent

import java.util.HashMap

class RusMapping {
    internal var mapping: HashMap<Int, KeyMapping> = object : HashMap<Int, KeyMapping>() {
        init {
            put(ScanCodes.SCANCODE_GRAVE,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_ESCAPE
                            AlternateScanCode = ScanCodes.SCANCODE_ESCAPE
                            AlternateFix = true
                            Char = "ё"
                            ShiftChar = "Ё"
                        }
                    })
            put(ScanCodes.SCANCODE_1,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F1
                            AlternateScanCode = ScanCodes.SCANCODE_F1
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_2,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F2
                            AlternateScanCode = ScanCodes.SCANCODE_F2
                            AlternateFix = true
                            ShiftChar = "\""
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_3,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F3
                            AlternateScanCode = ScanCodes.SCANCODE_F3
                            AlternateFix = true
                            ShiftChar = "№"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_4,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F4
                            AlternateScanCode = ScanCodes.SCANCODE_F4
                            AlternateFix = true
                            ShiftChar = ";"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_5,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F5
                            AlternateScanCode = ScanCodes.SCANCODE_F5
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_6,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F6
                            AlternateScanCode = ScanCodes.SCANCODE_F6
                            AlternateFix = true
                            ShiftChar = ":"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_7,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F7
                            AlternateScanCode = ScanCodes.SCANCODE_F7
                            AlternateFix = true
                            ShiftChar = "?"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_8,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F8
                            AlternateScanCode = ScanCodes.SCANCODE_F8
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_9,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F9
                            AlternateScanCode = ScanCodes.SCANCODE_F9
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_0,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F10
                            AlternateScanCode = ScanCodes.SCANCODE_F10
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_MINUS,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F11
                            AlternateScanCode = ScanCodes.SCANCODE_F11
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_EQUALS,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_F12
                            AlternateScanCode = ScanCodes.SCANCODE_F12
                            AlternateFix = true
                        }
                    })
            put(ScanCodes.SCANCODE_Q,
                    object : KeyMapping() {
                        init {
                            Char = "й"
                            ShiftChar = "Й"
                            AlternateKeyCode = KeyEvent.KEYCODE_BACK
                        }
                    })
            put(ScanCodes.SCANCODE_W,
                    object : KeyMapping() {
                        init {
                            Char = "ц"
                            ShiftChar = "Ц"
                        }
                    })
            put(ScanCodes.SCANCODE_E,
                    object : KeyMapping() {
                        init {
                            Char = "у"
                            ShiftChar = "У"
                        }
                    })
            put(ScanCodes.SCANCODE_R,
                    object : KeyMapping() {
                        init {
                            Char = "к"
                            ShiftChar = "К"
                        }
                    })
            put(ScanCodes.SCANCODE_T,
                    object : KeyMapping() {
                        init {
                            Char = "е"
                            ShiftChar = "Е"
                        }
                    })
            put(ScanCodes.SCANCODE_Y,
                    object : KeyMapping() {
                        init {
                            Char = "н"
                            ShiftChar = "Н"
                        }
                    })
            put(ScanCodes.SCANCODE_U,
                    object : KeyMapping() {
                        init {
                            Char = "г"
                            ShiftChar = "Г"
                        }
                    })
            put(ScanCodes.SCANCODE_I,
                    object : KeyMapping() {
                        init {
                            Char = "ш"
                            ShiftChar = "Ш"
                        }
                    })
            put(ScanCodes.SCANCODE_O,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_NUMPAD_SUBTRACT
                            AlternateScanCode = ScanCodes.SCANCODE_NUMPAD_SUBTRACT
                            AlternateFix = false
                            Char = "щ"
                            ShiftChar = "Щ"
                        }
                    })
            put(ScanCodes.SCANCODE_P,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_NUMPAD_ADD
                            AlternateScanCode = ScanCodes.SCANCODE_NUMPAD_ADD
                            AlternateFix = false
                            Char = "з"
                            ShiftChar = "З"
                        }
                    })
            put(ScanCodes.SCANCODE_LEFT_BRACKET,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_NUMPAD_DIVIDE
                            AlternateScanCode = ScanCodes.SCANCODE_NUMPAD_DIVIDE
                            AlternateFix = false
                            Char = "х"
                            ShiftChar = "Х"
                        }
                    })
            put(ScanCodes.SCANCODE_RIGHT_BRACKET,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_NUMPAD_MULTIPLY
                            AlternateScanCode = ScanCodes.SCANCODE_NUMPAD_MULTIPLY
                            AlternateFix = false
                            Char = "ъ"
                            ShiftChar = "Ъ"
                        }
                    })
            put(ScanCodes.SCANCODE_A,
                    object : KeyMapping() {
                        init {
                            Char = "ф"
                            ShiftChar = "Ф"
                        }
                    })
            put(ScanCodes.SCANCODE_S,
                    object : KeyMapping() {
                        init {
                            Char = "ы"
                            ShiftChar = "Ы"
                        }
                    })
            put(ScanCodes.SCANCODE_D,
                    object : KeyMapping() {
                        init {
                            Char = "в"
                            ShiftChar = "В"
                        }
                    })
            put(ScanCodes.SCANCODE_F,
                    object : KeyMapping() {
                        init {
                            Char = "а"
                            ShiftChar = "А"
                        }
                    })
            put(ScanCodes.SCANCODE_G,
                    object : KeyMapping() {
                        init {
                            Char = "п"
                            ShiftChar = "П"
                        }
                    })
            put(ScanCodes.SCANCODE_H,
                    object : KeyMapping() {
                        init {
                            Char = "р"
                            ShiftChar = "Р"
                        }
                    })
            put(ScanCodes.SCANCODE_J,
                    object : KeyMapping() {
                        init {
                            Char = "о"
                            ShiftChar = "О"
                        }
                    })
            put(ScanCodes.SCANCODE_K,
                    object : KeyMapping() {
                        init {
                            Char = "л"
                            ShiftChar = "Л"
                        }
                    })
            put(ScanCodes.SCANCODE_L,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_VOLUME_MUTE
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_MUTE;
                            AlternateFix = false
                            Char = "д"
                            ShiftChar = "Д"
                        }
                    })
            put(ScanCodes.SCANCODE_SEMICOLON,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_VOLUME_DOWN
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_DOWN;
                            AlternateFix = false
                            Char = "ж"
                            ShiftChar = "Ж"
                        }
                    })
            put(ScanCodes.SCANCODE_APOSTROPHE,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_VOLUME_UP
                            //AlternateScanCode = ScanCodes.SCANCODE_VOLUME_UP;
                            AlternateFix = false
                            Char = "э"
                            ShiftChar = "Э"
                        }
                    })
            put(ScanCodes.SCANCODE_Z,
                    object : KeyMapping() {
                        init {
                            Char = "я"
                            ShiftChar = "Я"
                        }
                    })
            put(ScanCodes.SCANCODE_X,
                    object : KeyMapping() {
                        init {
                            Char = "ч"
                            ShiftChar = "Ч"
                        }
                    })
            put(ScanCodes.SCANCODE_C,
                    object : KeyMapping() {
                        init {
                            Char = "с"
                            ShiftChar = "С"
                        }
                    })
            put(ScanCodes.SCANCODE_V,
                    object : KeyMapping() {
                        init {
                            Char = "м"
                            ShiftChar = "М"
                        }
                    })
            put(ScanCodes.SCANCODE_B,
                    object : KeyMapping() {
                        init {
                            Char = "и"
                            ShiftChar = "И"
                        }
                    })
            put(ScanCodes.SCANCODE_N,
                    object : KeyMapping() {
                        init {
                            Char = "т"
                            ShiftChar = "Т"
                        }
                    })
            put(ScanCodes.SCANCODE_M,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MEDIA_REWIND
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_REWIND;
                            AlternateFix = false
                            Char = "ь"
                            ShiftChar = "Ь"
                        }
                    })
            put(ScanCodes.SCANCODE_COMMA,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MEDIA_FAST_FORWARD
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_FAST_FORWARD;
                            AlternateFix = false
                            Char = "б"
                            ShiftChar = "Б"
                        }
                    })
            put(ScanCodes.SCANCODE_PERIOD,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MEDIA_PREVIOUS
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_PREVIOUS;
                            AlternateFix = false
                            Char = "ю"
                            ShiftChar = "Ю"
                        }
                    })
            put(ScanCodes.SCANCODE_BACKSLASH,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_INSERT
                            ShiftChar = "/"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_BACKSLASH_LEFT,
                    object : KeyMapping() {
                        init {
                            ShiftChar = "/"
                            IgnoreCapsLock = true
                        }
                    })
            put(ScanCodes.SCANCODE_SLASH,
                    object : KeyMapping() {
                        init {
                            Char = "."
                            ShiftChar = ","
                            IgnoreCapsLock = true
                            AlternateKeyCode = KeyEvent.KEYCODE_MEDIA_NEXT
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_NEXT;
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_SHIFT_RIGHT,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE
                            //AlternateScanCode = ScanCodes.SCANCODE_MEDIA_PLAY_PAUSE;
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_LEFT,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MOVE_HOME
                            AlternateScanCode = ScanCodes.SCANCODE_MOVE_HOME
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_RIGHT,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MOVE_END
                            AlternateScanCode = ScanCodes.SCANCODE_MOVE_END
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_UP,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_PAGE_UP
                            AlternateScanCode = ScanCodes.SCANCODE_PAGE_UP
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_DPAD_DOWN,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_PAGE_DOWN
                            AlternateScanCode = ScanCodes.SCANCODE_PAGE_DOWN
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_DEL,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_FORWARD_DEL
                            AlternateScanCode = ScanCodes.SCANCODE_FORWARD_DEL
                            AlternateFix = false
                        }
                    })
            put(ScanCodes.SCANCODE_ALT_RIGHT,
                    object : KeyMapping() {
                        init {
                            AlternateKeyCode = KeyEvent.KEYCODE_MENU
                            AlternateScanCode = ScanCodes.SCANCODE_MENU
                            AlternateFix = false
                        }
                    })
        }
    }

    fun getMapping(scanCode: Int): KeyMapping? {
        return if (mapping.containsKey(scanCode)) mapping[scanCode] else null
    }
}
