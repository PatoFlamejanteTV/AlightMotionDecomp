package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2474y extends AbstractC2309a1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f18127b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18128c;

    /* renamed from: d, reason: collision with root package name */
    private long f18129d;

    public C2474y(S2 s22) {
        super(s22);
        this.f18128c = new ArrayMap();
        this.f18127b = new ArrayMap();
    }

    private final void A(String str, long j8, C2472x4 c2472x4) {
        if (c2472x4 == null) {
            a().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            a().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        d6.X(c2472x4, bundle, true);
        o().b1("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j8) {
        Iterator it = this.f18127b.keySet().iterator();
        while (it.hasNext()) {
            this.f18127b.put((String) it.next(), Long.valueOf(j8));
        }
        if (!this.f18127b.isEmpty()) {
            this.f18129d = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void C(C2474y c2474y, String str, long j8) {
        c2474y.k();
        AbstractC1396p.f(str);
        Integer num = (Integer) c2474y.f18128c.get(str);
        if (num != null) {
            C2472x4 C8 = c2474y.p().C(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2474y.f18128c.remove(str);
                Long l8 = (Long) c2474y.f18127b.get(str);
                if (l8 == null) {
                    c2474y.a().G().a("First ad unit exposure time was never set");
                } else {
                    long longValue = j8 - l8.longValue();
                    c2474y.f18127b.remove(str);
                    c2474y.A(str, longValue, C8);
                }
                if (c2474y.f18128c.isEmpty()) {
                    long j9 = c2474y.f18129d;
                    if (j9 == 0) {
                        c2474y.a().G().a("First ad exposure time was never set");
                        return;
                    } else {
                        c2474y.t(j8 - j9, C8);
                        c2474y.f18129d = 0L;
                        return;
                    }
                }
                return;
            }
            c2474y.f18128c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2474y.a().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void t(long j8, C2472x4 c2472x4) {
        if (c2472x4 == null) {
            a().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            a().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        d6.X(c2472x4, bundle, true);
        o().b1("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v(C2474y c2474y, String str, long j8) {
        c2474y.k();
        AbstractC1396p.f(str);
        if (c2474y.f18128c.isEmpty()) {
            c2474y.f18129d = j8;
        }
        Integer num = (Integer) c2474y.f18128c.get(str);
        if (num != null) {
            c2474y.f18128c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2474y.f18128c.size() >= 100) {
            c2474y.a().L().a("Too many ads visible");
        } else {
            c2474y.f18128c.put(str, 1);
            c2474y.f18127b.put(str, Long.valueOf(j8));
        }
    }

    public final void D(String str, long j8) {
        if (str != null && str.length() != 0) {
            f().D(new RunnableC2482z0(this, str, j8));
        } else {
            a().G().a("Ad unit id must be a non-empty string");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1, com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2474y l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2352g2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2345f2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2465w4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ F4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2309a1
    public final /* bridge */ /* synthetic */ C2418p5 r() {
        return super.r();
    }

    public final void s(long j8) {
        C2472x4 C8 = p().C(false);
        for (String str : this.f18127b.keySet()) {
            A(str, j8 - ((Long) this.f18127b.get(str)).longValue(), C8);
        }
        if (!this.f18127b.isEmpty()) {
            t(j8 - this.f18129d, C8);
        }
        B(j8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    public final void z(String str, long j8) {
        if (str != null && str.length() != 0) {
            f().D(new RunnableC2307a(this, str, j8));
        } else {
            a().G().a("Ad unit id must be a non-empty string");
        }
    }
}
