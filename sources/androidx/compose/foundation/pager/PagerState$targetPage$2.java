package androidx.compose.foundation.pager;

import e6.AbstractC2829a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerState$targetPage$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int animationTargetPage;
        int pageAvailableSpace;
        int d8;
        float positionThresholdFraction;
        int coerceInPageRange;
        if (this.this$0.isScrollInProgress()) {
            animationTargetPage = this.this$0.getAnimationTargetPage();
            if (animationTargetPage != -1) {
                d8 = this.this$0.getAnimationTargetPage();
            } else if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                float abs = Math.abs(this.this$0.getCurrentPageOffsetFraction());
                positionThresholdFraction = this.this$0.getPositionThresholdFraction();
                if (abs >= Math.abs(positionThresholdFraction)) {
                    d8 = this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction()));
                } else {
                    d8 = this.this$0.getCurrentPage();
                }
            } else {
                float snapRemainingScrollOffset$foundation_release = this.this$0.getSnapRemainingScrollOffset$foundation_release();
                pageAvailableSpace = this.this$0.getPageAvailableSpace();
                d8 = AbstractC2829a.d(snapRemainingScrollOffset$foundation_release / pageAvailableSpace) + this.this$0.getCurrentPage();
            }
        } else {
            d8 = this.this$0.getCurrentPage();
        }
        coerceInPageRange = this.this$0.coerceInPageRange(d8);
        return Integer.valueOf(coerceInPageRange);
    }
}
