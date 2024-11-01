package S3;

import Q5.t;
import S3.c;
import c6.InterfaceC2072n;
import j3.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.r;
import n6.AbstractC3462k;
import n6.I;
import n6.InterfaceC3488x0;
import n6.M;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes4.dex */
public final class a implements S3.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f9406a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f9407b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f9408c;

    /* renamed from: d, reason: collision with root package name */
    private final I f9409d;

    /* renamed from: e, reason: collision with root package name */
    private int f9410e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3488x0 f9411f;

    /* renamed from: g, reason: collision with root package name */
    private final w f9412g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f9413h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0198a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9414a;

        /* renamed from: c, reason: collision with root package name */
        int f9416c;

        C0198a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9414a = obj;
            this.f9416c |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f9417a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.f9417a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f9417a.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f9418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.f9418a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f9418a.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9419a;

        /* renamed from: b, reason: collision with root package name */
        Object f9420b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9421c;

        /* renamed from: e, reason: collision with root package name */
        int f9423e;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9421c = obj;
            this.f9423e |= Integer.MIN_VALUE;
            return a.this.g(false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9424a;

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
            int i8 = this.f9424a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f9424a = 1;
                if (a.h(aVar, false, this, 1, null) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public a(m stripeRepository, N5.a paymentConfigProvider, c.a config, I dispatcher) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(dispatcher, "dispatcher");
        this.f9406a = stripeRepository;
        this.f9407b = paymentConfigProvider;
        this.f9408c = config;
        this.f9409d = dispatcher;
        w a9 = AbstractC3815N.a(null);
        this.f9412g = a9;
        this.f9413h = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof S3.a.C0198a
            if (r0 == 0) goto L14
            r0 = r9
            S3.a$a r0 = (S3.a.C0198a) r0
            int r1 = r0.f9416c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9416c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            S3.a$a r0 = new S3.a$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f9414a
            java.lang.Object r0 = V5.b.e()
            int r1 = r5.f9416c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r9 = r9.j()
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            Q5.t.b(r9)
            N5.a r9 = r8.f9407b
            java.lang.Object r9 = r9.get()
            n2.r r9 = (n2.r) r9
            j3.m r1 = r8.f9406a
            S3.c$a r3 = r8.f9408c
            java.lang.String r3 = r3.a()
            B2.j$c r4 = new B2.j$c
            S3.a$b r6 = new S3.a$b
            r6.<init>(r9)
            S3.a$c r7 = new S3.a$c
            r7.<init>(r9)
            r4.<init>(r6, r7)
            r5.f9416c = r2
            r9 = 0
            r6 = 4
            r7 = 0
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = j3.m.a.b(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L6a
            return r0
        L6a:
            boolean r0 = Q5.s.g(r9)
            r1 = 0
            if (r0 == 0) goto L72
            r9 = r1
        L72:
            com.stripe.android.model.n r9 = (com.stripe.android.model.n) r9
            if (r9 == 0) goto L7a
            com.stripe.android.model.StripeIntent$Status r1 = r9.getStatus()
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.f(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r8, U5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof S3.a.d
            if (r0 == 0) goto L13
            r0 = r9
            S3.a$d r0 = (S3.a.d) r0
            int r1 = r0.f9423e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9423e = r1
            goto L18
        L13:
            S3.a$d r0 = new S3.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9421c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f9423e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f9419a
            S3.a r8 = (S3.a) r8
            Q5.t.b(r9)
            goto L91
        L40:
            java.lang.Object r8 = r0.f9420b
            q6.w r8 = (q6.w) r8
            java.lang.Object r2 = r0.f9419a
            S3.a r2 = (S3.a) r2
            Q5.t.b(r9)
            goto L70
        L4c:
            Q5.t.b(r9)
            if (r8 != 0) goto L5b
            int r8 = r7.f9410e
            S3.c$a r9 = r7.f9408c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
        L5b:
            int r8 = r7.f9410e
            int r8 = r8 + r6
            r7.f9410e = r8
            q6.w r8 = r7.f9412g
            r0.f9419a = r7
            r0.f9420b = r8
            r0.f9423e = r6
            java.lang.Object r9 = r7.f(r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r2 = r7
        L70:
            r8.setValue(r9)
            int r8 = r2.f9410e
            S3.c$a r9 = r2.f9408c
            int r9 = r9.b()
            if (r8 >= r9) goto La0
            int r8 = r2.f9410e
            long r8 = S3.b.a(r8)
            r0.f9419a = r2
            r0.f9420b = r5
            r0.f9423e = r4
            java.lang.Object r8 = n6.X.c(r8, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r8 = r2
        L91:
            r0.f9419a = r5
            r0.f9423e = r3
            r9 = 0
            java.lang.Object r8 = h(r8, r9, r0, r6, r5)
            if (r8 != r1) goto L9d
            return r1
        L9d:
            Q5.I r8 = Q5.I.f8786a
            return r8
        La0:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.g(boolean, U5.d):java.lang.Object");
    }

    static /* synthetic */ Object h(a aVar, boolean z8, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return aVar.g(z8, dVar);
    }

    @Override // S3.c
    public void a(M scope) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(scope, "scope");
        d8 = AbstractC3462k.d(scope, this.f9409d, null, new e(null), 2, null);
        this.f9411f = d8;
    }

    @Override // S3.c
    public void b() {
        InterfaceC3488x0 interfaceC3488x0 = this.f9411f;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        this.f9411f = null;
    }

    @Override // S3.c
    public Object c(U5.d dVar) {
        return f(dVar);
    }

    @Override // S3.c
    public InterfaceC3813L getState() {
        return this.f9413h;
    }
}
