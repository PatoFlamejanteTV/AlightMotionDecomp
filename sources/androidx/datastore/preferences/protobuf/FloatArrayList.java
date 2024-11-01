package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        FloatArrayList floatArrayList = new FloatArrayList(new float[0], 0);
        EMPTY_LIST = floatArrayList;
        floatArrayList.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatArrayList() {
        this(new float[10], 0);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i8 = floatArrayList.size;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.size;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            float[] fArr = this.array;
            if (i10 > fArr.length) {
                this.array = Arrays.copyOf(fArr, i10);
            }
            System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
            this.size = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public void addFloat(float f8) {
        ensureIsMutable();
        int i8 = this.size;
        float[] fArr = this.array;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i9 = this.size;
        this.size = i9 + 1;
        fArr3[i9] = f8;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i8 = 0; i8 < this.size; i8++) {
            if (Float.floatToIntBits(this.array[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float getFloat(int i8) {
        ensureIndexInRange(i8);
        return this.array[i8];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.size; i9++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.array[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.array[i8] == floatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        ensureIsMutable();
        if (i9 >= i8) {
            float[] fArr = this.array;
            System.arraycopy(fArr, i9, fArr, i8, this.size - i9);
            this.size -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float setFloat(int i8, float f8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        float[] fArr = this.array;
        float f9 = fArr[i8];
        fArr[i8] = f8;
        return f9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i8) {
        this.array = fArr;
        this.size = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i8) {
        return Float.valueOf(getFloat(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i8) {
        if (i8 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i8), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i8) {
        ensureIsMutable();
        ensureIndexInRange(i8);
        float[] fArr = this.array;
        float f8 = fArr[i8];
        if (i8 < this.size - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i8, Float f8) {
        return Float.valueOf(setFloat(i8, f8.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f8) {
        addFloat(f8.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i8, Float f8) {
        addFloat(i8, f8.floatValue());
    }

    private void addFloat(int i8, float f8) {
        int i9;
        ensureIsMutable();
        if (i8 >= 0 && i8 <= (i9 = this.size)) {
            float[] fArr = this.array;
            if (i9 < fArr.length) {
                System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
            } else {
                float[] fArr2 = new float[((i9 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i8);
                System.arraycopy(this.array, i8, fArr2, i8 + 1, this.size - i8);
                this.array = fArr2;
            }
            this.array[i8] = f8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i8));
    }
}
