package androidx.collection;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(array, "array");
        int i8 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i8);
        if (arraySet.get_size$collection() != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                arraySet.add(array.valueAt(i9));
            }
            return;
        }
        if (i8 > 0) {
            AbstractC1428l.l(array.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i8, 6, null);
            AbstractC1428l.n(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i8, 6, null);
            if (arraySet.get_size$collection() == 0) {
                arraySet.set_size$collection(i8);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean addInternal(ArraySet<E> arraySet, E e8) {
        int i8;
        int indexOf;
        AbstractC3292y.i(arraySet, "<this>");
        int i9 = arraySet.get_size$collection();
        boolean z8 = false;
        if (e8 == null) {
            indexOf = indexOfNull(arraySet);
            i8 = 0;
        } else {
            int hashCode = e8.hashCode();
            i8 = hashCode;
            indexOf = indexOf(arraySet, e8, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i10 = ~indexOf;
        if (i9 >= arraySet.getHashes$collection().length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i11);
            if (i9 == arraySet.get_size$collection()) {
                if (arraySet.getHashes$collection().length == 0) {
                    z8 = true;
                }
                if (!z8) {
                    AbstractC1428l.l(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    AbstractC1428l.n(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i9) {
            int i12 = i10 + 1;
            AbstractC1428l.g(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i12, i10, i9);
            AbstractC1428l.i(arraySet.getArray$collection(), arraySet.getArray$collection(), i12, i10, i9);
        }
        if (i9 == arraySet.get_size$collection() && i10 < arraySet.getHashes$collection().length) {
            arraySet.getHashes$collection()[i10] = i8;
            arraySet.getArray$collection()[i10] = e8;
            arraySet.set_size$collection(arraySet.get_size$collection() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i8]);
        arraySet.setArray$collection(new Object[i8]);
    }

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i8);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(ArraySet<E> arraySet) {
        AbstractC3292y.i(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(ArraySet<E> arraySet, E e8) {
        AbstractC3292y.i(arraySet, "<this>");
        if (arraySet.indexOf(e8) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> arraySet, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        int i9 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i8) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i8);
            if (arraySet.get_size$collection() > 0) {
                AbstractC1428l.l(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
                AbstractC1428l.n(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
            }
        }
        if (arraySet.get_size$collection() == i9) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(ArraySet<E> arraySet, Object obj) {
        AbstractC3292y.i(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i8 = arraySet.get_size$collection();
            for (int i9 = 0; i9 < i8; i9++) {
                if (!((Set) obj).contains(arraySet.valueAt(i9))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> arraySet) {
        AbstractC3292y.i(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i8 = arraySet.get_size$collection();
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += hashes$collection[i10];
        }
        return i9;
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        int i9 = arraySet.get_size$collection();
        if (i9 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i8);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (AbstractC3292y.d(obj, arraySet.getArray$collection()[binarySearchInternal])) {
            return binarySearchInternal;
        }
        int i10 = binarySearchInternal + 1;
        while (i10 < i9 && arraySet.getHashes$collection()[i10] == i8) {
            if (AbstractC3292y.d(obj, arraySet.getArray$collection()[i10])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = binarySearchInternal - 1; i11 >= 0 && arraySet.getHashes$collection()[i11] == i8; i11--) {
            if (AbstractC3292y.d(obj, arraySet.getArray$collection()[i11])) {
                return i11;
            }
        }
        return ~i10;
    }

    public static final <E> int indexOfInternal(ArraySet<E> arraySet, Object obj) {
        AbstractC3292y.i(arraySet, "<this>");
        if (obj == null) {
            return indexOfNull(arraySet);
        }
        return indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        AbstractC3292y.i(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> arraySet) {
        AbstractC3292y.i(arraySet, "<this>");
        if (arraySet.get_size$collection() <= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(array, "array");
        int i8 = array.get_size$collection();
        int i9 = arraySet.get_size$collection();
        for (int i10 = 0; i10 < i8; i10++) {
            arraySet.remove(array.valueAt(i10));
        }
        return i9 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(ArraySet<E> arraySet, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        int i9 = arraySet.get_size$collection();
        E e8 = (E) arraySet.getArray$collection()[i8];
        if (i9 <= 1) {
            arraySet.clear();
        } else {
            int i10 = i9 - 1;
            int i11 = 8;
            if (arraySet.getHashes$collection().length > 8 && arraySet.get_size$collection() < arraySet.getHashes$collection().length / 3) {
                if (arraySet.get_size$collection() > 8) {
                    i11 = arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1);
                }
                int[] hashes$collection = arraySet.getHashes$collection();
                Object[] array$collection = arraySet.getArray$collection();
                allocArrays(arraySet, i11);
                if (i8 > 0) {
                    AbstractC1428l.l(hashes$collection, arraySet.getHashes$collection(), 0, 0, i8, 6, null);
                    AbstractC1428l.n(array$collection, arraySet.getArray$collection(), 0, 0, i8, 6, null);
                }
                if (i8 < i10) {
                    int i12 = i8 + 1;
                    AbstractC1428l.g(hashes$collection, arraySet.getHashes$collection(), i8, i12, i9);
                    AbstractC1428l.i(array$collection, arraySet.getArray$collection(), i8, i12, i9);
                }
            } else {
                if (i8 < i10) {
                    int i13 = i8 + 1;
                    AbstractC1428l.g(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i8, i13, i9);
                    AbstractC1428l.i(arraySet.getArray$collection(), arraySet.getArray$collection(), i8, i13, i9);
                }
                arraySet.getArray$collection()[i10] = null;
            }
            if (i9 == arraySet.get_size$collection()) {
                arraySet.set_size$collection(i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e8;
    }

    public static final <E> boolean removeInternal(ArraySet<E> arraySet, E e8) {
        AbstractC3292y.i(arraySet, "<this>");
        int indexOf = arraySet.indexOf(e8);
        if (indexOf >= 0) {
            arraySet.removeAt(indexOf);
            return true;
        }
        return false;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(elements, "elements");
        boolean z8 = false;
        for (int i8 = arraySet.get_size$collection() - 1; -1 < i8; i8--) {
            if (!AbstractC1435t.d0(elements, arraySet.getArray$collection()[i8])) {
                arraySet.removeAt(i8);
                z8 = true;
            }
        }
        return z8;
    }

    public static final <E> String toStringInternal(ArraySet<E> arraySet) {
        AbstractC3292y.i(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(arraySet.get_size$collection() * 14);
        sb.append('{');
        int i8 = arraySet.get_size$collection();
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            E valueAt = arraySet.valueAt(i9);
            if (valueAt != arraySet) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <E> E valueAtInternal(ArraySet<E> arraySet, int i8) {
        AbstractC3292y.i(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i8];
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        AbstractC3292y.i(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t8 : values) {
            arraySet.add(t8);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= arraySet.remove(it.next());
        }
        return z8;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC3292y.i(arraySet, "<this>");
        AbstractC3292y.i(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= arraySet.add(it.next());
        }
        return z8;
    }
}
