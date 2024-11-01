package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class LongObjectMap<V> {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ LongObjectMap(AbstractC3284p abstractC3284p) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongObjectMap longObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        return longObjectMap.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean all(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
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
                            if (!((Boolean) predicate.invoke(Long.valueOf(jArr[i11]), objArr[i11])).booleanValue()) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return true;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:            if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(long r18) {
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
            long[] r14 = r0.keys
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
            if (r8 == 0) goto L6f
            r10 = -1
        L6b:
            if (r10 < 0) goto L6e
            r4 = 1
        L6e:
            return r4
        L6f:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.contains(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:            if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(long r18) {
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
            long[] r14 = r0.keys
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
            if (r8 == 0) goto L6f
            r10 = -1
        L6b:
            if (r10 < 0) goto L6e
            r4 = 1
        L6e:
            return r4
        L6f:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.containsKey(long):boolean");
    }

    public final boolean containsValue(V v8) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && AbstractC3292y.d(v8, objArr[(i8 << 3) + i10])) {
                            return true;
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    public boolean equals(Object obj) {
        int i8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongObjectMap)) {
            return false;
        }
        LongObjectMap longObjectMap = (LongObjectMap) obj;
        if (longObjectMap.getSize() != getSize()) {
            return false;
        }
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i12;
                            long j9 = jArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (longObjectMap.get(j9) != null || !longObjectMap.containsKey(j9)) {
                                    break loop0;
                                }
                            } else if (!AbstractC3292y.d(obj2, longObjectMap.get(j9))) {
                                return false;
                            }
                            i10 = 8;
                        } else {
                            i8 = i12;
                        }
                        j8 >>= i10;
                        i12 = i8 + 1;
                    }
                    if (i11 != i10) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
            return false;
        }
        return true;
    }

    public final int findKeyIndex$collection(long j8) {
        int a9 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i8 = a9 ^ (a9 << 16);
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i10 = this._capacity;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (i9 * ScatterMapKt.BitmaskLsb) ^ j9;
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.keys[numberOfTrailingZeros] == j8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final void forEach(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
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
                            block.invoke(Long.valueOf(jArr[i11]), objArr[i11]);
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

    public final void forEachIndexed(Function1 block) {
        AbstractC3292y.i(block, "block");
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
                            block.invoke(Integer.valueOf((i8 << 3) + i10));
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

    public final void forEachKey(Function1 block) {
        AbstractC3292y.i(block, "block");
        long[] jArr = this.keys;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            block.invoke(Long.valueOf(jArr[(i8 << 3) + i10]));
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

    public final void forEachValue(Function1 block) {
        AbstractC3292y.i(block, "block");
        Object[] objArr = this.values;
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
                            block.invoke(objArr[(i8 << 3) + i10]);
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:            if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r16) {
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
            long[] r12 = r0.keys
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
            if (r7 == 0) goto L72
            r11 = -1
        L69:
            if (r11 < 0) goto L70
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            goto L71
        L70:
            r1 = 0
        L71:
            return r1
        L72:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.get(long):java.lang.Object");
    }

    public final int getCapacity() {
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:            if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(long r16, V r18) {
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
            long[] r12 = r0.keys
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
            if (r7 == 0) goto L71
            r11 = -1
        L69:
            if (r11 < 0) goto L70
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            return r1
        L70:
            return r18
        L71:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.getOrDefault(long, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(long j8, Function0 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        V v8 = get(j8);
        if (v8 == null) {
            return (V) defaultValue.invoke();
        }
        return v8;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i8;
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i9 = 0;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j8 = jArr2[i10];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j8) < 128) {
                            int i14 = (i10 << 3) + i13;
                            long j9 = jArr[i14];
                            Object obj = objArr[i14];
                            int a9 = a.a(j9);
                            if (obj != null) {
                                i8 = obj.hashCode();
                            } else {
                                i8 = 0;
                            }
                            i11 += i8 ^ a9;
                        }
                        j8 >>= 8;
                    }
                    if (i12 != 8) {
                        return i11;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    i9 = i11;
                    break;
                }
            }
        }
        return i9;
    }

    public final boolean isEmpty() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i8;
        int i9;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j8 = jArr2[i10];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j8) < 128) {
                            int i14 = (i10 << 3) + i13;
                            i9 = i10;
                            long j9 = jArr[i14];
                            Object obj = objArr[i14];
                            sb.append(j9);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i11++;
                            if (i11 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i9 = i10;
                        }
                        j8 >>= 8;
                        i13++;
                        i10 = i9;
                    }
                    int i15 = i10;
                    if (i12 != 8) {
                        break;
                    }
                    i8 = i15;
                } else {
                    i8 = i10;
                }
                if (i8 == length) {
                    break;
                }
                i10 = i8 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "s.append('}').toString()");
        return sb2;
    }

    private LongObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean any(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
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
                            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i11]), objArr[i11])).booleanValue()) {
                                return true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int count(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i8 = 0;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i13]), objArr[i13])).booleanValue()) {
                                i10++;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i11 != 8) {
                        return i10;
                    }
                }
                if (i9 == length) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
        }
        return i8;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC3292y.i(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongObjectMap longObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, InterfaceC2072n transform, int i9, Object obj) {
        long[] jArr;
        long[] jArr2;
        if (obj == null) {
            CharSequence separator = (i9 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i9 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i9 & 4) == 0 ? charSequence3 : "";
            int i10 = (i9 & 8) != 0 ? -1 : i8;
            CharSequence truncated = (i9 & 16) != 0 ? "..." : charSequence4;
            AbstractC3292y.i(separator, "separator");
            AbstractC3292y.i(prefix, "prefix");
            AbstractC3292y.i(postfix, "postfix");
            AbstractC3292y.i(truncated, "truncated");
            AbstractC3292y.i(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            long[] jArr3 = longObjectMap.keys;
            Object[] objArr = longObjectMap.values;
            long[] jArr4 = longObjectMap.metadata;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 0;
                loop0: while (true) {
                    long j8 = jArr4[i11];
                    int i13 = i11;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j8 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                long j9 = jArr3[i16];
                                Object obj2 = objArr[i16];
                                if (i12 == i10) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sb.append(separator);
                                }
                                jArr2 = jArr4;
                                sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj2));
                                i12++;
                            } else {
                                jArr2 = jArr4;
                            }
                            j8 >>= 8;
                            i15++;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i11 = i13 + 1;
                    jArr4 = jArr;
                }
            }
            sb.append(postfix);
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        long[] jArr;
        long[] jArr2;
        int i9;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr3 = this.keys;
        Object[] objArr = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j8 = jArr4[i10];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j8 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            jArr2 = jArr4;
                            i9 = length;
                            long j9 = jArr3[i14];
                            Object obj = objArr[i14];
                            if (i11 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb.append(separator);
                            }
                            sb.append(j9);
                            sb.append('=');
                            sb.append(obj);
                            i11++;
                        } else {
                            jArr2 = jArr4;
                            i9 = length;
                        }
                        j8 >>= 8;
                        i13++;
                        jArr4 = jArr2;
                        length = i9;
                    }
                    jArr = jArr4;
                    int i15 = length;
                    if (i12 != 8) {
                        break;
                    }
                    length = i15;
                } else {
                    jArr = jArr4;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr4 = jArr;
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(postfix);
        String sb22 = sb.toString();
        AbstractC3292y.h(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, InterfaceC2072n transform) {
        long[] jArr;
        long[] jArr2;
        CharSequence separator = charSequence;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr3 = this.keys;
        Object[] objArr = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr4[i9];
                int i11 = i9;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j8 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            long j9 = jArr3[i14];
                            Object obj = objArr[i14];
                            jArr2 = jArr3;
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i10++;
                        } else {
                            jArr2 = jArr3;
                        }
                        j8 >>= 8;
                        i13++;
                        separator = charSequence;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    break;
                }
                i9 = i11 + 1;
                separator = charSequence;
                jArr3 = jArr;
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(postfix);
        String sb22 = sb.toString();
        AbstractC3292y.h(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, InterfaceC2072n transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j8 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            long j9 = jArr[i13];
                            Object obj = objArr[i13];
                            if (i10 == i8) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i10++;
                        }
                        j8 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, InterfaceC2072n transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            long j9 = jArr[i12];
                            Object obj = objArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i9++;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, InterfaceC2072n transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            long j9 = jArr[i12];
                            Object obj = objArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i9++;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        AbstractC3292y.h(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, InterfaceC2072n transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            long j9 = jArr[i12];
                            Object obj = objArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i9++;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        AbstractC3292y.h(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(InterfaceC2072n transform) {
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            long j9 = jArr[i12];
                            Object obj = objArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9), obj));
                            i9++;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
