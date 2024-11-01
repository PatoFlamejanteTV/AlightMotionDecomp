package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements InterfaceC2072n {
    private long cachedConstraints;
    private float cachedDensity;
    private LazyStaggeredGridSlots cachedSizes;
    private final InterfaceC2072n calculation;

    public LazyStaggeredGridSlotCache(InterfaceC2072n calculation) {
        AbstractC3292y.i(calculation, "calculation");
        this.calculation = calculation;
        this.cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m766invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyStaggeredGridSlots m766invoke0kLqBqw(Density density, long j8) {
        AbstractC3292y.i(density, "density");
        if (this.cachedSizes != null && Constraints.m5116equalsimpl0(this.cachedConstraints, j8) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            AbstractC3292y.f(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j8;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.calculation.invoke(density, Constraints.m5111boximpl(j8));
        this.cachedSizes = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
