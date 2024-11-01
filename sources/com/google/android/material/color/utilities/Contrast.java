package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
    }

    public static double darker(double d8, double d9) {
        if (d8 >= 0.0d && d8 <= 100.0d) {
            double yFromLstar = ColorUtils.yFromLstar(d8);
            double d10 = ((yFromLstar + 5.0d) / d9) - 5.0d;
            if (d10 >= 0.0d && d10 <= 100.0d) {
                double ratioOfYs = ratioOfYs(yFromLstar, d10);
                double abs = Math.abs(ratioOfYs - d9);
                if (ratioOfYs < d9 && abs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double lstarFromY = ColorUtils.lstarFromY(d10) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (lstarFromY >= 0.0d && lstarFromY <= 100.0d) {
                    return lstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d8, double d9) {
        return Math.max(0.0d, darker(d8, d9));
    }

    public static double lighter(double d8, double d9) {
        if (d8 >= 0.0d && d8 <= 100.0d) {
            double yFromLstar = ColorUtils.yFromLstar(d8);
            double d10 = ((yFromLstar + 5.0d) * d9) - 5.0d;
            if (d10 >= 0.0d && d10 <= 100.0d) {
                double ratioOfYs = ratioOfYs(d10, yFromLstar);
                double abs = Math.abs(ratioOfYs - d9);
                if (ratioOfYs < d9 && abs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double lstarFromY = ColorUtils.lstarFromY(d10) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (lstarFromY >= 0.0d && lstarFromY <= 100.0d) {
                    return lstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d8, double d9) {
        double lighter = lighter(d8, d9);
        if (lighter < 0.0d) {
            return 100.0d;
        }
        return lighter;
    }

    public static double ratioOfTones(double d8, double d9) {
        return ratioOfYs(ColorUtils.yFromLstar(d8), ColorUtils.yFromLstar(d9));
    }

    public static double ratioOfYs(double d8, double d9) {
        double max = Math.max(d8, d9);
        if (max != d9) {
            d8 = d9;
        }
        return (max + 5.0d) / (d8 + 5.0d);
    }
}
