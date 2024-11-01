package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        EMPTY_LIST = longArrayList;
        longArrayList.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LongArrayList() {
        this(new long[10], 0);
    }

    public static LongArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i8 = longArrayList.size;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.size;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.array;
            if (i10 > jArr.length) {
                this.array = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
            this.size = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public void addLong(long j8) {
        ensureIsMutable();
        int i8 = this.size;
        long[] jArr = this.array;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i9 = this.size;
        this.size = i9 + 1;
        jArr3[i9] = j8;
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i8 = 0; i8 < this.size; i8++) {
            if (this.array[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long getLong(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.size; i9++) {
            i8 = (i8 * 31) + Internal.hashLong(this.array[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.array[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        ensureIsMutable();
        if (i9 >= i8) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i9, jArr, i8, this.size - i9);
            this.size -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long setLong(int i8, long j8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        long[] jArr = this.array;
        long j9 = jArr[i8];
        jArr[i8] = j8;
        return j9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i8) {
        this.array = jArr;
        this.size = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i8) {
        return Long.valueOf(getLong(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i8) {
        if (i8 >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        long[] jArr = this.array;
        long j8 = jArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i8, Long l8) {
        return Long.valueOf(setLong(i8, l8.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l8) {
        addLong(l8.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, Long l8) {
        addLong(i8, l8.longValue());
    }

    private void addLong(int i8, long j8) {
        int i9;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i9 = this.size)) {
            long[] jArr = this.array;
            if (i9 < jArr.length) {
                System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
            } else {
                long[] jArr2 = new long[((i9 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i8);
                System.arraycopy(this.array, i8, jArr2, i8 + 1, this.size - i8);
                this.array = jArr2;
            }
            this.array[i8] = j8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
