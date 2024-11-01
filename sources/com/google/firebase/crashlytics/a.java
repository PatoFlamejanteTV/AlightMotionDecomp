package com.google.firebase.crashlytics;

import A0.f;
import G0.d;
import G0.g;
import G0.l;
import J0.AbstractC1253j;
import J0.C1245b;
import J0.C1250g;
import J0.C1257n;
import J0.C1266x;
import J0.D;
import J0.I;
import O0.b;
import android.content.Context;
import android.content.pm.PackageManager;
import c1.InterfaceC2008a;
import d1.e;
import java.util.List;
import java.util.concurrent.ExecutorService;
import n1.C3388a;
import q0.InterfaceC3621g;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C1266x f18473a;

    private a(C1266x c1266x) {
        this.f18473a = c1266x;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(f fVar, e eVar, InterfaceC2008a interfaceC2008a, InterfaceC2008a interfaceC2008a2, InterfaceC2008a interfaceC2008a3, ExecutorService executorService, ExecutorService executorService2) {
        Context k8 = fVar.k();
        String packageName = k8.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + C1266x.k() + " for " + packageName);
        K0.g gVar = new K0.g(executorService, executorService2);
        P0.g gVar2 = new P0.g(k8);
        D d8 = new D(fVar);
        I i8 = new I(k8, packageName, eVar, d8);
        d dVar = new d(interfaceC2008a);
        F0.d dVar2 = new F0.d(interfaceC2008a2);
        C1257n c1257n = new C1257n(d8, gVar2);
        C3388a.e(c1257n);
        C1266x c1266x = new C1266x(fVar, i8, dVar, d8, dVar2.e(), dVar2.d(), gVar2, c1257n, new l(interfaceC2008a3), gVar);
        String c8 = fVar.n().c();
        String m8 = AbstractC1253j.m(k8);
        List<C1250g> j8 = AbstractC1253j.j(k8);
        g.f().b("Mapping file ID is: " + m8);
        for (C1250g c1250g : j8) {
            g.f().b(String.format("Build id for %s on %s: %s", c1250g.c(), c1250g.a(), c1250g.b()));
        }
        try {
            C1245b a9 = C1245b.a(k8, i8, c8, m8, j8, new G0.f(k8));
            g.f().i("Installer package name is: " + a9.f3888d);
            R0.g l8 = R0.g.l(k8, c8, i8, new b(), a9.f3890f, a9.f3891g, gVar2, d8);
            l8.o(gVar).e(new InterfaceC3621g() { // from class: F0.g
                @Override // q0.InterfaceC3621g
                public final void d(Exception exc) {
                    com.google.firebase.crashlytics.a.d(exc);
                }
            });
            if (c1266x.u(a9, l8)) {
                c1266x.i(l8);
            }
            return new a(c1266x);
        } catch (PackageManager.NameNotFoundException e8) {
            g.f().e("Error retrieving app package info.", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
        g.f().e("Error fetching settings.", exc);
    }

    public void e(boolean z8) {
        this.f18473a.v(Boolean.valueOf(z8));
    }
}
