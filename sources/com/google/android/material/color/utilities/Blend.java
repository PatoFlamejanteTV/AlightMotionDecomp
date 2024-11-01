package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i8, int i9, double d8) {
        Cam16 fromInt = Cam16.fromInt(i8);
        Cam16 fromInt2 = Cam16.fromInt(i9);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(jstar + ((fromInt2.getJstar() - jstar) * d8), astar + ((fromInt2.getAstar() - astar) * d8), bstar + ((fromInt2.getBstar() - bstar) * d8)).toInt();
    }

    public static int harmonize(int i8, int i9) {
        Hct fromInt = Hct.fromInt(i8);
        Hct fromInt2 = Hct.fromInt(i9);
        return Hct.from(MathUtils.sanitizeDegreesDouble(fromInt.getHue() + (Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i8, int i9, double d8) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i8, i9, d8)).getHue(), Cam16.fromInt(i8).getChroma(), ColorUtils.lstarFromArgb(i8)).toInt();
    }
}
