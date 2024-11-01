package P2;

import Q5.s;
import S2.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.w;

/* loaded from: classes4.dex */
public final class k implements P2.e {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f8051a;

    /* renamed from: b, reason: collision with root package name */
    private final w f8052b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f8053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8054a;

        /* renamed from: c, reason: collision with root package name */
        int f8056c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8054a = obj;
            this.f8056c |= Integer.MIN_VALUE;
            Object d8 = k.this.d(null, null, this);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8057a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3813L invoke(S2.b bVar) {
            Q2.b c8;
            InterfaceC3813L h8;
            if (bVar == null || (c8 = bVar.c()) == null || (h8 = c8.h()) == null) {
                return A4.g.n(null);
            }
            return h8;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8058a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(T2.b bVar) {
            if (bVar != null) {
                return bVar.e();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8059a;

        /* renamed from: c, reason: collision with root package name */
        int f8061c;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8059a = obj;
            this.f8061c |= Integer.MIN_VALUE;
            Object a9 = k.this.a(null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8062a;

        /* renamed from: c, reason: collision with root package name */
        int f8064c;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8062a = obj;
            this.f8064c |= Integer.MIN_VALUE;
            Object b9 = k.this.b(null, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    public k(b.a linkComponentBuilder) {
        AbstractC3292y.i(linkComponentBuilder, "linkComponentBuilder");
        this.f8051a = linkComponentBuilder;
        w a9 = AbstractC3815N.a(null);
        this.f8052b = a9;
        this.f8053c = A4.g.m(A4.g.l(a9, b.f8057a), c.f8058a);
    }

    private final S2.b g(P2.d dVar) {
        S2.b bVar = (S2.b) this.f8052b.getValue();
        if (bVar != null) {
            if (!AbstractC3292y.d(bVar.a(), dVar)) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        S2.b build = this.f8051a.a(dVar).build();
        this.f8052b.setValue(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(P2.d r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof P2.k.d
            if (r0 == 0) goto L13
            r0 = r6
            P2.k$d r0 = (P2.k.d) r0
            int r1 = r0.f8061c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8061c = r1
            goto L18
        L13:
            P2.k$d r0 = new P2.k$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8059a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f8061c
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
            S2.b r5 = r4.g(r5)
            Q2.b r5 = r5.c()
            r0.f8061c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.k.a(P2.d, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(P2.d r5, Y2.m r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof P2.k.e
            if (r0 == 0) goto L13
            r0 = r7
            P2.k$e r0 = (P2.k.e) r0
            int r1 = r0.f8064c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8064c = r1
            goto L18
        L13:
            P2.k$e r0 = new P2.k$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8062a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f8064c
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
            S2.b r5 = r4.g(r5)
            Q2.b r5 = r5.c()
            r0.f8064c = r3
            java.lang.Object r5 = r5.p(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            boolean r6 = Q5.s.h(r5)
            if (r6 == 0) goto L57
            T2.b r5 = (T2.b) r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
        L57:
            java.lang.Object r5 = Q5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.k.b(P2.d, Y2.m, U5.d):java.lang.Object");
    }

    @Override // P2.e
    public InterfaceC3821f c(P2.d configuration) {
        AbstractC3292y.i(configuration, "configuration");
        return g(configuration).c().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(P2.d r5, com.stripe.android.model.p r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof P2.k.a
            if (r0 == 0) goto L13
            r0 = r7
            P2.k$a r0 = (P2.k.a) r0
            int r1 = r0.f8056c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8056c = r1
            goto L18
        L13:
            P2.k$a r0 = new P2.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8054a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f8056c
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
            S2.b r5 = r4.g(r5)
            Q2.b r5 = r5.c()
            r0.f8056c = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.k.d(P2.d, com.stripe.android.model.p, U5.d):java.lang.Object");
    }

    @Override // P2.e
    public S2.b e(P2.d configuration) {
        AbstractC3292y.i(configuration, "configuration");
        return g(configuration);
    }

    @Override // P2.e
    public InterfaceC3813L f() {
        return this.f8053c;
    }
}
