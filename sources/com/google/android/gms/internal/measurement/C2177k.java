package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2177k implements InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    private final Double f16792a;

    public C2177k(Double d8) {
        if (d8 == null) {
            this.f16792a = Double.valueOf(Double.NaN);
        } else {
            this.f16792a = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        BigDecimal a9;
        int scale;
        if (Double.isNaN(this.f16792a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f16792a.doubleValue())) {
            if (this.f16792a.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f16792a.doubleValue());
        if (valueOf.signum() == 0) {
            a9 = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            a9 = AbstractC2168j.a(valueOf);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (a9.scale() > 0) {
            scale = a9.precision();
        } else {
            scale = a9.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(a9);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return a9.toPlainString();
            }
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        if ("toString".equals(str)) {
            return new C2259u(A());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", A(), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return new C2177k(this.f16792a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2177k)) {
            return false;
        }
        return this.f16792a.equals(((C2177k) obj).f16792a);
    }

    public final int hashCode() {
        return this.f16792a.hashCode();
    }

    public final String toString() {
        return A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        boolean z8;
        if (!Double.isNaN(this.f16792a.doubleValue()) && this.f16792a.doubleValue() != 0.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        return this.f16792a;
    }
}
