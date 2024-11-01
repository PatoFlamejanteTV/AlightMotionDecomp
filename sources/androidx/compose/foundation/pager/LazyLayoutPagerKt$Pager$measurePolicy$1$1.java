package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutPagerKt$Pager$measurePolicy$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$measurePolicy$1$1(PagerState pagerState) {
        super(0);
        this.$state = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$state.getPageCount());
    }
}
