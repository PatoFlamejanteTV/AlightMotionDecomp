package androidx.collection;

import R5.AbstractC1428l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i8 = this.head;
        int i9 = length - i8;
        int i10 = length << 1;
        if (i10 >= 0) {
            E[] eArr2 = (E[]) new Object[i10];
            AbstractC1428l.i(eArr, eArr2, 0, i8, length);
            AbstractC1428l.i(this.elements, eArr2, i9, 0, this.head);
            this.elements = eArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i10 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(E e8) {
        int i8 = (this.head - 1) & this.capacityBitmask;
        this.head = i8;
        this.elements[i8] = e8;
        if (i8 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e8) {
        E[] eArr = this.elements;
        int i8 = this.tail;
        eArr[i8] = e8;
        int i9 = this.capacityBitmask & (i8 + 1);
        this.tail = i9;
        if (i9 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i8) {
        if (i8 >= 0 && i8 < size()) {
            E e8 = this.elements[this.capacityBitmask & (this.head + i8)];
            AbstractC3292y.f(e8);
            return e8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getFirst() {
        int i8 = this.head;
        if (i8 != this.tail) {
            E e8 = this.elements[i8];
            AbstractC3292y.f(e8);
            return e8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getLast() {
        int i8 = this.head;
        int i9 = this.tail;
        if (i8 != i9) {
            E e8 = this.elements[(i9 - 1) & this.capacityBitmask];
            AbstractC3292y.f(e8);
            return e8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        if (this.head == this.tail) {
            return true;
        }
        return false;
    }

    public final E popFirst() {
        int i8 = this.head;
        if (i8 != this.tail) {
            E[] eArr = this.elements;
            E e8 = eArr[i8];
            eArr[i8] = null;
            this.head = (i8 + 1) & this.capacityBitmask;
            return e8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E popLast() {
        int i8 = this.head;
        int i9 = this.tail;
        if (i8 != i9) {
            int i10 = this.capacityBitmask & (i9 - 1);
            E[] eArr = this.elements;
            E e8 = eArr[i10];
            eArr[i10] = null;
            this.tail = i10;
            return e8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int i8) {
        int i9;
        if (i8 <= 0) {
            return;
        }
        if (i8 <= size()) {
            int i10 = this.tail;
            if (i8 < i10) {
                i9 = i10 - i8;
            } else {
                i9 = 0;
            }
            for (int i11 = i9; i11 < i10; i11++) {
                this.elements[i11] = null;
            }
            int i12 = this.tail;
            int i13 = i12 - i9;
            int i14 = i8 - i13;
            this.tail = i12 - i13;
            if (i14 > 0) {
                int length = this.elements.length;
                this.tail = length;
                int i15 = length - i14;
                for (int i16 = i15; i16 < length; i16++) {
                    this.elements[i16] = null;
                }
                this.tail = i15;
                return;
            }
            return;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromStart(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 <= size()) {
            int length = this.elements.length;
            int i9 = this.head;
            if (i8 < length - i9) {
                length = i9 + i8;
            }
            while (i9 < length) {
                this.elements[i9] = null;
                i9++;
            }
            int i10 = this.head;
            int i11 = length - i10;
            int i12 = i8 - i11;
            this.head = this.capacityBitmask & (i10 + i11);
            if (i12 > 0) {
                for (int i13 = 0; i13 < i12; i13++) {
                    this.elements[i13] = null;
                }
                this.head = i12;
                return;
            }
            return;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularArray(int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i8 <= 1073741824) {
            i8 = Integer.bitCount(i8) != 1 ? Integer.highestOneBit(i8 - 1) << 1 : i8;
            this.capacityBitmask = i8 - 1;
            this.elements = (E[]) new Object[i8];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30".toString());
    }

    public /* synthetic */ CircularArray(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 8 : i8);
    }
}
