package com.stripe.android;

import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import Q5.p;
import Q5.t;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2668p;
import g3.InterfaceC2910i;
import j3.InterfaceC3150a;
import j3.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k3.C3235a;
import k3.C3236b;
import k3.C3241g;
import k3.j;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.s;
import n6.AbstractC3458i;
import n6.M;
import q3.C3632a;
import q3.InterfaceC3639h;
import v0.AbstractC4118a;
import v2.d;
import x2.k;

/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: q, reason: collision with root package name */
    public static final a f24705q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f24706r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final List f24707s = AbstractC1435t.e("payment_method");

    /* renamed from: t, reason: collision with root package name */
    private static final long f24708t = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f24709a;

    /* renamed from: b, reason: collision with root package name */
    private final m f24710b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24711c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0951c f24712d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f24713e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3150a f24714f;

    /* renamed from: g, reason: collision with root package name */
    private final U5.g f24715g;

    /* renamed from: h, reason: collision with root package name */
    private final C3236b f24716h;

    /* renamed from: i, reason: collision with root package name */
    private final C3241g f24717i;

    /* renamed from: j, reason: collision with root package name */
    private final j f24718j;

    /* renamed from: k, reason: collision with root package name */
    private final C3235a f24719k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24720l;

    /* renamed from: m, reason: collision with root package name */
    private ActivityResultLauncher f24721m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f24722n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f24723o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3639h f24724p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final long a() {
            return b.f24708t;
        }

        public final /* synthetic */ int b(StripeIntent intent) {
            AbstractC3292y.i(intent, "intent");
            if (intent instanceof n) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            return 50001;
        }

        public final /* synthetic */ int c(InterfaceC2910i params) {
            AbstractC3292y.i(params, "params");
            if (params instanceof com.stripe.android.model.b) {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }
            if (params instanceof com.stripe.android.model.c) {
                return 50001;
            }
            throw new p();
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0453b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24725a;

        /* renamed from: c, reason: collision with root package name */
        int f24727c;

        C0453b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24725a = obj;
            this.f24727c |= Integer.MIN_VALUE;
            Object m8 = b.this.m(null, null, this);
            return m8 == V5.b.e() ? m8 : Q5.s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24728a;

        /* renamed from: c, reason: collision with root package name */
        int f24730c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24728a = obj;
            this.f24730c |= Integer.MIN_VALUE;
            Object n8 = b.this.n(null, null, this);
            return n8 == V5.b.e() ? n8 : Q5.s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24731a;

        /* renamed from: c, reason: collision with root package name */
        int f24733c;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24731a = obj;
            this.f24733c |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            return d8 == V5.b.e() ? d8 : Q5.s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24734a;

        /* renamed from: c, reason: collision with root package name */
        int f24736c;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24734a = obj;
            this.f24736c |= Integer.MIN_VALUE;
            Object e8 = b.this.e(null, this);
            return e8 == V5.b.e() ? e8 : Q5.s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f24737a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f24739c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f24740d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f24741e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC2668p interfaceC2668p, Throwable th, int i8, U5.d dVar) {
            super(2, dVar);
            this.f24739c = interfaceC2668p;
            this.f24740d = th;
            this.f24741e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f24739c, this.f24740d, this.f24741e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f24737a == 0) {
                t.b(obj);
                ((com.stripe.android.a) b.this.f24722n.invoke(this.f24739c)).a(new a.AbstractC0445a.b(k.f40948e.b(this.f24740d), this.f24741e));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.a invoke(InterfaceC2668p host) {
            AbstractC3292y.i(host, "host");
            ActivityResultLauncher activityResultLauncher = b.this.f24721m;
            if (activityResultLauncher != null) {
                return new a.c(activityResultLauncher);
            }
            return new a.b(host);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24743a;

        /* renamed from: b, reason: collision with root package name */
        Object f24744b;

        /* renamed from: c, reason: collision with root package name */
        Object f24745c;

        /* renamed from: d, reason: collision with root package name */
        Object f24746d;

        /* renamed from: e, reason: collision with root package name */
        Object f24747e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24748f;

        /* renamed from: h, reason: collision with root package name */
        int f24750h;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24748f = obj;
            this.f24750h |= Integer.MIN_VALUE;
            return b.this.c(null, null, null, this);
        }
    }

    public b(Context context, Function0 publishableKeyProvider, m stripeRepository, boolean z8, U5.g workContext, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3150a alipayRepository, U5.g uiContext) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(alipayRepository, "alipayRepository");
        AbstractC3292y.i(uiContext, "uiContext");
        this.f24709a = publishableKeyProvider;
        this.f24710b = stripeRepository;
        this.f24711c = z8;
        this.f24712d = analyticsRequestExecutor;
        this.f24713e = paymentAnalyticsRequestFactory;
        this.f24714f = alipayRepository;
        this.f24715g = uiContext;
        this.f24716h = new C3236b(context);
        d.a aVar = v2.d.f40434a;
        this.f24717i = new C3241g(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f24718j = new j(context, publishableKeyProvider, stripeRepository, aVar.a(z8), workContext);
        this.f24719k = C3235a.f34401b.a(context);
        boolean c8 = AbstractC4118a.c(context);
        this.f24720l = c8;
        this.f24722n = new g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24723o = linkedHashMap;
        this.f24724p = C3632a.f36661h.a(context, paymentAnalyticsRequestFactory, z8, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.y(), c8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Function0 tmp0) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.stripe.android.model.b r5, B2.j.c r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.C0453b
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$b r0 = (com.stripe.android.b.C0453b) r0
            int r1 = r0.f24727c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24727c = r1
            goto L18
        L13:
            com.stripe.android.b$b r0 = new com.stripe.android.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24725a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24727c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r7)
            j3.m r7 = r4.f24710b
            com.stripe.android.model.b r5 = r5.E(r3)
            java.util.List r2 = com.stripe.android.b.f24707s
            r0.f24727c = r3
            java.lang.Object r5 = r7.m(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.m(com.stripe.android.model.b, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(com.stripe.android.model.c r5, B2.j.c r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.b$c r0 = (com.stripe.android.b.c) r0
            int r1 = r0.f24730c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24730c = r1
            goto L18
        L13:
            com.stripe.android.b$c r0 = new com.stripe.android.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24728a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24730c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r5 = r7.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r7)
            j3.m r7 = r4.f24710b
            com.stripe.android.model.c r5 = r5.E(r3)
            java.util.List r2 = com.stripe.android.b.f24707s
            r0.f24730c = r3
            java.lang.Object r5 = r7.h(r5, r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.n(com.stripe.android.model.c, B2.j$c, U5.d):java.lang.Object");
    }

    private final Object o(InterfaceC2668p interfaceC2668p, int i8, Throwable th, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.f24715g, new f(interfaceC2668p, th, i8, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void q(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3292y.d(str, this.f24719k.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26049O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26048N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26050P;
        }
        this.f24712d.a(PaymentAnalyticsRequestFactory.v(this.f24713e, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // n2.s
    public boolean a(int i8, Intent intent) {
        return i8 == 50001 && intent != null;
    }

    @Override // n2.s
    public boolean b(int i8, Intent intent) {
        return i8 == 50000 && intent != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(com.stripe.android.view.InterfaceC2668p r10, g3.InterfaceC2910i r11, B2.j.c r12, U5.d r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.c(com.stripe.android.view.p, g3.i, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(android.content.Intent r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.d
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$d r0 = (com.stripe.android.b.d) r0
            int r1 = r0.f24733c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24733c = r1
            goto L18
        L13:
            com.stripe.android.b$d r0 = new com.stripe.android.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24731a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24733c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r6)
            Q5.s r6 = (Q5.s) r6
            java.lang.Object r5 = r6.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r6)
            k3.g r6 = r4.f24717i
            k3.c$a r2 = k3.C3237c.f34404h
            k3.c r5 = r2.b(r5)
            r0.f24733c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.d(android.content.Intent, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(android.content.Intent r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.b.e
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.b$e r0 = (com.stripe.android.b.e) r0
            int r1 = r0.f24736c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24736c = r1
            goto L18
        L13:
            com.stripe.android.b$e r0 = new com.stripe.android.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24734a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f24736c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r6)
            Q5.s r6 = (Q5.s) r6
            java.lang.Object r5 = r6.j()
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r6)
            k3.j r6 = r4.f24718j
            k3.c$a r2 = k3.C3237c.f34404h
            k3.c r5 = r2.b(r5)
            r0.f24736c = r3
            java.lang.Object r5 = r6.p(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.e(android.content.Intent, U5.d):java.lang.Object");
    }

    public Object p(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, j.c cVar, U5.d dVar) {
        Object d8 = this.f24724p.a(stripeIntent).d(interfaceC2668p, stripeIntent, cVar, dVar);
        if (d8 == V5.b.e()) {
            return d8;
        }
        return I.f8786a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(android.content.Context r13, final kotlin.jvm.functions.Function0 r14, j3.m r15, boolean r16, U5.g r17, B2.InterfaceC0951c r18, com.stripe.android.networking.PaymentAnalyticsRequestFactory r19, j3.InterfaceC3150a r20, U5.g r21, int r22, kotlin.jvm.internal.AbstractC3284p r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = 0
            goto Lb
        L9:
            r6 = r16
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L15
            n6.I r1 = n6.C3445b0.b()
            r7 = r1
            goto L17
        L15:
            r7 = r17
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            B2.m r1 = new B2.m
            v2.d$a r2 = v2.d.f40434a
            v2.d r2 = r2.a(r6)
            r1.<init>(r2, r7)
            r8 = r1
            goto L2a
        L28:
            r8 = r18
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L44
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            android.content.Context r2 = r13.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r3)
            n2.L r3 = new n2.L
            r4 = r14
            r3.<init>()
            r1.<init>(r2, r3)
            r9 = r1
            goto L47
        L44:
            r4 = r14
            r9 = r19
        L47:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L53
            j3.b r1 = new j3.b
            r5 = r15
            r1.<init>(r15)
            r10 = r1
            goto L56
        L53:
            r5 = r15
            r10 = r20
        L56:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            n6.J0 r0 = n6.C3445b0.c()
            r11 = r0
            goto L62
        L60:
            r11 = r21
        L62:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.b.<init>(android.content.Context, kotlin.jvm.functions.Function0, j3.m, boolean, U5.g, B2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory, j3.a, U5.g, int, kotlin.jvm.internal.p):void");
    }
}
