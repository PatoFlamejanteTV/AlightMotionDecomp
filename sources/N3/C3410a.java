package n3;

import Q5.s;
import R5.AbstractC1435t;
import j3.m;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3410a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0810a f35512b = new C0810a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f35513c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final List f35514d = AbstractC1435t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final m f35515a;

    /* renamed from: n3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0810a {
        private C0810a() {
        }

        public /* synthetic */ C0810a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35516a;

        /* renamed from: c, reason: collision with root package name */
        int f35518c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35516a = obj;
            this.f35518c |= Integer.MIN_VALUE;
            Object a9 = C3410a.this.a(null, null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35519a;

        /* renamed from: c, reason: collision with root package name */
        int f35521c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35519a = obj;
            this.f35521c |= Integer.MIN_VALUE;
            Object b9 = C3410a.this.b(null, null, null, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    public C3410a(m stripeRepository) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        this.f35515a = stripeRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:            r2 = Q5.s.f8810b;        r0 = Q5.t.a(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, U5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof n3.C3410a.b
            if (r2 == 0) goto L18
            r2 = r0
            n3.a$b r2 = (n3.C3410a.b) r2
            int r3 = r2.f35518c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f35518c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            n3.a$b r2 = new n3.a$b
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f35516a
            java.lang.Object r2 = V5.b.e()
            int r3 = r9.f35518c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            Q5.s r0 = (Q5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L35
            goto L89
        L35:
            r0 = move-exception
            goto L93
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            Q5.t.b(r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            Q5.s$a r3 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L5b:
            boolean r3 = Q5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L35
            j3.m r3 = r1.f35515a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            B2.j$c r7 = new B2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = n3.C3410a.f35514d     // Catch: java.lang.Throwable -> L35
            r9.f35518c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.n r0 = (com.stripe.android.model.n) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
        L99:
            java.lang.Object r0 = Q5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C3410a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|8|(1:(1:11)(2:16|17))(7:18|19|20|21|(2:23|(1:25))|26|27)|12|14))|33|6|7|8|(0)(0)|12|14) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0035, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:            r2 = Q5.s.f8810b;        r0 = Q5.t.a(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, U5.d r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof n3.C3410a.c
            if (r2 == 0) goto L18
            r2 = r0
            n3.a$c r2 = (n3.C3410a.c) r2
            int r3 = r2.f35521c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f35521c = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            n3.a$c r2 = new n3.a$c
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.f35519a
            java.lang.Object r2 = V5.b.e()
            int r3 = r9.f35521c
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            Q5.s r0 = (Q5.s) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L35
            goto L89
        L35:
            r0 = move-exception
            goto L93
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            Q5.t.b(r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L50
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L50
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r0 = move-exception
            Q5.s$a r3 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L5b:
            boolean r3 = Q5.s.h(r0)
            if (r3 == 0) goto L99
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L35
            j3.m r3 = r1.f35515a     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L35
            B2.j$c r7 = new B2.j$c     // Catch: java.lang.Throwable -> L35
            r14 = 4
            r15 = 0
            r13 = 0
            r10 = r7
            r11 = r17
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L35
            java.util.List r8 = n3.C3410a.f35514d     // Catch: java.lang.Throwable -> L35
            r9.f35521c = r4     // Catch: java.lang.Throwable -> L35
            r4 = r5
            r5 = r0
            r6 = r18
            java.lang.Object r0 = r3.i(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L35
            if (r0 != r2) goto L89
            return r2
        L89:
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L35
            com.stripe.android.model.u r0 = (com.stripe.android.model.u) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L93:
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
        L99:
            java.lang.Object r0 = Q5.s.b(r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C3410a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, U5.d):java.lang.Object");
    }
}
