package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LazyListScrollPosition() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListScrollPosition.<init>():void");
    }

    private final void setScrollOffset(int i8) {
        this.scrollOffset$delegate.setIntValue(i8);
    }

    private final void update(int i8, int i9) {
        if (i8 >= 0.0f) {
            setIndex(i8);
            this.nearestRangeState.update(i8);
            setScrollOffset(i9);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i8 + ')').toString());
        }
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPosition(int i8, int i9) {
        update(i8, i9);
        this.lastKnownFirstItemKey = null;
    }

    public final void setIndex(int i8) {
        this.index$delegate.setIntValue(i8);
    }

    public final void updateFromMeasureResult(LazyListMeasureResult measureResult) {
        Object obj;
        int i8;
        AbstractC3292y.i(measureResult, "measureResult");
        LazyListMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            obj = firstVisibleItem.getKey();
        } else {
            obj = null;
        }
        this.lastKnownFirstItemKey = obj;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset >= 0.0f) {
                LazyListMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
                if (firstVisibleItem2 != null) {
                    i8 = firstVisibleItem2.getIndex();
                } else {
                    i8 = 0;
                }
                update(i8, firstVisibleItemScrollOffset);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
        }
    }

    @ExperimentalFoundationApi
    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider itemProvider, int i8) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownFirstItemKey, i8);
        if (i8 != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(i8);
        }
        return findIndexByKey;
    }

    public LazyListScrollPosition(int i8, int i9) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i8);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i9);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i8, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
