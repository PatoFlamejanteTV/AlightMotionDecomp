package q6;

import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.InterfaceC3488x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3830o {

    /* renamed from: q6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f37450b;

        /* renamed from: q6.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0834a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37451a;

            /* renamed from: b, reason: collision with root package name */
            int f37452b;

            /* renamed from: d, reason: collision with root package name */
            Object f37454d;

            /* renamed from: e, reason: collision with root package name */
            Object f37455e;

            public C0834a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37451a = obj;
                this.f37452b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC3821f interfaceC3821f, InterfaceC2073o interfaceC2073o) {
            this.f37449a = interfaceC3821f;
            this.f37450b = interfaceC2073o;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // q6.InterfaceC3821f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q6.InterfaceC3822g r6, U5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q6.AbstractC3830o.a.C0834a
                if (r0 == 0) goto L13
                r0 = r7
                q6.o$a$a r0 = (q6.AbstractC3830o.a.C0834a) r0
                int r1 = r0.f37452b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37452b = r1
                goto L18
            L13:
                q6.o$a$a r0 = new q6.o$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37451a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37452b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Q5.t.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f37455e
                q6.g r6 = (q6.InterfaceC3822g) r6
                java.lang.Object r2 = r0.f37454d
                q6.o$a r2 = (q6.AbstractC3830o.a) r2
                Q5.t.b(r7)
                goto L53
            L40:
                Q5.t.b(r7)
                q6.f r7 = r5.f37449a
                r0.f37454d = r5
                r0.f37455e = r6
                r0.f37452b = r4
                java.lang.Object r7 = q6.AbstractC3823h.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                c6.o r2 = r2.f37450b
                r4 = 0
                r0.f37454d = r4
                r0.f37455e = r4
                r0.f37452b = r3
                r3 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3830o.a.collect(q6.g, U5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37456a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37457b;

        /* renamed from: c, reason: collision with root package name */
        int f37458c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37457b = obj;
            this.f37458c |= Integer.MIN_VALUE;
            return AbstractC3823h.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.o$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37459a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f37460b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.o$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f37461a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37462b;

            /* renamed from: d, reason: collision with root package name */
            int f37464d;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37462b = obj;
                this.f37464d |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        c(InterfaceC3822g interfaceC3822g, T t8) {
            this.f37459a = interfaceC3822g;
            this.f37460b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q6.AbstractC3830o.c.a
                if (r0 == 0) goto L13
                r0 = r6
                q6.o$c$a r0 = (q6.AbstractC3830o.c.a) r0
                int r1 = r0.f37464d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37464d = r1
                goto L18
            L13:
                q6.o$c$a r0 = new q6.o$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f37462b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37464d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f37461a
                q6.o$c r5 = (q6.AbstractC3830o.c) r5
                Q5.t.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Q5.t.b(r6)
                q6.g r6 = r4.f37459a     // Catch: java.lang.Throwable -> L4a
                r0.f37461a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f37464d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                Q5.I r5 = Q5.I.f8786a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.T r5 = r5.f37460b
                r5.f34573a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3830o.c.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    public static final InterfaceC3821f a(InterfaceC3821f interfaceC3821f, InterfaceC2073o interfaceC2073o) {
        return new a(interfaceC3821f, interfaceC2073o);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(q6.InterfaceC3821f r4, q6.InterfaceC3822g r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof q6.AbstractC3830o.b
            if (r0 == 0) goto L13
            r0 = r6
            q6.o$b r0 = (q6.AbstractC3830o.b) r0
            int r1 = r0.f37458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37458c = r1
            goto L18
        L13:
            q6.o$b r0 = new q6.o$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37457b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37458c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f37456a
            kotlin.jvm.internal.T r4 = (kotlin.jvm.internal.T) r4
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Q5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            q6.o$c r2 = new q6.o$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f37456a = r6     // Catch: java.lang.Throwable -> L51
            r0.f37458c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f34573a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            U5.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            Q5.AbstractC1410e.a(r4, r5)
            throw r4
        L72:
            Q5.AbstractC1410e.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3830o.b(q6.f, q6.g, U5.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, U5.g gVar) {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null && interfaceC3488x0.isCancelled()) {
            return d(th, interfaceC3488x0.q());
        }
        return false;
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null && AbstractC3292y.d(th2, th)) {
            return true;
        }
        return false;
    }
}
