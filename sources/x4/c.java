package X4;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import android.content.Context;
import c5.C2043h;
import c5.C2046k;
import c5.K;
import c5.L;
import c5.P;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.J0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f11250a;

    /* renamed from: b, reason: collision with root package name */
    private b5.n f11251b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11252c;

    /* renamed from: d, reason: collision with root package name */
    private int f11253d;

    /* renamed from: e, reason: collision with root package name */
    private int f11254e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11255a;

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
            int i8 = this.f11255a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f11255a = 1;
                if (cVar.t(this) == e8) {
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
        int f11257a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11259c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11260a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11261b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11262c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3775H f11263d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X4.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0244a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f11264a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f11265b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3775H f11266c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f11267d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0244a(c cVar, C3775H c3775h, T t8, U5.d dVar) {
                    super(2, dVar);
                    this.f11265b = cVar;
                    this.f11266c = c3775h;
                    this.f11267d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0244a(this.f11265b, this.f11266c, this.f11267d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f11264a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f11265b;
                        C3775H c3775h = this.f11266c;
                        ArrayList arrayList = (ArrayList) this.f11267d.f34573a;
                        this.f11264a = 1;
                        if (cVar.D(c3775h, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0244a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11261b = cVar;
                this.f11262c = t8;
                this.f11263d = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11261b, this.f11262c, this.f11263d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3488x0 d8;
                V5.b.e();
                if (this.f11260a == 0) {
                    t.b(obj);
                    this.f11261b.f11251b.k((ArrayList) this.f11262c.f34573a);
                    d8 = AbstractC3462k.d(this.f11261b.A(), null, null, new C0244a(this.f11261b, this.f11263d, this.f11262c, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11259c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f11259c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11257a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34573a = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("categories");
                if (r02 != null && r02.a()) {
                    t8.f34573a = C2046k.b.b(C2046k.f15883g, r02.b(), 0, 2, null);
                } else {
                    K p8 = this.f11259c.p();
                    if (p8.f()) {
                        C2046k.b bVar = C2046k.f15883g;
                        String d8 = p8.d();
                        AbstractC3292y.f(d8);
                        t8.f34573a = C2046k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3292y.f(d9);
                        L l8 = new L("categories", d9);
                        a9.L("categories");
                        a9.M0(l8);
                    }
                }
                a9.i();
                if (!((Collection) t8.f34573a).isEmpty()) {
                    c.this.f11254e++;
                    J0 c8 = C3445b0.c();
                    a aVar = new a(c.this, t8, this.f11259c, null);
                    this.f11257a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0245c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f11268a;

        /* renamed from: b, reason: collision with root package name */
        int f11269b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11271a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11272b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11273c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11272b = cVar;
                this.f11273c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11272b, this.f11273c, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = V5.b.e()
                    int r1 = r6.f11271a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    Q5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    Q5.t.b(r7)
                    goto L56
                L24:
                    Q5.t.b(r7)
                    goto L49
                L28:
                    Q5.t.b(r7)
                    goto L3c
                L2c:
                    Q5.t.b(r7)
                    X4.c r7 = r6.f11272b
                    q5.H r1 = r6.f11273c
                    r6.f11271a = r5
                    java.lang.Object r7 = X4.c.e(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    X4.c r7 = r6.f11272b
                    q5.H r1 = r6.f11273c
                    r6.f11271a = r4
                    java.lang.Object r7 = X4.c.a(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    X4.c r7 = r6.f11272b
                    q5.H r1 = r6.f11273c
                    r6.f11271a = r3
                    java.lang.Object r7 = X4.c.d(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    X4.c r7 = r6.f11272b
                    q5.H r1 = r6.f11273c
                    r6.f11271a = r2
                    java.lang.Object r7 = X4.c.k(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    Q5.I r7 = Q5.I.f8786a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X4.c.C0245c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11275b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, U5.d dVar) {
                super(2, dVar);
                this.f11275b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11275b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11274a == 0) {
                    t.b(obj);
                    this.f11275b.f11251b.f();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0246c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11277b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11278c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0246c(c cVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11277b = cVar;
                this.f11278c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0246c(this.f11277b, this.f11278c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f11276a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f11277b;
                    C3775H c3775h = this.f11278c;
                    this.f11276a = 1;
                    if (cVar.w(c3775h, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0246c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$d */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11281c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(c cVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11280b = cVar;
                this.f11281c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f11280b, this.f11281c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f11279a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f11280b;
                    C3775H c3775h = this.f11281c;
                    this.f11279a = 1;
                    if (cVar.z(c3775h, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$e */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11282a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11283b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11284c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(c cVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11283b = cVar;
                this.f11284c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f11283b, this.f11284c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f11282a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f11283b;
                    C3775H c3775h = this.f11284c;
                    this.f11282a = 1;
                    if (cVar.C(c3775h, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.c$c$f */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11285a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11286b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11287c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(c cVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11286b = cVar;
                this.f11287c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new f(this.f11286b, this.f11287c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f11285a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    c cVar = this.f11286b;
                    C3775H c3775h = this.f11287c;
                    this.f11285a = 1;
                    if (cVar.x(c3775h, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        C0245c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0245c(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r11.f11269b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r2) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r11.f11268a
                q5.H r0 = (q5.C3775H) r0
                Q5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f11268a
                q5.H r1 = (q5.C3775H) r1
                Q5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                Q5.t.b(r12)
                X4.c r12 = X4.c.this
                r1 = 0
                X4.c.r(r12, r1)
                q5.H r12 = new q5.H
                X4.c r1 = X4.c.this
                android.content.Context r1 = X4.c.b(r1)
                r12.<init>(r1)
                X4.c r1 = X4.c.this
                n6.M r5 = r1.A()
                X4.c$c$a r8 = new X4.c$c$a
                X4.c r1 = X4.c.this
                r8.<init>(r1, r12, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                n6.x0 r1 = n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
                r11.f11268a = r12
                r11.f11269b = r2
                java.lang.Object r1 = r1.k(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                n6.J0 r1 = n6.C3445b0.c()
                X4.c$c$b r2 = new X4.c$c$b
                X4.c r5 = X4.c.this
                r2.<init>(r5, r4)
                r11.f11268a = r12
                r11.f11269b = r3
                java.lang.Object r1 = n6.AbstractC3458i.g(r1, r2, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                X4.c r12 = X4.c.this
                int r12 = X4.c.j(r12)
                if (r12 < r3) goto Lbf
                X4.c r12 = X4.c.this
                n6.M r5 = r12.A()
                X4.c$c$c r8 = new X4.c$c$c
                X4.c r12 = X4.c.this
                r8.<init>(r12, r0, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
                X4.c r12 = X4.c.this
                n6.M r5 = r12.A()
                X4.c$c$d r8 = new X4.c$c$d
                X4.c r12 = X4.c.this
                r8.<init>(r12, r0, r4)
                n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
                X4.c r12 = X4.c.this
                n6.M r5 = r12.A()
                X4.c$c$e r8 = new X4.c$c$e
                X4.c r12 = X4.c.this
                r8.<init>(r12, r0, r4)
                n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
                X4.c r12 = X4.c.this
                n6.M r5 = r12.A()
                X4.c$c$f r8 = new X4.c$c$f
                X4.c r12 = X4.c.this
                r8.<init>(r12, r0, r4)
                n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
            Lbf:
                Q5.I r12 = Q5.I.f8786a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: X4.c.C0245c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0245c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f11288a;

        /* renamed from: b, reason: collision with root package name */
        int f11289b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3775H f11291d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11292a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11293b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11294c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3775H f11295d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f11296e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X4.c$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0247a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f11297a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f11298b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3775H f11299c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f11300d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0247a(c cVar, C3775H c3775h, T t8, U5.d dVar) {
                    super(2, dVar);
                    this.f11298b = cVar;
                    this.f11299c = c3775h;
                    this.f11300d = t8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0247a(this.f11298b, this.f11299c, this.f11300d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f11297a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        c cVar = this.f11298b;
                        C3775H c3775h = this.f11299c;
                        ArrayList arrayList = (ArrayList) this.f11300d.f34573a;
                        this.f11297a = 1;
                        if (cVar.E(c3775h, arrayList, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0247a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, P p8, C3775H c3775h, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11293b = cVar;
                this.f11294c = p8;
                this.f11295d = c3775h;
                this.f11296e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11293b, this.f11294c, this.f11295d, this.f11296e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3488x0 d8;
                V5.b.e();
                if (this.f11292a == 0) {
                    t.b(obj);
                    this.f11293b.f11251b.l(this.f11294c);
                    d8 = AbstractC3462k.d(this.f11293b.A(), null, null, new C0247a(this.f11293b, this.f11295d, this.f11296e, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11291d = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f11291d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3791p a9;
            C3791p c3791p;
            Object e8 = V5.b.e();
            int i8 = this.f11289b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3791p = (C3791p) this.f11288a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34573a = new ArrayList();
                a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("floating_categories");
                if (r02 != null && r02.a()) {
                    t8.f34573a = C2046k.f15883g.c(r02.b());
                } else {
                    K v8 = this.f11291d.v();
                    if (v8.f()) {
                        C2046k.b bVar = C2046k.f15883g;
                        String d8 = v8.d();
                        AbstractC3292y.f(d8);
                        t8.f34573a = bVar.c(d8);
                        String d9 = v8.d();
                        AbstractC3292y.f(d9);
                        L l8 = new L("floating_categories", d9);
                        a9.L("floating_categories");
                        a9.M0(l8);
                    }
                }
                if (!((Collection) t8.f34573a).isEmpty()) {
                    P B8 = c.this.B((C2046k) AbstractC1435t.m0((List) t8.f34573a), this.f11291d, a9);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(c.this, B8, this.f11291d, t8, null);
                    this.f11288a = a9;
                    this.f11289b = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                    c3791p = a9;
                }
                a9.i();
                return I.f8786a;
            }
            a9 = c3791p;
            a9.i();
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11301a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11303c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11305b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11305b = cVar;
                this.f11306c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11305b, this.f11306c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11304a == 0) {
                    t.b(obj);
                    this.f11305b.f11251b.e((ArrayList) this.f11306c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11303c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f11303c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11301a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34573a = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("home_features");
                if (r02 != null && r02.a()) {
                    t8.f34573a = this.f11303c.G0(r02.c());
                } else {
                    K y8 = this.f11303c.y();
                    if (y8.f()) {
                        t8.f34573a = this.f11303c.G0(y8);
                        String d8 = y8.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L("home_features", d8);
                        a9.L("home_features");
                        a9.M0(l8);
                    }
                }
                a9.i();
                if (!((Collection) t8.f34573a).isEmpty()) {
                    c.this.f11254e++;
                    c.this.f11253d = -1;
                    Iterator it = ((Iterable) t8.f34573a).iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (l6.n.s(((C2043h) it.next()).v0(), c.this.f11250a.getPackageName(), true)) {
                            c.this.f11253d = i9;
                        }
                        i9 = i10;
                    }
                    if (c.this.f11253d > -1 && c.this.f11253d < ((ArrayList) t8.f34573a).size()) {
                        ((ArrayList) t8.f34573a).remove(c.this.f11253d);
                    }
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(c.this, t8, null);
                this.f11301a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11307a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11309c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11311b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11312c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11311b = cVar;
                this.f11312c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11311b, this.f11312c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11310a == 0) {
                    t.b(obj);
                    this.f11311b.f11251b.d(this.f11312c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11309c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f11309c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11307a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("last_updates");
                if (r02 != null && r02.a()) {
                    arrayList = this.f11309c.G0(r02.c());
                } else {
                    K E8 = this.f11309c.E(20, 0);
                    if (E8.f()) {
                        arrayList = this.f11309c.G0(E8);
                        String d8 = E8.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L("last_updates", d8);
                        a9.L("last_updates");
                        a9.M0(l8);
                    }
                }
                ArrayList arrayList2 = arrayList;
                a9.i();
                String string = c.this.f11250a.getString(R.string.latest_updates);
                AbstractC3292y.h(string, "getString(...)");
                P p8 = new P(new C2046k(-3, string, null, 4, null), arrayList2, 0, 4, null);
                p8.f(1);
                J0 c8 = C3445b0.c();
                a aVar = new a(c.this, p8, null);
                this.f11307a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
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
        int f11313a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11315c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f11317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f11318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, c cVar, U5.d dVar) {
                super(2, dVar);
                this.f11317b = t8;
                this.f11318c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11317b, this.f11318c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11316a == 0) {
                    t.b(obj);
                    if (this.f11317b.f34573a != null) {
                        this.f11318c.f11251b.c((C2043h) this.f11317b.f34573a);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11315c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f11315c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11313a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("main_app");
                if (r02 != null && r02.a()) {
                    JSONObject jSONObject = new JSONObject(r02.b()).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    C2043h c2043h = new C2043h();
                    t8.f34573a = c2043h;
                    AbstractC3292y.f(jSONObject);
                    c2043h.a(jSONObject);
                } else {
                    K F8 = this.f11315c.F();
                    if (F8.f()) {
                        String d8 = F8.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C2043h c2043h2 = new C2043h();
                        t8.f34573a = c2043h2;
                        AbstractC3292y.f(jSONObject2);
                        c2043h2.a(jSONObject2);
                        String d9 = F8.d();
                        AbstractC3292y.f(d9);
                        L l8 = new L("main_app", d9);
                        a9.L("main_app");
                        a9.M0(l8);
                    }
                }
                a9.i();
                J0 c8 = C3445b0.c();
                a aVar = new a(t8, c.this, null);
                this.f11313a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
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
        int f11319a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11321c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11322a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11323b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11324c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11323b = cVar;
                this.f11324c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11323b, this.f11324c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11322a == 0) {
                    t.b(obj);
                    this.f11323b.f11251b.j(this.f11324c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11321c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f11321c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = V5.b.e();
            int i8 = this.f11319a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("new_releases");
                if (r02 != null && r02.a()) {
                    arrayList = this.f11321c.G0(r02.c());
                } else {
                    K I8 = this.f11321c.I(20, 0);
                    if (I8.f()) {
                        ArrayList G02 = this.f11321c.G0(I8);
                        String d8 = I8.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L("new_releases", d8);
                        a9.L("new_releases");
                        a9.M0(l8);
                        arrayList = G02;
                    } else {
                        arrayList = null;
                    }
                }
                a9.i();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = c.this.f11250a.getString(R.string.new_releases);
                    AbstractC3292y.h(string, "getString(...)");
                    P p8 = new P(new C2046k(-2, string, null, 4, null), arrayList, 0, 4, null);
                    p8.f(1);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(c.this, p8, null);
                    this.f11319a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
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
        int f11325a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11327c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11328a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11329b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11330c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11329b = cVar;
                this.f11330c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11329b, this.f11330c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11328a == 0) {
                    t.b(obj);
                    this.f11329b.f11251b.h((ArrayList) this.f11330c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11327c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f11327c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11325a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("recent_featured");
                if (r02 != null && r02.a()) {
                    t8.f34573a = this.f11327c.G0(r02.c());
                } else {
                    K U8 = this.f11327c.U(1, 0);
                    if (U8.f()) {
                        t8.f34573a = this.f11327c.G0(U8);
                        String d8 = U8.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L("recent_featured", d8);
                        a9.L("recent_featured");
                        a9.M0(l8);
                    }
                }
                a9.i();
                Collection collection = (Collection) t8.f34573a;
                if (collection != null && !collection.isEmpty()) {
                    J0 c8 = C3445b0.c();
                    a aVar = new a(c.this, t8, null);
                    this.f11325a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
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
        Object f11331a;

        /* renamed from: b, reason: collision with root package name */
        Object f11332b;

        /* renamed from: c, reason: collision with root package name */
        int f11333c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3775H f11335e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11337b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11338c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11337b = cVar;
                this.f11338c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11337b, this.f11338c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11336a == 0) {
                    t.b(obj);
                    this.f11337b.f11251b.a(this.f11338c);
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
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11340b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11341c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11340b = cVar;
                this.f11341c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11340b, this.f11341c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11339a == 0) {
                    t.b(obj);
                    this.f11340b.f11251b.g((C2043h) this.f11341c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11335e = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f11335e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3791p a9;
            ArrayList arrayList;
            C3791p c3791p;
            Object e8 = V5.b.e();
            int i8 = this.f11333c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3791p = (C3791p) this.f11331a;
                        t.b(obj);
                        a9 = c3791p;
                        a9.i();
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a9 = (C3791p) this.f11332b;
                arrayList = (ArrayList) this.f11331a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                L r02 = a9.r0("top_downloads");
                if (r02 != null && r02.a()) {
                    arrayList2 = this.f11335e.G0(r02.c());
                } else {
                    K b02 = this.f11335e.b0(20, 0);
                    if (b02.f()) {
                        arrayList2 = this.f11335e.G0(b02);
                        String d8 = b02.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L("top_downloads", d8);
                        a9.L("top_downloads");
                        a9.M0(l8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = c.this.f11250a.getString(R.string.top_downloads_title);
                    AbstractC3292y.h(string, "getString(...)");
                    P p8 = new P(new C2046k(-1, string, null, 4, null), arrayList, 0, 4, null);
                    p8.f(8);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(c.this, p8, null);
                    this.f11331a = arrayList;
                    this.f11332b = a9;
                    this.f11333c = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a9.i();
                return I.f8786a;
            }
            if (c.this.f11253d > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2043h c2043h = (C2043h) next;
                    if (!l6.n.s(c2043h.v0(), c.this.f11250a.getPackageName(), true)) {
                        t8.f34573a = c2043h;
                        break;
                    }
                }
                if (t8.f34573a != null) {
                    J0 c9 = C3445b0.c();
                    b bVar = new b(c.this, t8, null);
                    this.f11331a = a9;
                    this.f11332b = null;
                    this.f11333c = 2;
                    if (AbstractC3458i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3791p = a9;
                    a9 = c3791p;
                }
            }
            a9.i();
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11342a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11344c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3775H f11345d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11346a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11347b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11348c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f11347b = cVar;
                this.f11348c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11347b, this.f11348c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11346a == 0) {
                    t.b(obj);
                    this.f11347b.f11251b.b(this.f11348c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11344c = arrayList;
            this.f11345d = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f11344c, this.f11345d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11342a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(c.this.f11250a);
                a9.a();
                Iterator it = this.f11344c.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    arrayList.add(c.this.B((C2046k) next, this.f11345d, a9));
                }
                a9.i();
                J0 c8 = C3445b0.c();
                a aVar = new a(c.this, arrayList, null);
                this.f11342a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11349a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11350b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f11351c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3775H f11352d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11353a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f11354b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11355c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f11354b = cVar;
                this.f11355c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11354b, this.f11355c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11353a == 0) {
                    t.b(obj);
                    this.f11354b.f11251b.i(this.f11355c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ArrayList arrayList, c cVar, C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11350b = arrayList;
            this.f11351c = cVar;
            this.f11352d = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f11350b, this.f11351c, this.f11352d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11349a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (!this.f11350b.isEmpty()) {
                    C3791p a9 = C3791p.f37286s.a(this.f11351c.f11250a);
                    a9.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f11350b.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        arrayList.add(this.f11351c.B((C2046k) next, this.f11352d, a9));
                    }
                    a9.i();
                    J0 c8 = C3445b0.c();
                    a aVar = new a(this.f11351c, arrayList, null);
                    this.f11349a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public c(Context context, b5.n listener, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(scope, "scope");
        this.f11250a = context;
        this.f11251b = listener;
        this.f11252c = scope;
        this.f11253d = -1;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P B(C2046k c2046k, C3775H c3775h, C3791p c3791p) {
        String str;
        K c02;
        int i8 = 5;
        int i9 = 20;
        if (c2046k.s()) {
            str = "floating_category_top_" + c2046k.b();
        } else {
            str = "category_top_" + c2046k.b();
            int b9 = c2046k.b();
            if (b9 != 521) {
                if (b9 != 523) {
                    if (b9 != 524) {
                        i9 = 12;
                        i8 = 6;
                    }
                } else {
                    if (!UptodownApp.f29249C.S()) {
                        i8 = 4;
                    }
                    i9 = 8;
                }
            }
            i8 = 1;
        }
        ArrayList arrayList = new ArrayList();
        L r02 = c3791p.r0(str);
        if (r02 != null && r02.a()) {
            arrayList = c3775h.G0(r02.c());
        } else {
            if (c2046k.s()) {
                c02 = c3775h.e0(c2046k.b(), i9, 0);
            } else {
                c02 = c3775h.c0(c2046k.b(), i9, 0);
            }
            if (c02.f()) {
                arrayList = c3775h.G0(c02);
                String d8 = c02.d();
                AbstractC3292y.f(d8);
                L l8 = new L(str, d8);
                c3791p.L(str);
                c3791p.M0(l8);
            }
        }
        P p8 = new P(c2046k, arrayList, 0, 4, null);
        p8.f(i8);
        return p8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new j(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(C3775H c3775h, ArrayList arrayList, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new k(arrayList, c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(C3775H c3775h, ArrayList arrayList, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new l(arrayList, this, c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new C0245c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new e(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new f(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new h(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new i(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final M A() {
        return this.f11252c;
    }
}
