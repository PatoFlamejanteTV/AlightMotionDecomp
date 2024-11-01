package androidx.collection;

import Q5.C;
import R5.AbstractC1428l;
import androidx.annotation.IntRange;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    /* loaded from: classes.dex */
    private final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, InterfaceC2771e {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e8) {
            return MutableScatterSet.this.add(e8);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> elements) {
            AbstractC3292y.i(elements, "elements");
            return MutableScatterSet.this.addAll(elements);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            MutableScatterSet.this.clear();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return MutableScatterSet.this.remove(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            int size = MutableScatterSet.this.getSize();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                MutableScatterSet.this.minusAssign((MutableScatterSet<E>) it.next());
            }
            if (size != MutableScatterSet.this.getSize()) {
                return true;
            }
            return false;
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            boolean z8 = false;
            if (length >= 0) {
                int i8 = 0;
                boolean z9 = false;
                while (true) {
                    long j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j8) < 128) {
                                int i11 = (i8 << 3) + i10;
                                if (!elements.contains(mutableScatterSet.elements[i11])) {
                                    mutableScatterSet.removeElementAt(i11);
                                    z9 = true;
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i9 != 8) {
                            return z9;
                        }
                    }
                    if (i8 != length) {
                        i8++;
                    } else {
                        z8 = z9;
                        break;
                    }
                }
            }
            return z8;
        }
    }

    public MutableScatterSet() {
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

    private final int findAbsoluteInsertIndex(E e8) {
        int i8;
        int i9;
        if (e8 != null) {
            i8 = e8.hashCode();
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
                if (AbstractC3292y.d(this.elements[numberOfTrailingZeros], e8)) {
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
                return findFirstAvailableSlot;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
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
        this.elements = new Object[i9];
    }

    private final void resizeStorage(int i8) {
        int i9;
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i11 = this._capacity;
        initializeStorage(i8);
        Object[] objArr2 = this.elements;
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
                jArr2[i19] = ((~(255 << i20)) & jArr2[i19]) | (j8 << i20);
                objArr2[findFirstAvailableSlot] = obj;
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

    public final boolean add(E e8) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e8)] = e8;
        if (getSize() != size) {
            return true;
        }
        return false;
    }

    public final boolean addAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        plusAssign((Object[]) elements);
        return size != getSize();
    }

    public final Set<E> asMutableSet() {
        return new MutableSetWrapper();
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
        AbstractC1428l.t(this.elements, null, 0, this._capacity);
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:            if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(E r14) {
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
            java.lang.Object[] r11 = r13.elements
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
            if (r6 == 0) goto L74
            r10 = -1
        L6e:
            if (r10 < 0) goto L73
            r13.removeElementAt(r10)
        L73:
            return
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e8) {
        this.elements[findAbsoluteInsertIndex(e8)] = e8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:            if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r18) {
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
            java.lang.Object[] r15 = r0.elements
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
            if (r9 == 0) goto L7c
            r11 = -1
        L73:
            if (r11 < 0) goto L76
            r2 = 1
        L76:
            if (r2 == 0) goto L7b
            r0.removeElementAt(r11)
        L7b:
            return r2
        L7c:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        minusAssign((Object[]) elements);
        return size != getSize();
    }

    public final void removeElementAt(int i8) {
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
        this.elements[i8] = null;
    }

    public final void removeIf(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.elements;
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
                            if (((Boolean) predicate.invoke(objArr[i11])).booleanValue()) {
                                removeElementAt(i11);
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

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int trim() {
        int i8 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity < i8) {
            resizeStorage(normalizeCapacity);
            return i8 - this._capacity;
        }
        return 0;
    }

    public /* synthetic */ MutableScatterSet(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public MutableScatterSet(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (E e8 : elements) {
            plusAssign((MutableScatterSet<E>) e8);
        }
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        plusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean removeAll(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        minusAssign((Iterable) elements);
        return size != getSize();
    }

    public final void minusAssign(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (E e8 : elements) {
            minusAssign((MutableScatterSet<E>) e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign((MutableScatterSet<E>) objArr[(i8 << 3) + i10]);
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

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        plusAssign((ScatterSet) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        minusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        plusAssign((ObjectList) elements);
        return size != getSize();
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = getSize();
        minusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign((MutableScatterSet<E>) objArr[(i8 << 3) + i10]);
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
    public final void plusAssign(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            plusAssign((MutableScatterSet<E>) objArr[i9]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            minusAssign((MutableScatterSet<E>) objArr[i9]);
        }
    }
}
