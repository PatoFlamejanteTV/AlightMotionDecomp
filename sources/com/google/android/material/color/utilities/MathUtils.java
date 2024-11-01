package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d8, double d9, double d10) {
        return d10 < d8 ? d8 : d10 > d9 ? d9 : d10;
    }

    public static int clampInt(int i8, int i9, int i10) {
        return i10 < i8 ? i8 : i10 > i9 ? i9 : i10;
    }

    public static double differenceDegrees(double d8, double d9) {
        return 180.0d - Math.abs(Math.abs(d8 - d9) - 180.0d);
    }

    public static double lerp(double d8, double d9, double d10) {
        return ((1.0d - d10) * d8) + (d10 * d9);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d8 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d9 = dArr3[0] * d8;
        double d10 = dArr[1];
        double d11 = d9 + (dArr3[1] * d10);
        double d12 = dArr[2];
        double d13 = d11 + (dArr3[2] * d12);
        double[] dArr4 = dArr2[1];
        double d14 = (dArr4[0] * d8) + (dArr4[1] * d10) + (dArr4[2] * d12);
        double[] dArr5 = dArr2[2];
        return new double[]{d13, d14, (d8 * dArr5[0]) + (d10 * dArr5[1]) + (d12 * dArr5[2])};
    }

    public static double rotationDirection(double d8, double d9) {
        if (sanitizeDegreesDouble(d9 - d8) <= 180.0d) {
            return 1.0d;
        }
        return -1.0d;
    }

    public static double sanitizeDegreesDouble(double d8) {
        double d9 = d8 % 360.0d;
        return d9 < 0.0d ? d9 + 360.0d : d9;
    }

    public static int sanitizeDegreesInt(int i8) {
        int i9 = i8 % 360;
        if (i9 < 0) {
            return i9 + 360;
        }
        return i9;
    }

    public static int signum(double d8) {
        if (d8 < 0.0d) {
            return -1;
        }
        return d8 == 0.0d ? 0 : 1;
    }
}
