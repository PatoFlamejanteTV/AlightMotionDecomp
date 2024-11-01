package com.stripe.android.payments.core.authentication.threeds2;

import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import Q5.s;
import Q5.t;
import U5.g;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import b4.InterfaceC1970a;
import c4.n;
import c4.p;
import c6.InterfaceC2072n;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.x;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.a;
import com.stripe.android.stripe3ds2.transaction.h;
import g3.C2898H;
import g3.C2899I;
import j3.m;
import k3.C3237c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;
import n6.X;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: n, reason: collision with root package name */
    private static final a f26436n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f26437o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Stripe3ds2TransactionContract.a f26438a;

    /* renamed from: b, reason: collision with root package name */
    private final m f26439b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0951c f26440c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26441d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1970a f26442e;

    /* renamed from: f, reason: collision with root package name */
    private final p f26443f;

    /* renamed from: g, reason: collision with root package name */
    private final r3.d f26444g;

    /* renamed from: h, reason: collision with root package name */
    private final n f26445h;

    /* renamed from: i, reason: collision with root package name */
    private final g f26446i;

    /* renamed from: j, reason: collision with root package name */
    private final SavedStateHandle f26447j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f26448k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26449l;

    /* renamed from: m, reason: collision with root package name */
    private final j.c f26450m;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26451a;

        /* renamed from: b, reason: collision with root package name */
        Object f26452b;

        /* renamed from: c, reason: collision with root package name */
        Object f26453c;

        /* renamed from: d, reason: collision with root package name */
        int f26454d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f26455e;

        /* renamed from: g, reason: collision with root package name */
        int f26457g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26455e = obj;
            this.f26457g |= Integer.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26458a;

        /* renamed from: c, reason: collision with root package name */
        int f26460c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26458a = obj;
            this.f26460c |= Integer.MIN_VALUE;
            Object k8 = d.this.k(null, null, null, 0, this);
            return k8 == V5.b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0548d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c4.s f26462b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f26463c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26464d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f26465e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j.c f26466f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0548d(c4.s sVar, x xVar, int i8, d dVar, j.c cVar, U5.d dVar2) {
            super(2, dVar2);
            this.f26462b = sVar;
            this.f26463c = xVar;
            this.f26464d = i8;
            this.f26465e = dVar;
            this.f26466f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0548d(this.f26462b, this.f26463c, this.f26464d, this.f26465e, this.f26466f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object j8;
            Object e8 = V5.b.e();
            int i8 = this.f26461a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        j8 = ((s) obj).j();
                        return s.a(j8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                c4.s sVar = this.f26462b;
                this.f26461a = 1;
                obj = sVar.a(this);
                if (obj == e8) {
                    return e8;
                }
            }
            c4.c cVar = (c4.c) obj;
            C2898H c2898h = new C2898H(this.f26463c.f(), cVar.f(), cVar.i(), cVar.l().a(), cVar.a(), cVar.h(), cVar.b(), this.f26464d, null);
            m mVar = this.f26465e.f26439b;
            j.c cVar2 = this.f26466f;
            this.f26461a = 2;
            j8 = mVar.j(c2898h, cVar2, this);
            if (j8 == e8) {
                return e8;
            }
            return s.a(j8);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0548d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26467a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26468b;

        /* renamed from: d, reason: collision with root package name */
        int f26470d;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26468b = obj;
            this.f26470d |= Integer.MIN_VALUE;
            return d.this.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2899I.a f26472b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c4.s f26473c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26474d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f26475e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f26476f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2899I.a aVar, c4.s sVar, int i8, d dVar, String str, U5.d dVar2) {
            super(2, dVar2);
            this.f26472b = aVar;
            this.f26473c = sVar;
            this.f26474d = i8;
            this.f26475e = dVar;
            this.f26476f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f26472b, this.f26473c, this.f26474d, this.f26475e, this.f26476f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26471a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                long a9 = com.stripe.android.b.f24705q.a();
                this.f26471a = 1;
                if (X.b(a9, this) == e8) {
                    return e8;
                }
            }
            c4.e eVar = new c4.e(this.f26472b.f(), this.f26472b.b(), null, this.f26472b.a(), null, 20, null);
            c4.s sVar = this.f26473c;
            int i9 = this.f26474d;
            String d8 = this.f26475e.f26438a.v().d();
            if (d8 == null) {
                d8 = "";
            }
            return new a.b(sVar.b(eVar, i9, new com.stripe.android.stripe3ds2.transaction.n(d8, this.f26476f, this.f26475e.g().f(), this.f26475e.g().l())));
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public d(Stripe3ds2TransactionContract.a args, m stripeRepository, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC1970a threeDs2Service, p messageVersionRegistry, r3.d challengeResultProcessor, n initChallengeRepository, g workContext, SavedStateHandle savedStateHandle, boolean z8) {
        j.c p8;
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(threeDs2Service, "threeDs2Service");
        AbstractC3292y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3292y.i(challengeResultProcessor, "challengeResultProcessor");
        AbstractC3292y.i(initChallengeRepository, "initChallengeRepository");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        this.f26438a = args;
        this.f26439b = stripeRepository;
        this.f26440c = analyticsRequestExecutor;
        this.f26441d = paymentAnalyticsRequestFactory;
        this.f26442e = threeDs2Service;
        this.f26443f = messageVersionRegistry;
        this.f26444g = challengeResultProcessor;
        this.f26445h = initChallengeRepository;
        this.f26446i = workContext;
        this.f26447j = savedStateHandle;
        this.f26448k = z8;
        this.f26449l = savedStateHandle.contains("key_next_step");
        String b9 = args.h().b();
        if (b9 != null) {
            String str = b9.length() <= 0 ? null : b9;
            if (str != null) {
                p8 = new j.c(str, null, null, 6, null);
                this.f26450m = p8;
            }
        }
        p8 = args.p();
        this.f26450m = p8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.stripe.android.model.x r25, U5.d r26) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.e(com.stripe.android.model.x, U5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a i(String str) {
        String str2;
        String str3;
        this.f26440c.a(PaymentAnalyticsRequestFactory.v(this.f26441d, PaymentAnalyticsEvent.f26078q0, null, null, null, null, null, 62, null));
        String id = this.f26438a.v().getId();
        if (id == null) {
            str2 = "";
        } else {
            str2 = id;
        }
        int b9 = com.stripe.android.b.f24705q.b(this.f26438a.v());
        String d8 = this.f26438a.v().d();
        if (d8 == null) {
            str3 = "";
        } else {
            str3 = d8;
        }
        return new a.c(new PaymentBrowserAuthContract.a(str2, b9, str3, str, null, this.f26438a.b(), null, this.f26438a.p().l(), true, false, this.f26438a.u(), this.f26450m.f(), this.f26448k, null, false, 25152, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(c4.s r14, com.stripe.android.model.x r15, B2.j.c r16, int r17, U5.d r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof com.stripe.android.payments.core.authentication.threeds2.d.c
            if (r1 == 0) goto L17
            r1 = r0
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = (com.stripe.android.payments.core.authentication.threeds2.d.c) r1
            int r2 = r1.f26460c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f26460c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            com.stripe.android.payments.core.authentication.threeds2.d$c r1 = new com.stripe.android.payments.core.authentication.threeds2.d$c
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f26458a
            java.lang.Object r9 = V5.b.e()
            int r1 = r8.f26460c
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
            U5.g r11 = r7.f26446i
            com.stripe.android.payments.core.authentication.threeds2.d$d r12 = new com.stripe.android.payments.core.authentication.threeds2.d$d
            r6 = 0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f26460c = r10
            java.lang.Object r0 = n6.AbstractC3458i.g(r11, r12, r8)
            if (r0 != r9) goto L52
            return r9
        L52:
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.k(c4.s, com.stripe.android.model.x, B2.j$c, int, U5.d):java.lang.Object");
    }

    private final com.stripe.android.payments.core.authentication.threeds2.a o() {
        this.f26440c.a(PaymentAnalyticsRequestFactory.v(this.f26441d, PaymentAnalyticsEvent.f26056V, null, null, null, null, null, 62, null));
        return new a.C0547a(new C3237c(this.f26438a.v().d(), 0, null, false, null, null, this.f26438a.p().l(), 62, null));
    }

    public final boolean f() {
        return this.f26449l;
    }

    public final j.c g() {
        return this.f26450m;
    }

    public final Object h(c4.m mVar, U5.d dVar) {
        return this.f26445h.a(mVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:            if (r11 == null) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(g3.C2899I r11, c4.s r12, java.lang.String r13, int r14, U5.d r15) {
        /*
            r10 = this;
            g3.I$a r1 = r11.a()
            if (r1 == 0) goto L26
            boolean r11 = r1.h()
            if (r11 == 0) goto L20
            r0 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            java.lang.Object r11 = r0.n(r1, r2, r3, r4, r5)
            java.lang.Object r12 = V5.b.e()
            if (r11 != r12) goto L1c
            return r11
        L1c:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = (com.stripe.android.payments.core.authentication.threeds2.a) r11
            goto Lde
        L20:
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.o()
            goto Lde
        L26:
            java.lang.String r12 = r11.f()
            if (r12 == 0) goto L36
            java.lang.String r11 = r11.f()
            com.stripe.android.payments.core.authentication.threeds2.a r11 = r10.i(r11)
            goto Lde
        L36:
            g3.I$d r11 = r11.b()
            if (r11 == 0) goto Lab
            java.lang.String r12 = r11.a()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Code: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = r11.h()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Detail: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = r11.f()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Description: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r11 = r11.b()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Component: "
            r15.append(r0)
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.String[] r11 = new java.lang.String[]{r12, r13, r14, r11}
            java.util.List r11 = R5.AbstractC1435t.p(r11)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r11 = R5.AbstractC1435t.w0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != 0) goto Lad
        Lab:
            java.lang.String r11 = "Invalid 3DS2 authentication response"
        Lad:
            com.stripe.android.payments.core.authentication.threeds2.a$a r12 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            k3.c r13 = new k3.c
            x2.k$a r14 = x2.k.f40948e
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error encountered during 3DS2 authentication request. "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r15.<init>(r11)
            x2.k r3 = r14.b(r15)
            r8 = 123(0x7b, float:1.72E-43)
            r9 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.<init>(r13)
            r11 = r12
        Lde:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.j(g3.I, c4.s, java.lang.String, int, U5.d):java.lang.Object");
    }

    public final Object l(h hVar, U5.d dVar) {
        return this.f26444g.a(hVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(U5.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.stripe.android.payments.core.authentication.threeds2.d.e
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = (com.stripe.android.payments.core.authentication.threeds2.d.e) r0
            int r1 = r0.f26470d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26470d = r1
            goto L18
        L13:
            com.stripe.android.payments.core.authentication.threeds2.d$e r0 = new com.stripe.android.payments.core.authentication.threeds2.d$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26468b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26470d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f26467a
            com.stripe.android.payments.core.authentication.threeds2.d r0 = (com.stripe.android.payments.core.authentication.threeds2.d) r0
            Q5.t.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L68
        L2d:
            r15 = move-exception
            goto L71
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            Q5.t.b(r15)
            B2.c r15 = r14.f26440c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r14.f26441d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f26054T
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            B2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            Q5.s$a r15 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.x r15 = new com.stripe.android.model.x     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a r2 = r14.f26438a     // Catch: java.lang.Throwable -> L6f
            com.stripe.android.model.StripeIntent$a$j$b r2 = r2.h()     // Catch: java.lang.Throwable -> L6f
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L6f
            r0.f26467a = r14     // Catch: java.lang.Throwable -> L6f
            r0.f26470d = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r15 = r14.e(r15, r0)     // Catch: java.lang.Throwable -> L6f
            if (r15 != r1) goto L67
            return r1
        L67:
            r0 = r14
        L68:
            com.stripe.android.payments.core.authentication.threeds2.a r15 = (com.stripe.android.payments.core.authentication.threeds2.a) r15     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r15 = Q5.s.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L6f:
            r15 = move-exception
            r0 = r14
        L71:
            Q5.s$a r1 = Q5.s.f8810b
            java.lang.Object r15 = Q5.t.a(r15)
            java.lang.Object r15 = Q5.s.b(r15)
        L7b:
            java.lang.Throwable r1 = Q5.s.e(r15)
            if (r1 != 0) goto L82
            goto Laf
        L82:
            B2.c r15 = r0.f26440c
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r4 = r0.f26441d
            com.stripe.android.networking.PaymentAnalyticsEvent r5 = com.stripe.android.networking.PaymentAnalyticsEvent.f26053S
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            B2.b r2 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.a(r2)
            com.stripe.android.payments.core.authentication.threeds2.a$a r15 = new com.stripe.android.payments.core.authentication.threeds2.a$a
            k3.c r2 = new k3.c
            x2.k$a r4 = x2.k.f40948e
            x2.k r7 = r4.b(r1)
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.<init>(r2)
        Laf:
            r1 = r15
            com.stripe.android.payments.core.authentication.threeds2.a r1 = (com.stripe.android.payments.core.authentication.threeds2.a) r1
            androidx.lifecycle.SavedStateHandle r1 = r0.f26447j
            java.lang.String r2 = "key_next_step"
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.set(r2, r4)
            r0.f26449l = r3
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.core.authentication.threeds2.d.m(U5.d):java.lang.Object");
    }

    public final Object n(C2899I.a aVar, c4.s sVar, String str, int i8, U5.d dVar) {
        return AbstractC3458i.g(this.f26446i, new f(aVar, sVar, i8, this, str, null), dVar);
    }
}
