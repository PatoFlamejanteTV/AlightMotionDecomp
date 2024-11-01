package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[0], 0);
        EMPTY_LIST = booleanArrayList;
        booleanArrayList.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanArrayList() {
        this(new boolean[10], 0);
    }

    public static BooleanArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i8 = booleanArrayList.size;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.size;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            boolean[] zArr = this.array;
            if (i10 > zArr.length) {
                this.array = Arrays.copyOf(zArr, i10);
            }
            System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
            this.size = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public void addBoolean(boolean z8) {
        ensureIsMutable();
        int i8 = this.size;
        boolean[] zArr = this.array;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i9 = this.size;
        this.size = i9 + 1;
        zArr3[i9] = z8;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i8 = 0; i8 < this.size; i8++) {
            if (this.array[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean getBoolean(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.size; i9++) {
            i8 = (i8 * 31) + Internal.hashBoolean(this.array[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.array[i8] == booleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        ensureIsMutable();
        if (i9 >= i8) {
            boolean[] zArr = this.array;
            System.arraycopy(zArr, i9, zArr, i8, this.size - i9);
            this.size -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean setBoolean(int i8, boolean z8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        boolean[] zArr = this.array;
        boolean z9 = zArr[i8];
        zArr[i8] = z8;
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i8) {
        this.array = zArr;
        this.size = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i8) {
        return Boolean.valueOf(getBoolean(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i8) {
        if (i8 >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        boolean[] zArr = this.array;
        boolean z8 = zArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int i8, Boolean bool) {
        return Boolean.valueOf(setBoolean(i8, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, Boolean bool) {
        addBoolean(i8, bool.booleanValue());
    }

    private void addBoolean(int i8, boolean z8) {
        int i9;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i9 = this.size)) {
            boolean[] zArr = this.array;
            if (i9 < zArr.length) {
                System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
            } else {
                boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i8);
                System.arraycopy(this.array, i8, zArr2, i8 + 1, this.size - i8);
                this.array = zArr2;
            }
            this.array[i8] = z8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
