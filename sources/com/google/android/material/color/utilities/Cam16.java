package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j, reason: collision with root package name */
    private final double f18249j;
    private final double jstar;

    /* renamed from: m, reason: collision with root package name */
    private final double f18250m;

    /* renamed from: q, reason: collision with root package name */
    private final double f18251q;

    /* renamed from: s, reason: collision with root package name */
    private final double f18252s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.hue = d8;
        this.chroma = d9;
        this.f18249j = d10;
        this.f18251q = d11;
        this.f18250m = d12;
        this.f18252s = d13;
        this.jstar = d14;
        this.astar = d15;
        this.bstar = d16;
    }

    public static Cam16 fromInt(int i8) {
        return fromIntInViewingConditions(i8, ViewingConditions.DEFAULT);
    }

    static Cam16 fromIntInViewingConditions(int i8, ViewingConditions viewingConditions) {
        double linearized = ColorUtils.linearized((16711680 & i8) >> 16);
        double linearized2 = ColorUtils.linearized((65280 & i8) >> 8);
        double linearized3 = ColorUtils.linearized(i8 & 255);
        return fromXyzInViewingConditions((0.41233895d * linearized) + (0.35762064d * linearized2) + (0.18051042d * linearized3), (0.2126d * linearized) + (0.7152d * linearized2) + (0.0722d * linearized3), (linearized * 0.01932141d) + (linearized2 * 0.11916382d) + (linearized3 * 0.95034478d), viewingConditions);
    }

    static Cam16 fromJch(double d8, double d9, double d10) {
        return fromJchInViewingConditions(d8, d9, d10, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d8, double d9, double d10, ViewingConditions viewingConditions) {
        double d11 = d8 / 100.0d;
        double c8 = (4.0d / viewingConditions.getC()) * Math.sqrt(d11) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d9 * viewingConditions.getFlRoot();
        double sqrt = Math.sqrt(((d9 / Math.sqrt(d11)) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d10);
        double d12 = (1.7000000000000002d * d8) / ((0.007d * d8) + 1.0d);
        double log1p = 43.859649122807014d * Math.log1p(flRoot * 0.0228d);
        return new Cam16(d10, d9, d8, c8, flRoot, sqrt, d12, Math.cos(radians) * log1p, Math.sin(radians) * log1p);
    }

    public static Cam16 fromUcs(double d8, double d9, double d10) {
        return fromUcsInViewingConditions(d8, d9, d10, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d8, double d9, double d10, ViewingConditions viewingConditions) {
        double expm1 = (Math.expm1(Math.hypot(d9, d10) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d10, d9) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(d8 / (1.0d - ((d8 - 100.0d) * 0.007d)), expm1, atan2, viewingConditions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cam16 fromXyzInViewingConditions(double d8, double d9, double d10, ViewingConditions viewingConditions) {
        double d11;
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d12 = (dArr2[0] * d8) + (dArr2[1] * d9) + (dArr2[2] * d10);
        double[] dArr3 = dArr[1];
        double d13 = (dArr3[0] * d8) + (dArr3[1] * d9) + (dArr3[2] * d10);
        double[] dArr4 = dArr[2];
        double d14 = (dArr4[0] * d8) + (dArr4[1] * d9) + (dArr4[2] * d10);
        double d15 = viewingConditions.getRgbD()[0] * d12;
        double d16 = viewingConditions.getRgbD()[1] * d13;
        double d17 = viewingConditions.getRgbD()[2] * d14;
        double pow = Math.pow((viewingConditions.getFl() * Math.abs(d15)) / 100.0d, 0.42d);
        double pow2 = Math.pow((viewingConditions.getFl() * Math.abs(d16)) / 100.0d, 0.42d);
        double pow3 = Math.pow((viewingConditions.getFl() * Math.abs(d17)) / 100.0d, 0.42d);
        double signum = ((Math.signum(d15) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d16) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d17) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d18 = (((signum * 11.0d) + ((-12.0d) * signum2)) + signum3) / 11.0d;
        double d19 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d20 = signum2 * 20.0d;
        double d21 = (((signum * 20.0d) + d20) + (21.0d * signum3)) / 20.0d;
        double d22 = (((signum * 40.0d) + d20) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d19, d18));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d23 = degrees;
        double radians = Math.toRadians(d23);
        double pow4 = Math.pow((d22 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d24 = pow4 / 100.0d;
        double c8 = (4.0d / viewingConditions.getC()) * Math.sqrt(d24) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        if (d23 < 20.14d) {
            d11 = d23 + 360.0d;
        } else {
            d11 = d23;
        }
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d11) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.getNc()) * viewingConditions.getNcb()) * Math.hypot(d18, d19)) / (d21 + 0.305d), 0.9d);
        double sqrt = Math.sqrt(d24) * pow5;
        double flRoot = sqrt * viewingConditions.getFlRoot();
        double log1p = Math.log1p(flRoot * 0.0228d) * 43.859649122807014d;
        return new Cam16(d23, sqrt, pow4, c8, flRoot, Math.sqrt((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d, (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d), log1p * Math.cos(radians), log1p * Math.sin(radians));
    }

    double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f18249j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f18250m;
    }

    public double getQ() {
        return this.f18251q;
    }

    public double getS() {
        return this.f18252s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    int viewed(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double d8;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            d8 = getChroma() / Math.sqrt(getJ() / 100.0d);
        } else {
            d8 = 0.0d;
        }
        double pow = Math.pow(d8 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        double nc = cos * 3846.153846153846d * viewingConditions.getNc() * viewingConditions.getNcb();
        double nbb = aw / viewingConditions.getNbb();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d9 = (((0.305d + nbb) * 23.0d) * pow) / (((nc * 23.0d) + ((11.0d * pow) * cos2)) + ((pow * 108.0d) * sin));
        double d10 = cos2 * d9;
        double d11 = d9 * sin;
        double d12 = nbb * 460.0d;
        double d13 = (((451.0d * d10) + d12) + (288.0d * d11)) / 1403.0d;
        double d14 = ((d12 - (891.0d * d10)) - (261.0d * d11)) / 1403.0d;
        double d15 = ((d12 - (d10 * 220.0d)) - (d11 * 6300.0d)) / 1403.0d;
        double signum = Math.signum(d13) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d13) * 27.13d) / (400.0d - Math.abs(d13))), 2.380952380952381d);
        double signum2 = Math.signum(d14) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d14) * 27.13d) / (400.0d - Math.abs(d14))), 2.380952380952381d);
        double signum3 = Math.signum(d15) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d);
        double d16 = signum / viewingConditions.getRgbD()[0];
        double d17 = signum2 / viewingConditions.getRgbD()[1];
        double d18 = signum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d19 = (dArr3[0] * d16) + (dArr3[1] * d17) + (dArr3[2] * d18);
        double[] dArr4 = dArr2[1];
        double d20 = (dArr4[0] * d16) + (dArr4[1] * d17) + (dArr4[2] * d18);
        double[] dArr5 = dArr2[2];
        double d21 = (d16 * dArr5[0]) + (d17 * dArr5[1]) + (d18 * dArr5[2]);
        if (dArr != null) {
            dArr[0] = d19;
            dArr[1] = d20;
            dArr[2] = d21;
            return dArr;
        }
        return new double[]{d19, d20, d21};
    }
}
