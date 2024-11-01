package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final boolean canScrollBackward;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final int[] firstVisibleItemIndices;
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;
    private final List<LazyStaggeredGridItemInfo> visibleItemsInfo;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f8, MeasureResult measureResult, boolean z8, boolean z9, boolean z10, int i8, List list, long j8, int i9, int i10, int i11, int i12, int i13, AbstractC3284p abstractC3284p) {
        this(iArr, iArr2, f8, measureResult, z8, z9, z10, i8, list, j8, i9, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final boolean getCanScrollBackward() {
        return this.canScrollBackward;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo744getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasureResult(int[] firstVisibleItemIndices, int[] firstVisibleItemScrollOffsets, float f8, MeasureResult measureResult, boolean z8, boolean z9, boolean z10, int i8, List<? extends LazyStaggeredGridItemInfo> visibleItemsInfo, long j8, int i9, int i10, int i11, int i12, int i13) {
        AbstractC3292y.i(firstVisibleItemIndices, "firstVisibleItemIndices");
        AbstractC3292y.i(firstVisibleItemScrollOffsets, "firstVisibleItemScrollOffsets");
        AbstractC3292y.i(measureResult, "measureResult");
        AbstractC3292y.i(visibleItemsInfo, "visibleItemsInfo");
        this.firstVisibleItemIndices = firstVisibleItemIndices;
        this.firstVisibleItemScrollOffsets = firstVisibleItemScrollOffsets;
        this.consumedScroll = f8;
        this.measureResult = measureResult;
        this.canScrollForward = z8;
        this.canScrollBackward = z9;
        this.isVertical = z10;
        this.totalItemsCount = i8;
        this.visibleItemsInfo = visibleItemsInfo;
        this.viewportSize = j8;
        this.viewportStartOffset = i9;
        this.viewportEndOffset = i10;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.mainAxisItemSpacing = i13;
        this.orientation = z10 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
