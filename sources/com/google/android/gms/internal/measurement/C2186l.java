package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2186l implements InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2243s f16808a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16809b;

    public C2186l(String str) {
        this.f16808a = InterfaceC2243s.f16971b0;
        this.f16809b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final InterfaceC2243s a() {
        return this.f16808a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return new C2186l(this.f16809b, this.f16808a.b());
    }

    public final String c() {
        return this.f16809b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2186l)) {
            return false;
        }
        C2186l c2186l = (C2186l) obj;
        if (this.f16809b.equals(c2186l.f16809b) && this.f16808a.equals(c2186l.f16808a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16809b.hashCode() * 31) + this.f16808a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        throw new IllegalStateException("Control is not a double");
    }

    public C2186l(String str, InterfaceC2243s interfaceC2243s) {
        this.f16808a = interfaceC2243s;
        this.f16809b = str;
    }
}
