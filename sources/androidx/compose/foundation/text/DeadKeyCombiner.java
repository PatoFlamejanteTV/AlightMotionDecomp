package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m854consumeZmokQxo(KeyEvent event) {
        AbstractC3292y.i(event, "event");
        int m3878getUtf16CodePointZmokQxo = KeyEvent_androidKt.m3878getUtf16CodePointZmokQxo(event);
        Integer num = null;
        if ((Integer.MIN_VALUE & m3878getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m3878getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.deadKeyCode;
        if (num2 != null) {
            this.deadKeyCode = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), m3878getUtf16CodePointZmokQxo));
            if (valueOf.intValue() != 0) {
                num = valueOf;
            }
            if (num == null) {
                return Integer.valueOf(m3878getUtf16CodePointZmokQxo);
            }
            return num;
        }
        return Integer.valueOf(m3878getUtf16CodePointZmokQxo);
    }
}
