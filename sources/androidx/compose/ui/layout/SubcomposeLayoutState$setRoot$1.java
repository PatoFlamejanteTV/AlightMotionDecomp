package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setRoot$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        LayoutNodeSubcompositionsState state;
        LayoutNodeSubcompositionsState state2;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
        if (subcompositionsState$ui_release == null) {
            subcomposeSlotReusePolicy2 = this.this$0.slotReusePolicy;
            subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
            layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
        }
        subcomposeLayoutState2._state = subcompositionsState$ui_release;
        state = this.this$0.getState();
        state.makeSureStateIsConsistent();
        state2 = this.this$0.getState();
        subcomposeSlotReusePolicy = this.this$0.slotReusePolicy;
        state2.setSlotReusePolicy(subcomposeSlotReusePolicy);
    }
}
