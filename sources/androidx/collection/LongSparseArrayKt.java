package androidx.collection;

import R5.AbstractC1428l;
import R5.O;
import androidx.collection.internal.ContainerHelpersKt;
import c6.InterfaceC2072n;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int i8 = longSparseArray.size;
        if (i8 != 0 && j8 <= longSparseArray.keys[i8 - 1]) {
            longSparseArray.put(j8, e8);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i8 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != DELETED) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i9;
            }
        }
        int i11 = longSparseArray.size;
        if (i11 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            longSparseArray.values = copyOf2;
        }
        longSparseArray.keys[i11] = j8;
        longSparseArray.values[i11] = e8;
        longSparseArray.size = i11 + 1;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int i8 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(e8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int i8 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != DELETED) {
                if (i10 != i9) {
                    jArr[i9] = jArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i9;
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[binarySearch];
    }

    public static final <T extends E, E> T commonGetInternal(LongSparseArray<E> longSparseArray, long j8, T t8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
        if (binarySearch >= 0 && longSparseArray.values[binarySearch] != DELETED) {
            return (T) longSparseArray.values[binarySearch];
        }
        return t8;
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        int i11 = longSparseArray.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (longSparseArray.values[i12] == e8) {
                return i12;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i8) {
        int i9;
        AbstractC3292y.i(longSparseArray, "<this>");
        if (i8 >= 0 && i8 < (i9 = longSparseArray.size)) {
            if (longSparseArray.garbage) {
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != DELETED) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i10;
            }
            return longSparseArray.keys[i8];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
        if (binarySearch >= 0) {
            longSparseArray.values[binarySearch] = e8;
            return;
        }
        int i8 = ~binarySearch;
        if (i8 < longSparseArray.size && longSparseArray.values[i8] == DELETED) {
            longSparseArray.keys[i8] = j8;
            longSparseArray.values[i8] = e8;
            return;
        }
        if (longSparseArray.garbage) {
            int i9 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i9 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != DELETED) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i10;
                i8 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i10, j8);
            }
        }
        int i12 = longSparseArray.size;
        if (i12 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i12 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            longSparseArray.values = copyOf2;
        }
        int i13 = longSparseArray.size;
        if (i13 - i8 != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i14 = i8 + 1;
            AbstractC1428l.h(jArr2, jArr2, i14, i8, i13);
            Object[] objArr2 = longSparseArray.values;
            AbstractC1428l.i(objArr2, objArr2, i14, i8, longSparseArray.size);
        }
        longSparseArray.keys[i8] = j8;
        longSparseArray.values[i8] = e8;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> other) {
        AbstractC3292y.i(longSparseArray, "<this>");
        AbstractC3292y.i(other, "other");
        int size = other.size();
        for (int i8 = 0; i8 < size; i8++) {
            longSparseArray.put(other.keyAt(i8), other.valueAt(i8));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        E e9 = longSparseArray.get(j8);
        if (e9 == null) {
            longSparseArray.put(j8, e8);
        }
        return e9;
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[binarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.values[i8] != DELETED) {
            longSparseArray.values[i8] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j8);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e9 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e8;
        return e9;
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i8, E e8) {
        int i9;
        AbstractC3292y.i(longSparseArray, "<this>");
        if (i8 >= 0 && i8 < (i9 = longSparseArray.size)) {
            if (longSparseArray.garbage) {
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != DELETED) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i10;
            }
            longSparseArray.values[i8] = e8;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i8 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != DELETED) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i9;
        }
        return longSparseArray.size;
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append('{');
        int i8 = longSparseArray.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i9));
            sb.append('=');
            E valueAt = longSparseArray.valueAt(i9);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i8) {
        int i9;
        AbstractC3292y.i(longSparseArray, "<this>");
        if (i8 >= 0 && i8 < (i9 = longSparseArray.size)) {
            if (longSparseArray.garbage) {
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != DELETED) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i10;
            }
            return (E) longSparseArray.values[i8];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return longSparseArray.containsKey(j8);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, InterfaceC2072n action) {
        AbstractC3292y.i(longSparseArray, "<this>");
        AbstractC3292y.i(action, "action");
        int size = longSparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i8)), longSparseArray.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j8, T t8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return longSparseArray.get(j8, t8);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j8, Function0 defaultValue) {
        AbstractC3292y.i(longSparseArray, "<this>");
        AbstractC3292y.i(defaultValue, "defaultValue");
        T t8 = longSparseArray.get(j8);
        if (t8 == null) {
            return (T) defaultValue.invoke();
        }
        return t8;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    public static final <T> O keyIterator(final LongSparseArray<T> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return new O() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
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

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> other) {
        AbstractC3292y.i(longSparseArray, "<this>");
        AbstractC3292y.i(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j8, Object obj) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return longSparseArray.remove(j8, obj);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j8, T t8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        longSparseArray.put(j8, t8);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        AbstractC3292y.i(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j8);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) ? e8 : (E) longSparseArray.values[binarySearch];
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j8, E e8, E e9) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j8);
        if (indexOfKey < 0 || !AbstractC3292y.d(longSparseArray.values[indexOfKey], e8)) {
            return false;
        }
        longSparseArray.values[indexOfKey] = e9;
        return true;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j8, E e8) {
        AbstractC3292y.i(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j8);
        if (indexOfKey < 0 || !AbstractC3292y.d(e8, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }
}
