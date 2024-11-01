package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IntermediateLayoutModifierNode$localLookaheadScope$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ IntermediateLayoutModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntermediateLayoutModifierNode$localLookaheadScope$1(IntermediateLayoutModifierNode intermediateLayoutModifierNode) {
        super(0);
        this.this$0 = intermediateLayoutModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutCoordinates invoke() {
        NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
        AbstractC3292y.f(coordinator$ui_release);
        return coordinator$ui_release;
    }
}
