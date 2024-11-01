package androidx.collection;

import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ IntIntMap(AbstractC3284p abstractC3284p) {
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

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
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
        return intIntMap.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean all(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                            if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iArr2[i11]))).booleanValue()) {
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

    public final boolean contains(int i8) {
        if (findKeyIndex(i8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsKey(int i8) {
        if (findKeyIndex(i8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(int i8) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128 && i8 == iArr[(i9 << 3) + i11]) {
                            return true;
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntIntMap)) {
            return false;
        }
        IntIntMap intIntMap = (IntIntMap) obj;
        if (intIntMap.getSize() != getSize()) {
            return false;
        }
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                            if (iArr2[i11] != intIntMap.get(iArr[i11])) {
                                return false;
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
        return true;
    }

    public final int findKeyIndex(int i8) {
        int i9 = ScatterMapKt.MurmurHashC1 * i8;
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j8 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j9 = (i11 * ScatterMapKt.BitmaskLsb) ^ j8;
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i12;
                if (this.keys[numberOfTrailingZeros] == i8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final void forEach(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                            block.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iArr2[i11]));
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
        int[] iArr = this.keys;
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
                            block.invoke(Integer.valueOf(iArr[(i8 << 3) + i10]));
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
        int[] iArr = this.values;
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
                            block.invoke(Integer.valueOf(iArr[(i8 << 3) + i10]));
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

    public final int get(int i8) {
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + i8);
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getOrDefault(int i8, int i9) {
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return i9;
    }

    public final int getOrElse(int i8, Function0 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex < 0) {
            return ((Number) defaultValue.invoke()).intValue();
        }
        return this.values[findKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i8 = 0;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i10 += iArr2[i13] ^ iArr[i13];
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
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            sb.append(i13);
                            sb.append("=");
                            sb.append(i14);
                            i9++;
                            if (i9 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "s.append('}').toString()");
        return sb2;
    }

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public final boolean any(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i11]), Integer.valueOf(iArr2[i11]))).booleanValue()) {
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i8 = 0;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr2[i13]))).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, InterfaceC2072n transform, int i9, Object obj) {
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
            int[] iArr = intIntMap.keys;
            int[] iArr2 = intIntMap.values;
            long[] jArr3 = intIntMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 0;
                loop0: while (true) {
                    long j8 = jArr3[i11];
                    int i13 = i11;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j8 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                int i17 = iArr[i16];
                                int i18 = iArr2[i16];
                                if (i12 == i10) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sb.append(separator);
                                }
                                Integer valueOf = Integer.valueOf(i17);
                                jArr2 = jArr3;
                                sb.append((CharSequence) transform.invoke(valueOf, Integer.valueOf(i18)));
                                i12++;
                            } else {
                                jArr2 = jArr3;
                            }
                            j8 >>= 8;
                            i15++;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i11 = i13 + 1;
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
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        int[] iArr;
        int[] iArr2;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr3 = this.keys;
        int[] iArr4 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            int i14 = iArr3[i13];
                            int i15 = iArr4[i13];
                            iArr2 = iArr3;
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append(i14);
                            sb.append('=');
                            sb.append(i15);
                            i10++;
                        } else {
                            iArr2 = iArr3;
                        }
                        j8 >>= 8;
                        i12++;
                        iArr3 = iArr2;
                    }
                    iArr = iArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                iArr3 = iArr;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, InterfaceC2072n transform) {
        CharSequence separator = charSequence;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr[i9];
                int i11 = i9;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j8 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i15), Integer.valueOf(i16)));
                            i10++;
                        }
                        j8 >>= 8;
                        i13++;
                        separator = charSequence;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i9 = i11 + 1;
                separator = charSequence;
            }
        }
        sb.append(postfix);
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i8, InterfaceC2072n transform) {
        CharSequence separator = charSequence;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            if (i10 == i8) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i14), Integer.valueOf(i15)));
                            i10++;
                        }
                        j8 >>= 8;
                        i12++;
                        separator = charSequence;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                separator = charSequence;
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i13), Integer.valueOf(i14)));
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i13), Integer.valueOf(i14)));
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i13), Integer.valueOf(i14)));
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            loop0: while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) transform.invoke(Integer.valueOf(i13), Integer.valueOf(i14)));
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
