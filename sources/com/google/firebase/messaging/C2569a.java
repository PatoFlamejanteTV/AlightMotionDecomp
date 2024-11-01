package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import i1.C2965a;
import i1.C2966b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2569a implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final W0.a f18609a = new C2569a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0380a implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0380a f18610a = new C0380a();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f18611b = V0.c.a("projectNumber").b(Y0.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f18612c = V0.c.a("messageId").b(Y0.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f18613d = V0.c.a("instanceId").b(Y0.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f18614e = V0.c.a("messageType").b(Y0.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f18615f = V0.c.a("sdkPlatform").b(Y0.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f18616g = V0.c.a("packageName").b(Y0.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f18617h = V0.c.a("collapseKey").b(Y0.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final V0.c f18618i = V0.c.a("priority").b(Y0.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final V0.c f18619j = V0.c.a("ttl").b(Y0.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final V0.c f18620k = V0.c.a("topic").b(Y0.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final V0.c f18621l = V0.c.a("bulkId").b(Y0.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final V0.c f18622m = V0.c.a(NotificationCompat.CATEGORY_EVENT).b(Y0.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final V0.c f18623n = V0.c.a("analyticsLabel").b(Y0.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final V0.c f18624o = V0.c.a("campaignId").b(Y0.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final V0.c f18625p = V0.c.a("composerLabel").b(Y0.a.b().c(15).a()).a();

        private C0380a() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2965a c2965a, V0.e eVar) {
            eVar.d(f18611b, c2965a.l());
            eVar.a(f18612c, c2965a.h());
            eVar.a(f18613d, c2965a.g());
            eVar.a(f18614e, c2965a.i());
            eVar.a(f18615f, c2965a.m());
            eVar.a(f18616g, c2965a.j());
            eVar.a(f18617h, c2965a.d());
            eVar.c(f18618i, c2965a.k());
            eVar.c(f18619j, c2965a.o());
            eVar.a(f18620k, c2965a.n());
            eVar.d(f18621l, c2965a.b());
            eVar.a(f18622m, c2965a.f());
            eVar.a(f18623n, c2965a.a());
            eVar.d(f18624o, c2965a.c());
            eVar.a(f18625p, c2965a.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes4.dex */
    private static final class b implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f18626a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f18627b = V0.c.a("messagingClientEvent").b(Y0.a.b().c(1).a()).a();

        private b() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2966b c2966b, V0.e eVar) {
            eVar.a(f18627b, c2966b.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes4.dex */
    private static final class c implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f18628a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f18629b = V0.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // V0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (V0.e) obj2);
        }

        public void b(K k8, V0.e eVar) {
            throw null;
        }
    }

    private C2569a() {
    }

    @Override // W0.a
    public void a(W0.b bVar) {
        bVar.a(K.class, c.f18628a);
        bVar.a(C2966b.class, b.f18626a);
        bVar.a(C2965a.class, C0380a.f18610a);
    }
}
