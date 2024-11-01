package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f8, float f9, float f10, float f11, float f12) {
        return estimateAnimationDurationMillis(f8, f9, f10, f11, f12);
    }

    private static final double estimateCriticallyDamped(ComplexDouble complexDouble, double d8, double d9, double d10) {
        boolean z8;
        boolean z9;
        double d11;
        int i8;
        double d12 = d10;
        double real = complexDouble.getReal();
        double d13 = real * d8;
        double d14 = d9 - d13;
        double log = Math.log(Math.abs(d12 / d8)) / real;
        double log2 = Math.log(Math.abs(d12 / d14));
        double d15 = log2;
        for (int i9 = 0; i9 < 6; i9++) {
            d15 = log2 - Math.log(Math.abs(d15 / real));
        }
        double d16 = d15 / real;
        if (!Double.isInfinite(log) && !Double.isNaN(log)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            log = d16;
        } else {
            if (!Double.isInfinite(d16) && !Double.isNaN(d16)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!(!z9)) {
                log = Math.max(log, d16);
            }
        }
        double d17 = (-(d13 + d14)) / (real * d14);
        double d18 = real * d17;
        double exp = (Math.exp(d18) * d8) + (d14 * d17 * Math.exp(d18));
        if (!Double.isNaN(d17) && d17 > 0.0d) {
            if (d17 > 0.0d && (-exp) < d12) {
                if (d14 < 0.0d && d8 > 0.0d) {
                    log = 0.0d;
                }
            } else {
                log = (-(2.0d / real)) - (d8 / d14);
                d11 = Double.MAX_VALUE;
                i8 = 0;
                while (d11 > 0.001d && i8 < 100) {
                    i8++;
                    double d19 = real * log;
                    double d20 = d12;
                    double exp2 = log - ((((d8 + (d14 * log)) * Math.exp(d19)) + d12) / ((((1 + d19) * d14) + d13) * Math.exp(d19)));
                    d11 = Math.abs(log - exp2);
                    log = exp2;
                    d12 = d20;
                }
                return log;
            }
        }
        d12 = -d12;
        d11 = Double.MAX_VALUE;
        i8 = 0;
        while (d11 > 0.001d) {
            i8++;
            double d192 = real * log;
            double d202 = d12;
            double exp22 = log - ((((d8 + (d14 * log)) * Math.exp(d192)) + d12) / ((((1 + d192) * d14) + d13) * Math.exp(d192)));
            d11 = Math.abs(log - exp22);
            log = exp22;
            d12 = d202;
        }
        return log;
    }

    private static final long estimateDurationInternal(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d8, double d9, double d10, double d11) {
        double estimateCriticallyDamped;
        double d12 = d9;
        if (d10 == 0.0d && d12 == 0.0d) {
            return 0L;
        }
        if (d10 < 0.0d) {
            d12 = -d12;
        }
        double abs = Math.abs(d10);
        if (d8 > 1.0d) {
            estimateCriticallyDamped = estimateOverDamped(complexDouble, complexDouble2, abs, d12, d11);
        } else if (d8 < 1.0d) {
            estimateCriticallyDamped = estimateUnderDamped(complexDouble, abs, d12, d11);
        } else {
            estimateCriticallyDamped = estimateCriticallyDamped(complexDouble, abs, d12, d11);
        }
        return (long) (estimateCriticallyDamped * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double estimateOverDamped(androidx.compose.animation.core.ComplexDouble r29, androidx.compose.animation.core.ComplexDouble r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection(double d8, double d9, double d10, double d11, double d12) {
        return (d8 * Math.exp(d9 * d10)) + (d11 * Math.exp(d12 * d10));
    }

    private static final double estimateUnderDamped(ComplexDouble complexDouble, double d8, double d9, double d10) {
        double real = complexDouble.getReal();
        double imaginary = (d9 - (real * d8)) / complexDouble.getImaginary();
        return Math.log(d10 / Math.sqrt((d8 * d8) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d8) {
        boolean z8;
        if (!Double.isInfinite(d8) && !Double.isNaN(d8)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    private static final double iterateNewtonsMethod(double d8, Function1 function1, Function1 function12) {
        return d8 - (((Number) function1.invoke(Double.valueOf(d8))).doubleValue() / ((Number) function12.invoke(Double.valueOf(d8))).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d8, double d9, double d10, double d11, double d12) {
        double sqrt = 2.0d * d9 * Math.sqrt(d8);
        double d13 = (sqrt * sqrt) - (4.0d * d8);
        double d14 = -sqrt;
        ComplexDouble complexSqrt = ComplexDoubleKt.complexSqrt(d13);
        complexSqrt._real += d14;
        complexSqrt._real *= 0.5d;
        complexSqrt._imaginary *= 0.5d;
        ComplexDouble complexSqrt2 = ComplexDoubleKt.complexSqrt(d13);
        double d15 = -1;
        complexSqrt2._real *= d15;
        complexSqrt2._imaginary *= d15;
        complexSqrt2._real += d14;
        complexSqrt2._real *= 0.5d;
        complexSqrt2._imaginary *= 0.5d;
        return estimateDurationInternal(complexSqrt, complexSqrt2, d9, d10, d11, d12);
    }

    public static final long estimateAnimationDurationMillis(double d8, double d9, double d10, double d11, double d12, double d13) {
        double sqrt = d9 / (Math.sqrt(d8 * d10) * 2.0d);
        double d14 = (d9 * d9) - ((4.0d * d10) * d8);
        double d15 = 1.0d / (2.0d * d10);
        double d16 = -d9;
        ComplexDouble complexSqrt = ComplexDoubleKt.complexSqrt(d14);
        complexSqrt._real += d16;
        complexSqrt._real *= d15;
        complexSqrt._imaginary *= d15;
        ComplexDouble complexSqrt2 = ComplexDoubleKt.complexSqrt(d14);
        double d17 = -1;
        complexSqrt2._real *= d17;
        complexSqrt2._imaginary *= d17;
        complexSqrt2._real += d16;
        complexSqrt2._real *= d15;
        complexSqrt2._imaginary *= d15;
        return estimateDurationInternal(complexSqrt, complexSqrt2, sqrt, d11, d12, d13);
    }
}
