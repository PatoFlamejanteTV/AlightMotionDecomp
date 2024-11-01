package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final List<Integer> pinnedItems;
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j8, boolean z8, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i8, long j9, int i9, int i10, boolean z9, int i11, AbstractC3284p abstractC3284p) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j8, z8, lazyLayoutMeasureScope, i8, j9, i9, i10, z9, i11);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m752getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m753getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m754getLaneInfoSZVOQXA(long j8) {
        int i8 = (int) (j8 >> 32);
        if (((int) (4294967295L & j8)) - i8 != 1) {
            return -2;
        }
        return i8;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m755getSpanRangelOCCd4c(LazyStaggeredGridItemProvider getSpanRange, int i8, int i9) {
        int i10;
        AbstractC3292y.i(getSpanRange, "$this$getSpanRange");
        boolean isFullSpan = getSpanRange.getSpanProvider().isFullSpan(i8);
        if (isFullSpan) {
            i10 = this.laneCount;
        } else {
            i10 = 1;
        }
        if (isFullSpan) {
            i9 = 0;
        }
        return SpanRange.m768constructorimpl(i9, i10);
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i8) {
        AbstractC3292y.i(lazyStaggeredGridItemProvider, "<this>");
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i8);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m756isFullSpanSZVOQXA(long j8) {
        return ((int) (4294967295L & j8)) - ((int) (j8 >> 32)) != 1;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState state, List<Integer> pinnedItems, final LazyStaggeredGridItemProvider itemProvider, final LazyStaggeredGridSlots resolvedSlots, long j8, final boolean z8, final LazyLayoutMeasureScope measureScope, int i8, long j9, int i9, int i10, boolean z9, int i11) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(pinnedItems, "pinnedItems");
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(resolvedSlots, "resolvedSlots");
        AbstractC3292y.i(measureScope, "measureScope");
        this.state = state;
        this.pinnedItems = pinnedItems;
        this.itemProvider = itemProvider;
        this.resolvedSlots = resolvedSlots;
        this.constraints = j8;
        this.isVertical = z8;
        this.measureScope = measureScope;
        this.mainAxisAvailableSize = i8;
        this.contentOffset = j9;
        this.beforeContentPadding = i9;
        this.afterContentPadding = i10;
        this.reverseLayout = z9;
        this.mainAxisSpacing = i11;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z8, itemProvider, measureScope, resolvedSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            public LazyStaggeredGridMeasuredItem createItem(int i12, int i13, int i14, Object key, Object obj, List<? extends Placeable> placeables) {
                AbstractC3292y.i(key, "key");
                AbstractC3292y.i(placeables, "placeables");
                return new LazyStaggeredGridMeasuredItem(i12, key, placeables, LazyStaggeredGridMeasureContext.this.isVertical(), LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), i13, i14, LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), obj);
            }
        };
        this.laneInfo = state.getLaneInfo$foundation_release();
        this.laneCount = resolvedSlots.getSizes().length;
    }
}
