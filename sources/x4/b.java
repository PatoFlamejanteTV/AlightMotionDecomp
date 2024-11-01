package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c5.C2045j;
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
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f11223a;

    /* renamed from: b, reason: collision with root package name */
    private b5.m f11224b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11225c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11226a;

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
            int i8 = this.f11226a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f11226a = 1;
                if (bVar.d(this) == e8) {
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
    /* renamed from: X4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0242b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11228a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11231b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11231b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11231b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11230a == 0) {
                    t.b(obj);
                    this.f11231b.f11224b.a();
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
        /* renamed from: X4.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0243b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11233b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0243b(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11233b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0243b(this.f11233b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11232a == 0) {
                    t.b(obj);
                    this.f11233b.f11224b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0243b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.b$b$c */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11234a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11235b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11235b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f11235b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11234a == 0) {
                    t.b(obj);
                    this.f11235b.f11224b.a();
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
        /* renamed from: X4.b$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11236a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11237b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11237b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f11237b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11236a == 0) {
                    t.b(obj);
                    this.f11237b.f11224b.b();
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
        /* renamed from: X4.b$b$e */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11238a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11239b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11239b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f11239b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11238a == 0) {
                    t.b(obj);
                    this.f11239b.f11224b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.b$b$f */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11240a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11241b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11241b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new f(this.f11241b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11240a == 0) {
                    t.b(obj);
                    this.f11241b.f11224b.a();
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
        /* renamed from: X4.b$b$g */
        /* loaded from: classes5.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11242a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11243b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new g(this.f11243b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11242a == 0) {
                    t.b(obj);
                    this.f11243b.f11224b.a();
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
        /* renamed from: X4.b$b$h */
        /* loaded from: classes5.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11244a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11245b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new h(this.f11245b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11244a == 0) {
                    t.b(obj);
                    this.f11245b.f11224b.a();
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
        /* renamed from: X4.b$b$i */
        /* loaded from: classes5.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11246a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11247b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11247b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new i(this.f11247b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11246a == 0) {
                    t.b(obj);
                    this.f11247b.f11224b.a();
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
        /* renamed from: X4.b$b$j */
        /* loaded from: classes5.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11248a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f11249b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f11249b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new j(this.f11249b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11248a == 0) {
                    t.b(obj);
                    this.f11249b.f11224b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        C0242b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0242b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            Object e8 = V5.b.e();
            switch (this.f11228a) {
                case 0:
                    t.b(obj);
                    C2045j.a aVar = C2045j.f15879n;
                    C2045j d8 = aVar.d(b.this.f11223a);
                    if (d8 != null && !d8.d()) {
                        J0 c8 = C3445b0.c();
                        C0243b c0243b = new C0243b(b.this, null);
                        this.f11228a = 1;
                        if (AbstractC3458i.g(c8, c0243b, this) == e8) {
                            return e8;
                        }
                    } else {
                        C3775H c3775h = new C3775H(b.this.f11223a);
                        K o8 = c3775h.o();
                        if (!o8.b() && o8.d() != null) {
                            String d9 = o8.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                int i8 = jSONObject2.getInt("success");
                                if (i8 == 1) {
                                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        AbstractC3292y.f(jSONObject3);
                                        C2045j c9 = aVar.c(jSONObject3);
                                        if (c9 != null) {
                                            long j8 = 1000;
                                            c9.y(System.currentTimeMillis() / j8);
                                            if (d8 == null) {
                                                c9.t(b.this.f11223a);
                                            } else if (c9.k() == d8.k()) {
                                                if (!l6.n.s(c9.n(), d8.n(), true)) {
                                                    d8.B(c9.n());
                                                    d8.y(System.currentTimeMillis() / j8);
                                                    d8.t(b.this.f11223a);
                                                } else {
                                                    c9.t(b.this.f11223a);
                                                }
                                            } else {
                                                c9.t(b.this.f11223a);
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
                                                        aVar.a(b.this.f11223a);
                                                        J0 c10 = C3445b0.c();
                                                        c cVar = new c(b.this, null);
                                                        this.f11228a = 2;
                                                        if (AbstractC3458i.g(c10, cVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    } else {
                                                        J0 c11 = C3445b0.c();
                                                        d dVar = new d(b.this, null);
                                                        this.f11228a = 3;
                                                        if (AbstractC3458i.g(c11, dVar, this) == e8) {
                                                            return e8;
                                                        }
                                                    }
                                                } else {
                                                    J0 c12 = C3445b0.c();
                                                    e eVar = new e(b.this, null);
                                                    this.f11228a = 4;
                                                    if (AbstractC3458i.g(c12, eVar, this) == e8) {
                                                        return e8;
                                                    }
                                                }
                                            } else {
                                                J0 c13 = C3445b0.c();
                                                f fVar = new f(b.this, null);
                                                this.f11228a = 5;
                                                if (AbstractC3458i.g(c13, fVar, this) == e8) {
                                                    return e8;
                                                }
                                            }
                                        } else {
                                            J0 c14 = C3445b0.c();
                                            g gVar = new g(b.this, null);
                                            this.f11228a = 6;
                                            if (AbstractC3458i.g(c14, gVar, this) == e8) {
                                                return e8;
                                            }
                                        }
                                    } else {
                                        J0 c15 = C3445b0.c();
                                        h hVar = new h(b.this, null);
                                        this.f11228a = 7;
                                        if (AbstractC3458i.g(c15, hVar, this) == e8) {
                                            return e8;
                                        }
                                    }
                                } else {
                                    aVar.a(b.this.f11223a);
                                    J0 c16 = C3445b0.c();
                                    i iVar = new i(b.this, null);
                                    this.f11228a = 8;
                                    if (AbstractC3458i.g(c16, iVar, this) == e8) {
                                        return e8;
                                    }
                                }
                            } else {
                                J0 c17 = C3445b0.c();
                                j jVar = new j(b.this, null);
                                this.f11228a = 9;
                                if (AbstractC3458i.g(c17, jVar, this) == e8) {
                                    return e8;
                                }
                            }
                        } else {
                            if (o8.e() == 404) {
                                aVar.a(b.this.f11223a);
                            }
                            J0 c18 = C3445b0.c();
                            a aVar2 = new a(b.this, null);
                            this.f11228a = 10;
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
            return ((C0242b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public b(Context context, b5.m listener, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(scope, "scope");
        this.f11223a = context;
        this.f11224b = listener;
        this.f11225c = scope;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new C0242b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
