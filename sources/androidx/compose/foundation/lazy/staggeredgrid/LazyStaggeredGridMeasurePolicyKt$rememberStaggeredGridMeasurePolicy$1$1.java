package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ InterfaceC2072n $slots;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(Orientation orientation, InterfaceC2072n interfaceC2072n, Function0 function0, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z8, float f8) {
        super(2);
        this.$orientation = orientation;
        this.$slots = interfaceC2072n;
        this.$itemProviderLambda = function0;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$mainAxisSpacing = f8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m761invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m761invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        boolean z8;
        float beforePadding;
        float afterPadding;
        float startPadding;
        int m5123getMaxWidthimpl;
        long IntOffset;
        AbstractC3292y.i(lazyLayoutMeasureScope, "$this$null");
        CheckScrollableContainerConstraintsKt.m287checkScrollableContainerConstraintsK40F9xA(j8, this.$orientation);
        LazyStaggeredGridSlots lazyStaggeredGridSlots = (LazyStaggeredGridSlots) this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m5111boximpl(j8));
        if (this.$orientation == Orientation.Vertical) {
            z8 = true;
        } else {
            z8 = false;
        }
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) this.$itemProviderLambda.invoke();
        this.$state.setSlots$foundation_release(lazyStaggeredGridSlots);
        this.$state.setVertical$foundation_release(z8);
        this.$state.setSpanProvider$foundation_release(lazyStaggeredGridItemProvider.getSpanProvider());
        beforePadding = LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo419roundToPx0680j_4 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(beforePadding);
        afterPadding = LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo419roundToPx0680j_42 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(afterPadding);
        startPadding = LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection());
        int mo419roundToPx0680j_43 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(startPadding);
        if (z8) {
            m5123getMaxWidthimpl = Constraints.m5122getMaxHeightimpl(j8);
        } else {
            m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        }
        int i8 = (m5123getMaxWidthimpl - mo419roundToPx0680j_4) - mo419roundToPx0680j_42;
        if (z8) {
            IntOffset = IntOffsetKt.IntOffset(mo419roundToPx0680j_43, mo419roundToPx0680j_4);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo419roundToPx0680j_4, mo419roundToPx0680j_43);
        }
        long j9 = IntOffset;
        PaddingValues paddingValues = this.$contentPadding;
        int mo419roundToPx0680j_44 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(Dp.m5155constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        int mo419roundToPx0680j_45 = lazyLayoutMeasureScope.mo419roundToPx0680j_4(Dp.m5155constructorimpl(paddingValues2.mo530calculateTopPaddingD9Ej5fM() + paddingValues2.mo527calculateBottomPaddingD9Ej5fM()));
        boolean z9 = z8;
        LazyStaggeredGridMeasureResult m759measureStaggeredGriddSVRQoE = LazyStaggeredGridMeasureKt.m759measureStaggeredGriddSVRQoE(lazyLayoutMeasureScope, this.$state, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProvider, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, Constraints.m5114copyZbe2FdA$default(j8, ConstraintsKt.m5137constrainWidthK40F9xA(j8, mo419roundToPx0680j_44), 0, ConstraintsKt.m5136constrainHeightK40F9xA(j8, mo419roundToPx0680j_45), 0, 10, null), z9, this.$reverseLayout, j9, i8, lazyLayoutMeasureScope.mo419roundToPx0680j_4(this.$mainAxisSpacing), mo419roundToPx0680j_4, mo419roundToPx0680j_42);
        this.$state.applyMeasureResult$foundation_release(m759measureStaggeredGriddSVRQoE);
        return m759measureStaggeredGriddSVRQoE;
    }
}
