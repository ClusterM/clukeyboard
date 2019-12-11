package com.clusterrr.hardwarekeyboard

open class KeyMapping {
    var ReplaceKeyCode: Int = 0
    var ReplaceScanCode: Int = 0
    var FnKeyCode: Int = 0
    var FnScanCode: Int = 0
    var FnFixSupport: Boolean = false
    var AltLanguageChar: String? = null
    var AltLanguageShiftChar: String? = null
    var AltLanguageIgnoreCapsLock: Boolean = false
}
