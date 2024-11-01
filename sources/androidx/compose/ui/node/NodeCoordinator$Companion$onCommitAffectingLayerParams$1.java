package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends AbstractC3293z implements Function1 {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return I.f8786a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        LayerPositionalProperties layerPositionalProperties;
        LayerPositionalProperties layerPositionalProperties2;
        LayerPositionalProperties layerPositionalProperties3;
        if (nodeCoordinator.isValidOwnerScope()) {
            layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
            if (layerPositionalProperties != null) {
                layerPositionalProperties2 = NodeCoordinator.tmpLayerPositionalProperties;
                layerPositionalProperties2.copyFrom(layerPositionalProperties);
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                layerPositionalProperties3 = NodeCoordinator.tmpLayerPositionalProperties;
                if (layerPositionalProperties3.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner$ui_release = layoutNode.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.requestOnPositionedCallback(layoutNode);
                    return;
                }
                return;
            }
            NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
        }
    }
}
