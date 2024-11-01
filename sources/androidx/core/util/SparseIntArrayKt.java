package androidx.core.util;

import R5.N;
import android.util.SparseIntArray;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i8) {
        if (sparseIntArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i8) {
        if (sparseIntArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i8) {
        if (sparseIntArray.indexOfValue(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseIntArray sparseIntArray, InterfaceC2072n interfaceC2072n) {
        int size = sparseIntArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(sparseIntArray.keyAt(i8)), Integer.valueOf(sparseIntArray.valueAt(i8)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i8, int i9) {
        return sparseIntArray.get(i8, i9);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i8, Function0 function0) {
        int indexOfKey = sparseIntArray.indexOfKey(i8);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return ((Number) function0.invoke()).intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final N keyIterator(final SparseIntArray sparseIntArray) {
        return new N() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseIntArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseIntArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i8), sparseIntArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i8, int i9) {
        int indexOfKey = sparseIntArray.indexOfKey(i8);
        if (indexOfKey >= 0 && i9 == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(SparseIntArray sparseIntArray, int i8, int i9) {
        sparseIntArray.put(i8, i9);
    }

    public static final N valueIterator(final SparseIntArray sparseIntArray) {
        return new N() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseIntArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseIntArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
