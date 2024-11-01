package androidx.compose.ui.util;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f8, float f9) {
        return (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static final long packInts(int i8, int i9) {
        return (i9 & 4294967295L) | (i8 << 32);
    }

    public static final float unpackFloat1(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float unpackFloat2(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final int unpackInt1(long j8) {
        return (int) (j8 >> 32);
    }

    public static final int unpackInt2(long j8) {
        return (int) (j8 & 4294967295L);
    }
}
