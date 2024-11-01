package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2150h implements InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16736a;

    public C2150h(Boolean bool) {
        if (bool == null) {
            this.f16736a = false;
        } else {
            this.f16736a = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        return Boolean.toString(this.f16736a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        if ("toString".equals(str)) {
            return new C2259u(Boolean.toString(this.f16736a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f16736a), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return new C2150h(Boolean.valueOf(this.f16736a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2150h) && this.f16736a == ((C2150h) obj).f16736a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f16736a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f16736a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        return Boolean.valueOf(this.f16736a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        double d8;
        if (this.f16736a) {
            d8 = 1.0d;
        } else {
            d8 = 0.0d;
        }
        return Double.valueOf(d8);
    }
}
