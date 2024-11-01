package F2;

import Q5.I;
import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import R5.a0;
import c3.C2024d;
import c3.C2027g;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import n6.U;

/* loaded from: classes4.dex */
public final class i implements F2.d {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f2170a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f2171b;

    /* renamed from: c, reason: collision with root package name */
    private final M3.e f2172c;

    /* renamed from: d, reason: collision with root package name */
    private final t3.d f2173d;

    /* renamed from: e, reason: collision with root package name */
    private final C2024d f2174e;

    /* renamed from: f, reason: collision with root package name */
    private final U f2175f;

    /* renamed from: g, reason: collision with root package name */
    private final p3.i f2176g;

    /* renamed from: h, reason: collision with root package name */
    private final U5.g f2177h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2178a;

        /* renamed from: b, reason: collision with root package name */
        Object f2179b;

        /* renamed from: c, reason: collision with root package name */
        Object f2180c;

        /* renamed from: d, reason: collision with root package name */
        Object f2181d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2182e;

        /* renamed from: g, reason: collision with root package name */
        int f2184g;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2182e = obj;
            this.f2184g |= Integer.MIN_VALUE;
            return i.this.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2185a;

        /* renamed from: b, reason: collision with root package name */
        Object f2186b;

        /* renamed from: c, reason: collision with root package name */
        Object f2187c;

        /* renamed from: d, reason: collision with root package name */
        Object f2188d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2189e;

        /* renamed from: g, reason: collision with root package name */
        int f2191g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2189e = obj;
            this.f2191g |= Integer.MIN_VALUE;
            Object a9 = i.this.a(null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f2192a;

        /* renamed from: c, reason: collision with root package name */
        int f2194c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2192a = obj;
            this.f2194c |= Integer.MIN_VALUE;
            Object j8 = i.this.j(null, null, null, this);
            if (j8 == V5.b.e()) {
                return j8;
            }
            return s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2195a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f2198d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ F2.c f2199e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f2200a;

            a(F2.a aVar, U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                int i8 = this.f2200a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f2200a = 1;
                throw null;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f2201a;

            b(F2.a aVar, U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                int i8 = this.f2201a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f2201a = 1;
                throw null;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(F2.a aVar, k kVar, i iVar, F2.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f2197c = kVar;
            this.f2198d = iVar;
            this.f2199e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(null, this.f2197c, this.f2198d, this.f2199e, dVar);
            dVar2.f2196b = obj;
            return dVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: F2.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2202a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2203b;

        /* renamed from: d, reason: collision with root package name */
        int f2205d;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2203b = obj;
            this.f2205d |= Integer.MIN_VALUE;
            Object k8 = i.this.k(this);
            if (k8 == V5.b.e()) {
                return k8;
            }
            return s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2206a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Couldn't find an instance of CustomerAdapter. Are you instantiating CustomerSheet unconditionally in your app?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2207a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2208b;

        /* renamed from: d, reason: collision with root package name */
        int f2210d;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2208b = obj;
            this.f2210d |= Integer.MIN_VALUE;
            Object l8 = i.this.l(null, this);
            if (l8 == V5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    public i(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, M3.e elementsSessionRepository, t3.d isFinancialConnectionsAvailable, C2024d lpmRepository, U customerAdapterProvider, p3.i errorReporter, U5.g workContext) {
        AbstractC3292y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3292y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3292y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3292y.i(lpmRepository, "lpmRepository");
        AbstractC3292y.i(customerAdapterProvider, "customerAdapterProvider");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f2170a = isLiveModeProvider;
        this.f2171b = googlePayRepositoryFactory;
        this.f2172c = elementsSessionRepository;
        this.f2173d = isFinancialConnectionsAvailable;
        this.f2174e = lpmRepository;
        this.f2175f = customerAdapterProvider;
        this.f2176g = errorReporter;
        this.f2177h = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(F2.c r12, com.stripe.android.model.j r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof F2.i.a
            if (r0 == 0) goto L13
            r0 = r14
            F2.i$a r0 = (F2.i.a) r0
            int r1 = r0.f2184g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2184g = r1
            goto L18
        L13:
            F2.i$a r0 = new F2.i$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f2182e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f2184g
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r12 = r0.f2181d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.f2180c
            com.stripe.android.model.j r13 = (com.stripe.android.model.j) r13
            java.lang.Object r1 = r0.f2179b
            F2.c r1 = (F2.c) r1
            java.lang.Object r0 = r0.f2178a
            F2.i r0 = (F2.i) r0
            Q5.t.b(r14)
            r10 = r14
            r14 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L92
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L46:
            Q5.t.b(r14)
            c3.d r14 = r11.f2174e
            com.stripe.android.model.StripeIntent r2 = r13.w()
            java.lang.String r4 = r13.u()
            c3.d$a r14 = r14.b(r2, r4)
            java.util.List r14 = r14.c()
            boolean r2 = r12.i()
            if (r2 == 0) goto L9f
            kotlin.jvm.functions.Function1 r2 = r11.f2171b
            kotlin.jvm.functions.Function0 r4 = r11.f2170a
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L74
            N2.d r4 = N2.d.f6435b
            goto L76
        L74:
            N2.d r4 = N2.d.f6436c
        L76:
            java.lang.Object r2 = r2.invoke(r4)
            com.stripe.android.googlepaylauncher.n r2 = (com.stripe.android.googlepaylauncher.n) r2
            q6.f r2 = r2.isReady()
            r0.f2178a = r11
            r0.f2179b = r12
            r0.f2180c = r13
            r0.f2181d = r14
            r0.f2184g = r3
            java.lang.Object r0 = q6.AbstractC3823h.w(r2, r0)
            if (r0 != r1) goto L91
            return r1
        L91:
            r1 = r11
        L92:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La0
            r6 = r12
            r5 = r13
            r7 = r14
            r8 = 1
            goto La5
        L9f:
            r1 = r11
        La0:
            r3 = 0
            r6 = r12
            r5 = r13
            r7 = r14
            r8 = 0
        La5:
            d3.d$a r4 = d3.C2752d.f31307q
            t3.d r9 = r1.f2173d
            d3.d r12 = r4.a(r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.g(F2.c, com.stripe.android.model.j, U5.d):java.lang.Object");
    }

    private final List h(F2.a aVar) {
        if (aVar.f()) {
            List e8 = aVar.e();
            if (e8 == null) {
                return AbstractC1435t.m();
            }
            return e8;
        }
        return AbstractC1435t.e("card");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List i(List list) {
        Set k8 = a0.k(o.p.f25755i.f25773a, o.p.f25745O.f25773a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (k8.contains(((C2027g) obj).d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(F2.a r11, F2.c r12, F2.k r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof F2.i.c
            if (r0 == 0) goto L13
            r0 = r14
            F2.i$c r0 = (F2.i.c) r0
            int r1 = r0.f2194c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2194c = r1
            goto L18
        L13:
            F2.i$c r0 = new F2.i$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f2192a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f2194c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r14)
            goto L48
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Q5.t.b(r14)
            F2.i$d r14 = new F2.i$d
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r13
            r7 = r10
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f2194c = r3
            java.lang.Object r14 = n6.N.e(r14, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.j(F2.a, F2.c, F2.k, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof F2.i.e
            if (r0 == 0) goto L13
            r0 = r9
            F2.i$e r0 = (F2.i.e) r0
            int r1 = r0.f2205d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2205d = r1
            goto L18
        L13:
            F2.i$e r0 = new F2.i$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2203b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f2205d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f2202a
            F2.i r0 = (F2.i) r0
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r9 = r9.j()
            goto L57
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            Q5.t.b(r9)
            n6.U r9 = r8.f2175f
            m6.a$a r2 = m6.C3374a.f35036b
            r2 = 5
            m6.d r4 = m6.EnumC3377d.f35046e
            long r4 = m6.AbstractC3376c.s(r2, r4)
            F2.i$f r2 = F2.i.f.f2206a
            r0.f2202a = r8
            r0.f2205d = r3
            java.lang.Object r9 = F2.e.a(r9, r4, r2, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r0 = r8
        L57:
            java.lang.Throwable r1 = Q5.s.e(r9)
            if (r1 == 0) goto L6d
            p3.i r2 = r0.f2176g
            p3.i$d r3 = p3.i.d.f36205i
            x2.k$a r0 = x2.k.f40948e
            x2.k r4 = r0.b(r1)
            r6 = 4
            r7 = 0
            r5 = 0
            p3.i.b.a(r2, r3, r4, r5, r6, r7)
        L6d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.k(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(F2.a r18, U5.d r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof F2.i.g
            if (r2 == 0) goto L18
            r2 = r1
            F2.i$g r2 = (F2.i.g) r2
            int r3 = r2.f2210d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f2210d = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            F2.i$g r2 = new F2.i$g
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f2208b
            java.lang.Object r2 = V5.b.e()
            int r3 = r8.f2210d
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.lang.Object r2 = r8.f2207a
            F2.i r2 = (F2.i) r2
            Q5.t.b(r1)
            Q5.s r1 = (Q5.s) r1
            java.lang.Object r1 = r1.j()
            goto L76
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            Q5.t.b(r1)
            java.util.List r11 = r17.h(r18)
            com.stripe.android.paymentsheet.w$l$a r1 = new com.stripe.android.paymentsheet.w$l$a
            com.stripe.android.paymentsheet.w$m r3 = new com.stripe.android.paymentsheet.w$m
            com.stripe.android.paymentsheet.w$m$d$b r10 = new com.stripe.android.paymentsheet.w$m$d$b
            r5 = 3
            r6 = 0
            r10.<init>(r6, r6, r5, r6)
            r15 = 28
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.<init>(r3)
            M3.e r3 = r0.f2172c
            java.util.List r6 = R5.AbstractC1435t.m()
            r8.f2207a = r0
            r8.f2210d = r4
            r5 = 0
            r7 = 0
            r4 = r1
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L75
            return r2
        L75:
            r2 = r0
        L76:
            java.lang.Throwable r3 = Q5.s.e(r1)
            if (r3 == 0) goto L8c
            p3.i r4 = r2.f2176g
            p3.i$d r5 = p3.i.d.f36202f
            x2.k$a r2 = x2.k.f40948e
            x2.k r6 = r2.b(r3)
            r8 = 4
            r9 = 0
            r7 = 0
            p3.i.b.a(r4, r5, r6, r7, r8, r9)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.l(F2.a, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0033, B:15:0x00e4, B:17:0x00ea, B:18:0x00fa, B:25:0x005a, B:27:0x00cc, B:31:0x006f, B:32:0x00b3, B:37:0x0081, B:38:0x009e, B:42:0x008e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // F2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(F2.c r10, U5.d r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.a(F2.c, U5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, M3.e elementsSessionRepository, t3.d isFinancialConnectionsAvailable, C2024d lpmRepository, p3.i errorReporter, U5.g workContext) {
        this(isLiveModeProvider, googlePayRepositoryFactory, elementsSessionRepository, isFinancialConnectionsAvailable, lpmRepository, K2.a.f4570a.a(), errorReporter, workContext);
        AbstractC3292y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3292y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3292y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3292y.i(lpmRepository, "lpmRepository");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
    }
}
