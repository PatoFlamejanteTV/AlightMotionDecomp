package com.google.firebase.sessions;

import A0.f;
import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.h;
import D0.r;
import R5.AbstractC1435t;
import U5.g;
import android.content.Context;
import androidx.annotation.Keep;
import c1.InterfaceC2009b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d1.e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m1.C3346B;
import m1.C3357g;
import m1.G;
import m1.InterfaceC3350F;
import m1.J;
import m1.k;
import m1.x;
import n6.I;
import o1.C3516f;
import s.j;

@Keep
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F backgroundDispatcher;
    private static final F blockingDispatcher;
    private static final F firebaseApp;
    private static final F firebaseInstallationsApi;
    private static final F sessionLifecycleServiceBinder;
    private static final F sessionsSettings;
    private static final F transportFactory;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        F b9 = F.b(f.class);
        AbstractC3292y.h(b9, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b9;
        F b10 = F.b(e.class);
        AbstractC3292y.h(b10, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b10;
        F a9 = F.a(C0.a.class, I.class);
        AbstractC3292y.h(a9, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a9;
        F a10 = F.a(C0.b.class, I.class);
        AbstractC3292y.h(a10, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a10;
        F b11 = F.b(j.class);
        AbstractC3292y.h(b11, "unqualified(TransportFactory::class.java)");
        transportFactory = b11;
        F b12 = F.b(C3516f.class);
        AbstractC3292y.h(b12, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b12;
        F b13 = F.b(InterfaceC3350F.class);
        AbstractC3292y.h(b13, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k getComponents$lambda$0(InterfaceC1040e interfaceC1040e) {
        Object b9 = interfaceC1040e.b(firebaseApp);
        AbstractC3292y.h(b9, "container[firebaseApp]");
        Object b10 = interfaceC1040e.b(sessionsSettings);
        AbstractC3292y.h(b10, "container[sessionsSettings]");
        Object b11 = interfaceC1040e.b(backgroundDispatcher);
        AbstractC3292y.h(b11, "container[backgroundDispatcher]");
        Object b12 = interfaceC1040e.b(sessionLifecycleServiceBinder);
        AbstractC3292y.h(b12, "container[sessionLifecycleServiceBinder]");
        return new k((f) b9, (C3516f) b10, (g) b11, (InterfaceC3350F) b12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(InterfaceC1040e interfaceC1040e) {
        return new c(J.f34863a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(InterfaceC1040e interfaceC1040e) {
        Object b9 = interfaceC1040e.b(firebaseApp);
        AbstractC3292y.h(b9, "container[firebaseApp]");
        f fVar = (f) b9;
        Object b10 = interfaceC1040e.b(firebaseInstallationsApi);
        AbstractC3292y.h(b10, "container[firebaseInstallationsApi]");
        e eVar = (e) b10;
        Object b11 = interfaceC1040e.b(sessionsSettings);
        AbstractC3292y.h(b11, "container[sessionsSettings]");
        C3516f c3516f = (C3516f) b11;
        InterfaceC2009b f8 = interfaceC1040e.f(transportFactory);
        AbstractC3292y.h(f8, "container.getProvider(transportFactory)");
        C3357g c3357g = new C3357g(f8);
        Object b12 = interfaceC1040e.b(backgroundDispatcher);
        AbstractC3292y.h(b12, "container[backgroundDispatcher]");
        return new C3346B(fVar, eVar, c3516f, c3357g, (g) b12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3516f getComponents$lambda$3(InterfaceC1040e interfaceC1040e) {
        Object b9 = interfaceC1040e.b(firebaseApp);
        AbstractC3292y.h(b9, "container[firebaseApp]");
        Object b10 = interfaceC1040e.b(blockingDispatcher);
        AbstractC3292y.h(b10, "container[blockingDispatcher]");
        Object b11 = interfaceC1040e.b(backgroundDispatcher);
        AbstractC3292y.h(b11, "container[backgroundDispatcher]");
        Object b12 = interfaceC1040e.b(firebaseInstallationsApi);
        AbstractC3292y.h(b12, "container[firebaseInstallationsApi]");
        return new C3516f((f) b9, (g) b10, (g) b11, (e) b12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(InterfaceC1040e interfaceC1040e) {
        Context k8 = ((f) interfaceC1040e.b(firebaseApp)).k();
        AbstractC3292y.h(k8, "container[firebaseApp].applicationContext");
        Object b9 = interfaceC1040e.b(backgroundDispatcher);
        AbstractC3292y.h(b9, "container[backgroundDispatcher]");
        return new x(k8, (g) b9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3350F getComponents$lambda$5(InterfaceC1040e interfaceC1040e) {
        Object b9 = interfaceC1040e.b(firebaseApp);
        AbstractC3292y.h(b9, "container[firebaseApp]");
        return new G((f) b9);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1038c> getComponents() {
        C1038c.b h8 = C1038c.e(k.class).h(LIBRARY_NAME);
        F f8 = firebaseApp;
        C1038c.b b9 = h8.b(r.k(f8));
        F f9 = sessionsSettings;
        C1038c.b b10 = b9.b(r.k(f9));
        F f10 = backgroundDispatcher;
        C1038c d8 = b10.b(r.k(f10)).b(r.k(sessionLifecycleServiceBinder)).f(new h() { // from class: m1.m
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                k components$lambda$0;
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC1040e);
                return components$lambda$0;
            }
        }).e().d();
        C1038c d9 = C1038c.e(c.class).h("session-generator").f(new h() { // from class: m1.n
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                com.google.firebase.sessions.c components$lambda$1;
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC1040e);
                return components$lambda$1;
            }
        }).d();
        C1038c.b b11 = C1038c.e(b.class).h("session-publisher").b(r.k(f8));
        F f11 = firebaseInstallationsApi;
        return AbstractC1435t.p(d8, d9, b11.b(r.k(f11)).b(r.k(f9)).b(r.m(transportFactory)).b(r.k(f10)).f(new h() { // from class: m1.o
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                com.google.firebase.sessions.b components$lambda$2;
                components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(interfaceC1040e);
                return components$lambda$2;
            }
        }).d(), C1038c.e(C3516f.class).h("sessions-settings").b(r.k(f8)).b(r.k(blockingDispatcher)).b(r.k(f10)).b(r.k(f11)).f(new h() { // from class: m1.p
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                C3516f components$lambda$3;
                components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(interfaceC1040e);
                return components$lambda$3;
            }
        }).d(), C1038c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(r.k(f8)).b(r.k(f10)).f(new h() { // from class: m1.q
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                com.google.firebase.sessions.a components$lambda$4;
                components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(interfaceC1040e);
                return components$lambda$4;
            }
        }).d(), C1038c.e(InterfaceC3350F.class).h("sessions-service-binder").b(r.k(f8)).f(new h() { // from class: m1.r
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                InterfaceC3350F components$lambda$5;
                components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(interfaceC1040e);
                return components$lambda$5;
            }
        }).d(), k1.h.b(LIBRARY_NAME, "2.0.5"));
    }
}
