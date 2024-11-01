package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComplexDouble {
    private double _imaginary;
    private double _real;

    public ComplexDouble(double d8, double d9) {
        this._real = d8;
        this._imaginary = d9;
    }

    private final double component1() {
        return this._real;
    }

    private final double component2() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d8, double d9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d8 = complexDouble._real;
        }
        if ((i8 & 2) != 0) {
            d9 = complexDouble._imaginary;
        }
        return complexDouble.copy(d8, d9);
    }

    public final ComplexDouble copy(double d8, double d9) {
        return new ComplexDouble(d8, d9);
    }

    public final ComplexDouble div(double d8) {
        this._real /= d8;
        this._imaginary /= d8;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        return Double.compare(this._real, complexDouble._real) == 0 && Double.compare(this._imaginary, complexDouble._imaginary) == 0;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final double getReal() {
        return this._real;
    }

    public int hashCode() {
        return (b.a(this._real) * 31) + b.a(this._imaginary);
    }

    public final ComplexDouble minus(double d8) {
        this._real += -d8;
        return this;
    }

    public final ComplexDouble plus(double d8) {
        this._real += d8;
        return this;
    }

    public final ComplexDouble times(double d8) {
        this._real *= d8;
        this._imaginary *= d8;
        return this;
    }

    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    public final ComplexDouble unaryMinus() {
        double d8 = -1;
        this._real *= d8;
        this._imaginary *= d8;
        return this;
    }

    public final ComplexDouble minus(ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        double d8 = -1;
        other._real *= d8;
        other._imaginary *= d8;
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    public final ComplexDouble plus(ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    public final ComplexDouble times(ComplexDouble other) {
        AbstractC3292y.i(other, "other");
        this._real = (getReal() * other.getReal()) - (getImaginary() * other.getImaginary());
        this._imaginary = (getReal() * other.getImaginary()) + (other.getReal() * getImaginary());
        return this;
    }
}
