package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i8) {
        if (i8 >= 0 && i8 < getSize()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + ", size " + getSize());
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i8) {
        int startIndex = interval.getStartIndex();
        if (i8 >= interval.getStartIndex() + interval.getSize() || startIndex > i8) {
            return false;
        }
        return true;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i8) {
        int binarySearch;
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval == null || !contains(interval, i8)) {
            MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
            binarySearch = IntervalListKt.binarySearch(mutableVector, i8);
            IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[binarySearch];
            this.lastInterval = interval2;
            return interval2;
        }
        return interval;
    }

    public final void addInterval(int i8, T t8) {
        if (i8 >= 0) {
            if (i8 == 0) {
                return;
            }
            IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i8, t8);
            this.size = getSize() + i8;
            this.intervals.add(interval);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i8).toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i8, int i9, Function1 block) {
        int binarySearch;
        AbstractC3292y.i(block, "block");
        checkIndexBounds(i8);
        checkIndexBounds(i9);
        if (i9 >= i8) {
            binarySearch = IntervalListKt.binarySearch(this.intervals, i8);
            int startIndex = this.intervals.getContent()[binarySearch].getStartIndex();
            while (startIndex <= i9) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[binarySearch];
                block.invoke(interval);
                startIndex += interval.getSize();
                binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i9 + ") should be not smaller than fromIndex (" + i8 + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i8) {
        checkIndexBounds(i8);
        return getIntervalForIndex(i8);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
