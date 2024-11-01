package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        EMPTY_LIST = intArrayList;
        intArrayList.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IntArrayList() {
        this(new int[10], 0);
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
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

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i8 = intArrayList.size;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.size;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.array;
            if (i10 > iArr.length) {
                this.array = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
            this.size = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int i8) {
        ensureIsMutable();
        int i9 = this.size;
        int[] iArr = this.array;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i8 = 0; i8 < this.size; i8++) {
            if (this.array[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.size; i9++) {
            i8 = (i8 * 31) + this.array[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.array[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        ensureIsMutable();
        if (i9 >= i8) {
            int[] iArr = this.array;
            System.arraycopy(iArr, i9, iArr, i8, this.size - i9);
            this.size -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int i8, int i9) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        int[] iArr = this.array;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i8) {
        this.array = iArr;
        this.size = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i8) {
        return Integer.valueOf(getInt(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i8) {
        if (i8 >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        int[] iArr = this.array;
        int i9 = iArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i8, Integer num) {
        return Integer.valueOf(setInt(i8, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, Integer num) {
        addInt(i8, num.intValue());
    }

    private void addInt(int i8, int i9) {
        int i10;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i10 = this.size)) {
            int[] iArr = this.array;
            if (i10 < iArr.length) {
                System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
            } else {
                int[] iArr2 = new int[((i10 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i8);
                System.arraycopy(this.array, i8, iArr2, i8 + 1, this.size - i8);
                this.array = iArr2;
            }
            this.array[i8] = i9;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
