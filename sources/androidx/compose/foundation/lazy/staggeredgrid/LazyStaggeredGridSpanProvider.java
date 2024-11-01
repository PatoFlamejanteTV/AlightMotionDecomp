package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridSpanProvider {
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridInterval> intervals) {
        AbstractC3292y.i(intervals, "intervals");
        this.intervals = intervals;
    }

    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i8) {
        if (i8 < 0 || i8 >= this.intervals.getSize()) {
            return false;
        }
        IntervalList.Interval<LazyStaggeredGridInterval> interval = this.intervals.get(i8);
        Function1 span = interval.getValue().getSpan();
        int startIndex = i8 - interval.getStartIndex();
        if (span == null || span.invoke(Integer.valueOf(startIndex)) != StaggeredGridItemSpan.Companion.getFullLine()) {
            return false;
        }
        return true;
    }
}
