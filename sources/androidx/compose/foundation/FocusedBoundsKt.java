package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    private static final ProvidableModifierLocal<Function1> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.INSTANCE);

    public static final ProvidableModifierLocal<Function1> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    @ExperimentalFoundationApi
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, Function1 onPositioned) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(onPositioned, "onPositioned");
        return modifier.then(new FocusedBoundsObserverElement(onPositioned));
    }
}
