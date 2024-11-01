package androidx.collection;

import R5.AbstractC1428l;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void append(int i8, E e8) {
        int i9 = this.size;
        if (i9 != 0 && i8 <= this.keys[i9 - 1]) {
            put(i8, e8);
            return;
        }
        if (this.garbage && i9 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i10 = this.size;
        if (i10 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i10] = i8;
        this.values[i10] = e8;
        this.size = i10 + 1;
    }

    public void clear() {
        int i8 = this.size;
        Object[] objArr = this.values;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i8) {
        if (indexOfKey(i8) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(E e8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i8 = this.size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                if (this.values[i9] == e8) {
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

    public void delete(int i8) {
        remove(i8);
    }

    public E get(int i8) {
        return (E) SparseArrayCompatKt.commonGet(this, i8);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i8);
    }

    public int indexOfValue(E e8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.values[i9] == e8) {
                return i9;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int keyAt(int i8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i8];
    }

    public void put(int i8, E e8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i8);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e8;
            return;
        }
        int i9 = ~binarySearch;
        if (i9 < this.size && this.values[i9] == SparseArrayCompatKt.DELETED) {
            this.keys[i9] = i8;
            this.values[i9] = e8;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i9 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i8);
        }
        int i10 = this.size;
        if (i10 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i11 = this.size;
        if (i11 - i9 != 0) {
            int[] iArr = this.keys;
            int i12 = i9 + 1;
            AbstractC1428l.g(iArr, iArr, i12, i9, i11);
            Object[] objArr = this.values;
            AbstractC1428l.i(objArr, objArr, i12, i9, this.size);
        }
        this.keys[i9] = i8;
        this.values[i9] = e8;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> other) {
        AbstractC3292y.i(other, "other");
        int size = other.size();
        for (int i8 = 0; i8 < size; i8++) {
            int keyAt = other.keyAt(i8);
            E valueAt = other.valueAt(i8);
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i9 = ~binarySearch;
                if (i9 < this.size && this.values[i9] == SparseArrayCompatKt.DELETED) {
                    this.keys[i9] = keyAt;
                    this.values[i9] = valueAt;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i9 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i10 = this.size;
                    if (i10 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i11 = this.size;
                    if (i11 - i9 != 0) {
                        int[] iArr = this.keys;
                        int i12 = i9 + 1;
                        AbstractC1428l.g(iArr, iArr, i12, i9, i11);
                        Object[] objArr = this.values;
                        AbstractC1428l.i(objArr, objArr, i12, i9, this.size);
                    }
                    this.keys[i9] = keyAt;
                    this.values[i9] = valueAt;
                    this.size++;
                }
            }
        }
    }

    public E putIfAbsent(int i8, E e8) {
        E e9 = (E) SparseArrayCompatKt.commonGet(this, i8);
        if (e9 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i8);
            if (binarySearch >= 0) {
                this.values[binarySearch] = e8;
            } else {
                int i9 = ~binarySearch;
                if (i9 < this.size && this.values[i9] == SparseArrayCompatKt.DELETED) {
                    this.keys[i9] = i8;
                    this.values[i9] = e8;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i9 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i8);
                    }
                    int i10 = this.size;
                    if (i10 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i11 = this.size;
                    if (i11 - i9 != 0) {
                        int[] iArr = this.keys;
                        int i12 = i9 + 1;
                        AbstractC1428l.g(iArr, iArr, i12, i9, i11);
                        Object[] objArr = this.values;
                        AbstractC1428l.i(objArr, objArr, i12, i9, this.size);
                    }
                    this.keys[i9] = i8;
                    this.values[i9] = e8;
                    this.size++;
                }
            }
        }
        return e9;
    }

    public void remove(int i8) {
        SparseArrayCompatKt.commonRemove(this, i8);
    }

    public void removeAt(int i8) {
        if (this.values[i8] != SparseArrayCompatKt.DELETED) {
            this.values[i8] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i8, int i9) {
        int min = Math.min(i9, i8 + i9);
        while (i8 < min) {
            removeAt(i8);
            i8++;
        }
    }

    public E replace(int i8, E e8) {
        int indexOfKey = indexOfKey(i8);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e9 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e8;
        return e9;
    }

    public void setValueAt(int i8, E e8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i8] = e8;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i9));
            sb.append('=');
            E valueAt = valueAt(i9);
            if (valueAt != this) {
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

    public E valueAt(int i8) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return (E) this.values[i8];
    }

    public SparseArrayCompat(int i8) {
        if (i8 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i8);
            this.keys = new int[idealIntArraySize];
            this.values = new Object[idealIntArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m105clone() {
        Object clone = super.clone();
        AbstractC3292y.g(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i8, E e8) {
        return (E) SparseArrayCompatKt.commonGet(this, i8, e8);
    }

    public boolean remove(int i8, Object obj) {
        int indexOfKey = indexOfKey(i8);
        if (indexOfKey < 0 || !AbstractC3292y.d(obj, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(int i8, E e8, E e9) {
        int indexOfKey = indexOfKey(i8);
        if (indexOfKey < 0 || !AbstractC3292y.d(this.values[indexOfKey], e8)) {
            return false;
        }
        this.values[indexOfKey] = e9;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
