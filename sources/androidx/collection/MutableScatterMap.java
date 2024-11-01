package androidx.collection;

import Q5.C;
import Q5.r;
import R5.AbstractC1428l;
import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d6.InterfaceC2770d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    /* loaded from: classes.dex */
    private final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, InterfaceC2770d, j$.util.Map {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V put(K k8, V v8) {
            return MutableScatterMap.this.put(k8, v8);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(Map<? extends K, ? extends V> from) {
            AbstractC3292y.i(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
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
        this.values = new Object[i9];
    }

    private final void resizeStorage(int i8) {
        int i9;
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = this._capacity;
        initializeStorage(i8);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
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
                long[] jArr2 = this.metadata;
                int i15 = findFirstAvailableSlot >> 3;
                int i16 = (findFirstAvailableSlot & 7) << 3;
                i9 = i12;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j8 << i16);
                int i17 = this._capacity;
                int i18 = ((findFirstAvailableSlot - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j8 << i20);
                objArr3[findFirstAvailableSlot] = obj;
                objArr4[findFirstAvailableSlot] = objArr2[i9];
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

    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
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
        AbstractC1428l.t(this.values, null, 0, this._capacity);
        AbstractC1428l.t(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K k8, InterfaceC2072n computeBlock) {
        boolean z8;
        Object obj;
        AbstractC3292y.i(computeBlock, "computeBlock");
        int findInsertIndex = findInsertIndex(k8);
        if (findInsertIndex < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            obj = null;
        } else {
            obj = this.values[findInsertIndex];
        }
        V v8 = (V) computeBlock.invoke(k8, obj);
        if (z8) {
            int i8 = ~findInsertIndex;
            this.keys[i8] = k8;
            this.values[i8] = v8;
        } else {
            this.values[findInsertIndex] = v8;
        }
        return v8;
    }

    public final int findInsertIndex(K k8) {
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

    public final V getOrPut(K k8, Function0 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        V v8 = get(k8);
        if (v8 == null) {
            V v9 = (V) defaultValue.invoke();
            set(k8, v9);
            return v9;
        }
        return v8;
    }

    public final void minusAssign(K k8) {
        remove(k8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(r pair) {
        AbstractC3292y.i(pair, "pair");
        set(pair.c(), pair.d());
    }

    public final V put(K k8, V v8) {
        int findInsertIndex = findInsertIndex(k8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        V v9 = (V) objArr[findInsertIndex];
        this.keys[findInsertIndex] = k8;
        objArr[findInsertIndex] = v8;
        return v9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(r[] pairs) {
        AbstractC3292y.i(pairs, "pairs");
        for (r rVar : pairs) {
            set(rVar.a(), rVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:            if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L17:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L45:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC3292y.d(r11, r14)
            if (r11 == 0) goto L5e
            goto L6e
        L5e:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L45
        L64:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L77
            r10 = -1
        L6e:
            if (r10 < 0) goto L75
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L75:
            r14 = 0
            return r14
        L77:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
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
                            if (((Boolean) predicate.invoke(this.keys[i11], this.values[i11])).booleanValue()) {
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

    public final V removeValueAt(int i8) {
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
        Object[] objArr = this.values;
        V v8 = (V) objArr[i8];
        objArr[i8] = null;
        return v8;
    }

    public final void set(K k8, V v8) {
        int findInsertIndex = findInsertIndex(k8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = k8;
        this.values[findInsertIndex] = v8;
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

    public /* synthetic */ MutableScatterMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(K[] keys) {
        AbstractC3292y.i(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final void plusAssign(r[] pairs) {
        AbstractC3292y.i(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(Iterable<? extends r> pairs) {
        AbstractC3292y.i(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Iterable<? extends r> pairs) {
        AbstractC3292y.i(pairs, "pairs");
        for (r rVar : pairs) {
            set(rVar.a(), rVar.b());
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        AbstractC3292y.i(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(InterfaceC3255g pairs) {
        AbstractC3292y.i(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        AbstractC3292y.i(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(InterfaceC3255g pairs) {
        AbstractC3292y.i(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            set(rVar.a(), rVar.b());
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

    public final void plusAssign(ScatterMap<K, V> from) {
        AbstractC3292y.i(from, "from");
        putAll(from);
    }

    public final void putAll(Map<K, ? extends V> from) {
        AbstractC3292y.i(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:            if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(K r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L4a:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L69
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC3292y.d(r15, r1)
            if (r15 == 0) goto L63
            goto L73
        L63:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L4a
        L69:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L86
            r11 = -1
        L73:
            if (r11 < 0) goto L85
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.AbstractC3292y.d(r1, r7)
            if (r1 == 0) goto L85
            r0.removeValueAt(r11)
            return r12
        L85:
            return r2
        L86:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        AbstractC3292y.i(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i11 = (i8 << 3) + i10;
                        set(objArr[i11], objArr2[i11]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        AbstractC3292y.i(keys, "keys");
        Object[] objArr = keys.content;
        int i8 = keys._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(objArr[i9]);
        }
    }
}
