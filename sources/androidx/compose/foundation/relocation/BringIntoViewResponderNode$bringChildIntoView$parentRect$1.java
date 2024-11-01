package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$parentRect$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$parentRect$1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        super(0);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Rect invoke() {
        Rect bringChildIntoView$localRect;
        bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (bringChildIntoView$localRect != null) {
            return this.this$0.getResponder().calculateRectForParent(bringChildIntoView$localRect);
        }
        return null;
    }
}
