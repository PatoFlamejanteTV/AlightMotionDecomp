package com.google.android.material.math;

/* loaded from: classes3.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f8, float f9, float f10, float f11) {
        return (float) Math.hypot(f10 - f8, f11 - f9);
    }

    public static float distanceToFurthestCorner(float f8, float f9, float f10, float f11, float f12, float f13) {
        return max(dist(f8, f9, f10, f11), dist(f8, f9, f12, f11), dist(f8, f9, f12, f13), dist(f8, f9, f10, f13));
    }

    public static float floorMod(float f8, int i8) {
        float f9 = i8;
        int i9 = (int) (f8 / f9);
        if (Math.signum(f8) * f9 < 0.0f && i9 * i8 != f8) {
            i9--;
        }
        return f8 - (i9 * i8);
    }

    public static boolean geq(float f8, float f9, float f10) {
        return f8 + f10 >= f9;
    }

    public static float lerp(float f8, float f9, float f10) {
        return ((1.0f - f10) * f8) + (f10 * f9);
    }

    private static float max(float f8, float f9, float f10, float f11) {
        return (f8 <= f9 || f8 <= f10 || f8 <= f11) ? (f9 <= f10 || f9 <= f11) ? f10 > f11 ? f10 : f11 : f9 : f8;
    }

    public static int floorMod(int i8, int i9) {
        int i10 = i8 / i9;
        if ((i8 ^ i9) < 0 && i10 * i9 != i8) {
            i10--;
        }
        return i8 - (i10 * i9);
    }
}
