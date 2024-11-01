package androidx.collection;

import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class FloatLongMap {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ FloatLongMap(AbstractC3284p abstractC3284p) {
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

    public static /* synthetic */ String joinToString$default(FloatLongMap floatLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
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
        return floatLongMap.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean all(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            if (!((Boolean) predicate.invoke(Float.valueOf(fArr[i11]), Long.valueOf(jArr[i11]))).booleanValue()) {
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

    public final boolean contains(float f8) {
        if (findKeyIndex(f8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsKey(float f8) {
        if (findKeyIndex(f8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(long j8) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j9 = jArr2[i8];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j9) < 128 && j8 == jArr[(i8 << 3) + i10]) {
                            return true;
                        }
                        j9 >>= 8;
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatLongMap)) {
            return false;
        }
        FloatLongMap floatLongMap = (FloatLongMap) obj;
        if (floatLongMap.getSize() != getSize()) {
            return false;
        }
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            if (jArr[i11] != floatLongMap.get(fArr[i11])) {
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

    public final int findKeyIndex(float f8) {
        int floatToIntBits = Float.floatToIntBits(f8) * ScatterMapKt.MurmurHashC1;
        int i8 = floatToIntBits ^ (floatToIntBits << 16);
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i10 = this._capacity;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * ScatterMapKt.BitmaskLsb) ^ j8;
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (this.keys[numberOfTrailingZeros] == f8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final void forEach(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            block.invoke(Float.valueOf(fArr[i11]), Long.valueOf(jArr[i11]));
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
        float[] fArr = this.keys;
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
                            block.invoke(Float.valueOf(fArr[(i8 << 3) + i10]));
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
        long[] jArr = this.values;
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

    public final long get(float f8) {
        int findKeyIndex = findKeyIndex(f8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + f8);
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final long getOrDefault(float f8, long j8) {
        int findKeyIndex = findKeyIndex(f8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return j8;
    }

    public final long getOrElse(float f8, Function0 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f8);
        if (findKeyIndex < 0) {
            return ((Number) defaultValue.invoke()).longValue();
        }
        return this.values[findKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            i10 += Float.floatToIntBits(fArr[i13]) ^ a.a(jArr[i13]);
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
        int i8;
        int i9;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            float f8 = fArr[i14];
                            i9 = i10;
                            long j9 = jArr[i14];
                            sb.append(f8);
                            sb.append("=");
                            sb.append(j9);
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

    private FloatLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = LongSetKt.getEmptyLongArray();
    }

    public final boolean any(InterfaceC2072n predicate) {
        AbstractC3292y.i(predicate, "predicate");
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i11]), Long.valueOf(jArr[i11]))).booleanValue()) {
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i13]), Long.valueOf(jArr[i13]))).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(FloatLongMap floatLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, InterfaceC2072n transform, int i9, Object obj) {
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
            float[] fArr = floatLongMap.keys;
            long[] jArr3 = floatLongMap.values;
            long[] jArr4 = floatLongMap.metadata;
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
                                float f8 = fArr[i16];
                                long j9 = jArr3[i16];
                                if (i12 == i10) {
                                    sb.append(truncated);
                                    break loop0;
                                }
                                if (i12 != 0) {
                                    sb.append(separator);
                                }
                                jArr2 = jArr4;
                                sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr;
        float[] fArr2;
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr3 = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            float f8 = fArr3[i13];
                            fArr2 = fArr3;
                            long j9 = jArr[i13];
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append(f8);
                            sb.append('=');
                            sb.append(j9);
                            i10++;
                        } else {
                            fArr2 = fArr3;
                        }
                        j8 >>= 8;
                        i12++;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                fArr3 = fArr;
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                int i11 = i9;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j8 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            float f8 = fArr[i14];
                            long j9 = jArr[i14];
                            if (i10 == i8) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            float f8 = fArr[i13];
                            long j9 = jArr[i13];
                            if (i10 == i8) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            float f8 = fArr[i12];
                            long j9 = jArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            float f8 = fArr[i12];
                            long j9 = jArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            float f8 = fArr[i12];
                            long j9 = jArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append(separator);
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
        float[] fArr = this.keys;
        long[] jArr = this.values;
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
                            float f8 = fArr[i12];
                            long j9 = jArr[i12];
                            if (i9 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i9 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) transform.invoke(Float.valueOf(f8), Long.valueOf(j9)));
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
