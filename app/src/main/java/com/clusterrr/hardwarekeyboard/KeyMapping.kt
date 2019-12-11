package com.clusterrr.hardwarekeyboard

open class KeyMapping {
    var ReplaceKeyCode: Int = 0
    var ReplaceScanCode: Int = 0
    var AlternateKeyCode: Int = 0
    var AlternateScanCode: Int = 0
    var AlternateFix: Boolean = false
    var Char: String? = null
    var ShiftChar: String? = null
    var IgnoreCapsLock: Boolean = false
}
