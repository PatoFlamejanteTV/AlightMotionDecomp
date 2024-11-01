package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m919isTypedEventZmokQxo(KeyEvent isTypedEvent) {
        AbstractC3292y.i(isTypedEvent, "$this$isTypedEvent");
        if (isTypedEvent.getAction() == 0 && !Character.isISOControl(isTypedEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }
}
