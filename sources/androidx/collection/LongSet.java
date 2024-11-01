package androidx.collection;

import androidx.annotation.IntRange;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(AbstractC3284p abstractC3284p) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
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
        return longSet.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean all(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && !((Boolean) predicate.invoke(Long.valueOf(jArr[(i8 << 3) + i10]))).booleanValue()) {
                            return false;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int count() {
        return this._size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) obj;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && !longSet.contains(jArr[(i8 << 3) + i10])) {
                            return false;
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
        return true;
    }

    public final int findElementIndex$collection(long j8) {
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
                if (this.elements[numberOfTrailingZeros] == j8) {
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

    public final long first() {
        long[] jArr = this.elements;
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
                            return jArr[(i8 << 3) + i10];
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
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void forEach(Function1 block) {
        AbstractC3292y.i(block, "block");
        long[] jArr = this.elements;
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

    public final void forEachIndex(Function1 block) {
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

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getCapacity() {
        return this._capacity;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.elements;
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
                            i10 += a.a(jArr[(i9 << 3) + i12]);
                        }
                        j8 >>= 8;
                    }
                    if (i11 != 8) {
                        return i10;
                    }
                }
                if (i9 != length) {
                    i9++;
                } else {
                    i8 = i10;
                    break;
                }
            }
        }
        return i8;
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
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public final boolean any(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && ((Boolean) predicate.invoke(Long.valueOf(jArr[(i8 << 3) + i10]))).booleanValue()) {
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

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int count(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.elements;
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
                        if ((255 & j8) < 128 && ((Boolean) predicate.invoke(Long.valueOf(jArr[(i9 << 3) + i12]))).booleanValue()) {
                            i10++;
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

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 transform, int i9, Object obj) {
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
            long[] jArr = longSet.elements;
            long[] jArr2 = longSet.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 0;
                loop0: while (true) {
                    long j8 = jArr2[i11];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j8 & 255) < 128) {
                                long j9 = jArr[(i11 << 3) + i15];
                                if (i12 == i10) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sb.append(separator);
                                }
                                sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
                                i12++;
                                i13 = 8;
                            }
                            j8 >>= i13;
                        }
                        if (i14 != i13) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
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
        int i9;
        int i10;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j8 = jArr2[i11];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j8 & 255) < 128) {
                            i10 = i11;
                            long j9 = jArr[(i11 << 3) + i14];
                            if (i12 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb.append(separator);
                            }
                            sb.append(j9);
                            i12++;
                        } else {
                            i10 = i11;
                        }
                        j8 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i15 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i9 = i15;
                } else {
                    i9 = i11;
                }
                if (i9 == length) {
                    break;
                }
                i11 = i9 + 1;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final long first(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        long[] jArr = this.elements;
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
                            long j9 = jArr[(i8 << 3) + i10];
                            if (((Boolean) predicate.invoke(Long.valueOf(j9))).booleanValue()) {
                                return j9;
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
        throw new NoSuchElementException("Could not find a match");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
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
                            long j9 = jArr[(i9 << 3) + i12];
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j8 & 255) < 128) {
                            long j9 = jArr[(i9 << 3) + i13];
                            if (i10 == i8) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
                            i10++;
                            i11 = 8;
                        }
                        j8 >>= i11;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
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
                            long j9 = jArr[(i8 << 3) + i11];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
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
        sb.append(postfix);
        String sb22 = sb.toString();
        AbstractC3292y.h(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
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
                        if ((255 & j8) < 128) {
                            long j9 = jArr[(i8 << 3) + i11];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
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

    public final String joinToString(CharSequence separator, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.elements;
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
                            long j9 = jArr[(i8 << 3) + i11];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
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

    public final String joinToString(Function1 transform) {
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.elements;
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
                        if ((255 & j8) < 128) {
                            long j9 = jArr[(i8 << 3) + i11];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) transform.invoke(Long.valueOf(j9)));
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
