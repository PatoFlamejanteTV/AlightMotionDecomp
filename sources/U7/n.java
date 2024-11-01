package U7;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final T7.a f10301a;

    /* renamed from: b, reason: collision with root package name */
    public final T7.b f10302b;

    /* renamed from: c, reason: collision with root package name */
    public final W7.j f10303c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10304d;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10305a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10306b;

        /* renamed from: d, reason: collision with root package name */
        public int f10308d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10306b = obj;
            this.f10308d |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(T7.a networkUtil, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10301a = networkUtil;
        this.f10302b = requestApi;
        this.f10303c = resolver;
        this.f10304d = "geoip";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // U7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof U7.n.a
            if (r0 == 0) goto L13
            r0 = r12
            U7.n$a r0 = (U7.n.a) r0
            int r1 = r0.f10308d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10308d = r1
            goto L18
        L13:
            U7.n$a r0 = new U7.n$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f10306b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10308d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f10305a
            U7.n r0 = (U7.n) r0
            Q5.t.b(r12)     // Catch: A5.a -> L2e
            goto L59
        L2e:
            goto L6c
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            Q5.t.b(r12)
            T7.a r12 = r11.f10301a     // Catch: A5.a -> L5c
            boolean r12 = r12.a()     // Catch: A5.a -> L5c
            if (r12 == 0) goto L5e
            T7.b r12 = r11.f10302b     // Catch: A5.a -> L5c
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r5 = r11.f10304d     // Catch: A5.a -> L5c
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3292y.q(r2, r5)     // Catch: A5.a -> L5c
            r0.f10305a = r11     // Catch: A5.a -> L5c
            r0.f10308d = r4     // Catch: A5.a -> L5c
            java.lang.Object r12 = r12.a(r2, r0)     // Catch: A5.a -> L5c
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r11
        L59:
            java.lang.String r12 = (java.lang.String) r12     // Catch: A5.a -> L2e
            goto L6d
        L5c:
            goto L6b
        L5e:
            A5.b r4 = A5.b.f238a     // Catch: A5.a -> L5c
            com.inmobi.cmp.model.ChoiceError r5 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L5c
            r9 = 0
            r10 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            A5.b.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: A5.a -> L5c
        L6b:
            r0 = r11
        L6c:
            r12 = r3
        L6d:
            if (r12 != 0) goto L70
            goto L79
        L70:
            W7.j r0 = r0.f10303c
            java.lang.Object r12 = r0.a(r12)
            r3 = r12
            O5.b r3 = (O5.b) r3
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.n.a(U5.d):java.lang.Object");
    }
}
