package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    String str = "identity";
    static Easing sDefault = new Easing();
    private static final String STANDARD_NAME = "standard";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(ACCELERATE_NAME)) {
                    c8 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(DECELERATE_NAME)) {
                    c8 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(ANTICIPATE_NAME)) {
                    c8 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(LINEAR_NAME)) {
                    c8 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(OVERSHOOT_NAME)) {
                    c8 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(STANDARD_NAME)) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return new CubicEasing(ACCELERATE);
            case 1:
                return new CubicEasing(DECELERATE);
            case 2:
                return new CubicEasing(ANTICIPATE);
            case 3:
                return new CubicEasing(LINEAR);
            case 4:
                return new CubicEasing(OVERSHOOT);
            case 5:
                return new CubicEasing(STANDARD);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return sDefault;
        }
    }

    public double get(double d8) {
        return d8;
    }

    public double getDiff(double d8) {
        return 1.0d;
    }

    public String toString() {
        return this.str;
    }

    /* loaded from: classes.dex */
    static class CubicEasing extends Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;

        /* renamed from: x1, reason: collision with root package name */
        double f14538x1;

        /* renamed from: x2, reason: collision with root package name */
        double f14539x2;

        /* renamed from: y1, reason: collision with root package name */
        double f14540y1;

        /* renamed from: y2, reason: collision with root package name */
        double f14541y2;

        CubicEasing(String str) {
            this.str = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f14538x1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i8 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i8);
            this.f14540y1 = Double.parseDouble(str.substring(i8, indexOf3).trim());
            int i9 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i9);
            this.f14539x2 = Double.parseDouble(str.substring(i9, indexOf4).trim());
            int i10 = indexOf4 + 1;
            this.f14541y2 = Double.parseDouble(str.substring(i10, str.indexOf(41, i10)).trim());
        }

        private double getDiffX(double d8) {
            double d9 = 1.0d - d8;
            double d10 = this.f14538x1;
            double d11 = this.f14539x2;
            return (d9 * 3.0d * d9 * d10) + (d9 * 6.0d * d8 * (d11 - d10)) + (3.0d * d8 * d8 * (1.0d - d11));
        }

        private double getDiffY(double d8) {
            double d9 = 1.0d - d8;
            double d10 = this.f14540y1;
            double d11 = this.f14541y2;
            return (d9 * 3.0d * d9 * d10) + (d9 * 6.0d * d8 * (d11 - d10)) + (3.0d * d8 * d8 * (1.0d - d11));
        }

        private double getX(double d8) {
            double d9 = 1.0d - d8;
            double d10 = 3.0d * d9;
            return (this.f14538x1 * d9 * d10 * d8) + (this.f14539x2 * d10 * d8 * d8) + (d8 * d8 * d8);
        }

        private double getY(double d8) {
            double d9 = 1.0d - d8;
            double d10 = 3.0d * d9;
            return (this.f14540y1 * d9 * d10 * d8) + (this.f14541y2 * d10 * d8 * d8) + (d8 * d8 * d8);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d8) {
            if (d8 <= 0.0d) {
                return 0.0d;
            }
            if (d8 >= 1.0d) {
                return 1.0d;
            }
            double d9 = 0.5d;
            double d10 = 0.5d;
            while (d9 > error) {
                d9 *= 0.5d;
                if (getX(d10) < d8) {
                    d10 += d9;
                } else {
                    d10 -= d9;
                }
            }
            double d11 = d10 - d9;
            double x8 = getX(d11);
            double d12 = d10 + d9;
            double x9 = getX(d12);
            double y8 = getY(d11);
            return (((getY(d12) - y8) * (d8 - x8)) / (x9 - x8)) + y8;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d8) {
            double d9 = 0.5d;
            double d10 = 0.5d;
            while (d9 > d_error) {
                d9 *= 0.5d;
                if (getX(d10) < d8) {
                    d10 += d9;
                } else {
                    d10 -= d9;
                }
            }
            double d11 = d10 - d9;
            double x8 = getX(d11);
            double d12 = d10 + d9;
            return (getY(d12) - getY(d11)) / (getX(d12) - x8);
        }

        void setup(double d8, double d9, double d10, double d11) {
            this.f14538x1 = d8;
            this.f14540y1 = d9;
            this.f14539x2 = d10;
            this.f14541y2 = d11;
        }

        public CubicEasing(double d8, double d9, double d10, double d11) {
            setup(d8, d9, d10, d11);
        }
    }
}
