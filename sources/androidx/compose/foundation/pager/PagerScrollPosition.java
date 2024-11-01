package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerScrollPosition {
    private final MutableIntState currentPage$delegate;
    private final MutableIntState firstVisiblePage$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownFirstPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PagerScrollPosition() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerScrollPosition.<init>():void");
    }

    private final void setScrollOffset(int i8) {
        this.scrollOffset$delegate.setIntValue(i8);
    }

    private final void update(int i8, int i9) {
        if (i8 >= 0.0f) {
            setFirstVisiblePage(i8);
            this.nearestRangeState.update(i8);
            setScrollOffset(i9);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i8 + ')').toString());
        }
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final int getFirstVisiblePage() {
        return this.firstVisiblePage$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPosition(int i8, int i9) {
        update(i8, i9);
        this.lastKnownFirstPageKey = null;
    }

    public final void setCurrentPage(int i8) {
        this.currentPage$delegate.setIntValue(i8);
    }

    public final void setFirstVisiblePage(int i8) {
        this.firstVisiblePage$delegate.setIntValue(i8);
    }

    public final void updateFromMeasureResult(PagerMeasureResult measureResult) {
        Object obj;
        int i8;
        AbstractC3292y.i(measureResult, "measureResult");
        MeasuredPage firstVisiblePage = measureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            obj = firstVisiblePage.getKey();
        } else {
            obj = null;
        }
        this.lastKnownFirstPageKey = obj;
        if (this.hadFirstNotEmptyLayout || measureResult.getPagesCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisiblePageOffset = measureResult.getFirstVisiblePageOffset();
            if (firstVisiblePageOffset >= 0.0f) {
                MeasuredPage firstVisiblePage2 = measureResult.getFirstVisiblePage();
                if (firstVisiblePage2 != null) {
                    i8 = firstVisiblePage2.getIndex();
                } else {
                    i8 = 0;
                }
                update(i8, firstVisiblePageOffset);
                PageInfo closestPageToSnapPosition = measureResult.getClosestPageToSnapPosition();
                if (closestPageToSnapPosition != null) {
                    setCurrentPage(closestPageToSnapPosition.getIndex());
                    return;
                }
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisiblePageOffset + ')').toString());
        }
    }

    public PagerScrollPosition(int i8, int i9) {
        this.firstVisiblePage$delegate = SnapshotIntStateKt.mutableIntStateOf(i8);
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i8);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i9);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i8, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
