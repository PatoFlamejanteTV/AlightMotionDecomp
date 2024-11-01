package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private Function1 callback;

    public OnGloballyPositionedNode(Function1 function1) {
        this.callback = function1;
    }

    public final Function1 getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(Function1 function1) {
        this.callback = function1;
    }
}
