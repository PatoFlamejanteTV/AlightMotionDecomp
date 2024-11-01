package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerStateKt$rememberPagerState$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $initialPage;
    final /* synthetic */ float $initialPageOffsetFraction;
    final /* synthetic */ Function0 $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$1$1(int i8, float f8, Function0 function0) {
        super(0);
        this.$initialPage = i8;
        this.$initialPageOffsetFraction = f8;
        this.$pageCount = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PagerStateImpl invoke() {
        return new PagerStateImpl(this.$initialPage, this.$initialPageOffsetFraction, this.$pageCount);
    }
}
