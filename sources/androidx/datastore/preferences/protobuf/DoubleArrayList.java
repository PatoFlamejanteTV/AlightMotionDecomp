package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[0], 0);
        EMPTY_LIST = doubleArrayList;
        doubleArrayList.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DoubleArrayList() {
        this(new double[10], 0);
    }

    public static DoubleArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i8 = doubleArrayList.size;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.size;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            double[] dArr = this.array;
            if (i10 > dArr.length) {
                this.array = Arrays.copyOf(dArr, i10);
            }
            System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
            this.size = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public void addDouble(double d8) {
        ensureIsMutable();
        int i8 = this.size;
        double[] dArr = this.array;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i9 = this.size;
        this.size = i9 + 1;
        dArr3[i9] = d8;
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
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i8 = 0; i8 < this.size; i8++) {
            if (Double.doubleToLongBits(this.array[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double getDouble(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.size; i9++) {
            i8 = (i8 * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i9]));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.array[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        ensureIsMutable();
        if (i9 >= i8) {
            double[] dArr = this.array;
            System.arraycopy(dArr, i9, dArr, i8, this.size - i9);
            this.size -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double setDouble(int i8, double d8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        double[] dArr = this.array;
        double d9 = dArr[i8];
        dArr[i8] = d8;
        return d9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] dArr, int i8) {
        this.array = dArr;
        this.size = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i8) {
        return Double.valueOf(getDouble(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i8) {
        if (i8 >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        double[] dArr = this.array;
        double d8 = dArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int i8, Double d8) {
        return Double.valueOf(setDouble(i8, d8.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d8) {
        addDouble(d8.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, Double d8) {
        addDouble(i8, d8.doubleValue());
    }

    private void addDouble(int i8, double d8) {
        int i9;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i9 = this.size)) {
            double[] dArr = this.array;
            if (i9 < dArr.length) {
                System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
            } else {
                double[] dArr2 = new double[((i9 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i8);
                System.arraycopy(this.array, i8, dArr2, i8 + 1, this.size - i8);
                this.array = dArr2;
            }
            this.array[i8] = d8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
