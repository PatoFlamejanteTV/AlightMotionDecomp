package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(LazyStaggeredGridState state) {
        AbstractC3292y.i(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int i8, int i9) {
        int m5321getWidthimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i11);
            if (this.state.isVertical$foundation_release()) {
                m5321getWidthimpl = IntSize.m5320getHeightimpl(lazyStaggeredGridItemInfo.mo750getSizeYbymL2g());
            } else {
                m5321getWidthimpl = IntSize.m5321getWidthimpl(lazyStaggeredGridItemInfo.mo750getSizeYbymL2g());
            }
            i10 += m5321getWidthimpl;
        }
        int size2 = (i10 / visibleItemsInfo.size()) + layoutInfo.getMainAxisItemSpacing();
        int laneCount$foundation_release = (i8 / this.state.getLaneCount$foundation_release()) - (getFirstVisibleItemIndex() / this.state.getLaneCount$foundation_release());
        int min = Math.min(Math.abs(i9), size2);
        if (i9 < 0) {
            min *= -1;
        }
        return ((size2 * laneCount$foundation_release) + min) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) AbstractC1435t.z0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getLaneCount$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int i8) {
        int m5279getXimpl;
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(this.state.getLayoutInfo(), i8);
        if (findVisibleItem != null) {
            long mo749getOffsetnOccac = findVisibleItem.mo749getOffsetnOccac();
            if (this.state.isVertical$foundation_release()) {
                m5279getXimpl = IntOffset.m5280getYimpl(mo749getOffsetnOccac);
            } else {
                m5279getXimpl = IntOffset.m5279getXimpl(mo749getOffsetnOccac);
            }
            return Integer.valueOf(m5279getXimpl);
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(InterfaceC2072n interfaceC2072n, d dVar) {
        Object e8 = c.e(this.state, null, interfaceC2072n, dVar, 1, null);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(ScrollScope scrollScope, int i8, int i9) {
        AbstractC3292y.i(scrollScope, "<this>");
        this.state.snapToItemInternal$foundation_release(scrollScope, i8, i9);
    }
}
