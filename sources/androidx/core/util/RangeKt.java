package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import i6.InterfaceC2978f;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t8) {
        return range.extend((Range<T>) t8);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t8, T t9) {
        return new Range<>(t8, t9);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> InterfaceC2978f toClosedRange(final Range<T> range) {
        return new InterfaceC2978f() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return InterfaceC2978f.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // i6.InterfaceC2978f
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // i6.InterfaceC2978f
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // i6.InterfaceC2978f
            public boolean isEmpty() {
                return InterfaceC2978f.a.b(this);
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(InterfaceC2978f interfaceC2978f) {
        return new Range<>(interfaceC2978f.getStart(), interfaceC2978f.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
