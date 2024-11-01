package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerKt$VerticalPager$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$VerticalPager$2$1(int i8) {
        super(0);
        this.$pageCount = i8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$pageCount);
    }
}
