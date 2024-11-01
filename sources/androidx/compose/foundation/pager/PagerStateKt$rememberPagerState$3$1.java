package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PagerStateKt$rememberPagerState$3$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $initialPage;
    final /* synthetic */ float $initialPageOffsetFraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$3$1(int i8, float f8) {
        super(0);
        this.$initialPage = i8;
        this.$initialPageOffsetFraction = f8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PagerStateImpl invoke() {
        return new PagerStateImpl(this.$initialPage, this.$initialPageOffsetFraction, AnonymousClass1.INSTANCE);
    }
}
