package androidx.core.util;

import R5.N;
import R5.r;
import android.util.SparseBooleanArray;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i8) {
        if (sparseBooleanArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i8) {
        if (sparseBooleanArray.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z8) {
        if (sparseBooleanArray.indexOfValue(z8) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, InterfaceC2072n interfaceC2072n) {
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i8)), Boolean.valueOf(sparseBooleanArray.valueAt(i8)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i8, boolean z8) {
        return sparseBooleanArray.get(i8, z8);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i8, Function0 function0) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i8);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final N keyIterator(final SparseBooleanArray sparseBooleanArray) {
        return new N() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseBooleanArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseBooleanArray2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i8), sparseBooleanArray2.valueAt(i8));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i8, boolean z8) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i8);
        if (indexOfKey >= 0 && z8 == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(i8);
            return true;
        }
        return false;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i8, boolean z8) {
        sparseBooleanArray.put(i8, z8);
    }

    public static final r valueIterator(final SparseBooleanArray sparseBooleanArray) {
        return new r() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseBooleanArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.r
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseBooleanArray2.valueAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }
}
