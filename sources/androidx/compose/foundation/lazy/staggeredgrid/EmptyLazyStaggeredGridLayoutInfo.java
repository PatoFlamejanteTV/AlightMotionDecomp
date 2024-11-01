package androidx.compose.foundation.lazy.staggeredgrid;

import R5.AbstractC1435t;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* loaded from: classes.dex */
public final class EmptyLazyStaggeredGridLayoutInfo implements LazyStaggeredGridLayoutInfo {
    private static final int afterContentPadding = 0;
    private static final int beforeContentPadding = 0;
    private static final int mainAxisItemSpacing = 0;
    private static final int totalItemsCount = 0;
    private static final int viewportEndOffset = 0;
    private static final int viewportStartOffset = 0;
    public static final EmptyLazyStaggeredGridLayoutInfo INSTANCE = new EmptyLazyStaggeredGridLayoutInfo();
    private static final List<LazyStaggeredGridItemInfo> visibleItemsInfo = AbstractC1435t.m();
    private static final long viewportSize = IntSize.Companion.m5326getZeroYbymL2g();
    private static final Orientation orientation = Orientation.Vertical;

    private EmptyLazyStaggeredGridLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public Orientation getOrientation() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public long mo744getViewportSizeYbymL2g() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
