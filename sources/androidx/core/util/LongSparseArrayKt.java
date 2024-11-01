package androidx.core.util;

import R5.O;
import android.util.LongSparseArray;
import c6.InterfaceC2072n;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class LongSparseArrayKt {
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j8) {
        if (longSparseArray.indexOfKey(j8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j8) {
        if (longSparseArray.indexOfKey(j8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t8) {
        if (longSparseArray.indexOfValue(t8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, InterfaceC2072n interfaceC2072n) {
        int size = longSparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Long.valueOf(longSparseArray.keyAt(i8)), longSparseArray.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j8, T t8) {
        T t9 = longSparseArray.get(j8);
        if (t9 != null) {
            return t9;
        }
        return t8;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j8, Function0 function0) {
        T t8 = longSparseArray.get(j8);
        if (t8 == null) {
            return (T) function0.invoke();
        }
        return t8;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> O keyIterator(final LongSparseArray<T> longSparseArray) {
        return new O() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < longSparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.O
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return longSparseArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            longSparseArray.put(longSparseArray2.keyAt(i8), longSparseArray2.valueAt(i8));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j8, T t8) {
        int indexOfKey = longSparseArray.indexOfKey(j8);
        if (indexOfKey >= 0 && AbstractC3292y.d(t8, longSparseArray.valueAt(indexOfKey))) {
            longSparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j8, T t8) {
        longSparseArray.put(j8, t8);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
