package androidx.collection;

import R5.AbstractC1428l;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public void append(long j8, E e8) {
        int i8 = this.size;
        if (i8 != 0 && j8 <= this.keys[i8 - 1]) {
            put(j8, e8);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i8 >= jArr.length) {
                Object[] objArr = this.values;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.garbage = false;
                this.size = i9;
            }
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i11] = j8;
        this.values[i11] = e8;
        this.size = i11 + 1;
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

    public boolean containsKey(long j8) {
        if (indexOfKey(j8) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(E e8) {
        if (indexOfValue(e8) >= 0) {
            return true;
        }
        return false;
    }

    public void delete(long j8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
        if (binarySearch >= 0 && this.values[binarySearch] != LongSparseArrayKt.access$getDELETED$p()) {
            this.values[binarySearch] = LongSparseArrayKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public E get(long j8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.access$getDELETED$p()) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public int indexOfKey(long j8) {
        if (this.garbage) {
            int i8 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
    }

    public int indexOfValue(E e8) {
        if (this.garbage) {
            int i8 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
        }
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.values[i12] == e8) {
                return i12;
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

    public long keyAt(int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this.size)) {
            if (this.garbage) {
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.garbage = false;
                this.size = i10;
            }
            return this.keys[i8];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public void put(long j8, E e8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e8;
            return;
        }
        int i8 = ~binarySearch;
        if (i8 < this.size && this.values[i8] == LongSparseArrayKt.access$getDELETED$p()) {
            this.keys[i8] = j8;
            this.values[i8] = e8;
            return;
        }
        if (this.garbage) {
            int i9 = this.size;
            long[] jArr = this.keys;
            if (i9 >= jArr.length) {
                Object[] objArr = this.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.garbage = false;
                this.size = i10;
                i8 = ~ContainerHelpersKt.binarySearch(this.keys, i10, j8);
            }
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i12 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i13 = this.size;
        if (i13 - i8 != 0) {
            long[] jArr2 = this.keys;
            int i14 = i8 + 1;
            AbstractC1428l.h(jArr2, jArr2, i14, i8, i13);
            Object[] objArr2 = this.values;
            AbstractC1428l.i(objArr2, objArr2, i14, i8, this.size);
        }
        this.keys[i8] = j8;
        this.values[i8] = e8;
        this.size++;
    }

    public void putAll(LongSparseArray<? extends E> other) {
        AbstractC3292y.i(other, "other");
        int size = other.size();
        for (int i8 = 0; i8 < size; i8++) {
            put(other.keyAt(i8), other.valueAt(i8));
        }
    }

    public E putIfAbsent(long j8, E e8) {
        E e9 = get(j8);
        if (e9 == null) {
            put(j8, e8);
        }
        return e9;
    }

    public void remove(long j8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.access$getDELETED$p()) {
            return;
        }
        this.values[binarySearch] = LongSparseArrayKt.access$getDELETED$p();
        this.garbage = true;
    }

    public void removeAt(int i8) {
        if (this.values[i8] != LongSparseArrayKt.access$getDELETED$p()) {
            this.values[i8] = LongSparseArrayKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public E replace(long j8, E e8) {
        int indexOfKey = indexOfKey(j8);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e9 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e8;
        return e9;
    }

    public void setValueAt(int i8, E e8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this.size)) {
            if (this.garbage) {
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.garbage = false;
                this.size = i10;
            }
            this.values[i8] = e8;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public int size() {
        if (this.garbage) {
            int i8 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.garbage = false;
            this.size = i9;
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

    public E valueAt(int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this.size)) {
            if (this.garbage) {
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.garbage = false;
                this.size = i10;
            }
            return (E) this.values[i8];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public LongSparseArray(int i8) {
        if (i8 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i8);
            this.keys = new long[idealLongArraySize];
            this.values = new Object[idealLongArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m104clone() {
        Object clone = super.clone();
        AbstractC3292y.g(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j8, E e8) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j8);
        return (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.access$getDELETED$p()) ? e8 : (E) this.values[binarySearch];
    }

    public boolean replace(long j8, E e8, E e9) {
        int indexOfKey = indexOfKey(j8);
        if (indexOfKey < 0 || !AbstractC3292y.d(this.values[indexOfKey], e8)) {
            return false;
        }
        this.values[indexOfKey] = e9;
        return true;
    }

    public boolean remove(long j8, E e8) {
        int indexOfKey = indexOfKey(j8);
        if (indexOfKey < 0 || !AbstractC3292y.d(e8, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
