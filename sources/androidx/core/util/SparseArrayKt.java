package androidx.core.util;

import R5.N;
import android.util.SparseArray;
import c6.InterfaceC2072n;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArray<T> sparseArray, int i8) {
        if (sparseArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i8) {
        if (sparseArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t8) {
        if (sparseArray.indexOfValue(t8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, InterfaceC2072n interfaceC2072n) {
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(sparseArray.keyAt(i8)), sparseArray.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i8, T t8) {
        T t9 = sparseArray.get(i8);
        if (t9 != null) {
            return t9;
        }
        return t8;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i8, Function0 function0) {
        T t8 = sparseArray.get(i8);
        if (t8 == null) {
            return (T) function0.invoke();
        }
        return t8;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> N keyIterator(final SparseArray<T> sparseArray) {
        return new N() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), sparseArray2.valueAt(i8));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i8, T t8) {
        int indexOfKey = sparseArray.indexOfKey(i8);
        if (indexOfKey >= 0 && AbstractC3292y.d(t8, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i8, T t8) {
        sparseArray.put(i8, t8);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
