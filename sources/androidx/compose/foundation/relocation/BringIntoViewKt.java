package androidx.compose.foundation.relocation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

/* loaded from: classes.dex */
public final class BringIntoViewKt {
    private static final ProvidableModifierLocal<BringIntoViewParent> ModifierLocalBringIntoViewParent = ModifierLocalKt.modifierLocalOf(BringIntoViewKt$ModifierLocalBringIntoViewParent$1.INSTANCE);

    public static final ProvidableModifierLocal<BringIntoViewParent> getModifierLocalBringIntoViewParent() {
        return ModifierLocalBringIntoViewParent;
    }
}
