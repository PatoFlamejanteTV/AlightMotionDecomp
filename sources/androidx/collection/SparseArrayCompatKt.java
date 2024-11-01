package androidx.collection;

import R5.AbstractC1428l;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int i9 = sparseArrayCompat.size;
        if (i9 != 0 && i8 <= sparseArrayCompat.keys[i9 - 1]) {
            sparseArrayCompat.put(i8, e8);
            return;
        }
        if (sparseArrayCompat.garbage && i9 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        if (i10 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            sparseArrayCompat.values = copyOf2;
        }
        sparseArrayCompat.keys[i10] = i8;
        sparseArrayCompat.values[i10] = e8;
        sparseArrayCompat.size = i10 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int i8 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i8 = sparseArrayCompat.size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                if (sparseArrayCompat.values[i9] == e8) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 < 0) {
            return false;
        }
        return true;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        E e8;
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        if (binarySearch < 0 || (e8 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return null;
        }
        return e8;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i8 = sparseArrayCompat.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (sparseArrayCompat.values[i9] == e8) {
                return i9;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i8];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e8;
            return;
        }
        int i9 = ~binarySearch;
        if (i9 < sparseArrayCompat.size && sparseArrayCompat.values[i9] == DELETED) {
            sparseArrayCompat.keys[i9] = i8;
            sparseArrayCompat.values[i9] = e8;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i9 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        }
        int i10 = sparseArrayCompat.size;
        if (i10 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            sparseArrayCompat.values = copyOf2;
        }
        int i11 = sparseArrayCompat.size;
        if (i11 - i9 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i12 = i9 + 1;
            AbstractC1428l.g(iArr, iArr, i12, i9, i11);
            Object[] objArr = sparseArrayCompat.values;
            AbstractC1428l.i(objArr, objArr, i12, i9, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i9] = i8;
        sparseArrayCompat.values[i9] = e8;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> other) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        AbstractC3292y.i(other, "other");
        int size = other.size();
        for (int i8 = 0; i8 < size; i8++) {
            int keyAt = other.keyAt(i8);
            E valueAt = other.valueAt(i8);
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i9 = ~binarySearch;
                if (i9 < sparseArrayCompat.size && sparseArrayCompat.values[i9] == DELETED) {
                    sparseArrayCompat.keys[i9] = keyAt;
                    sparseArrayCompat.values[i9] = valueAt;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i9 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    int i10 = sparseArrayCompat.size;
                    if (i10 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i11 = sparseArrayCompat.size;
                    if (i11 - i9 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i12 = i9 + 1;
                        AbstractC1428l.g(iArr, iArr, i12, i9, i11);
                        Object[] objArr = sparseArrayCompat.values;
                        AbstractC1428l.i(objArr, objArr, i12, i9, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i9] = keyAt;
                    sparseArrayCompat.values[i9] = valueAt;
                    sparseArrayCompat.size++;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        E e9 = (E) commonGet(sparseArrayCompat, i8);
        if (e9 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e8;
            } else {
                int i9 = ~binarySearch;
                if (i9 < sparseArrayCompat.size && sparseArrayCompat.values[i9] == DELETED) {
                    sparseArrayCompat.keys[i9] = i8;
                    sparseArrayCompat.values[i9] = e8;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i9 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
                    }
                    int i10 = sparseArrayCompat.size;
                    if (i10 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i11 = sparseArrayCompat.size;
                    if (i11 - i9 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i12 = i9 + 1;
                        AbstractC1428l.g(iArr, iArr, i12, i9, i11);
                        Object[] objArr = sparseArrayCompat.values;
                        AbstractC1428l.i(objArr, objArr, i12, i9, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i9] = i8;
                    sparseArrayCompat.values[i9] = e8;
                    sparseArrayCompat.size++;
                }
            }
        }
        return e9;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        if (binarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i8] != DELETED) {
            sparseArrayCompat.values[i8] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i8, int i9) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int min = Math.min(i9, i8 + i9);
        while (i8 < min) {
            sparseArrayCompat.removeAt(i8);
            i8++;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i8);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e9 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e8;
        return e9;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i8] = e8;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i8 = sparseArrayCompat.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i9));
            sb.append('=');
            E valueAt = sparseArrayCompat.valueAt(i9);
            if (valueAt != sparseArrayCompat) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "buffer.toString()");
        return sb2;
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i8 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != DELETED) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i9;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i8, T t8) {
        T t9;
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        if (binarySearch >= 0 && (t9 = (T) sparseArrayCompat.values[binarySearch]) != DELETED) {
            return t9;
        }
        return t8;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8) {
        E e9;
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i8);
        return (binarySearch < 0 || (e9 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e8 : e9;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i8, E e8, E e9) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i8);
        if (indexOfKey < 0 || !AbstractC3292y.d(sparseArrayCompat.values[indexOfKey], e8)) {
            return false;
        }
        sparseArrayCompat.values[indexOfKey] = e9;
        return true;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i8, Object obj) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i8);
        if (indexOfKey < 0 || !AbstractC3292y.d(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }
}
