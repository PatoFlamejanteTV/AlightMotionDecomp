package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface IntervalList<T> {

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i8, int i9, T t8) {
            this.startIndex = i8;
            this.size = i9;
            this.value = t8;
            if (i8 >= 0) {
                if (i9 > 0) {
                    return;
                }
                throw new IllegalArgumentException(("size should be >0, but was " + i9).toString());
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i8).toString());
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    void forEach(int i8, int i9, Function1 function1);

    Interval<T> get(int i8);

    int getSize();
}
