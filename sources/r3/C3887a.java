package r3;

import B2.B;
import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import Q5.p;
import Q5.t;
import U5.g;
import c6.InterfaceC2072n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.stripe3ds2.transaction.h;
import j3.m;
import k3.C3237c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3887a implements r3.d {

    /* renamed from: g, reason: collision with root package name */
    private static final C0842a f37811g = new C0842a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f37812h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f37813a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0951c f37814b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f37815c;

    /* renamed from: d, reason: collision with root package name */
    private final B f37816d;

    /* renamed from: e, reason: collision with root package name */
    private final v2.d f37817e;

    /* renamed from: f, reason: collision with root package name */
    private final g f37818f;

    /* renamed from: r3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0842a {
        private C0842a() {
        }

        public /* synthetic */ C0842a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37819a;

        /* renamed from: b, reason: collision with root package name */
        Object f37820b;

        /* renamed from: c, reason: collision with root package name */
        Object f37821c;

        /* renamed from: d, reason: collision with root package name */
        int f37822d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f37823e;

        /* renamed from: g, reason: collision with root package name */
        int f37825g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37823e = obj;
            this.f37825g |= Integer.MIN_VALUE;
            return C3887a.this.f(null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37826a;

        /* renamed from: b, reason: collision with root package name */
        Object f37827b;

        /* renamed from: c, reason: collision with root package name */
        Object f37828c;

        /* renamed from: d, reason: collision with root package name */
        int f37829d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f37830e;

        /* renamed from: g, reason: collision with root package name */
        int f37832g;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37830e = obj;
            this.f37832g |= Integer.MIN_VALUE;
            return C3887a.this.h(null, null, 0, null, this);
        }
    }

    /* renamed from: r3.a$d */
    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f37833a;

        /* renamed from: b, reason: collision with root package name */
        int f37834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f37835c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3887a f37836d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, C3887a c3887a, U5.d dVar) {
            super(2, dVar);
            this.f37835c = hVar;
            this.f37836d = c3887a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f37835c, this.f37836d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            j.c cVar;
            Object e8 = V5.b.e();
            int i8 = this.f37834b;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (j.c) this.f37833a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = this.f37835c;
                if (hVar instanceof h.f) {
                    this.f37836d.f37814b.a(this.f37836d.f37815c.p(PaymentAnalyticsEvent.f26059Y, ((h.f) this.f37835c).h()));
                } else if (hVar instanceof h.c) {
                    this.f37836d.f37814b.a(this.f37836d.f37815c.p(PaymentAnalyticsEvent.f26059Y, ((h.c) this.f37835c).h()));
                } else if (hVar instanceof h.a) {
                    this.f37836d.f37814b.a(this.f37836d.f37815c.p(PaymentAnalyticsEvent.f26058X, ((h.a) this.f37835c).h()));
                } else if (hVar instanceof h.d) {
                    this.f37836d.f37814b.a(PaymentAnalyticsRequestFactory.v(this.f37836d.f37815c, PaymentAnalyticsEvent.f26060Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.e) {
                    this.f37836d.f37814b.a(PaymentAnalyticsRequestFactory.v(this.f37836d.f37815c, PaymentAnalyticsEvent.f26060Z, null, null, null, null, null, 62, null));
                } else if (hVar instanceof h.g) {
                    this.f37836d.f37814b.a(this.f37836d.f37815c.p(PaymentAnalyticsEvent.f26076p0, ((h.g) this.f37835c).h()));
                }
                InterfaceC0951c interfaceC0951c = this.f37836d.f37814b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.f37836d.f37815c;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.f26057W;
                d4.g a9 = this.f37835c.a();
                if (a9 != null) {
                    str = a9.b();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                interfaceC0951c.a(paymentAnalyticsRequestFactory.p(paymentAnalyticsEvent, str));
                j.c cVar2 = new j.c(this.f37835c.b().f(), this.f37835c.b().b(), null, 4, null);
                C3887a c3887a = this.f37836d;
                h hVar2 = this.f37835c;
                this.f37833a = cVar2;
                this.f37834b = 1;
                Object g8 = C3887a.g(c3887a, hVar2, cVar2, 0, this, 4, null);
                if (g8 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = g8;
            }
            if (((Boolean) obj).booleanValue()) {
                h hVar3 = this.f37835c;
                if (!(hVar3 instanceof h.f)) {
                    if (!(hVar3 instanceof h.c)) {
                        if (hVar3 instanceof h.a) {
                            i9 = 3;
                        } else if (!(hVar3 instanceof h.d) && !(hVar3 instanceof h.e)) {
                            if (hVar3 instanceof h.g) {
                                i9 = 4;
                            } else {
                                throw new p();
                            }
                        }
                    }
                }
                return new C3237c(this.f37835c.b().d(), i9, null, false, null, null, cVar.l(), 60, null);
            }
            i9 = 2;
            return new C3237c(this.f37835c.b().d(), i9, null, false, null, null, cVar.l(), 60, null);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3887a(m stripeRepository, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, B retryDelaySupplier, v2.d logger, g workContext) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(retryDelaySupplier, "retryDelaySupplier");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(workContext, "workContext");
        this.f37813a = stripeRepository;
        this.f37814b = analyticsRequestExecutor;
        this.f37815c = paymentAnalyticsRequestFactory;
        this.f37816d = retryDelaySupplier;
        this.f37817e = logger;
        this.f37818f = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.stripe.android.stripe3ds2.transaction.h r8, B2.j.c r9, int r10, U5.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof r3.C3887a.b
            if (r0 == 0) goto L14
            r0 = r11
            r3.a$b r0 = (r3.C3887a.b) r0
            int r1 = r0.f37825g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37825g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            r3.a$b r0 = new r3.a$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f37823e
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.f37825g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L51
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            Q5.t.b(r11)
            goto Lad
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r10 = r6.f37822d
            java.lang.Object r8 = r6.f37821c
            r9 = r8
            B2.j$c r9 = (B2.j.c) r9
            java.lang.Object r8 = r6.f37820b
            com.stripe.android.stripe3ds2.transaction.h r8 = (com.stripe.android.stripe3ds2.transaction.h) r8
            java.lang.Object r1 = r6.f37819a
            r3.a r1 = (r3.C3887a) r1
            Q5.t.b(r11)
            Q5.s r11 = (Q5.s) r11
            java.lang.Object r11 = r11.j()
        L4f:
            r4 = r10
            goto L71
        L51:
            Q5.t.b(r11)
            j3.m r11 = r7.f37813a
            com.stripe.android.stripe3ds2.transaction.n r1 = r8.b()
            java.lang.String r1 = r1.h()
            r6.f37819a = r7
            r6.f37820b = r8
            r6.f37821c = r9
            r6.f37822d = r10
            r6.f37825g = r3
            java.lang.Object r11 = r11.y(r1, r9, r6)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            r1 = r7
            goto L4f
        L71:
            java.lang.Throwable r5 = Q5.s.e(r11)
            if (r5 != 0) goto L9b
            g3.I r11 = (g3.C2899I) r11
            int r8 = 3 - r4
            v2.d r9 = r1.f37817e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "3DS2 challenge completion request was successful. "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " retries attempted."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.b(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
            goto Lb7
        L9b:
            r10 = 0
            r6.f37819a = r10
            r6.f37820b = r10
            r6.f37821c = r10
            r6.f37825g = r2
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.h(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C3887a.f(com.stripe.android.stripe3ds2.transaction.h, B2.j$c, int, U5.d):java.lang.Object");
    }

    static /* synthetic */ Object g(C3887a c3887a, h hVar, j.c cVar, int i8, U5.d dVar, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 3;
        }
        return c3887a.f(hVar, cVar, i8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b A[PHI: r11
  0x009b: PHI (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v1 java.lang.Object) binds: [B:17:0x0098, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.stripe.android.stripe3ds2.transaction.h r7, B2.j.c r8, int r9, java.lang.Throwable r10, U5.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof r3.C3887a.c
            if (r0 == 0) goto L13
            r0 = r11
            r3.a$c r0 = (r3.C3887a.c) r0
            int r1 = r0.f37832g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37832g = r1
            goto L18
        L13:
            r3.a$c r0 = new r3.a$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f37830e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37832g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r11)
            goto L9b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r9 = r0.f37829d
            java.lang.Object r7 = r0.f37828c
            r8 = r7
            B2.j$c r8 = (B2.j.c) r8
            java.lang.Object r7 = r0.f37827b
            com.stripe.android.stripe3ds2.transaction.h r7 = (com.stripe.android.stripe3ds2.transaction.h) r7
            java.lang.Object r10 = r0.f37826a
            r3.a r10 = (r3.C3887a) r10
            Q5.t.b(r11)
            goto L8a
        L47:
            Q5.t.b(r11)
            v2.d r11 = r6.f37817e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "3DS2 challenge completion request failed. Remaining retries: "
            r2.append(r5)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r11.a(r2, r10)
            boolean r11 = r10 instanceof x2.k
            r2 = 0
            if (r11 == 0) goto L6c
            x2.k r10 = (x2.k) r10
            boolean r10 = r10.e()
            goto L6d
        L6c:
            r10 = 0
        L6d:
            if (r9 <= 0) goto L9c
            if (r10 == 0) goto L9c
            B2.B r10 = r6.f37816d
            r11 = 3
            long r10 = r10.a(r11, r9)
            r0.f37826a = r6
            r0.f37827b = r7
            r0.f37828c = r8
            r0.f37829d = r9
            r0.f37832g = r4
            java.lang.Object r10 = n6.X.c(r10, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            r10 = r6
        L8a:
            int r9 = r9 - r4
            r11 = 0
            r0.f37826a = r11
            r0.f37827b = r11
            r0.f37828c = r11
            r0.f37832g = r3
            java.lang.Object r11 = r10.f(r7, r8, r9, r0)
            if (r11 != r1) goto L9b
            return r1
        L9b:
            return r11
        L9c:
            v2.d r7 = r6.f37817e
            java.lang.String r8 = "Did not make a successful 3DS2 challenge completion request after retrying."
            r7.b(r8)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C3887a.h(com.stripe.android.stripe3ds2.transaction.h, B2.j$c, int, java.lang.Throwable, U5.d):java.lang.Object");
    }

    @Override // r3.d
    public Object a(h hVar, U5.d dVar) {
        return AbstractC3458i.g(this.f37818f, new d(hVar, this, null), dVar);
    }
}
