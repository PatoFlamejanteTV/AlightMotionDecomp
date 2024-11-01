package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class KeyboardActionsKt {
    public static final KeyboardActions KeyboardActions(Function1 onAny) {
        AbstractC3292y.i(onAny, "onAny");
        return new KeyboardActions(onAny, onAny, onAny, onAny, onAny, onAny);
    }
}
