package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c5.C2058x;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f11392a;

    /* renamed from: b, reason: collision with root package name */
    private b5.p f11393b;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11394a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11394a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                e eVar = e.this;
                this.f11394a = 1;
                if (eVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11396a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11398a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11399b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11399b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11399b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11398a == 0) {
                    t.b(obj);
                    this.f11399b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0249b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11400a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11401b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0249b(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11401b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0249b(this.f11401b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11400a == 0) {
                    t.b(obj);
                    this.f11401b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0249b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11402a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11403b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11403b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f11403b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11402a == 0) {
                    t.b(obj);
                    this.f11403b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11404a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11405b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11405b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f11405b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11404a == 0) {
                    t.b(obj);
                    this.f11405b.f11393b.b();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.e$b$e, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0250e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0250e(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11407b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0250e(this.f11407b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11406a == 0) {
                    t.b(obj);
                    this.f11407b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0250e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11409b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11409b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new f(this.f11409b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11408a == 0) {
                    t.b(obj);
                    this.f11409b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11411b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11411b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new g(this.f11411b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11410a == 0) {
                    t.b(obj);
                    this.f11411b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11412a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11413b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new h(this.f11413b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11412a == 0) {
                    t.b(obj);
                    this.f11413b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11414a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11415b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11415b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new i(this.f11415b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11414a == 0) {
                    t.b(obj);
                    this.f11415b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11416a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11417b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e eVar, U5.d dVar) {
                super(2, dVar);
                this.f11417b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new j(this.f11417b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11416a == 0) {
                    t.b(obj);
                    this.f11417b.f11393b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Object e8 = V5.b.e();
            switch (this.f11396a) {
                case 0:
                    t.b(obj);
                    C2058x.a aVar = C2058x.f15962n;
                    C2058x d8 = aVar.d(e.this.f11392a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C3445b0.c();
                        C0249b c0249b = new C0249b(e.this, null);
                        this.f11396a = 1;
                        if (AbstractC3458i.g(c8, c0249b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3775H c3775h = new C3775H(e.this.f11392a);
                        K z8 = c3775h.z();
                        if (!z8.b() && z8.d() != null) {
                            String d9 = z8.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3292y.f(jSONObject3);
                                        C2058x c9 = aVar.c(jSONObject3);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(e.this.f11392a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!l6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.B(c9.n());
                                                    d8.t(e.this.f11392a);
                                                } else {
                                                    c9.t(e.this.f11392a);
                                                }
                                            } else {
                                                c9.t(e.this.f11392a);
                                            }
                                            K Q8 = c3775h.Q(c9.k());
                                            if (!Q8.b() && Q8.d() != null) {
                                                String d10 = Q8.d();
                                                AbstractC3292y.f(d10);
                                                JSONObject jSONObject4 = new JSONObject(d10);
                                                if (!jSONObject4.isNull("success")) {
                                                    i8 = jSONObject4.getInt("success");
                                                }
                                                if (!jSONObject4.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                                    jSONObject = jSONObject4.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                                } else {
                                                    jSONObject = null;
                                                }
                                                if (i8 == 1 && jSONObject != null) {
                                                    if (!C2043h.f15796F0.a(jSONObject).d1()) {
                                                        aVar.a(e.this.f11392a);
                                                        J0 c10 = C3445b0.c();
                                                        c cVar = new c(e.this, null);
                                                        this.f11396a = 2;
                                                        if (AbstractC3458i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C3445b0.c();
                                                        d dVar = new d(e.this, null);
                                                        this.f11396a = 3;
                                                        if (AbstractC3458i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C3445b0.c();
                                                    C0250e c0250e = new C0250e(e.this, null);
                                                    this.f11396a = 4;
                                                    if (AbstractC3458i.g(c12, c0250e, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C3445b0.c();
                                                f fVar = new f(e.this, null);
                                                this.f11396a = 5;
                                                if (AbstractC3458i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C3445b0.c();
                                            g gVar = new g(e.this, null);
                                            this.f11396a = 6;
                                            if (AbstractC3458i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C3445b0.c();
                                        h hVar = new h(e.this, null);
                                        this.f11396a = 7;
                                        if (AbstractC3458i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(e.this.f11392a);
                                    J0 c16 = C3445b0.c();
                                    i iVar = new i(e.this, null);
                                    this.f11396a = 8;
                                    if (AbstractC3458i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C3445b0.c();
                                j jVar = new j(e.this, null);
                                this.f11396a = 9;
                                if (AbstractC3458i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (z8.e() == 404) {
                                aVar.a(e.this.f11392a);
                            }
                            J0 c18 = C3445b0.c();
                            a aVar2 = new a(e.this, null);
                            this.f11396a = 10;
                            if (AbstractC3458i.g(c18, aVar2, this) == e8) {
                                return e8;
                            }
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    t.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public e(Context context, b5.p listener, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(scope, "scope");
        this.f11392a = context;
        this.f11393b = listener;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
