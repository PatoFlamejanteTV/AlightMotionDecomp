package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import i6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider {
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z8, LazyStaggeredGridItemProvider itemProvider, LazyLayoutMeasureScope measureScope, LazyStaggeredGridSlots resolvedSlots) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(measureScope, "measureScope");
        AbstractC3292y.i(resolvedSlots, "resolvedSlots");
        this.isVertical = z8;
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.resolvedSlots = resolvedSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m762childConstraintsJhjzzOo(int i8, int i9) {
        int i10;
        int length = this.resolvedSlots.getSizes().length;
        int g8 = m.g(i8, length - 1);
        int g9 = m.g(i9, length - g8);
        if (g9 == 1) {
            i10 = this.resolvedSlots.getSizes()[g8];
        } else {
            int i11 = this.resolvedSlots.getPositions()[g8];
            int i12 = (g8 + g9) - 1;
            i10 = (this.resolvedSlots.getPositions()[i12] + this.resolvedSlots.getSizes()[i12]) - i11;
        }
        if (this.isVertical) {
            return Constraints.Companion.m5133fixedWidthOenEA2s(i10);
        }
        return Constraints.Companion.m5132fixedHeightOenEA2s(i10);
    }

    public abstract LazyStaggeredGridMeasuredItem createItem(int i8, int i9, int i10, Object obj, Object obj2, List<? extends Placeable> list);

    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m763getAndMeasurejy6DScQ(int i8, long j8) {
        int i9 = (int) (j8 >> 32);
        int i10 = ((int) (j8 & 4294967295L)) - i9;
        return createItem(i8, i9, i10, this.itemProvider.getKey(i8), this.itemProvider.getContentType(i8), this.measureScope.mo733measure0kLqBqw(i8, m762childConstraintsJhjzzOo(i9, i10)));
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
