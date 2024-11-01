package n3;

import Q5.p;
import Q5.s;
import com.stripe.android.model.d;
import j3.m;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3292y;
import l3.InterfaceC3322a;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3411b {

    /* renamed from: a, reason: collision with root package name */
    private final m f35522a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35523a;

        /* renamed from: c, reason: collision with root package name */
        int f35525c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35523a = obj;
            this.f35525c |= Integer.MIN_VALUE;
            Object a9 = C3411b.this.a(null, null, null, null, null, null, null, null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0811b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35526a;

        /* renamed from: c, reason: collision with root package name */
        int f35528c;

        C0811b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35526a = obj;
            this.f35528c |= Integer.MIN_VALUE;
            Object b9 = C3411b.this.b(null, null, null, null, null, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35529a;

        /* renamed from: c, reason: collision with root package name */
        int f35531c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35529a = obj;
            this.f35531c |= Integer.MIN_VALUE;
            Object c8 = C3411b.this.c(null, null, null, null, null, this);
            if (c8 == V5.b.e()) {
                return c8;
            }
            return s.a(c8);
        }
    }

    public C3411b(m stripeRepository) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        this.f35522a = stripeRepository;
    }

    private final com.stripe.android.model.d d(InterfaceC3322a interfaceC3322a, String str, String str2) {
        if (interfaceC3322a instanceof InterfaceC3322a.b) {
            InterfaceC3322a.b bVar = (InterfaceC3322a.b) interfaceC3322a;
            return new d.b(str, bVar.b(), bVar.a(), str2);
        }
        if (interfaceC3322a instanceof InterfaceC3322a.C0793a) {
            return new d.a(str, ((InterfaceC3322a.C0793a) interfaceC3322a).a(), str2);
        }
        throw new p();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, U5.d r26) {
        /*
            r17 = this;
            r0 = r17
            r1 = r26
            boolean r2 = r1 instanceof n3.C3411b.a
            if (r2 == 0) goto L17
            r2 = r1
            n3.b$a r2 = (n3.C3411b.a) r2
            int r3 = r2.f35525c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35525c = r3
            goto L1c
        L17:
            n3.b$a r2 = new n3.b$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f35523a
            java.lang.Object r3 = V5.b.e()
            int r4 = r2.f35525c
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            Q5.t.b(r1)
            Q5.s r1 = (Q5.s) r1
            java.lang.Object r1 = r1.j()
            goto L72
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            Q5.t.b(r1)
            j3.m r1 = r0.f35522a
            g3.N r11 = g3.N.f32057b
            g3.s r4 = new g3.s
            r9 = 0
            r10 = 0
            r8 = 0
            r6 = r4
            r7 = r20
            r12 = r23
            r13 = r21
            r14 = r22
            r15 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            B2.j$c r6 = new B2.j$c
            r7 = 4
            r20 = r6
            r21 = r18
            r22 = r19
            r23 = r9
            r24 = r7
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r2.f35525c = r5
            java.lang.Object r1 = r1.t(r4, r6, r2)
            if (r1 != r3) goto L72
            return r3
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C3411b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:            r2 = Q5.s.f8810b;        r0 = Q5.t.a(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, l3.InterfaceC3322a r19, U5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof n3.C3411b.C0811b
            if (r3 == 0) goto L18
            r3 = r0
            n3.b$b r3 = (n3.C3411b.C0811b) r3
            int r4 = r3.f35528c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f35528c = r4
            goto L1d
        L18:
            n3.b$b r3 = new n3.b$b
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f35526a
            java.lang.Object r4 = V5.b.e()
            int r5 = r3.f35528c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            Q5.s r0 = (Q5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r0 = move-exception
            goto L8d
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3e:
            Q5.t.b(r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.n$c r0 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            Q5.s$a r5 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L58:
            boolean r5 = Q5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.n$c r0 = (com.stripe.android.model.n.c) r0     // Catch: java.lang.Throwable -> L34
            j3.m r5 = r1.f35522a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            B2.j$c r13 = new B2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f35528c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.q(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            g3.x r0 = (g3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
        L93:
            java.lang.Object r0 = Q5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C3411b.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, l3.a, U5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(7:17|18|19|20|(2:22|(1:24))|25|26)|11|13))|32|6|7|(0)(0)|11|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:            r2 = Q5.s.f8810b;        r0 = Q5.t.a(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, l3.InterfaceC3322a r19, U5.d r20) {
        /*
            r14 = this;
            r1 = r14
            r2 = r16
            r0 = r20
            boolean r3 = r0 instanceof n3.C3411b.c
            if (r3 == 0) goto L18
            r3 = r0
            n3.b$c r3 = (n3.C3411b.c) r3
            int r4 = r3.f35531c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.f35531c = r4
            goto L1d
        L18:
            n3.b$c r3 = new n3.b$c
            r3.<init>(r0)
        L1d:
            java.lang.Object r0 = r3.f35529a
            java.lang.Object r4 = V5.b.e()
            int r5 = r3.f35531c
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            Q5.s r0 = (Q5.s) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L34
            goto L83
        L34:
            r0 = move-exception
            goto L8d
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3e:
            Q5.t.b(r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4d
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            Q5.s$a r5 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L58:
            boolean r5 = Q5.s.h(r0)
            if (r5 == 0) goto L93
            com.stripe.android.model.u$b r0 = (com.stripe.android.model.u.b) r0     // Catch: java.lang.Throwable -> L34
            j3.m r5 = r1.f35522a     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L34
            r7 = r18
            r8 = r19
            com.stripe.android.model.d r2 = r14.d(r8, r2, r7)     // Catch: java.lang.Throwable -> L34
            B2.j$c r13 = new B2.j$c     // Catch: java.lang.Throwable -> L34
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r13
            r8 = r15
            r9 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L34
            r3.f35531c = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r5.A(r0, r2, r13, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 != r4) goto L83
            return r4
        L83:
            Q5.t.b(r0)     // Catch: java.lang.Throwable -> L34
            g3.x r0 = (g3.x) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L34
            goto L97
        L8d:
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
        L93:
            java.lang.Object r0 = Q5.s.b(r0)
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C3411b.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, l3.a, U5.d):java.lang.Object");
    }
}
