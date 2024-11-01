package Y2;

import Q5.I;
import Q5.p;
import Q5.t;
import R5.AbstractC1435t;
import Y2.m;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import j6.InterfaceC3214c;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3269a;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.w;
import r4.C3890A;
import r4.J;
import r4.Q;
import r4.g0;
import r4.s0;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Y2.k f11780a;

    /* renamed from: b, reason: collision with root package name */
    private final Q2.b f11781b;

    /* renamed from: c, reason: collision with root package name */
    private final R2.e f11782c;

    /* renamed from: d, reason: collision with root package name */
    private final v2.d f11783d;

    /* renamed from: e, reason: collision with root package name */
    private final Y2.e f11784e;

    /* renamed from: f, reason: collision with root package name */
    private final w f11785f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f11786g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11787h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f11788i;

    /* renamed from: j, reason: collision with root package name */
    private final String f11789j;

    /* renamed from: k, reason: collision with root package name */
    private final String f11790k;

    /* renamed from: l, reason: collision with root package name */
    private final String f11791l;

    /* renamed from: m, reason: collision with root package name */
    private final s0 f11792m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f11793n;

    /* renamed from: o, reason: collision with root package name */
    private final s0 f11794o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f11795p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3813L f11796q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f11797r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3813L f11798s;

    /* renamed from: t, reason: collision with root package name */
    private final w f11799t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f11800u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11801v;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Y2.k f11802a;

        /* renamed from: b, reason: collision with root package name */
        private final S2.b f11803b;

        public a(Y2.k signupMode, S2.b linkComponent) {
            AbstractC3292y.i(signupMode, "signupMode");
            AbstractC3292y.i(linkComponent, "linkComponent");
            this.f11802a = signupMode;
            this.f11803b = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            c a9 = this.f11803b.b().a(this.f11802a);
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11804a;

        static {
            int[] iArr = new int[Y2.k.values().length];
            try {
                iArr[Y2.k.f12024b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y2.k.f12023a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11804a = iArr;
        }
    }

    /* renamed from: Y2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0262c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0262c f11805a = new C0262c();

        C0262c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11806a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f11807a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11808a;

        /* renamed from: b, reason: collision with root package name */
        Object f11809b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11810c;

        /* renamed from: e, reason: collision with root package name */
        int f11812e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11810c = obj;
            this.f11812e |= Integer.MIN_VALUE;
            return c.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11813a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f11816d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, c cVar, U5.d dVar) {
            super(2, dVar);
            this.f11815c = function1;
            this.f11816d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            g gVar = new g(this.f11815c, this.f11816d, dVar);
            gVar.f11814b = obj;
            return gVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, U5.d dVar) {
            return ((g) create(str, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r5.f11813a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Q5.t.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f11814b
                java.lang.String r1 = (java.lang.String) r1
                Q5.t.b(r6)
                goto L40
            L22:
                Q5.t.b(r6)
                java.lang.Object r6 = r5.f11814b
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r6 = l6.n.T(r1)
                if (r6 == 0) goto L33
                goto L55
            L33:
                r5.f11814b = r1
                r5.f11813a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = n6.X.b(r3, r5)
                if (r6 != r0) goto L40
                return r0
            L40:
                kotlin.jvm.functions.Function1 r6 = r5.f11815c
                Z2.a r3 = Z2.a.f13215b
                r6.invoke(r3)
                Y2.c r6 = r5.f11816d
                r3 = 0
                r5.f11814b = r3
                r5.f11813a = r2
                java.lang.Object r6 = Y2.c.g(r6, r1, r5)
                if (r6 != r0) goto L5c
                return r0
            L55:
                kotlin.jvm.functions.Function1 r6 = r5.f11815c
                Z2.a r0 = Z2.a.f13214a
                r6.invoke(r0)
            L5c:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Y2.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function1 {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11818a;

            static {
                int[] iArr = new int[Z2.a.values().length];
                try {
                    iArr[Z2.a.f13214a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Z2.a.f13215b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Z2.a.f13216c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f11818a = iArr;
            }
        }

        h() {
            super(1);
        }

        public final void a(Z2.a signUpState) {
            Object value;
            Y2.e eVar;
            m i8;
            AbstractC3292y.i(signUpState, "signUpState");
            c.this.k();
            w wVar = c.this.f11785f;
            c cVar = c.this;
            do {
                value = wVar.getValue();
                eVar = (Y2.e) value;
                int i9 = a.f11818a[signUpState.ordinal()];
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        i8 = cVar.u((String) cVar.f11796q.getValue(), (String) cVar.f11797r.getValue(), (String) cVar.f11798s.getValue());
                    } else {
                        throw new p();
                    }
                } else {
                    i8 = eVar.i();
                }
            } while (!wVar.a(value, Y2.e.b(eVar, i8, null, null, null, null, false, false, signUpState, 126, null)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Z2.a) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11819a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11820b;

        /* renamed from: d, reason: collision with root package name */
        int f11822d;

        i(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11820b = obj;
            this.f11822d |= Integer.MIN_VALUE;
            return c.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11823a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11824b;

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            j jVar = new j(dVar);
            jVar.f11824b = obj;
            return jVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, U5.d dVar) {
            return ((j) create(str, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            V5.b.e();
            if (this.f11823a == 0) {
                t.b(obj);
                String str = (String) this.f11824b;
                if (str != null && !l6.n.T(str)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(!z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11825a;

        k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r5.f11825a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                Q5.t.b(r6)
                goto L54
            L1e:
                Q5.t.b(r6)
                goto L3c
            L22:
                Q5.t.b(r6)
                Y2.c r6 = Y2.c.this
                Y2.e r6 = Y2.c.e(r6)
                boolean r6 = r6.l()
                if (r6 == 0) goto L47
                Y2.c r6 = Y2.c.this
                r5.f11825a = r4
                java.lang.Object r6 = Y2.c.j(r6, r5)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                Y2.c r6 = Y2.c.this
                r5.f11825a = r3
                java.lang.Object r6 = Y2.c.i(r6, r4, r5)
                if (r6 != r0) goto L54
                return r0
            L47:
                Y2.c r6 = Y2.c.this
                r5.f11825a = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = Y2.c.z(r6, r1, r5, r4, r2)
                if (r6 != r0) goto L54
                return r0
            L54:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Y2.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11827a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3269a implements InterfaceC2074p {
            a(Object obj) {
                super(4, obj, c.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // c6.InterfaceC2074p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, String str3, U5.d dVar) {
                return l.j((c) this.receiver, str, str2, str3, dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f11829a;

            b(c cVar) {
                this.f11829a = cVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(m mVar, U5.d dVar) {
                Object value;
                w wVar = this.f11829a.f11785f;
                do {
                    value = wVar.getValue();
                } while (!wVar.a(value, Y2.e.b((Y2.e) value, mVar, null, null, null, null, false, false, null, 254, null)));
                return I.f8786a;
            }
        }

        l(U5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object j(c cVar, String str, String str2, String str3, U5.d dVar) {
            return cVar.u(str, str2, str3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11827a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f l8 = AbstractC3823h.l(c.this.f11796q, c.this.f11797r, c.this.f11798s, new a(c.this));
                b bVar = new b(c.this);
                this.f11827a = 1;
                if (l8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public c(Y2.k signupMode, P2.d config, Q2.b linkAccountManager, R2.e linkEventsReporter, v2.d logger) {
        boolean z8;
        boolean z9;
        boolean z10;
        s0 s0Var;
        AbstractC3292y.i(signupMode, "signupMode");
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(linkAccountManager, "linkAccountManager");
        AbstractC3292y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3292y.i(logger, "logger");
        this.f11780a = signupMode;
        this.f11781b = linkAccountManager;
        this.f11782c = linkEventsReporter;
        this.f11783d = logger;
        Y2.e a9 = Y2.e.f11834i.a(signupMode, config);
        this.f11784e = a9;
        w a10 = AbstractC3815N.a(a9);
        this.f11785f = a10;
        this.f11786g = a10;
        if (signupMode == Y2.k.f12024b) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f11787h = z8;
        Set e8 = a9.e();
        this.f11788i = e8;
        String b9 = e8.contains(Y2.j.f12018a) ? config.b().b() : null;
        this.f11789j = b9;
        String h8 = e8.contains(Y2.j.f12019b) ? config.b().h() : null;
        String str = h8 == null ? "" : h8;
        this.f11790k = str;
        String f8 = e8.contains(Y2.j.f12020c) ? config.b().f() : null;
        this.f11791l = f8;
        C3890A.a aVar = C3890A.f37849h;
        if (a9.k() && z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        s0 a11 = aVar.a(b9, z9);
        this.f11792m = a11;
        Q.a aVar2 = Q.f38111r;
        String a12 = config.b().a();
        if (a9.l() && z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q b10 = Q.a.b(aVar2, str, a12, null, z10, false, 20, null);
        this.f11793n = b10;
        s0 a13 = J.f38018h.a(f8);
        this.f11794o = a13;
        if (p()) {
            s0Var = a13;
        } else {
            s0Var = null;
        }
        this.f11795p = new g0(null, AbstractC1435t.r(a11, b10, s0Var));
        this.f11796q = A4.g.m(a11.l(), C0262c.f11805a);
        this.f11797r = A4.g.m(b10.l(), e.f11807a);
        this.f11798s = A4.g.m(a13.l(), d.f11806a);
        w a14 = AbstractC3815N.a(null);
        this.f11799t = a14;
        this.f11800u = a14;
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(U5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof Y2.c.i
            if (r0 == 0) goto L13
            r0 = r13
            Y2.c$i r0 = (Y2.c.i) r0
            int r1 = r0.f11822d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11822d = r1
            goto L18
        L13:
            Y2.c$i r0 = new Y2.c$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f11820b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f11822d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f11819a
            Y2.c r0 = (Y2.c) r0
            Q5.t.b(r13)
            goto L4c
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            Q5.t.b(r13)
            q6.L r13 = r12.f11797r
            Y2.c$j r2 = new Y2.c$j
            r4 = 0
            r2.<init>(r4)
            r0.f11819a = r12
            r0.f11822d = r3
            java.lang.Object r13 = q6.AbstractC3823h.x(r13, r2, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            r0 = r12
        L4c:
            q6.w r13 = r0.f11785f
        L4e:
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            Y2.e r1 = (Y2.e) r1
            Z2.a r9 = Z2.a.f13216c
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            Y2.e r1 = Y2.e.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.a(r0, r1)
            if (r0 == 0) goto L4e
            Q5.I r13 = Q5.I.f8786a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.c.A(U5.d):java.lang.Object");
    }

    private final void B() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new l(null), 3, null);
    }

    public static final /* synthetic */ m h(c cVar, String str, String str2, String str3) {
        return cVar.u(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f11799t.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.String r19, U5.d r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.c.t(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m u(String str, String str2, String str3) {
        boolean z8;
        Y2.k g8 = this.f11784e.g();
        if (str == null || str2 == null || g8 == null) {
            return null;
        }
        boolean z9 = false;
        if (p() && (str3 == null || l6.n.T(str3))) {
            z8 = false;
        } else {
            z8 = true;
        }
        String z10 = this.f11793n.z(str2);
        String x8 = this.f11793n.x();
        if (this.f11789j != null) {
            z9 = true;
        }
        m.b bVar = new m.b(str, z10, x8, str3, w(g8, z9, true ^ l6.n.T(this.f11790k)));
        if (!z8) {
            return null;
        }
        return bVar;
    }

    private final void v(Throwable th) {
        X2.b a9 = X2.c.a(th);
        this.f11783d.a("Error: ", th);
        this.f11799t.setValue(a9);
    }

    private final Y2.l w(Y2.k kVar, boolean z8, boolean z9) {
        int i8 = b.f11804a[kVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8 && z9) {
                    return Y2.l.f12029c;
                }
                if (z8) {
                    return Y2.l.f12028b;
                }
                return Y2.l.f12027a;
            }
            throw new p();
        }
        if (z8) {
            return Y2.l.f12031e;
        }
        if (!z8) {
            return Y2.l.f12030d;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(boolean z8, U5.d dVar) {
        Object j8 = AbstractC3823h.j(AbstractC3823h.q(this.f11796q, z8 ? 1 : 0), new g(new h(), this, null), dVar);
        if (j8 == V5.b.e()) {
            return j8;
        }
        return I.f8786a;
    }

    static /* synthetic */ Object z(c cVar, boolean z8, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return cVar.y(z8, dVar);
    }

    public final s0 l() {
        return this.f11792m;
    }

    public final InterfaceC3813L m() {
        return this.f11800u;
    }

    public final s0 n() {
        return this.f11794o;
    }

    public final Q o() {
        return this.f11793n;
    }

    public final boolean p() {
        return this.f11784e.c().contains(Y2.j.f12020c);
    }

    public final g0 q() {
        return this.f11795p;
    }

    public final Y2.k r() {
        return this.f11780a;
    }

    public final InterfaceC3813L s() {
        return this.f11786g;
    }

    public final void x() {
        Object value;
        w wVar = this.f11785f;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, Y2.e.b((Y2.e) value, null, null, null, null, null, !r2.j(), false, null, 223, null)));
        if (((Y2.e) this.f11785f.getValue()).j() && !this.f11801v) {
            this.f11801v = true;
            this.f11782c.j();
        }
    }
}
