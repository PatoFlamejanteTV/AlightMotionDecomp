package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerState$settledPage$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$settledPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int currentPage;
        if (this.this$0.isScrollInProgress()) {
            currentPage = this.this$0.getSettledPageState();
        } else {
            currentPage = this.this$0.getCurrentPage();
        }
        return Integer.valueOf(currentPage);
    }
}
