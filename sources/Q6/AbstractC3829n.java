package q6;

import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3829n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.n$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37431a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37432b;

        /* renamed from: c, reason: collision with root package name */
        int f37433c;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37432b = obj;
            this.f37433c |= Integer.MIN_VALUE;
            return AbstractC3829n.c(null, null, null, this);
        }
    }

    /* renamed from: q6.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f37435b;

        /* renamed from: q6.n$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37436a;

            /* renamed from: b, reason: collision with root package name */
            int f37437b;

            /* renamed from: d, reason: collision with root package name */
            Object f37439d;

            /* renamed from: e, reason: collision with root package name */
            Object f37440e;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37436a = obj;
                this.f37437b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC3821f interfaceC3821f, InterfaceC2073o interfaceC2073o) {
            this.f37434a = interfaceC3821f;
            this.f37435b = interfaceC2073o;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // q6.InterfaceC3821f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q6.InterfaceC3822g r9, U5.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof q6.AbstractC3829n.b.a
                if (r0 == 0) goto L13
                r0 = r10
                q6.n$b$a r0 = (q6.AbstractC3829n.b.a) r0
                int r1 = r0.f37437b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37437b = r1
                goto L18
            L13:
                q6.n$b$a r0 = new q6.n$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f37436a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37437b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f37439d
                r6.t r9 = (r6.t) r9
                Q5.t.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f37439d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                Q5.t.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f37440e
                q6.g r9 = (q6.InterfaceC3822g) r9
                java.lang.Object r2 = r0.f37439d
                q6.n$b r2 = (q6.AbstractC3829n.b) r2
                Q5.t.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                Q5.t.b(r10)
                q6.f r10 = r8.f37434a     // Catch: java.lang.Throwable -> L96
                r0.f37439d = r8     // Catch: java.lang.Throwable -> L96
                r0.f37440e = r9     // Catch: java.lang.Throwable -> L96
                r0.f37437b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                r6.t r10 = new r6.t
                U5.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                c6.o r9 = r2.f37435b     // Catch: java.lang.Throwable -> L8e
                r0.f37439d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f37440e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f37437b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                Q5.I r9 = Q5.I.f8786a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                q6.P r10 = new q6.P
                r10.<init>(r9)
                c6.o r2 = r2.f37435b
                r0.f37439d = r9
                r0.f37440e = r6
                r0.f37437b = r4
                java.lang.Object r10 = q6.AbstractC3829n.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3829n.b.collect(q6.g, U5.d):java.lang.Object");
        }
    }

    /* renamed from: q6.n$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37442b;

        /* renamed from: q6.n$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37443a;

            /* renamed from: b, reason: collision with root package name */
            int f37444b;

            /* renamed from: d, reason: collision with root package name */
            Object f37446d;

            /* renamed from: e, reason: collision with root package name */
            Object f37447e;

            /* renamed from: f, reason: collision with root package name */
            Object f37448f;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37443a = obj;
                this.f37444b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC2072n interfaceC2072n, InterfaceC3821f interfaceC3821f) {
            this.f37441a = interfaceC2072n;
            this.f37442b = interfaceC3821f;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // q6.InterfaceC3821f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q6.InterfaceC3822g r7, U5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q6.AbstractC3829n.c.a
                if (r0 == 0) goto L13
                r0 = r8
                q6.n$c$a r0 = (q6.AbstractC3829n.c.a) r0
                int r1 = r0.f37444b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37444b = r1
                goto L18
            L13:
                q6.n$c$a r0 = new q6.n$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f37443a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37444b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Q5.t.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f37448f
                r6.t r7 = (r6.t) r7
                java.lang.Object r2 = r0.f37447e
                q6.g r2 = (q6.InterfaceC3822g) r2
                java.lang.Object r4 = r0.f37446d
                q6.n$c r4 = (q6.AbstractC3829n.c) r4
                Q5.t.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                Q5.t.b(r8)
                r6.t r8 = new r6.t
                U5.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                c6.n r2 = r6.f37441a     // Catch: java.lang.Throwable -> L86
                r0.f37446d = r6     // Catch: java.lang.Throwable -> L86
                r0.f37447e = r7     // Catch: java.lang.Throwable -> L86
                r0.f37448f = r8     // Catch: java.lang.Throwable -> L86
                r0.f37444b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                q6.f r7 = r4.f37442b
                r8 = 0
                r0.f37446d = r8
                r0.f37447e = r8
                r0.f37448f = r8
                r0.f37444b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                Q5.I r7 = Q5.I.f8786a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3829n.c.collect(q6.g, U5.d):java.lang.Object");
        }
    }

    public static final void b(InterfaceC3822g interfaceC3822g) {
        if (!(interfaceC3822g instanceof P)) {
        } else {
            throw ((P) interfaceC3822g).f37395a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(q6.InterfaceC3822g r4, c6.InterfaceC2073o r5, java.lang.Throwable r6, U5.d r7) {
        /*
            boolean r0 = r7 instanceof q6.AbstractC3829n.a
            if (r0 == 0) goto L13
            r0 = r7
            q6.n$a r0 = (q6.AbstractC3829n.a) r0
            int r1 = r0.f37433c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37433c = r1
            goto L18
        L13:
            q6.n$a r0 = new q6.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37432b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37433c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f37431a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            Q5.t.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            Q5.t.b(r7)
            r0.f37431a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f37433c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            Q5.I r4 = Q5.I.f8786a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            Q5.AbstractC1410e.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3829n.c(q6.g, c6.o, java.lang.Throwable, U5.d):java.lang.Object");
    }

    public static final InterfaceC3821f d(InterfaceC3821f interfaceC3821f, InterfaceC2073o interfaceC2073o) {
        return new b(interfaceC3821f, interfaceC2073o);
    }

    public static final InterfaceC3821f e(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
        return new c(interfaceC2072n, interfaceC3821f);
    }
}
