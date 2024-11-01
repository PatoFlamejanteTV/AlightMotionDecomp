package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;

/* loaded from: classes.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        if (SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null) {
            return true;
        }
        return false;
    }

    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    public static final Rect touchBoundsInRoot(Modifier.Node node, boolean z8) {
        if (!node.getNode().isAttached()) {
            return Rect.Companion.getZero();
        }
        if (!z8) {
            return LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m4203requireCoordinator64DMado(node, NodeKind.m4320constructorimpl(8)));
        }
        return DelegatableNodeKt.m4203requireCoordinator64DMado(node, NodeKind.m4320constructorimpl(8)).touchBoundsInRoot();
    }
}
