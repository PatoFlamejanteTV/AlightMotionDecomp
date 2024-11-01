package androidx.compose.ui.util;

import e6.AbstractC2829a;

/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float lerp(float f8, float f9, float f10) {
        return ((1 - f10) * f8) + (f10 * f9);
    }

    public static final int lerp(int i8, int i9, float f8) {
        return i8 + AbstractC2829a.c((i9 - i8) * f8);
    }

    public static final long lerp(long j8, long j9, float f8) {
        return j8 + AbstractC2829a.e((j9 - j8) * f8);
    }
}
