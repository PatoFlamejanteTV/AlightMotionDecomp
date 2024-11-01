package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.DelegatableNode;

/* loaded from: classes.dex */
public final class NestedScrollNodeKt {
    private static final ProvidableModifierLocal<NestedScrollNode> ModifierLocalNestedScroll = ModifierLocalKt.modifierLocalOf(NestedScrollNodeKt$ModifierLocalNestedScroll$1.INSTANCE);

    public static final ProvidableModifierLocal<NestedScrollNode> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
