package O3;

import D3.f;
import E3.c;
import O3.V;
import Q5.C1413h;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import d3.C2752d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.U0;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import v3.C4122b;

/* renamed from: O3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1363k implements V {

    /* renamed from: r, reason: collision with root package name */
    public static final h f7617r = new h(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f7618s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f7619a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f7620b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f7621c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f7622d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f7623e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f7624f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f7625g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f7626h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f7627i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f7628j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f7629k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f7630l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7631m;

    /* renamed from: n, reason: collision with root package name */
    private final n6.M f7632n;

    /* renamed from: o, reason: collision with root package name */
    private final q6.w f7633o;

    /* renamed from: p, reason: collision with root package name */
    private final q6.w f7634p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f7635q;

    /* renamed from: O3.k$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7636a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0146a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7638a;

            C0146a(C1363k c1363k) {
                this.f7638a = c1363k;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7638a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, list, null, false, false, false, false, 62, null)));
                return Q5.I.f8786a;
            }
        }

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
            int i8 = this.f7636a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1363k.this.f7619a;
                C0146a c0146a = new C0146a(C1363k.this);
                this.f7636a = 1;
                if (interfaceC3813L.collect(c0146a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7639a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7641a;

            a(C1363k c1363k) {
                this.f7641a = c1363k;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7641a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, null, null, z8, false, false, false, 59, null)));
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
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
            Object e8 = V5.b.e();
            int i8 = this.f7639a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1363k.this.f7620b;
                a aVar = new a(C1363k.this);
                this.f7639a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$c */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7642a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7644a;

            a(C1363k c1363k) {
                this.f7644a = c1363k;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7644a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, null, null, false, false, z8, false, 47, null)));
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7642a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1363k.this.f7621c;
                a aVar = new a(C1363k.this);
                this.f7642a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7645a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7647a;

            a(C1363k c1363k) {
                this.f7647a = c1363k;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7647a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, null, null, false, false, false, z8, 31, null)));
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7645a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1363k.this.f7622d;
                a aVar = new a(C1363k.this);
                this.f7645a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$e */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7648a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7650a;

            a(C1363k c1363k) {
                this.f7650a = c1363k;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7650a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, null, null, false, z8, false, false, 55, null)));
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7648a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = C1363k.this.f7624f;
                a aVar = new a(C1363k.this);
                this.f7648a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7651a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7653a;

            a(C1363k c1363k) {
                this.f7653a = c1363k;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.f fVar, U5.d dVar) {
                this.f7653a.f7633o.setValue(fVar);
                return Q5.I.f8786a;
            }
        }

        /* renamed from: O3.k$f$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3821f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f f7654a;

            /* renamed from: O3.k$f$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3822g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3822g f7655a;

                /* renamed from: O3.k$f$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0147a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f7656a;

                    /* renamed from: b, reason: collision with root package name */
                    int f7657b;

                    public C0147a(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f7656a = obj;
                        this.f7657b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3822g interfaceC3822g) {
                    this.f7655a = interfaceC3822g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof O3.C1363k.f.b.a.C0147a
                        if (r0 == 0) goto L13
                        r0 = r7
                        O3.k$f$b$a$a r0 = (O3.C1363k.f.b.a.C0147a) r0
                        int r1 = r0.f7657b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7657b = r1
                        goto L18
                    L13:
                        O3.k$f$b$a$a r0 = new O3.k$f$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f7656a
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.f7657b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Q5.t.b(r7)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        Q5.t.b(r7)
                        q6.g r7 = r5.f7655a
                        r2 = r6
                        D3.f r2 = (D3.f) r2
                        boolean r4 = r2 instanceof D3.f.C0023f
                        if (r4 != 0) goto L4d
                        D3.f$d r4 = D3.f.d.f1259a
                        boolean r4 = kotlin.jvm.internal.AbstractC3292y.d(r2, r4)
                        if (r4 != 0) goto L4d
                        D3.f$c r4 = D3.f.c.f1258a
                        boolean r2 = kotlin.jvm.internal.AbstractC3292y.d(r2, r4)
                        if (r2 == 0) goto L56
                    L4d:
                        r0.f7657b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        Q5.I r6 = Q5.I.f8786a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: O3.C1363k.f.b.a.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3821f interfaceC3821f) {
                this.f7654a = interfaceC3821f;
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                Object collect = this.f7654a.collect(new a(interfaceC3822g), dVar);
                if (collect == V5.b.e()) {
                    return collect;
                }
                return Q5.I.f8786a;
            }
        }

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7651a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                b bVar = new b(C1363k.this.f7625g);
                a aVar = new a(C1363k.this);
                this.f7651a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$g */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7659a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7661a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1363k c1363k) {
                super(3);
                this.f7661a = c1363k;
            }

            @Override // c6.InterfaceC2073o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.r invoke(D3.f fVar, com.stripe.android.model.o oVar, List paymentOptionsItems) {
                AbstractC3292y.i(paymentOptionsItems, "paymentOptionsItems");
                return this.f7661a.n(fVar, oVar, paymentOptionsItems);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$g$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1363k f7662a;

            b(C1363k c1363k) {
                this.f7662a = c1363k;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.paymentsheet.r rVar, U5.d dVar) {
                Object value;
                q6.w wVar = this.f7662a.f7634p;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, V.a.b((V.a) value, null, rVar, false, false, false, false, 61, null)));
                return Q5.I.f8786a;
            }
        }

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7659a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = A4.g.e(C1363k.this.f7633o, C1363k.this.f7626h, C1363k.this.f7619a, new a(C1363k.this));
                b bVar = new b(C1363k.this);
                this.f7659a = 1;
                if (e9.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: O3.k$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$h$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function0 {
            a(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.D.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m35invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m35invoke() {
                ((com.stripe.android.paymentsheet.D) this.receiver).x();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f7663a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2752d f7664b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(R3.a aVar, C2752d c2752d) {
                super(0);
                this.f7663a = aVar;
                this.f7664b = c2752d;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m36invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m36invoke() {
                this.f7663a.r().m(new c.a(C1361i.f7563r.a(this.f7663a, this.f7664b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$h$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends C3289v implements Function1 {
            c(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.D.class, "modifyPaymentMethod", "modifyPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3292y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.D) this.receiver).s(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$h$d */
        /* loaded from: classes4.dex */
        public /* synthetic */ class d extends C3289v implements Function1 {
            d(Object obj) {
                super(1, obj, com.stripe.android.paymentsheet.D.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3292y.i(p02, "p0");
                ((com.stripe.android.paymentsheet.D) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.k$h$e */
        /* loaded from: classes4.dex */
        public /* synthetic */ class e extends C3289v implements Function1 {
            e(Object obj) {
                super(1, obj, R3.a.class, "handlePaymentMethodSelected", "handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(D3.f fVar) {
                ((R3.a) this.receiver).E(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((D3.f) obj);
                return Q5.I.f8786a;
            }
        }

        private h() {
        }

        public final V a(R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder, com.stripe.android.paymentsheet.D savedPaymentMethodMutator) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(customerStateHolder, "customerStateHolder");
            AbstractC3292y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new C1363k(savedPaymentMethodMutator.o(), savedPaymentMethodMutator.n(), savedPaymentMethodMutator.l(), savedPaymentMethodMutator.m(), new a(savedPaymentMethodMutator), viewModel.v(), viewModel.y(), customerStateHolder.b(), new b(viewModel, paymentMethodMetadata), new c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.W().c());
        }

        public /* synthetic */ h(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1363k(InterfaceC3813L paymentOptionsItems, InterfaceC3813L editing, InterfaceC3813L canEdit, InterfaceC3813L canRemove, Function0 toggleEdit, InterfaceC3813L isProcessing, InterfaceC3813L currentSelection, InterfaceC3813L mostRecentlySelectedSavedPaymentMethod, Function0 onAddCardPressed, Function1 onEditPaymentMethod, Function1 onDeletePaymentMethod, Function1 onPaymentMethodSelected, boolean z8) {
        AbstractC3292y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3292y.i(editing, "editing");
        AbstractC3292y.i(canEdit, "canEdit");
        AbstractC3292y.i(canRemove, "canRemove");
        AbstractC3292y.i(toggleEdit, "toggleEdit");
        AbstractC3292y.i(isProcessing, "isProcessing");
        AbstractC3292y.i(currentSelection, "currentSelection");
        AbstractC3292y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3292y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3292y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3292y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3292y.i(onPaymentMethodSelected, "onPaymentMethodSelected");
        this.f7619a = paymentOptionsItems;
        this.f7620b = editing;
        this.f7621c = canEdit;
        this.f7622d = canRemove;
        this.f7623e = toggleEdit;
        this.f7624f = isProcessing;
        this.f7625g = currentSelection;
        this.f7626h = mostRecentlySelectedSavedPaymentMethod;
        this.f7627i = onAddCardPressed;
        this.f7628j = onEditPaymentMethod;
        this.f7629k = onDeletePaymentMethod;
        this.f7630l = onPaymentMethodSelected;
        this.f7631m = z8;
        n6.M a9 = n6.N.a(C3445b0.d().plus(U0.b(null, 1, null)));
        this.f7632n = a9;
        this.f7633o = AbstractC3815N.a(null);
        q6.w a10 = AbstractC3815N.a(m());
        this.f7634p = a10;
        this.f7635q = a10;
        AbstractC3462k.d(a9, null, null, new a(null), 3, null);
        AbstractC3462k.d(a9, null, null, new b(null), 3, null);
        AbstractC3462k.d(a9, null, null, new c(null), 3, null);
        AbstractC3462k.d(a9, null, null, new d(null), 3, null);
        AbstractC3462k.d(a9, null, null, new e(null), 3, null);
        AbstractC3462k.d(a9, null, null, new f(null), 3, null);
        AbstractC3462k.d(a9, null, null, new g(null), 3, null);
    }

    private final V.a m() {
        List list = (List) this.f7619a.getValue();
        return new V.a(list, n((D3.f) this.f7625g.getValue(), (com.stripe.android.model.o) this.f7626h.getValue(), list), ((Boolean) this.f7620b.getValue()).booleanValue(), ((Boolean) this.f7624f.getValue()).booleanValue(), ((Boolean) this.f7621c.getValue()).booleanValue(), ((Boolean) this.f7622d.getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.r n(D3.f fVar, com.stripe.android.model.o oVar, List list) {
        boolean d8;
        boolean d9;
        boolean z8;
        boolean z9 = true;
        if (fVar instanceof f.C0023f) {
            d8 = true;
        } else {
            d8 = AbstractC3292y.d(fVar, f.d.f1259a);
        }
        if (d8) {
            d9 = true;
        } else {
            d9 = AbstractC3292y.d(fVar, f.c.f1258a);
        }
        if (!d9) {
            if (fVar instanceof f.e) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.b;
            }
            if (!z8 && fVar != null) {
                z9 = false;
            }
            if (z9) {
                if (oVar != null) {
                    fVar = new f.C0023f(oVar, null, null, 6, null);
                } else {
                    fVar = null;
                }
            } else {
                throw new Q5.p();
            }
        }
        return com.stripe.android.paymentsheet.t.f27676a.c(list, fVar);
    }

    @Override // O3.V
    public void a(V.b viewAction) {
        AbstractC3292y.i(viewAction, "viewAction");
        if (viewAction instanceof V.b.C0138b) {
            this.f7629k.invoke(((V.b.C0138b) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.c) {
            this.f7628j.invoke(((V.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof V.b.d) {
            this.f7630l.invoke(((V.b.d) viewAction).a());
        } else if (AbstractC3292y.d(viewAction, V.b.a.f7500a)) {
            this.f7627i.invoke();
        } else if (AbstractC3292y.d(viewAction, V.b.e.f7506a)) {
            this.f7623e.invoke();
        }
    }

    @Override // O3.V
    public boolean c() {
        return this.f7631m;
    }

    @Override // O3.V
    public void close() {
        n6.N.d(this.f7632n, null, 1, null);
    }

    @Override // O3.V
    public InterfaceC3813L getState() {
        return this.f7635q;
    }
}
