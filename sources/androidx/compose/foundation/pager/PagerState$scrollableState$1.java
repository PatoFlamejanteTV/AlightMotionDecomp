package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerState$scrollableState$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollableState$1(PagerState pagerState) {
        super(1);
        this.this$0 = pagerState;
    }

    public final Float invoke(float f8) {
        float performScroll;
        performScroll = this.this$0.performScroll(-f8);
        return Float.valueOf(-performScroll);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
