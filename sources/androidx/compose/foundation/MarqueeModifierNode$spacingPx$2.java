package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MarqueeModifierNode$spacingPx$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MarqueeSpacing $spacing;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$spacingPx$2(MarqueeSpacing marqueeSpacing, MarqueeModifierNode marqueeModifierNode) {
        super(0);
        this.$spacing = marqueeSpacing;
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int contentWidth;
        int containerWidth;
        MarqueeSpacing marqueeSpacing = this.$spacing;
        MarqueeModifierNode marqueeModifierNode = this.this$0;
        Density requireDensity = DelegatableNodeKt.requireDensity(marqueeModifierNode);
        contentWidth = marqueeModifierNode.getContentWidth();
        containerWidth = marqueeModifierNode.getContainerWidth();
        return Integer.valueOf(marqueeSpacing.calculateSpacing(requireDensity, contentWidth, containerWidth));
    }
}
