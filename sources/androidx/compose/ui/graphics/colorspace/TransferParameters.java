package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    private final double f14441a;

    /* renamed from: b, reason: collision with root package name */
    private final double f14442b;

    /* renamed from: c, reason: collision with root package name */
    private final double f14443c;

    /* renamed from: d, reason: collision with root package name */
    private final double f14444d;

    /* renamed from: e, reason: collision with root package name */
    private final double f14445e;

    /* renamed from: f, reason: collision with root package name */
    private final double f14446f;
    private final double gamma;

    public TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.gamma = d8;
        this.f14441a = d9;
        this.f14442b = d10;
        this.f14443c = d11;
        this.f14444d = d12;
        this.f14445e = d13;
        this.f14446f = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f14441a;
    }

    public final double component3() {
        return this.f14442b;
    }

    public final double component4() {
        return this.f14443c;
    }

    public final double component5() {
        return this.f14444d;
    }

    public final double component6() {
        return this.f14445e;
    }

    public final double component7() {
        return this.f14446f;
    }

    public final TransferParameters copy(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        return new TransferParameters(d8, d9, d10, d11, d12, d13, d14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f14441a, transferParameters.f14441a) == 0 && Double.compare(this.f14442b, transferParameters.f14442b) == 0 && Double.compare(this.f14443c, transferParameters.f14443c) == 0 && Double.compare(this.f14444d, transferParameters.f14444d) == 0 && Double.compare(this.f14445e, transferParameters.f14445e) == 0 && Double.compare(this.f14446f, transferParameters.f14446f) == 0;
    }

    public final double getA() {
        return this.f14441a;
    }

    public final double getB() {
        return this.f14442b;
    }

    public final double getC() {
        return this.f14443c;
    }

    public final double getD() {
        return this.f14444d;
    }

    public final double getE() {
        return this.f14445e;
    }

    public final double getF() {
        return this.f14446f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.animation.core.b.a(this.gamma) * 31) + androidx.compose.animation.core.b.a(this.f14441a)) * 31) + androidx.compose.animation.core.b.a(this.f14442b)) * 31) + androidx.compose.animation.core.b.a(this.f14443c)) * 31) + androidx.compose.animation.core.b.a(this.f14444d)) * 31) + androidx.compose.animation.core.b.a(this.f14445e)) * 31) + androidx.compose.animation.core.b.a(this.f14446f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f14441a + ", b=" + this.f14442b + ", c=" + this.f14443c + ", d=" + this.f14444d + ", e=" + this.f14445e + ", f=" + this.f14446f + ')';
    }

    public /* synthetic */ TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i8, AbstractC3284p abstractC3284p) {
        this(d8, d9, d10, d11, d12, (i8 & 32) != 0 ? 0.0d : d13, (i8 & 64) != 0 ? 0.0d : d14);
    }
}
