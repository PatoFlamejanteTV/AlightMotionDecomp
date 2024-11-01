package androidx.compose.ui.input.key;

/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m3876getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m3877getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return KeyEventType.Companion.m3875getUnknownCS__XNY();
            }
            return KeyEventType.Companion.m3874getKeyUpCS__XNY();
        }
        return KeyEventType.Companion.m3873getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m3878getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3879isAltPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3880isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3881isMetaPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m3882isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
