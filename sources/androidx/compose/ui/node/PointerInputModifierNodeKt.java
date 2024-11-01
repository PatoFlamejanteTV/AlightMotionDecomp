package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates getLayoutCoordinates(PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m4203requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m4320constructorimpl(16));
    }

    public static final boolean isAttached(PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}
