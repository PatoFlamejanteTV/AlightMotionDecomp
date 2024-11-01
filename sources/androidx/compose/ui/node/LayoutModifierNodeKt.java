package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m4203requireCoordinator64DMado(layoutModifierNode, NodeKind.m4320constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    public static final void invalidatePlacement(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, 3, null);
    }
}
