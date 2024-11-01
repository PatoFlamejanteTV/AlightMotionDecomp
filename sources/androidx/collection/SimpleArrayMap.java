package androidx.collection;

import R5.AbstractC1428l;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t8) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (T) this.array[(indexOfKey << 1) + 1];
        }
        return t8;
    }

    private final int indexOf(K k8, int i8) {
        int i9 = this.size;
        if (i9 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i9, i8);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (AbstractC3292y.d(k8, this.array[binarySearch << 1])) {
            return binarySearch;
        }
        int i10 = binarySearch + 1;
        while (i10 < i9 && this.hashes[i10] == i8) {
            if (AbstractC3292y.d(k8, this.array[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = binarySearch - 1; i11 >= 0 && this.hashes[i11] == i8; i11--) {
            if (AbstractC3292y.d(k8, this.array[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    private final int indexOfNull() {
        int i8 = this.size;
        if (i8 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i8, 0);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (this.array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i9 = binarySearch + 1;
        while (i9 < i8 && this.hashes[i9] == 0) {
            if (this.array[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = binarySearch - 1; i10 >= 0 && this.hashes[i10] == 0; i10--) {
            if (this.array[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int __restricted$indexOfValue(V v8) {
        int i8 = this.size * 2;
        Object[] objArr = this.array;
        if (v8 == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (AbstractC3292y.d(v8, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k8) {
        if (indexOfKey(k8) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(V v8) {
        if (__restricted$indexOfValue(v8) >= 0) {
            return true;
        }
        return false;
    }

    public void ensureCapacity(int i8) {
        int i9 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i8);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i8 * 2);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size == i9) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i8 = this.size;
                for (int i9 = 0; i9 < i8; i9++) {
                    K keyAt = keyAt(i9);
                    V valueAt = valueAt(i9);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!AbstractC3292y.d(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.size;
            for (int i11 = 0; i11 < i10; i11++) {
                K keyAt2 = keyAt(i11);
                V valueAt2 = valueAt(i11);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!AbstractC3292y.d(valueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v8) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return v8;
    }

    public int hashCode() {
        int i8;
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i9 = this.size;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            Object obj = objArr[i10];
            int i13 = iArr[i11];
            if (obj != null) {
                i8 = obj.hashCode();
            } else {
                i8 = 0;
            }
            i12 += i8 ^ i13;
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public int indexOfKey(K k8) {
        if (k8 == null) {
            return indexOfNull();
        }
        return indexOf(k8, k8.hashCode());
    }

    public boolean isEmpty() {
        if (this.size <= 0) {
            return true;
        }
        return false;
    }

    public K keyAt(int i8) {
        if (i8 >= 0 && i8 < this.size) {
            return (K) this.array[i8 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public V put(K k8, V v8) {
        int i8;
        int indexOfNull;
        int i9 = this.size;
        if (k8 != null) {
            i8 = k8.hashCode();
        } else {
            i8 = 0;
        }
        if (k8 != null) {
            indexOfNull = indexOf(k8, i8);
        } else {
            indexOfNull = indexOfNull();
        }
        if (indexOfNull >= 0) {
            int i10 = (indexOfNull << 1) + 1;
            Object[] objArr = this.array;
            V v9 = (V) objArr[i10];
            objArr[i10] = v8;
            return v9;
        }
        int i11 = ~indexOfNull;
        int[] iArr = this.hashes;
        if (i9 >= iArr.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i12 << 1);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i9 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i9) {
            int[] iArr2 = this.hashes;
            int i13 = i11 + 1;
            AbstractC1428l.g(iArr2, iArr2, i13, i11, i9);
            Object[] objArr2 = this.array;
            AbstractC1428l.i(objArr2, objArr2, i13 << 1, i11 << 1, this.size << 1);
        }
        int i14 = this.size;
        if (i9 == i14) {
            int[] iArr3 = this.hashes;
            if (i11 < iArr3.length) {
                iArr3[i11] = i8;
                Object[] objArr3 = this.array;
                int i15 = i11 << 1;
                objArr3[i15] = k8;
                objArr3[i15 + 1] = v8;
                this.size = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        AbstractC3292y.i(map, "map");
        int i8 = map.size;
        ensureCapacity(this.size + i8);
        if (this.size == 0) {
            if (i8 > 0) {
                AbstractC1428l.g(map.hashes, this.hashes, 0, 0, i8);
                AbstractC1428l.i(map.array, this.array, 0, 0, i8 << 1);
                this.size = i8;
                return;
            }
            return;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            put(map.keyAt(i9), map.valueAt(i9));
        }
    }

    public V putIfAbsent(K k8, V v8) {
        V v9 = get(k8);
        if (v9 == null) {
            return put(k8, v8);
        }
        return v9;
    }

    public V remove(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this.size)) {
            Object[] objArr = this.array;
            int i10 = i8 << 1;
            V v8 = (V) objArr[i10 + 1];
            if (i9 <= 1) {
                clear();
            } else {
                int i11 = i9 - 1;
                int[] iArr = this.hashes;
                int i12 = 8;
                if (iArr.length > 8 && i9 < iArr.length / 3) {
                    if (i9 > 8) {
                        i12 = i9 + (i9 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i12);
                    AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                    this.hashes = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.array, i12 << 1);
                    AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
                    this.array = copyOf2;
                    if (i9 == this.size) {
                        if (i8 > 0) {
                            AbstractC1428l.g(iArr, this.hashes, 0, 0, i8);
                            AbstractC1428l.i(objArr, this.array, 0, 0, i10);
                        }
                        if (i8 < i11) {
                            int i13 = i8 + 1;
                            AbstractC1428l.g(iArr, this.hashes, i8, i13, i9);
                            AbstractC1428l.i(objArr, this.array, i10, i13 << 1, i9 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i8 < i11) {
                        int i14 = i8 + 1;
                        AbstractC1428l.g(iArr, iArr, i8, i14, i9);
                        Object[] objArr2 = this.array;
                        AbstractC1428l.i(objArr2, objArr2, i10, i14 << 1, i9 << 1);
                    }
                    Object[] objArr3 = this.array;
                    int i15 = i11 << 1;
                    objArr3[i15] = null;
                    objArr3[i15 + 1] = null;
                }
                if (i9 == this.size) {
                    this.size = i11;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return v8;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public V replace(K k8, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v8);
        }
        return null;
    }

    public V setValueAt(int i8, V v8) {
        if (i8 >= 0 && i8 < this.size) {
            int i9 = (i8 << 1) + 1;
            Object[] objArr = this.array;
            V v9 = (V) objArr[i9];
            objArr[i9] = v8;
            return v9;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i9);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i9);
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

    public V valueAt(int i8) {
        if (i8 >= 0 && i8 < this.size) {
            return (V) this.array[(i8 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public SimpleArrayMap(int i8) {
        int[] iArr;
        Object[] objArr;
        if (i8 == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i8];
        }
        this.hashes = iArr;
        if (i8 == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i8 << 1];
        }
        this.array = objArr;
    }

    public boolean remove(K k8, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || !AbstractC3292y.d(v8, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K k8, V v8, V v9) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || !AbstractC3292y.d(v8, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v9);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
