package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.T;
import r6.C3931a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f37516a;

        public a(T t8) {
            this.f37516a = t8;
        }

        @Override // q6.InterfaceC3822g
        public Object emit(Object obj, U5.d dVar) {
            this.f37516a.f34573a = obj;
            throw new C3931a(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f37518b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f37519a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37520b;

            /* renamed from: c, reason: collision with root package name */
            int f37521c;

            /* renamed from: e, reason: collision with root package name */
            Object f37523e;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37520b = obj;
                this.f37521c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(InterfaceC2072n interfaceC2072n, T t8) {
            this.f37517a = interfaceC2072n;
            this.f37518b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, U5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q6.r.b.a
                if (r0 == 0) goto L13
                r0 = r6
                q6.r$b$a r0 = (q6.r.b.a) r0
                int r1 = r0.f37521c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37521c = r1
                goto L18
            L13:
                q6.r$b$a r0 = new q6.r$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f37520b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37521c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f37523e
                java.lang.Object r0 = r0.f37519a
                q6.r$b r0 = (q6.r.b) r0
                Q5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Q5.t.b(r6)
                c6.n r6 = r4.f37517a
                r0.f37519a = r4
                r0.f37523e = r5
                r0.f37521c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                Q5.I r5 = Q5.I.f8786a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f37518b
                r6.f34573a = r5
                r6.a r5 = new r6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.r.b.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37524a;

        /* renamed from: b, reason: collision with root package name */
        Object f37525b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37526c;

        /* renamed from: d, reason: collision with root package name */
        int f37527d;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37526c = obj;
            this.f37527d |= Integer.MIN_VALUE;
            return AbstractC3823h.w(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37528a;

        /* renamed from: b, reason: collision with root package name */
        Object f37529b;

        /* renamed from: c, reason: collision with root package name */
        Object f37530c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f37531d;

        /* renamed from: e, reason: collision with root package name */
        int f37532e;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37531d = obj;
            this.f37532e |= Integer.MIN_VALUE;
            return AbstractC3823h.x(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f37534b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f37535a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37536b;

            /* renamed from: c, reason: collision with root package name */
            int f37537c;

            /* renamed from: e, reason: collision with root package name */
            Object f37539e;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37536b = obj;
                this.f37537c |= Integer.MIN_VALUE;
                return e.this.emit(null, this);
            }
        }

        public e(InterfaceC2072n interfaceC2072n, T t8) {
            this.f37533a = interfaceC2072n;
            this.f37534b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, U5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof q6.r.e.a
                if (r0 == 0) goto L13
                r0 = r6
                q6.r$e$a r0 = (q6.r.e.a) r0
                int r1 = r0.f37537c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37537c = r1
                goto L18
            L13:
                q6.r$e$a r0 = new q6.r$e$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f37536b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37537c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f37539e
                java.lang.Object r0 = r0.f37535a
                q6.r$e r0 = (q6.r.e) r0
                Q5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Q5.t.b(r6)
                c6.n r6 = r4.f37533a
                r0.f37535a = r4
                r0.f37539e = r5
                r0.f37537c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                Q5.I r5 = Q5.I.f8786a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f37534b
                r6.f34573a = r5
                r6.a r5 = new r6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.r.e.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37540a;

        /* renamed from: b, reason: collision with root package name */
        Object f37541b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37542c;

        /* renamed from: d, reason: collision with root package name */
        int f37543d;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37542c = obj;
            this.f37543d |= Integer.MIN_VALUE;
            return AbstractC3823h.y(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(q6.InterfaceC3821f r4, U5.d r5) {
        /*
            boolean r0 = r5 instanceof q6.r.c
            if (r0 == 0) goto L13
            r0 = r5
            q6.r$c r0 = (q6.r.c) r0
            int r1 = r0.f37527d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37527d = r1
            goto L18
        L13:
            q6.r$c r0 = new q6.r$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37526c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37527d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f37525b
            q6.r$a r4 = (q6.r.a) r4
            java.lang.Object r0 = r0.f37524a
            kotlin.jvm.internal.T r0 = (kotlin.jvm.internal.T) r0
            Q5.t.b(r5)     // Catch: r6.C3931a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Q5.t.b(r5)
            kotlin.jvm.internal.T r5 = new kotlin.jvm.internal.T
            r5.<init>()
            s6.F r2 = r6.s.f38851a
            r5.f34573a = r2
            q6.r$a r2 = new q6.r$a
            r2.<init>(r5)
            r0.f37524a = r5     // Catch: r6.C3931a -> L5b
            r0.f37525b = r2     // Catch: r6.C3931a -> L5b
            r0.f37527d = r3     // Catch: r6.C3931a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r6.C3931a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            r6.o.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f34573a
            s6.F r5 = r6.s.f38851a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.r.a(q6.f, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(q6.InterfaceC3821f r4, c6.InterfaceC2072n r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof q6.r.d
            if (r0 == 0) goto L13
            r0 = r6
            q6.r$d r0 = (q6.r.d) r0
            int r1 = r0.f37532e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37532e = r1
            goto L18
        L13:
            q6.r$d r0 = new q6.r$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37531d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37532e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f37530c
            q6.r$b r4 = (q6.r.b) r4
            java.lang.Object r5 = r0.f37529b
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            java.lang.Object r0 = r0.f37528a
            c6.n r0 = (c6.InterfaceC2072n) r0
            Q5.t.b(r6)     // Catch: r6.C3931a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            Q5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            s6.F r2 = r6.s.f38851a
            r6.f34573a = r2
            q6.r$b r2 = new q6.r$b
            r2.<init>(r5, r6)
            r0.f37528a = r5     // Catch: r6.C3931a -> L62
            r0.f37529b = r6     // Catch: r6.C3931a -> L62
            r0.f37530c = r2     // Catch: r6.C3931a -> L62
            r0.f37532e = r3     // Catch: r6.C3931a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r6.C3931a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            r6.o.a(r6, r4)
        L6a:
            java.lang.Object r4 = r5.f34573a
            s6.F r5 = r6.s.f38851a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.r.b(q6.f, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(q6.InterfaceC3821f r4, c6.InterfaceC2072n r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof q6.r.f
            if (r0 == 0) goto L13
            r0 = r6
            q6.r$f r0 = (q6.r.f) r0
            int r1 = r0.f37543d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37543d = r1
            goto L18
        L13:
            q6.r$f r0 = new q6.r$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37542c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37543d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f37541b
            q6.r$e r4 = (q6.r.e) r4
            java.lang.Object r5 = r0.f37540a
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            Q5.t.b(r6)     // Catch: r6.C3931a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Q5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            q6.r$e r2 = new q6.r$e
            r2.<init>(r5, r6)
            r0.f37540a = r6     // Catch: r6.C3931a -> L57
            r0.f37541b = r2     // Catch: r6.C3931a -> L57
            r0.f37543d = r3     // Catch: r6.C3931a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: r6.C3931a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            r6.o.a(r6, r4)
        L5e:
            java.lang.Object r4 = r5.f34573a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.r.c(q6.f, c6.n, U5.d):java.lang.Object");
    }
}
