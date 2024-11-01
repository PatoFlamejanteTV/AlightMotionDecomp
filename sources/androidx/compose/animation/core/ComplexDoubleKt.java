package androidx.compose.animation.core;

import Q5.r;
import Q5.x;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComplexDoubleKt {
    public static final r complexQuadraticFormula(double d8, double d9, double d10) {
        double d11 = (d9 * d9) - ((4.0d * d8) * d10);
        double d12 = 1.0d / (d8 * 2.0d);
        double d13 = -d9;
        ComplexDouble complexSqrt = complexSqrt(d11);
        complexSqrt._real += d13;
        complexSqrt._real *= d12;
        complexSqrt._imaginary *= d12;
        ComplexDouble complexSqrt2 = complexSqrt(d11);
        double d14 = -1;
        complexSqrt2._real *= d14;
        complexSqrt2._imaginary *= d14;
        complexSqrt2._real += d13;
        complexSqrt2._real *= d12;
        complexSqrt2._imaginary *= d12;
        return x.a(complexSqrt, complexSqrt2);
    }

    public static final ComplexDouble complexSqrt(double d8) {
        if (d8 < 0.0d) {
            return new ComplexDouble(0.0d, Math.sqrt(Math.abs(d8)));
        }
        return new ComplexDouble(Math.sqrt(d8), 0.0d);
    }

    public static final ComplexDouble minus(double d8, ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        double d9 = -1;
        other._real *= d9;
        other._imaginary *= d9;
        other._real += d8;
        return other;
    }

    public static final ComplexDouble plus(double d8, ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        other._real += d8;
        return other;
    }

    public static final ComplexDouble times(double d8, ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        other._real *= d8;
        other._imaginary *= d8;
        return other;
    }
}
