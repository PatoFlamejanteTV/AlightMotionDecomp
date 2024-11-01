package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    private Function1 callback;

    public OnPlacedNode(Function1 function1) {
        this.callback = function1;
    }

    public final Function1 getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public /* synthetic */ void mo314onRemeasuredozmzZPI(long j8) {
        androidx.compose.ui.node.c.b(this, j8);
    }

    public final void setCallback(Function1 function1) {
        this.callback = function1;
    }
}
