package androidx.compose.foundation.lazy.staggeredgrid;

import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i8) {
        AbstractC3292y.i(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) AbstractC1435t.m0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i8 > ((LazyStaggeredGridItemInfo) AbstractC1435t.y0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i8) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) AbstractC1435t.p0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), AbstractC1435t.k(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i8), 3, null));
    }
}
