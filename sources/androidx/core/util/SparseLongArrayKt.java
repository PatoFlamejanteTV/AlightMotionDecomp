package androidx.core.util;

import R5.N;
import R5.O;
import android.util.SparseLongArray;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(SparseLongArray sparseLongArray, int i8) {
        if (sparseLongArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i8) {
        if (sparseLongArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j8) {
        if (sparseLongArray.indexOfValue(j8) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseLongArray sparseLongArray, InterfaceC2072n interfaceC2072n) {
        int size = sparseLongArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(sparseLongArray.keyAt(i8)), Long.valueOf(sparseLongArray.valueAt(i8)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i8, long j8) {
        return sparseLongArray.get(i8, j8);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i8, Function0 function0) {
        int indexOfKey = sparseLongArray.indexOfKey(i8);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return ((Number) function0.invoke()).longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final N keyIterator(final SparseLongArray sparseLongArray) {
        return new N() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseLongArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseLongArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i8), sparseLongArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i8, long j8) {
        int indexOfKey = sparseLongArray.indexOfKey(i8);
        if (indexOfKey >= 0 && j8 == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(SparseLongArray sparseLongArray, int i8, long j8) {
        sparseLongArray.put(i8, j8);
    }

    public static final O valueIterator(final SparseLongArray sparseLongArray) {
        return new O() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseLongArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.O
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseLongArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
