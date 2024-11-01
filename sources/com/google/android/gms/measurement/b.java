package com.google.android.gms.measurement;

import Q.AbstractC1396p;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.F3;
import com.google.android.gms.measurement.internal.S2;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f17107a;

    /* renamed from: b, reason: collision with root package name */
    private final F3 f17108b;

    public b(S2 s22) {
        super();
        AbstractC1396p.l(s22);
        this.f17107a = s22;
        this.f17108b = s22.H();
    }

    @Override // l0.z
    public final long A() {
        return this.f17107a.L().R0();
    }

    @Override // l0.z
    public final String B() {
        return this.f17108b.w0();
    }

    @Override // l0.z
    public final String a() {
        return this.f17108b.v0();
    }

    @Override // l0.z
    public final void b(String str, String str2, Bundle bundle) {
        this.f17107a.H().f0(str, str2, bundle);
    }

    @Override // l0.z
    public final int c(String str) {
        return F3.E(str);
    }

    @Override // l0.z
    public final String d() {
        return this.f17108b.x0();
    }

    @Override // l0.z
    public final String e() {
        return this.f17108b.v0();
    }

    @Override // l0.z
    public final void f(Bundle bundle) {
        this.f17108b.N0(bundle);
    }

    @Override // l0.z
    public final void g(String str) {
        this.f17107a.v().D(str, this.f17107a.x().elapsedRealtime());
    }

    @Override // l0.z
    public final List h(String str, String str2) {
        return this.f17108b.G(str, str2);
    }

    @Override // l0.z
    public final void i(String str) {
        this.f17107a.v().z(str, this.f17107a.x().elapsedRealtime());
    }

    @Override // l0.z
    public final Map j(String str, String str2, boolean z8) {
        return this.f17108b.H(str, str2, z8);
    }

    @Override // l0.z
    public final void k(String str, String str2, Bundle bundle) {
        this.f17108b.T0(str, str2, bundle);
    }
}
