package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public interface Interval {

        /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$-CC, reason: invalid class name */
        /* loaded from: classes.dex */
        public abstract /* synthetic */ class CC {
            public static Function1 a(Interval interval) {
                return null;
            }

            public static Function1 b(Interval interval) {
                return LazyLayoutIntervalContent$Interval$type$1.INSTANCE;
            }
        }

        Function1 getKey();

        Function1 getType();
    }

    public final Object getContentType(int i8) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i8);
        return interval.getValue().getType().invoke(Integer.valueOf(i8 - interval.getStartIndex()));
    }

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int i8) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i8);
        int startIndex = i8 - interval.getStartIndex();
        Function1 key = interval.getValue().getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) {
            return Lazy_androidKt.getDefaultLazyLayoutKey(i8);
        }
        return invoke;
    }

    public final <T> T withInterval(int i8, InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        IntervalList.Interval<Interval> interval = getIntervals().get(i8);
        return (T) block.invoke(Integer.valueOf(i8 - interval.getStartIndex()), interval.getValue());
    }
}
