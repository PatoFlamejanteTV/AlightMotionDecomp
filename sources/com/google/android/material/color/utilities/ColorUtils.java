package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ColorUtils {
    static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    static final double[] WHITE_POINT_D65 = {95.047d, 100.0d, 108.883d};

    private ColorUtils() {
    }

    public static int alphaFromArgb(int i8) {
        return (i8 >> 24) & 255;
    }

    public static int argbFromLab(double d8, double d9, double d10) {
        double[] dArr = WHITE_POINT_D65;
        double d11 = (d8 + 16.0d) / 116.0d;
        double d12 = d11 - (d10 / 200.0d);
        return argbFromXyz(labInvf((d9 / 500.0d) + d11) * dArr[0], labInvf(d11) * dArr[1], labInvf(d12) * dArr[2]);
    }

    public static int argbFromLinrgb(double[] dArr) {
        return argbFromRgb(delinearized(dArr[0]), delinearized(dArr[1]), delinearized(dArr[2]));
    }

    public static int argbFromLstar(double d8) {
        int delinearized = delinearized(yFromLstar(d8));
        return argbFromRgb(delinearized, delinearized, delinearized);
    }

    public static int argbFromRgb(int i8, int i9, int i10) {
        return ((i8 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((i9 & 255) << 8) | (i10 & 255);
    }

    public static int argbFromXyz(double d8, double d9, double d10) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d11 = (dArr2[0] * d8) + (dArr2[1] * d9) + (dArr2[2] * d10);
        double[] dArr3 = dArr[1];
        double d12 = (dArr3[0] * d8) + (dArr3[1] * d9) + (dArr3[2] * d10);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d11), delinearized(d12), delinearized((dArr4[0] * d8) + (dArr4[1] * d9) + (dArr4[2] * d10)));
    }

    public static int blueFromArgb(int i8) {
        return i8 & 255;
    }

    public static int delinearized(double d8) {
        double pow;
        double d9 = d8 / 100.0d;
        if (d9 <= 0.0031308d) {
            pow = d9 * 12.92d;
        } else {
            pow = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return MathUtils.clampInt(0, 255, (int) Math.round(pow * 255.0d));
    }

    public static int greenFromArgb(int i8) {
        return (i8 >> 8) & 255;
    }

    public static boolean isOpaque(int i8) {
        if (alphaFromArgb(i8) >= 255) {
            return true;
        }
        return false;
    }

    static double labF(double d8) {
        if (d8 > 0.008856451679035631d) {
            return Math.pow(d8, 0.3333333333333333d);
        }
        return ((d8 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] labFromArgb(int i8) {
        double linearized = linearized(redFromArgb(i8));
        double linearized2 = linearized(greenFromArgb(i8));
        double linearized3 = linearized(blueFromArgb(i8));
        double[][] dArr = SRGB_TO_XYZ;
        double[] dArr2 = dArr[0];
        double d8 = (dArr2[0] * linearized) + (dArr2[1] * linearized2) + (dArr2[2] * linearized3);
        double[] dArr3 = dArr[1];
        double d9 = (dArr3[0] * linearized) + (dArr3[1] * linearized2) + (dArr3[2] * linearized3);
        double[] dArr4 = dArr[2];
        double d10 = (dArr4[0] * linearized) + (dArr4[1] * linearized2) + (dArr4[2] * linearized3);
        double[] dArr5 = WHITE_POINT_D65;
        double d11 = d8 / dArr5[0];
        double d12 = d9 / dArr5[1];
        double d13 = d10 / dArr5[2];
        double labF = labF(d11);
        double labF2 = labF(d12);
        return new double[]{(116.0d * labF2) - 16.0d, (labF - labF2) * 500.0d, (labF2 - labF(d13)) * 200.0d};
    }

    static double labInvf(double d8) {
        double d9 = d8 * d8 * d8;
        return d9 > 0.008856451679035631d ? d9 : ((d8 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double linearized(int i8) {
        double pow;
        double d8 = i8 / 255.0d;
        if (d8 <= 0.040449936d) {
            pow = d8 / 12.92d;
        } else {
            pow = Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        }
        return pow * 100.0d;
    }

    public static double lstarFromArgb(int i8) {
        return (labF(xyzFromArgb(i8)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double lstarFromY(double d8) {
        return (labF(d8 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int redFromArgb(int i8) {
        return (i8 >> 16) & 255;
    }

    public static double[] whitePointD65() {
        return WHITE_POINT_D65;
    }

    public static double[] xyzFromArgb(int i8) {
        return MathUtils.matrixMultiply(new double[]{linearized(redFromArgb(i8)), linearized(greenFromArgb(i8)), linearized(blueFromArgb(i8))}, SRGB_TO_XYZ);
    }

    public static double yFromLstar(double d8) {
        return labInvf((d8 + 16.0d) / 116.0d) * 100.0d;
    }
}
