package X4;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import X4.f;
import android.content.Context;
import b5.x;
import c5.C2033C;
import c5.C2041f;
import c5.C2043h;
import c5.K;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import q5.C3775H;
import q5.C3784i;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11418a;

    /* renamed from: b, reason: collision with root package name */
    private C2041f f11419b;

    /* renamed from: c, reason: collision with root package name */
    private C2043h f11420c;

    /* renamed from: d, reason: collision with root package name */
    private final x f11421d;

    /* renamed from: e, reason: collision with root package name */
    private int f11422e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11423a;

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
            int i8 = this.f11423a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                f fVar = f.this;
                this.f11423a = 1;
                if (fVar.h(this) == e8) {
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
        int f11425a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11427a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f11428b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, U5.d dVar) {
                super(2, dVar);
                this.f11428b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11428b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11427a == 0) {
                    t.b(obj);
                    this.f11428b.f11421d.b(this.f11428b.f11420c, this.f11428b.f11419b);
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
        /* renamed from: X4.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0251b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11429a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f11430b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0251b(f fVar, U5.d dVar) {
                super(2, dVar);
                this.f11430b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0251b(this.f11430b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11429a == 0) {
                    t.b(obj);
                    x xVar = this.f11430b.f11421d;
                    C2041f c2041f = this.f11430b.f11419b;
                    AbstractC3292y.f(c2041f);
                    String z8 = c2041f.z();
                    if (z8 == null) {
                        z8 = this.f11430b.f11420c.q0();
                        AbstractC3292y.f(z8);
                    }
                    xVar.e(z8);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0251b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int j(C2033C c2033c, C2033C c2033c2) {
            if (c2033c != null && c2033c2 != null) {
                long l8 = c2033c2.l() - c2033c.l();
                if (l8 == 0 && c2033c.a() != null && c2033c2.a() != null) {
                    String a9 = c2033c2.a();
                    AbstractC3292y.f(a9);
                    long parseLong = Long.parseLong(a9);
                    String a10 = c2033c.a();
                    AbstractC3292y.f(a10);
                    l8 = parseLong - Long.parseLong(a10);
                }
                return (int) l8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11425a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                f.this.f11419b = new C3784i().B(f.this.f11418a, f.this.f11420c.v0());
                K C02 = new C3775H(f.this.f11418a).C0(f.this.f11420c.h(), 20, f.this.f11422e);
                if (!C02.b() && C02.d() != null) {
                    String d8 = C02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        C2033C.b bVar = C2033C.f15567h;
                        String d9 = C02.d();
                        AbstractC3292y.f(d9);
                        ArrayList a9 = bVar.a(d9);
                        if (a9 != null && a9.size() > 0) {
                            AbstractC1435t.B(a9, new Comparator() { // from class: X4.g
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int j8;
                                    j8 = f.b.j((C2033C) obj2, (C2033C) obj3);
                                    return j8;
                                }
                            });
                            f.this.f11420c.p1(a9);
                            J0 c8 = C3445b0.c();
                            a aVar = new a(f.this, null);
                            this.f11425a = 1;
                            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        } else {
                            J0 c9 = C3445b0.c();
                            C0251b c0251b = new C0251b(f.this, null);
                            this.f11425a = 2;
                            if (AbstractC3458i.g(c9, c0251b, this) == e8) {
                                return e8;
                            }
                        }
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

    public f(M scope, Context context, C2041f c2041f, C2043h appInfo, x listener, int i8) {
        AbstractC3292y.i(scope, "scope");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(listener, "listener");
        this.f11418a = context;
        this.f11419b = c2041f;
        this.f11420c = appInfo;
        this.f11421d = listener;
        this.f11422e = i8;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
