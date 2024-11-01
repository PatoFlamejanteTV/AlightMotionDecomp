package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FocusEventModifierKt {
    public static final Modifier onFocusEvent(Modifier modifier, Function1 function1) {
        return modifier.then(new FocusEventElement(function1));
    }
}
