package j$.com.android.tools.r8;

import j$.util.Objects;
import j$.util.concurrent.t;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.function.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static t a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    public static t b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d8) {
                DoubleConsumer.this.accept(d8);
                doubleConsumer2.accept(d8);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.c(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i8) {
                IntConsumer.this.accept(i8);
                intConsumer2.accept(i8);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.d(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j8) {
                LongConsumer.this.accept(j8);
                longConsumer2.accept(j8);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }
        };
    }

    public static /* synthetic */ long f(long j8, long j9) {
        long j10 = j8 + j9;
        if (((j9 ^ j8) < 0) || ((j8 ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry g(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List h(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean i(Unsafe unsafe, Object obj, long j8, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j8, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j8) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long j(long j8, long j9) {
        long j10 = j8 % j9;
        if (j10 == 0) {
            return 0L;
        }
        return (((j8 ^ j9) >> 63) | 1) > 0 ? j10 : j10 + j9;
    }

    public static /* synthetic */ long k(long j8, long j9) {
        long j10 = j8 / j9;
        return (j8 - (j9 * j10) != 0 && (((j8 ^ j9) >> 63) | 1) < 0) ? j10 - 1 : j10;
    }

    public static /* synthetic */ long l(long j8, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j9) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (numberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j8 >= 0) | (j9 != Long.MIN_VALUE)) {
                long j10 = j8 * j9;
                if (j8 == 0 || j10 / j8 == j9) {
                    return j10;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long m(long j8, long j9) {
        long j10 = j8 - j9;
        if (((j9 ^ j8) >= 0) || ((j8 ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException();
    }
}
