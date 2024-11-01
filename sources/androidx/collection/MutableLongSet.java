package androidx.collection;

import Q5.C;
import R5.AbstractC1428l;
import androidx.annotation.IntRange;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableLongSet extends LongSet {
    private int growthLimit;

    public MutableLongSet() {
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

    private final int findAbsoluteInsertIndex(long j8) {
        int i8;
        int a9 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i9 = a9 ^ (a9 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this._capacity;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i14;
            long j11 = j9 ^ (j10 * ScatterMapKt.BitmaskLsb);
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.elements[numberOfTrailingZeros] == j8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i10);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i10);
                }
                this._size++;
                int i18 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i19 = findFirstAvailableSlot >> 3;
                long j13 = jArr2[i19];
                int i20 = (findFirstAvailableSlot & 7) << 3;
                if (((j13 >> i20) & 255) == 128) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                this.growthLimit = i18 - i8;
                jArr2[i19] = (j13 & (~(255 << i20))) | (j10 << i20);
                int i21 = this._capacity;
                int i22 = ((findFirstAvailableSlot - 7) & i21) + (i21 & 7);
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                jArr2[i23] = ((~(255 << i24)) & jArr2[i23]) | (j10 << i24);
                return findFirstAvailableSlot;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
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
        this.elements = new long[i9];
    }

    private final void removeElementAt(int i8) {
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
    }

    private final void resizeStorage(int i8) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i9 = this._capacity;
        initializeStorage(i8);
        long[] jArr5 = this.elements;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr3[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                long j8 = jArr4[i10];
                int a9 = a.a(j8) * ScatterMapKt.MurmurHashC1;
                int i11 = a9 ^ (a9 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                long j9 = i11 & ModuleDescriptor.MODULE_VERSION;
                long[] jArr6 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                int i13 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i12] = (jArr6[i12] & (~(255 << i13))) | (j9 << i13);
                int i14 = this._capacity;
                int i15 = ((findFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr6[i16] = ((~(255 << i17)) & jArr6[i16]) | (j9 << i17);
                jArr5[findFirstAvailableSlot] = j8;
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i10++;
            jArr3 = jArr;
            jArr4 = jArr2;
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

    public final boolean add(long j8) {
        int i8 = this._size;
        this.elements[findAbsoluteInsertIndex(j8)] = j8;
        if (this._size != i8) {
            return true;
        }
        return false;
    }

    public final boolean addAll(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign(elements);
        return i8 != this._size;
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
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:            if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = androidx.collection.a.a(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L15:
            long[] r5 = r0.metadata
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L42:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5f
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.elements
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L59
            goto L69
        L59:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L42
        L5f:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L6f
            r11 = -1
        L69:
            if (r11 < 0) goto L6e
            r15.removeElementAt(r11)
        L6e:
            return
        L6f:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.minusAssign(long):void");
    }

    public final void plusAssign(long j8) {
        this.elements[findAbsoluteInsertIndex(j8)] = j8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:            if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = androidx.collection.a.a(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = 0
        L17:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L44:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.elements
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5b
            goto L6b
        L5b:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L44
        L61:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L6e
            r4 = 1
        L6e:
            if (r4 == 0) goto L73
            r0.removeElementAt(r10)
        L73:
            return r4
        L74:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.remove(long):boolean");
    }

    public final boolean removeAll(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign(elements);
        return i8 != this._size;
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

    public /* synthetic */ MutableLongSet(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public MutableLongSet(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (long j8 : elements) {
            plusAssign(j8);
        }
    }

    public final boolean addAll(LongSet elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign(elements);
        return i8 != this._size;
    }

    public final boolean removeAll(LongSet elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign(elements);
        return i8 != this._size;
    }

    public final void plusAssign(LongSet elements) {
        AbstractC3292y.i(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        plusAssign(jArr[(i8 << 3) + i10]);
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

    public final void minusAssign(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (long j8 : elements) {
            minusAssign(j8);
        }
    }

    public final void minusAssign(LongSet elements) {
        AbstractC3292y.i(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        minusAssign(jArr[(i8 << 3) + i10]);
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
