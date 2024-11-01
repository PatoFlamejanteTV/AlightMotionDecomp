package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    ProtobufArrayList() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i8) {
        return (E[]) new Object[i8];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i8) {
        if (i8 >= 0 && i8 < this.size) {
        } else {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i8) {
        return "Index:" + i8 + ", Size:" + this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        ensureIsMutable();
        int i8 = this.size;
        E[] eArr = this.array;
        if (i8 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i8 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i9 = this.size;
        this.size = i9 + 1;
        eArr2[i9] = e8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        E[] eArr = this.array;
        E e8 = eArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(eArr, i8 + 1, eArr, i8, (r2 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i8, E e8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        E[] eArr = this.array;
        E e9 = eArr[i8];
        eArr[i8] = e8;
        ((AbstractList) this).modCount++;
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i8) {
        this.array = eArr;
        this.size = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int i8) {
        if (i8 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, E e8) {
        int i9;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i9 = this.size)) {
            E[] eArr = this.array;
            if (i9 < eArr.length) {
                System.arraycopy(eArr, i8, eArr, i8 + 1, i9 - i8);
            } else {
                E[] eArr2 = (E[]) createArray(((i9 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, eArr2, 0, i8);
                System.arraycopy(this.array, i8, eArr2, i8 + 1, this.size - i8);
                this.array = eArr2;
            }
            this.array[i8] = e8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
