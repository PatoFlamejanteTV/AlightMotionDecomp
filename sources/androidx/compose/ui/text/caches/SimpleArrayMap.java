package androidx.compose.ui.text.caches;

import R5.AbstractC1428l;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    public static final int $stable = 8;
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K k8) {
        if (indexOfKey(k8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(V v8) {
        if (indexOfValue$ui_text_release(v8) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int i8) {
        int i9 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i8);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i8 << 1);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
        }
        if (this._size == i9) {
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
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i8 = this._size;
                if (i8 != simpleArrayMap._size) {
                    return false;
                }
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
            if (!(obj instanceof Map) || this._size != ((Map) obj).size()) {
                return false;
            }
            int i10 = this._size;
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

    public final V get(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k8, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return v8;
    }

    protected final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int i8;
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i9 = this._size;
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

    protected final int indexOf(Object obj, int i8) {
        int i9 = this._size;
        if (i9 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i9, i8);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (AbstractC3292y.d(obj, this.keyValues[binarySearchInternal << 1])) {
            return binarySearchInternal;
        }
        int i10 = binarySearchInternal + 1;
        while (i10 < i9 && this.hashes[i10] == i8) {
            if (AbstractC3292y.d(obj, this.keyValues[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = binarySearchInternal - 1; i11 >= 0 && this.hashes[i11] == i8; i11--) {
            if (AbstractC3292y.d(obj, this.keyValues[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public final int indexOfKey(Object obj) {
        if (obj == null) {
            return indexOfNull();
        }
        return indexOf(obj, obj.hashCode());
    }

    protected final int indexOfNull() {
        int i8 = this._size;
        if (i8 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i8, 0);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (this.keyValues[binarySearchInternal << 1] == null) {
            return binarySearchInternal;
        }
        int i9 = binarySearchInternal + 1;
        while (i9 < i8 && this.hashes[i9] == 0) {
            if (this.keyValues[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = binarySearchInternal - 1; i10 >= 0 && this.hashes[i10] == 0; i10--) {
            if (this.keyValues[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int indexOfValue$ui_text_release(V v8) {
        int i8 = this._size << 1;
        Object[] objArr = this.keyValues;
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

    public final boolean isEmpty() {
        if (this._size <= 0) {
            return true;
        }
        return false;
    }

    public final K keyAt(int i8) {
        return (K) this.keyValues[i8 << 1];
    }

    public final V put(K k8, V v8) {
        int hashCode;
        int indexOf;
        int i8 = this._size;
        if (k8 == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k8.hashCode();
            indexOf = indexOf(k8, hashCode);
        }
        if (indexOf >= 0) {
            int i9 = (indexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v9 = (V) objArr[i9];
            objArr[i9] = v8;
            return v9;
        }
        int i10 = ~indexOf;
        int[] iArr = this.hashes;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i11 << 1);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
            if (i8 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.hashes;
            int i12 = i10 + 1;
            AbstractC1428l.g(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.keyValues;
            AbstractC1428l.i(objArr2, objArr2, i12 << 1, i10 << 1, this._size << 1);
        }
        int i13 = this._size;
        if (i8 == i13) {
            int[] iArr3 = this.hashes;
            if (i10 < iArr3.length) {
                iArr3[i10] = hashCode;
                Object[] objArr3 = this.keyValues;
                int i14 = i10 << 1;
                objArr3[i14] = k8;
                objArr3[i14 + 1] = v8;
                this._size = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i8 = simpleArrayMap._size;
        ensureCapacity(this._size + i8);
        if (this._size == 0) {
            if (i8 > 0) {
                AbstractC1428l.g(simpleArrayMap.hashes, this.hashes, 0, 0, i8);
                AbstractC1428l.i(simpleArrayMap.keyValues, this.keyValues, 0, 0, i8 << 1);
                this._size = i8;
                return;
            }
            return;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            put(simpleArrayMap.keyAt(i9), simpleArrayMap.valueAt(i9));
        }
    }

    public final V putIfAbsent(K k8, V v8) {
        V v9 = get(k8);
        if (v9 == null) {
            return put(k8, v8);
        }
        return v9;
    }

    public final V remove(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public final V removeAt(int i8) {
        Object[] objArr = this.keyValues;
        int i9 = i8 << 1;
        V v8 = (V) objArr[i9 + 1];
        int i10 = this._size;
        if (i10 <= 1) {
            clear();
        } else {
            int i11 = i10 - 1;
            int[] iArr = this.hashes;
            int i12 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i12 = i10 + (i10 >> 1);
                }
                int[] iArr2 = new int[i12];
                this.hashes = iArr2;
                this.keyValues = new Object[i12 << 1];
                if (i8 > 0) {
                    AbstractC1428l.g(iArr, iArr2, 0, 0, i8);
                    AbstractC1428l.i(objArr, this.keyValues, 0, 0, i9);
                }
                if (i8 < i11) {
                    int i13 = i8 + 1;
                    AbstractC1428l.g(iArr, this.hashes, i8, i13, i10);
                    AbstractC1428l.i(objArr, this.keyValues, i9, i13 << 1, i10 << 1);
                }
            } else {
                if (i8 < i11) {
                    int i14 = i8 + 1;
                    AbstractC1428l.g(iArr, iArr, i8, i14, i10);
                    Object[] objArr2 = this.keyValues;
                    AbstractC1428l.i(objArr2, objArr2, i9, i14 << 1, i10 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i15 = i11 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            }
            if (i10 == this._size) {
                this._size = i11;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v8;
    }

    public final V replace(K k8, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v8);
        }
        return null;
    }

    public final V setValueAt(int i8, V v8) {
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.keyValues;
        V v9 = (V) objArr[i9];
        objArr[i9] = v8;
        return v9;
    }

    protected final void set_size(int i8) {
        this._size = i8;
    }

    public final int size() {
        return this._size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i9);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i9);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final V valueAt(int i8) {
        return (V) this.keyValues[(i8 << 1) + 1];
    }

    public SimpleArrayMap(int i8) {
        if (i8 == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i8];
            this.keyValues = new Object[i8 << 1];
        }
        this._size = 0;
    }

    public final boolean remove(K k8, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || !AbstractC3292y.d(v8, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public final boolean replace(K k8, V v8, V v9) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || valueAt(indexOfKey) != v8) {
            return false;
        }
        setValueAt(indexOfKey, v9);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}
