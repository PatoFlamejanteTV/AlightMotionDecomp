package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IntermediateLayoutModifierNode$onAttach$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LayoutNode $closestLookaheadRoot;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntermediateLayoutModifierNode$onAttach$2(LayoutNode layoutNode) {
        super(0);
        this.$closestLookaheadRoot = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutCoordinates invoke() {
        LayoutNode parent$ui_release = this.$closestLookaheadRoot.getParent$ui_release();
        AbstractC3292y.f(parent$ui_release);
        return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
    }
}
