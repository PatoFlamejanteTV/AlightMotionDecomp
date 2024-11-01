package M3;

import B2.j;
import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import g3.v;
import j3.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n2.r;
import n6.M;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final m f6149a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f6150b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f6151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6152a;

        /* renamed from: c, reason: collision with root package name */
        int f6154c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6152a = obj;
            this.f6154c |= Integer.MIN_VALUE;
            Object e8 = g.this.e(null, null, this);
            if (e8 == V5.b.e()) {
                return e8;
            }
            return s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f6156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f6157c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f6158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar, g gVar, Throwable th, U5.d dVar) {
            super(2, dVar);
            this.f6156b = vVar;
            this.f6157c = gVar;
            this.f6158d = th;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f6156b, this.f6157c, this.f6158d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r5.f6155a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                Q5.t.b(r6)
                Q5.s r6 = (Q5.s) r6
                java.lang.Object r6 = r6.j()
                goto L95
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                Q5.t.b(r6)
                Q5.s r6 = (Q5.s) r6
                java.lang.Object r6 = r6.j()
                goto L57
            L2b:
                Q5.t.b(r6)
                g3.v r6 = r5.f6156b
                boolean r1 = r6 instanceof g3.v.b
                java.lang.String r4 = "payment_method"
                if (r1 == 0) goto L70
                M3.g r6 = r5.f6157c
                j3.m r6 = M3.g.d(r6)
                g3.v r1 = r5.f6156b
                g3.v$b r1 = (g3.v.b) r1
                java.lang.String r1 = r1.d()
                M3.g r2 = r5.f6157c
                B2.j$c r2 = M3.g.c(r2)
                java.util.List r4 = R5.AbstractC1435t.e(r4)
                r5.f6155a = r3
                java.lang.Object r6 = r6.c(r1, r2, r4, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                java.lang.Throwable r0 = r5.f6158d
                boolean r1 = Q5.s.h(r6)
                if (r1 == 0) goto L6b
                com.stripe.android.model.n r6 = (com.stripe.android.model.n) r6
                com.stripe.android.model.j$b r1 = com.stripe.android.model.j.f25490j
                com.stripe.android.model.StripeIntent r6 = M3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            L6b:
                java.lang.Object r6 = Q5.s.b(r6)
                goto Lbe
            L70:
                boolean r1 = r6 instanceof g3.v.c
                if (r1 == 0) goto Lae
                M3.g r6 = r5.f6157c
                j3.m r6 = M3.g.d(r6)
                g3.v r1 = r5.f6156b
                g3.v$c r1 = (g3.v.c) r1
                java.lang.String r1 = r1.d()
                M3.g r3 = r5.f6157c
                B2.j$c r3 = M3.g.c(r3)
                java.util.List r4 = R5.AbstractC1435t.e(r4)
                r5.f6155a = r2
                java.lang.Object r6 = r6.x(r1, r3, r4, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                java.lang.Throwable r0 = r5.f6158d
                boolean r1 = Q5.s.h(r6)
                if (r1 == 0) goto La9
                com.stripe.android.model.u r6 = (com.stripe.android.model.u) r6
                com.stripe.android.model.j$b r1 = com.stripe.android.model.j.f25490j
                com.stripe.android.model.StripeIntent r6 = M3.f.a(r6)
                com.stripe.android.model.j r6 = r1.a(r6, r0)
            La9:
                java.lang.Object r6 = Q5.s.b(r6)
                goto Lbe
            Lae:
                boolean r6 = r6 instanceof g3.v.a
                if (r6 == 0) goto Lc3
                Q5.s$a r6 = Q5.s.f8810b
                java.lang.Throwable r6 = r5.f6158d
                java.lang.Object r6 = Q5.t.a(r6)
                java.lang.Object r6 = Q5.s.b(r6)
            Lbe:
                Q5.s r6 = Q5.s.a(r6)
                return r6
            Lc3:
                Q5.p r6 = new Q5.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: M3.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6159a;

        /* renamed from: b, reason: collision with root package name */
        Object f6160b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6161c;

        /* renamed from: e, reason: collision with root package name */
        int f6163e;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6161c = obj;
            this.f6163e |= Integer.MIN_VALUE;
            Object a9 = g.this.a(null, null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    public g(m stripeRepository, N5.a lazyPaymentConfig, U5.g workContext) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC3292y.i(workContext, "workContext");
        this.f6149a = stripeRepository;
        this.f6150b = lazyPaymentConfig;
        this.f6151c = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(g3.v r6, java.lang.Throwable r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof M3.g.a
            if (r0 == 0) goto L13
            r0 = r8
            M3.g$a r0 = (M3.g.a) r0
            int r1 = r0.f6154c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6154c = r1
            goto L18
        L13:
            M3.g$a r0 = new M3.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6152a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6154c
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
            U5.g r8 = r5.f6151c
            M3.g$b r2 = new M3.g$b
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f6154c = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            Q5.s r8 = (Q5.s) r8
            java.lang.Object r6 = r8.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.g.e(g3.v, java.lang.Throwable, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.c f() {
        return new j.c(((r) this.f6150b.get()).f(), ((r) this.f6150b.get()).h(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // M3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.w.l r6, com.stripe.android.paymentsheet.w.i r7, java.util.List r8, java.lang.String r9, U5.d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof M3.g.c
            if (r0 == 0) goto L13
            r0 = r10
            M3.g$c r0 = (M3.g.c) r0
            int r1 = r0.f6163e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6163e = r1
            goto L18
        L13:
            M3.g$c r0 = new M3.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6161c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6163e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r6 = r10.j()
            goto L7b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f6160b
            g3.v r6 = (g3.v) r6
            java.lang.Object r7 = r0.f6159a
            M3.g r7 = (M3.g) r7
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r8 = r10.j()
            goto L67
        L4c:
            Q5.t.b(r10)
            g3.v r6 = M3.f.c(r6, r7, r8, r9)
            j3.m r7 = r5.f6149a
            B2.j$c r8 = r5.f()
            r0.f6159a = r5
            r0.f6160b = r6
            r0.f6163e = r4
            java.lang.Object r8 = r7.b(r6, r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r7 = r5
        L67:
            java.lang.Throwable r9 = Q5.s.e(r8)
            if (r9 == 0) goto L7c
            r8 = 0
            r0.f6159a = r8
            r0.f6160b = r8
            r0.f6163e = r3
            java.lang.Object r6 = r7.e(r6, r9, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r8 = r6
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.g.a(com.stripe.android.paymentsheet.w$l, com.stripe.android.paymentsheet.w$i, java.util.List, java.lang.String, U5.d):java.lang.Object");
    }
}
