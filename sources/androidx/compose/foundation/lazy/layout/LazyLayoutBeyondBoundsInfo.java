package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* loaded from: classes.dex */
    public static final class Interval {
        private final int end;
        private final int start;

        public Interval(int i8, int i9) {
            this.start = i8;
            this.end = i9;
            if (i8 >= 0) {
                if (i9 >= i8) {
                    return;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = interval.start;
            }
            if ((i10 & 2) != 0) {
                i9 = interval.end;
            }
            return interval.copy(i8, i9);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i8, int i9) {
            return new Interval(i8, i9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    public final Interval addInterval(int i8, int i9) {
        Interval interval = new Interval(i8, i9);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                Interval interval = content[i8];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i8++;
            } while (i8 < size);
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                Interval interval = content[i8];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i8++;
            } while (i8 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    public final void removeInterval(Interval interval) {
        AbstractC3292y.i(interval, "interval");
        this.beyondBoundsItems.remove(interval);
    }
}
