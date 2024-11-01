package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new RotaryInputElement(null, function1));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new RotaryInputElement(function1, null));
    }
}
