package U2;

import B2.j;
import P2.f;
import Q5.I;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.Q;
import c6.InterfaceC2072n;
import com.stripe.android.model.p;
import g3.C2912k;
import g3.InterfaceC2913l;
import g3.r;
import j3.m;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;
import p3.i;

/* loaded from: classes4.dex */
public final class a implements U2.c {

    /* renamed from: h, reason: collision with root package name */
    private static final C0214a f10018h = new C0214a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f10019i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f10020a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f10021b;

    /* renamed from: c, reason: collision with root package name */
    private final m f10022c;

    /* renamed from: d, reason: collision with root package name */
    private final T3.a f10023d;

    /* renamed from: e, reason: collision with root package name */
    private final U5.g f10024e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f10025f;

    /* renamed from: g, reason: collision with root package name */
    private final p3.i f10026g;

    /* renamed from: U2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0214a {
        private C0214a() {
        }

        public /* synthetic */ C0214a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10027a;

        /* renamed from: c, reason: collision with root package name */
        int f10029c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10027a = obj;
            this.f10029c |= Integer.MIN_VALUE;
            Object a9 = a.this.a(null, null, null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f10030a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10032c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10033d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f10034e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f10035f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f10036g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, String str4, r rVar, U5.d dVar) {
            super(2, dVar);
            this.f10032c = str;
            this.f10033d = str2;
            this.f10034e = str3;
            this.f10035f = str4;
            this.f10036g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f10032c, this.f10033d, this.f10034e, this.f10035f, this.f10036g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f10030a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a9 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T3.a aVar = a.this.f10023d;
                Locale locale = a.this.f10025f;
                j.c l8 = a.l(a.this, null, 1, null);
                String str = this.f10032c;
                String str2 = this.f10033d;
                String str3 = this.f10034e;
                String str4 = this.f10035f;
                r rVar = this.f10036g;
                this.f10030a = 1;
                a9 = aVar.a(str, str2, str3, str4, locale, "android_payment_element", rVar, l8, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            return s.a(a9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10037a;

        /* renamed from: c, reason: collision with root package name */
        int f10039c;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10037a = obj;
            this.f10039c |= Integer.MIN_VALUE;
            Object b9 = a.this.b(null, null, null, null, null, false, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f10040a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f10043d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f10044e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10045f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f10046g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, p pVar, String str2, boolean z8, String str3, U5.d dVar) {
            super(2, dVar);
            this.f10042c = str;
            this.f10043d = pVar;
            this.f10044e = str2;
            this.f10045f = z8;
            this.f10046g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f10042c, this.f10043d, this.f10044e, this.f10045f, this.f10046g, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f10040a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                Q5.t.b(r10)
                Q5.s r10 = (Q5.s) r10
                java.lang.Object r10 = r10.j()
                goto L4b
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                Q5.t.b(r10)
                U2.a r10 = U2.a.this
                T3.a r3 = U2.a.g(r10)
                java.lang.String r4 = r9.f10042c
                g3.l$a r5 = new g3.l$a
                com.stripe.android.model.p r10 = r9.f10043d
                java.util.Map r10 = r10.B()
                java.lang.String r1 = r9.f10044e
                boolean r6 = r9.f10045f
                r5.<init>(r10, r1, r6)
                U2.a r10 = U2.a.this
                java.lang.String r1 = r9.f10046g
                B2.j$c r7 = U2.a.f(r10, r1)
                r9.f10040a = r2
                java.lang.String r6 = "android_payment_element"
                r8 = r9
                java.lang.Object r10 = r3.b(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L4b
                return r0
            L4b:
                com.stripe.android.model.p r0 = r9.f10043d
                java.lang.String r1 = r9.f10042c
                boolean r2 = Q5.s.h(r10)
                if (r2 == 0) goto L86
                g3.k r10 = (g3.C2912k) r10     // Catch: java.lang.Throwable -> L7f
                java.util.List r10 = r10.a()     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = R5.AbstractC1435t.m0(r10)     // Catch: java.lang.Throwable -> L7f
                g3.k$e r10 = (g3.C2912k.e) r10     // Catch: java.lang.Throwable -> L7f
                g3.l$a$a r2 = g3.InterfaceC2913l.a.f32173d     // Catch: java.lang.Throwable -> L7f
                java.util.Map r3 = r0.B()     // Catch: java.lang.Throwable -> L7f
                java.util.Map r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p$e r3 = com.stripe.android.model.p.f25804u     // Catch: java.lang.Throwable -> L7f
                java.lang.String r4 = r10.getId()     // Catch: java.lang.Throwable -> L7f
                com.stripe.android.model.p r1 = r3.l(r4, r1, r2)     // Catch: java.lang.Throwable -> L7f
                P2.f$a r2 = new P2.f$a     // Catch: java.lang.Throwable -> L7f
                r2.<init>(r10, r1, r0)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r10 = Q5.s.b(r2)     // Catch: java.lang.Throwable -> L7f
                goto L8a
            L7f:
                r10 = move-exception
                Q5.s$a r0 = Q5.s.f8810b
                java.lang.Object r10 = Q5.t.a(r10)
            L86:
                java.lang.Object r10 = Q5.s.b(r10)
            L8a:
                U2.a r0 = U2.a.this
                java.lang.Throwable r1 = Q5.s.e(r10)
                if (r1 == 0) goto La4
                p3.i r2 = U2.a.h(r0)
                p3.i$d r3 = p3.i.d.f36208l
                x2.k$a r0 = x2.k.f40948e
                x2.k r4 = r0.b(r1)
                r6 = 4
                r7 = 0
                r5 = 0
                p3.i.b.a(r2, r3, r4, r5, r6, r7)
            La4:
                Q5.s r10 = Q5.s.a(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: U2.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10047a;

        /* renamed from: c, reason: collision with root package name */
        int f10049c;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10047a = obj;
            this.f10049c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, this);
            if (e8 == V5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f10050a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10053d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f10052c = str;
            this.f10053d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f10052c, this.f10053d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object l8;
            Object e8 = V5.b.e();
            int i8 = this.f10050a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    l8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f10022c;
                String str = this.f10052c;
                String str2 = this.f10053d;
                j.c k8 = a.this.k(str2);
                this.f10050a = 1;
                l8 = mVar.l(str, str2, k8, this);
                if (l8 == e8) {
                    return e8;
                }
            }
            return s.a(l8);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10054a;

        /* renamed from: c, reason: collision with root package name */
        int f10056c;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10054a = obj;
            this.f10056c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, this);
            if (c8 == V5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f10057a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10058b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, U5.d dVar) {
            super(2, dVar);
            this.f10060d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            i iVar = new i(this.f10060d, dVar);
            iVar.f10058b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f10057a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    a aVar = a.this;
                    String str = this.f10060d;
                    s.a aVar2 = s.f8810b;
                    T3.a aVar3 = aVar.f10023d;
                    j.c l8 = a.l(aVar, null, 1, null);
                    this.f10057a = 1;
                    obj = aVar3.c(str, "android_payment_element", l8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
            } catch (Throwable th) {
                s.a aVar4 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (obj != null) {
                b9 = s.b((g3.p) obj);
                return s.a(b9);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f10061a;

        /* renamed from: c, reason: collision with root package name */
        int f10063c;

        j(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10061a = obj;
            this.f10063c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, null, null, this);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f10064a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10066c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10067d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f10068e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f10069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, p pVar, String str3, U5.d dVar) {
            super(2, dVar);
            this.f10066c = str;
            this.f10067d = str2;
            this.f10068e = pVar;
            this.f10069f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f10066c, this.f10067d, this.f10068e, this.f10069f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object n8;
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f10064a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    n8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                m mVar = a.this.f10022c;
                String str = this.f10066c;
                String str2 = this.f10067d;
                Map e9 = Q.e(x.a("payment_method_options", InterfaceC2913l.a.f32173d.a(this.f10068e.B())));
                j.c l8 = a.l(a.this, null, 1, null);
                this.f10064a = 1;
                n8 = mVar.n(str, str2, e9, l8, this);
                if (n8 == e8) {
                    return e8;
                }
            }
            a aVar = a.this;
            Throwable e10 = s.e(n8);
            if (e10 != null) {
                i.b.a(aVar.f10026g, i.d.f36209m, x2.k.f40948e.b(e10), null, 4, null);
            }
            String str3 = this.f10069f;
            String str4 = this.f10066c;
            p pVar = this.f10068e;
            if (s.h(n8)) {
                String str5 = (String) n8;
                b9 = s.b(new f.b(new C2912k.d(str5, str3), p.f25804u.l(str5, str4, InterfaceC2913l.a.f32173d.a(pVar.B()))));
            } else {
                b9 = s.b(n8);
            }
            return s.a(b9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, m stripeRepository, T3.a consumersApiService, U5.g workContext, Locale locale, p3.i errorReporter) {
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(consumersApiService, "consumersApiService");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f10020a = publishableKeyProvider;
        this.f10021b = stripeAccountIdProvider;
        this.f10022c = stripeRepository;
        this.f10023d = consumersApiService;
        this.f10024e = workContext;
        this.f10025f = locale;
        this.f10026g = errorReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c k(String str) {
        String str2;
        if (str == null) {
            str2 = (String) this.f10020a.invoke();
        } else {
            str2 = str;
        }
        Object invoke = this.f10021b.invoke();
        if (str != null) {
            invoke = null;
        }
        return new j.c(str2, (String) invoke, null, 4, null);
    }

    static /* synthetic */ j.c l(a aVar, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return aVar.k(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // U2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, g3.r r19, U5.d r20) {
        /*
            r14 = this;
            r8 = r14
            r0 = r20
            boolean r1 = r0 instanceof U2.a.b
            if (r1 == 0) goto L17
            r1 = r0
            U2.a$b r1 = (U2.a.b) r1
            int r2 = r1.f10029c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f10029c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            U2.a$b r1 = new U2.a$b
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f10027a
            java.lang.Object r10 = V5.b.e()
            int r1 = r9.f10029c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            Q5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            Q5.t.b(r0)
            U5.g r12 = r8.f10024e
            U2.a$c r13 = new U2.a$c
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f10029c = r11
            java.lang.Object r0 = n6.AbstractC3458i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, g3.r, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // U2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.stripe.android.model.p r15, java.lang.String r16, com.stripe.android.model.StripeIntent r17, java.lang.String r18, java.lang.String r19, boolean r20, U5.d r21) {
        /*
            r14 = this;
            r8 = r14
            r0 = r21
            boolean r1 = r0 instanceof U2.a.d
            if (r1 == 0) goto L17
            r1 = r0
            U2.a$d r1 = (U2.a.d) r1
            int r2 = r1.f10039c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f10039c = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            U2.a$d r1 = new U2.a$d
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.f10037a
            java.lang.Object r10 = V5.b.e()
            int r1 = r9.f10039c
            r11 = 1
            if (r1 == 0) goto L36
            if (r1 != r11) goto L2e
            Q5.t.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            Q5.t.b(r0)
            U5.g r12 = r8.f10024e
            U2.a$e r13 = new U2.a$e
            r7 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r20
            r6 = r19
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f10039c = r11
            java.lang.Object r0 = n6.AbstractC3458i.g(r12, r13, r9)
            if (r0 != r10) goto L55
            return r10
        L55:
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.b(com.stripe.android.model.p, java.lang.String, com.stripe.android.model.StripeIntent, java.lang.String, java.lang.String, boolean, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof U2.a.h
            if (r0 == 0) goto L13
            r0 = r7
            U2.a$h r0 = (U2.a.h) r0
            int r1 = r0.f10056c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10056c = r1
            goto L18
        L13:
            U2.a$h r0 = new U2.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10054a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10056c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Q5.t.b(r7)
            U5.g r7 = r5.f10024e
            U2.a$i r2 = new U2.a$i
            r4 = 0
            r2.<init>(r6, r4)
            r0.f10056c = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.c(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // U2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(com.stripe.android.model.p r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, U5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof U2.a.j
            if (r1 == 0) goto L17
            r1 = r0
            U2.a$j r1 = (U2.a.j) r1
            int r2 = r1.f10063c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f10063c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            U2.a$j r1 = new U2.a$j
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f10061a
            java.lang.Object r9 = V5.b.e()
            int r1 = r8.f10063c
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 != r10) goto L2e
            Q5.t.b(r0)
            goto L52
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            Q5.t.b(r0)
            U5.g r11 = r7.f10024e
            U2.a$k r12 = new U2.a$k
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r15
            r4 = r14
            r5 = r16
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f10063c = r10
            java.lang.Object r0 = n6.AbstractC3458i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.d(com.stripe.android.model.p, java.lang.String, java.lang.String, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r6, java.lang.String r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof U2.a.f
            if (r0 == 0) goto L13
            r0 = r8
            U2.a$f r0 = (U2.a.f) r0
            int r1 = r0.f10049c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10049c = r1
            goto L18
        L13:
            U2.a$f r0 = new U2.a$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10047a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10049c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Q5.t.b(r8)
            U5.g r8 = r5.f10024e
            U2.a$g r2 = new U2.a$g
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f10049c = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            Q5.s r8 = (Q5.s) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.e(java.lang.String, java.lang.String, U5.d):java.lang.Object");
    }
}
