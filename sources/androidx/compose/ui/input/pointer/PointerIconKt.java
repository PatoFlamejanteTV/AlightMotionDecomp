package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class PointerIconKt {
    @Stable
    public static final Modifier pointerHoverIcon(Modifier modifier, PointerIcon pointerIcon, boolean z8) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z8));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z8);
    }
}
