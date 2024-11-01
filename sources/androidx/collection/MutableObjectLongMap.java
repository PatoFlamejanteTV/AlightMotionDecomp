package androidx.collection;

import Q5.C;
import R5.AbstractC1428l;
import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Iterator;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    private int growthLimit;

    public MutableObjectLongMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(C.b(C.b(this._size) * 32) ^ Long.MIN_VALUE, C.b(C.b(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findFirstAvailableSlot(int i8) {
        int i9 = this._capacity;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j8 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    private final int findIndex(K k8) {
        int i8;
        int i9;
        if (k8 != null) {
            i8 = k8.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * ScatterMapKt.MurmurHashC1;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & ModuleDescriptor.MODULE_VERSION;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j8 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j9 = i13;
            int i19 = i13;
            long j10 = j8 ^ (j9 * ScatterMapKt.BitmaskLsb);
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j11) >> 3)) & i14;
                if (AbstractC3292y.d(this.keys[numberOfTrailingZeros], k8)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i20 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i21 = findFirstAvailableSlot >> 3;
                long j12 = jArr2[i21];
                int i22 = (findFirstAvailableSlot & 7) << 3;
                if (((j12 >> i22) & 255) == 128) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                this.growthLimit = i20 - i9;
                jArr2[i21] = (j12 & (~(255 << i22))) | (j9 << i22);
                int i23 = this._capacity;
                int i24 = ((findFirstAvailableSlot - 7) & i23) + (i23 & 7);
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                jArr2[i25] = ((~(255 << i26)) & jArr2[i25]) | (j9 << i26);
                return ~findFirstAvailableSlot;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1428l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        initializeGrowth();
    }

    private final void initializeStorage(int i8) {
        int i9;
        if (i8 > 0) {
            i9 = Math.max(7, ScatterMapKt.normalizeCapacity(i8));
        } else {
            i9 = 0;
        }
        this._capacity = i9;
        initializeMetadata(i9);
        this.keys = new Object[i9];
        this.values = new long[i9];
    }

    private final void resizeStorage(int i8) {
        int i9;
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i11 = this._capacity;
        initializeStorage(i8);
        Object[] objArr2 = this.keys;
        long[] jArr3 = this.values;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i12];
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                int i13 = i10 * ScatterMapKt.MurmurHashC1;
                int i14 = i13 ^ (i13 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i14 >>> 7);
                long j8 = i14 & ModuleDescriptor.MODULE_VERSION;
                long[] jArr4 = this.metadata;
                int i15 = findFirstAvailableSlot >> 3;
                int i16 = (findFirstAvailableSlot & 7) << 3;
                i9 = i12;
                jArr4[i15] = (jArr4[i15] & (~(255 << i16))) | (j8 << i16);
                int i17 = this._capacity;
                int i18 = ((findFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr4[i19] = (jArr4[i19] & (~(255 << i20))) | (j8 << i20);
                objArr2[findFirstAvailableSlot] = obj;
                jArr3[findFirstAvailableSlot] = jArr2[i9];
            } else {
                i9 = i12;
            }
            i12 = i9 + 1;
        }
    }

    private final void writeMetadata(int i8, long j8) {
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (j8 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (j8 << i14) | (jArr[i13] & (~(255 << i14)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            AbstractC1428l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i8 = this._capacity;
            int i9 = i8 >> 3;
            long j8 = 255 << ((i8 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j8)) | j8;
        }
        AbstractC1428l.t(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final long getOrPut(K k8, Function0 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(k8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        long longValue = ((Number) defaultValue.invoke()).longValue();
        set(k8, longValue);
        return longValue;
    }

    public final void minusAssign(K k8) {
        remove(k8);
    }

    public final void plusAssign(ObjectLongMap<K> from) {
        AbstractC3292y.i(from, "from");
        putAll(from);
    }

    public final void put(K k8, long j8) {
        set(k8, j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ObjectLongMap<K> from) {
        AbstractC3292y.i(from, "from");
        Object[] objArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            set(objArr[i11], jArr[i11]);
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final void remove(K k8) {
        int findKeyIndex = findKeyIndex(k8);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (((Boolean) predicate.invoke(this.keys[i11], Long.valueOf(this.values[i11]))).booleanValue()) {
                                removeValueAt(i11);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final void removeValueAt(int i8) {
        this._size--;
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        this.keys[i8] = null;
    }

    public final void set(K k8, long j8) {
        int findIndex = findIndex(k8);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = k8;
        this.values[findIndex] = j8;
    }

    public final int trim() {
        int i8 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity < i8) {
            resizeStorage(normalizeCapacity);
            return i8 - this._capacity;
        }
        return 0;
    }

    public /* synthetic */ MutableObjectLongMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(K[] keys) {
        AbstractC3292y.i(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final long put(K k8, long j8, long j9) {
        int findIndex = findIndex(k8);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        } else {
            j9 = this.values[findIndex];
        }
        this.keys[findIndex] = k8;
        this.values[findIndex] = j8;
        return j9;
    }

    public MutableObjectLongMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean remove(K k8, long j8) {
        int findKeyIndex = findKeyIndex(k8);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != j8) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        AbstractC3292y.i(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC3255g keys) {
        AbstractC3292y.i(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        AbstractC3292y.i(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        remove(objArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }
}
