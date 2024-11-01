package com.google.android.gms.measurement.internal;

import N.AbstractC1349l;
import N.C1350m;
import Q.AbstractC1396p;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.C2123e;
import com.google.android.gms.internal.measurement.C2124e0;
import com.google.android.gms.internal.measurement.C2193l6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.AbstractBinderC3308h;
import l0.C3302b;

/* loaded from: classes3.dex */
public final class X2 extends AbstractBinderC3308h {

    /* renamed from: a, reason: collision with root package name */
    private final H5 f17618a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17619b;

    /* renamed from: k, reason: collision with root package name */
    private String f17620k;

    public X2(H5 h52) {
        this(h52, null);
    }

    private final void s0(Runnable runnable) {
        AbstractC1396p.l(runnable);
        if (this.f17618a.f().J()) {
            runnable.run();
        } else {
            this.f17618a.f().G(runnable);
        }
    }

    private final void t0(String str, boolean z8) {
        boolean z9;
        if (!TextUtils.isEmpty(str)) {
            if (z8) {
                try {
                    if (this.f17619b == null) {
                        if (!"com.google.android.gms".equals(this.f17620k) && !V.o.a(this.f17618a.w(), Binder.getCallingUid()) && !C1350m.a(this.f17618a.w()).c(Binder.getCallingUid())) {
                            z9 = false;
                            this.f17619b = Boolean.valueOf(z9);
                        }
                        z9 = true;
                        this.f17619b = Boolean.valueOf(z9);
                    }
                    if (this.f17619b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e8) {
                    this.f17618a.a().G().b("Measurement Service called with invalid calling package. appId", C2401n2.s(str));
                    throw e8;
                }
            }
            if (this.f17620k == null && AbstractC1349l.k(this.f17618a.w(), Binder.getCallingUid(), str)) {
                this.f17620k = str;
            }
            if (str.equals(this.f17620k)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f17618a.a().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void w0(M5 m52, boolean z8) {
        AbstractC1396p.l(m52);
        AbstractC1396p.f(m52.f17457a);
        t0(m52.f17457a, false);
        this.f17618a.y0().k0(m52.f17458b, m52.f17473q);
    }

    private final void x0(Runnable runnable) {
        AbstractC1396p.l(runnable);
        if (this.f17618a.f().J()) {
            runnable.run();
        } else {
            this.f17618a.f().D(runnable);
        }
    }

    private final void z0(E e8, M5 m52) {
        this.f17618a.z0();
        this.f17618a.s(e8, m52);
    }

    @Override // l0.InterfaceC3306f
    public final void A(M5 m52) {
        AbstractC1396p.f(m52.f17457a);
        AbstractC1396p.l(m52.f17478v);
        s0(new RunnableC2402n3(this, m52));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void A0(M5 m52) {
        this.f17618a.z0();
        this.f17618a.m0(m52);
    }

    @Override // l0.InterfaceC3306f
    public final void B(Y5 y52, M5 m52) {
        AbstractC1396p.l(y52);
        w0(m52, false);
        x0(new RunnableC2450u3(this, y52, m52));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void B0(M5 m52) {
        this.f17618a.z0();
        this.f17618a.o0(m52);
    }

    @Override // l0.InterfaceC3306f
    public final String E(M5 m52) {
        w0(m52, false);
        return this.f17618a.V(m52);
    }

    @Override // l0.InterfaceC3306f
    public final void H(C2335e c2335e, M5 m52) {
        AbstractC1396p.l(c2335e);
        AbstractC1396p.l(c2335e.f17781c);
        w0(m52, false);
        C2335e c2335e2 = new C2335e(c2335e);
        c2335e2.f17779a = m52.f17457a;
        x0(new RunnableC2367i3(this, c2335e2, m52));
    }

    @Override // l0.InterfaceC3306f
    public final void J(long j8, String str, String str2, String str3) {
        x0(new RunnableC2346f3(this, str2, str3, str, j8));
    }

    @Override // l0.InterfaceC3306f
    public final void O(M5 m52) {
        w0(m52, false);
        x0(new RunnableC2353g3(this, m52));
    }

    @Override // l0.InterfaceC3306f
    public final List P(String str, String str2, String str3) {
        t0(str, true);
        try {
            return (List) this.f17618a.f().t(new CallableC2388l3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17618a.a().G().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3306f
    public final void Q(C2335e c2335e) {
        AbstractC1396p.l(c2335e);
        AbstractC1396p.l(c2335e.f17781c);
        AbstractC1396p.f(c2335e.f17779a);
        t0(c2335e.f17779a, true);
        x0(new RunnableC2360h3(this, new C2335e(c2335e)));
    }

    @Override // l0.InterfaceC3306f
    public final void X(E e8, String str, String str2) {
        AbstractC1396p.l(e8);
        AbstractC1396p.f(str);
        t0(str, true);
        x0(new RunnableC2436s3(this, e8, str));
    }

    @Override // l0.InterfaceC3306f
    public final void a0(final M5 m52) {
        AbstractC1396p.f(m52.f17457a);
        AbstractC1396p.l(m52.f17478v);
        s0(new Runnable() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // java.lang.Runnable
            public final void run() {
                X2.this.B0(m52);
            }
        });
    }

    @Override // l0.InterfaceC3306f
    public final C3302b b0(M5 m52) {
        w0(m52, false);
        AbstractC1396p.f(m52.f17457a);
        try {
            return (C3302b) this.f17618a.f().B(new CallableC2423q3(this, m52)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f17618a.a().G().c("Failed to get consent. appId", C2401n2.s(m52.f17457a), e8);
            return new C3302b(null);
        }
    }

    @Override // l0.InterfaceC3306f
    public final List f0(String str, String str2, boolean z8, M5 m52) {
        w0(m52, false);
        String str3 = m52.f17457a;
        AbstractC1396p.l(str3);
        try {
            List<a6> list = (List) this.f17618a.f().t(new CallableC2381k3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (!z8 && d6.J0(a6Var.f17682c)) {
                }
                arrayList.add(new Y5(a6Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17618a.a().G().c("Failed to query user properties. appId", C2401n2.s(m52.f17457a), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f17618a.a().G().c("Failed to query user properties. appId", C2401n2.s(m52.f17457a), e);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3306f
    public final void i0(final M5 m52) {
        AbstractC1396p.f(m52.f17457a);
        AbstractC1396p.l(m52.f17478v);
        s0(new Runnable() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // java.lang.Runnable
            public final void run() {
                X2.this.A0(m52);
            }
        });
    }

    @Override // l0.InterfaceC3306f
    public final List j0(M5 m52, Bundle bundle) {
        w0(m52, false);
        AbstractC1396p.l(m52.f17457a);
        try {
            return (List) this.f17618a.f().t(new CallableC2443t3(this, m52, bundle)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17618a.a().G().c("Failed to get trigger URIs. appId", C2401n2.s(m52.f17457a), e8);
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k(Bundle bundle, String str) {
        boolean q8 = this.f17618a.i0().q(G.f17299f1);
        boolean q9 = this.f17618a.i0().q(G.f17305h1);
        if (bundle.isEmpty() && q8 && q9) {
            this.f17618a.l0().d1(str);
            return;
        }
        this.f17618a.l0().F0(str, bundle);
        if (q9 && this.f17618a.l0().h1(str)) {
            this.f17618a.l0().X(str, bundle);
        }
    }

    @Override // l0.InterfaceC3306f
    public final byte[] k0(E e8, String str) {
        AbstractC1396p.f(str);
        AbstractC1396p.l(e8);
        t0(str, true);
        this.f17618a.a().F().b("Log and bundle. event", this.f17618a.n0().c(e8.f17192a));
        long a9 = this.f17618a.x().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f17618a.f().B(new CallableC2429r3(this, e8, str)).get();
            if (bArr == null) {
                this.f17618a.a().G().b("Log and bundle returned null. appId", C2401n2.s(str));
                bArr = new byte[0];
            }
            this.f17618a.a().F().d("Log and bundle processed. event, size, time_ms", this.f17618a.n0().c(e8.f17192a), Integer.valueOf(bArr.length), Long.valueOf((this.f17618a.x().a() / 1000000) - a9));
            return bArr;
        } catch (InterruptedException e9) {
            e = e9;
            this.f17618a.a().G().d("Failed to log and bundle. appId, event, error", C2401n2.s(str), this.f17618a.n0().c(e8.f17192a), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            this.f17618a.a().G().d("Failed to log and bundle. appId, event, error", C2401n2.s(str), this.f17618a.n0().c(e8.f17192a), e);
            return null;
        }
    }

    @Override // l0.InterfaceC3306f
    public final List l0(M5 m52, boolean z8) {
        w0(m52, false);
        String str = m52.f17457a;
        AbstractC1396p.l(str);
        try {
            List<a6> list = (List) this.f17618a.f().t(new CallableC2471x3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (!z8 && d6.J0(a6Var.f17682c)) {
                }
                arrayList.add(new Y5(a6Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17618a.a().G().c("Failed to get user properties. appId", C2401n2.s(m52.f17457a), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f17618a.a().G().c("Failed to get user properties. appId", C2401n2.s(m52.f17457a), e);
            return null;
        }
    }

    @Override // l0.InterfaceC3306f
    public final List m(String str, String str2, M5 m52) {
        w0(m52, false);
        String str3 = m52.f17457a;
        AbstractC1396p.l(str3);
        try {
            return (List) this.f17618a.f().t(new CallableC2395m3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17618a.a().G().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3306f
    public final void n(final Bundle bundle, M5 m52) {
        if (C2193l6.a() && this.f17618a.i0().q(G.f17305h1)) {
            w0(m52, false);
            final String str = m52.f17457a;
            AbstractC1396p.l(str);
            x0(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z2
                @Override // java.lang.Runnable
                public final void run() {
                    X2.this.v0(bundle, str);
                }
            });
        }
    }

    @Override // l0.InterfaceC3306f
    public final void n0(M5 m52) {
        w0(m52, false);
        x0(new RunnableC2339e3(this, m52));
    }

    @Override // l0.InterfaceC3306f
    public final void p(M5 m52) {
        w0(m52, false);
        x0(new RunnableC2332d3(this, m52));
    }

    @Override // l0.InterfaceC3306f
    public final void p0(E e8, M5 m52) {
        AbstractC1396p.l(e8);
        w0(m52, false);
        x0(new RunnableC2416p3(this, e8, m52));
    }

    @Override // l0.InterfaceC3306f
    public final List s(String str, String str2, String str3, boolean z8) {
        t0(str, true);
        try {
            List<a6> list = (List) this.f17618a.f().t(new CallableC2374j3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (!z8 && d6.J0(a6Var.f17682c)) {
                }
                arrayList.add(new Y5(a6Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17618a.a().G().c("Failed to get user properties as. appId", C2401n2.s(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f17618a.a().G().c("Failed to get user properties as. appId", C2401n2.s(str), e);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3306f
    public final void u(M5 m52) {
        AbstractC1396p.f(m52.f17457a);
        t0(m52.f17457a, false);
        x0(new RunnableC2409o3(this, m52));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final E u0(E e8, M5 m52) {
        D d8;
        if ("_cmp".equals(e8.f17192a) && (d8 = e8.f17193b) != null && d8.s() != 0) {
            String Q8 = e8.f17193b.Q("_cis");
            if ("referrer broadcast".equals(Q8) || "referrer API".equals(Q8)) {
                this.f17618a.a().J().b("Event has been filtered ", e8.toString());
                return new E("_cmpx", e8.f17193b, e8.f17194c, e8.f17195d);
            }
        }
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void v0(Bundle bundle, String str) {
        if (bundle.isEmpty()) {
            this.f17618a.l0().d1(str);
        } else {
            this.f17618a.l0().F0(str, bundle);
            this.f17618a.l0().X(str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y0(E e8, M5 m52) {
        com.google.android.gms.internal.measurement.C c8;
        boolean z8;
        if (!this.f17618a.r0().W(m52.f17457a)) {
            z0(e8, m52);
            return;
        }
        this.f17618a.a().K().b("EES config found for", m52.f17457a);
        I2 r02 = this.f17618a.r0();
        String str = m52.f17457a;
        if (TextUtils.isEmpty(str)) {
            c8 = null;
        } else {
            c8 = (com.google.android.gms.internal.measurement.C) r02.f17402j.get(str);
        }
        if (c8 == null) {
            this.f17618a.a().K().b("EES not loaded for", m52.f17457a);
            z0(e8, m52);
            return;
        }
        try {
            Map Q8 = this.f17618a.x0().Q(e8.f17193b.y(), true);
            String a9 = l0.q.a(e8.f17192a);
            if (a9 == null) {
                a9 = e8.f17192a;
            }
            z8 = c8.d(new C2123e(a9, e8.f17195d, Q8));
        } catch (C2124e0 unused) {
            this.f17618a.a().G().c("EES error. appId, eventName", m52.f17458b, e8.f17192a);
            z8 = false;
        }
        if (!z8) {
            this.f17618a.a().K().b("EES was not applied to event", e8.f17192a);
            z0(e8, m52);
            return;
        }
        if (c8.g()) {
            this.f17618a.a().K().b("EES edited event", e8.f17192a);
            z0(this.f17618a.x0().H(c8.a().d()), m52);
        } else {
            z0(e8, m52);
        }
        if (c8.f()) {
            for (C2123e c2123e : c8.a().f()) {
                this.f17618a.a().K().b("EES logging created event", c2123e.e());
                z0(this.f17618a.x0().H(c2123e), m52);
            }
        }
    }

    @Override // l0.InterfaceC3306f
    public final void z(final Bundle bundle, M5 m52) {
        w0(m52, false);
        final String str = m52.f17457a;
        AbstractC1396p.l(str);
        x0(new Runnable() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // java.lang.Runnable
            public final void run() {
                X2.this.k(bundle, str);
            }
        });
    }

    private X2(H5 h52, String str) {
        AbstractC1396p.l(h52);
        this.f17618a = h52;
        this.f17620k = null;
    }
}
