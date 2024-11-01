package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setCompositionContext$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (CompositionContext) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
        LayoutNodeSubcompositionsState state;
        state = this.this$0.getState();
        state.setCompositionContext(compositionContext);
    }
}
