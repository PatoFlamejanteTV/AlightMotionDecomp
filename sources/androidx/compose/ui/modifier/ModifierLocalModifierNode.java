package androidx.compose.ui.modifier;

import androidx.compose.ui.node.DelegatableNode;

/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    <T> T getCurrent(ModifierLocal<T> modifierLocal);

    ModifierLocalMap getProvidedValues();

    <T> void provide(ModifierLocal<T> modifierLocal, T t8);
}
