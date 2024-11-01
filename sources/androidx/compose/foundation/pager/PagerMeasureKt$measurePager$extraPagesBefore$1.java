package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerMeasureKt$measurePager$extraPagesBefore$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $childConstraints;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ int $pageAvailableSize;
    final /* synthetic */ PagerLazyLayoutItemProvider $pagerItemProvider;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyLayoutMeasureScope $this_measurePager;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ long $visualPageOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesBefore$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j9, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z8, int i8) {
        super(1);
        this.$this_measurePager = lazyLayoutMeasureScope;
        this.$childConstraints = j8;
        this.$pagerItemProvider = pagerLazyLayoutItemProvider;
        this.$visualPageOffset = j9;
        this.$orientation = orientation;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$reverseLayout = z8;
        this.$pageAvailableSize = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final MeasuredPage invoke(int i8) {
        MeasuredPage m791getAndMeasureSGf7dI0;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.$this_measurePager;
        m791getAndMeasureSGf7dI0 = PagerMeasureKt.m791getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i8, this.$childConstraints, this.$pagerItemProvider, this.$visualPageOffset, this.$orientation, this.$horizontalAlignment, this.$verticalAlignment, lazyLayoutMeasureScope.getLayoutDirection(), this.$reverseLayout, this.$pageAvailableSize);
        return m791getAndMeasureSGf7dI0;
    }
}
