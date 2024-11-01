package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    @Stable
    public static final Modifier onGloballyPositioned(Modifier modifier, Function1 function1) {
        return modifier.then(new OnGloballyPositionedElement(function1));
    }
}
