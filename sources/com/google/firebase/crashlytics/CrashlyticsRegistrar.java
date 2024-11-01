package com.google.firebase.crashlytics;

import A0.f;
import C0.b;
import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.h;
import D0.r;
import K0.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import d1.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l1.InterfaceC3314a;
import n1.C3388a;
import n1.InterfaceC3389b;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final F f18471a = F.a(C0.a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final F f18472b = F.a(b.class, ExecutorService.class);

    static {
        C3388a.a(InterfaceC3389b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC1040e interfaceC1040e) {
        g.f(false);
        long currentTimeMillis = System.currentTimeMillis();
        a c8 = a.c((f) interfaceC1040e.a(f.class), (e) interfaceC1040e.a(e.class), interfaceC1040e.i(G0.a.class), interfaceC1040e.i(B0.a.class), interfaceC1040e.i(InterfaceC3314a.class), (ExecutorService) interfaceC1040e.b(this.f18471a), (ExecutorService) interfaceC1040e.b(this.f18472b));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            G0.g.f().b("Initializing Crashlytics blocked main for " + currentTimeMillis2 + " ms");
        }
        return c8;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1038c.e(a.class).h("fire-cls").b(r.l(f.class)).b(r.l(e.class)).b(r.k(this.f18471a)).b(r.k(this.f18472b)).b(r.a(G0.a.class)).b(r.a(B0.a.class)).b(r.a(InterfaceC3314a.class)).f(new h() { // from class: F0.f
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                com.google.firebase.crashlytics.a b9;
                b9 = CrashlyticsRegistrar.this.b(interfaceC1040e);
                return b9;
            }
        }).e().d(), k1.h.b("fire-cls", "19.2.0"));
    }
}
