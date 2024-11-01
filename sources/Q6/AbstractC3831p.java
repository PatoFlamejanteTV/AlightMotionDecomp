package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3831p {

    /* renamed from: q6.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37465a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37466b;

        public a(InterfaceC3821f interfaceC3821f, int i8) {
            this.f37465a = interfaceC3821f;
            this.f37466b = i8;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f37465a.collect(new b(new Q(), this.f37466b, interfaceC3822g), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: q6.p$b */
    /* loaded from: classes5.dex */
    static final class b implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f37467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37468b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37469c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.p$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37470a;

            /* renamed from: c, reason: collision with root package name */
            int f37472c;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37470a = obj;
                this.f37472c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(Q q8, int i8, InterfaceC3822g interfaceC3822g) {
            this.f37467a = q8;
            this.f37468b = i8;
            this.f37469c = interfaceC3822g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q6.AbstractC3831p.b.a
                if (r0 == 0) goto L13
                r0 = r7
                q6.p$b$a r0 = (q6.AbstractC3831p.b.a) r0
                int r1 = r0.f37472c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37472c = r1
                goto L18
            L13:
                q6.p$b$a r0 = new q6.p$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37470a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37472c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Q5.t.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Q5.t.b(r7)
                kotlin.jvm.internal.Q r7 = r5.f37467a
                int r2 = r7.f34571a
                int r4 = r5.f37468b
                if (r2 < r4) goto L4a
                q6.g r7 = r5.f37469c
                r0.f37472c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                Q5.I r6 = Q5.I.f8786a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f34571a = r2
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.b.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    /* renamed from: q6.p$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37474b;

        public c(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
            this.f37473a = interfaceC3821f;
            this.f37474b = interfaceC2072n;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f37473a.collect(new d(new kotlin.jvm.internal.O(), interfaceC3822g, this.f37474b), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return Q5.I.f8786a;
        }
    }

    /* renamed from: q6.p$d */
    /* loaded from: classes5.dex */
    static final class d implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f37475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37476b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37477c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.p$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f37478a;

            /* renamed from: b, reason: collision with root package name */
            Object f37479b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37480c;

            /* renamed from: e, reason: collision with root package name */
            int f37482e;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37480c = obj;
                this.f37482e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(kotlin.jvm.internal.O o8, InterfaceC3822g interfaceC3822g, InterfaceC2072n interfaceC2072n) {
            this.f37475a = o8;
            this.f37476b = interfaceC3822g;
            this.f37477c = interfaceC2072n;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, U5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q6.AbstractC3831p.d.a
                if (r0 == 0) goto L13
                r0 = r8
                q6.p$d$a r0 = (q6.AbstractC3831p.d.a) r0
                int r1 = r0.f37482e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37482e = r1
                goto L18
            L13:
                q6.p$d$a r0 = new q6.p$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f37480c
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37482e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Q5.t.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f37479b
                java.lang.Object r2 = r0.f37478a
                q6.p$d r2 = (q6.AbstractC3831p.d) r2
                Q5.t.b(r8)
                goto L6c
            L41:
                Q5.t.b(r8)
                goto L59
            L45:
                Q5.t.b(r8)
                kotlin.jvm.internal.O r8 = r6.f37475a
                boolean r8 = r8.f34569a
                if (r8 == 0) goto L5c
                q6.g r8 = r6.f37476b
                r0.f37482e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                Q5.I r7 = Q5.I.f8786a
                return r7
            L5c:
                c6.n r8 = r6.f37477c
                r0.f37478a = r6
                r0.f37479b = r7
                r0.f37482e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.O r8 = r2.f37475a
                r8.f34569a = r5
                q6.g r8 = r2.f37476b
                r2 = 0
                r0.f37478a = r2
                r0.f37479b = r2
                r0.f37482e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                Q5.I r7 = Q5.I.f8786a
                return r7
            L8b:
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.d.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.p$e */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37483a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37484b;

        /* renamed from: c, reason: collision with root package name */
        int f37485c;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37484b = obj;
            this.f37485c |= Integer.MIN_VALUE;
            return AbstractC3831p.d(null, null, this);
        }
    }

    /* renamed from: q6.p$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37487b;

        /* renamed from: q6.p$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37488a;

            /* renamed from: b, reason: collision with root package name */
            int f37489b;

            /* renamed from: d, reason: collision with root package name */
            Object f37491d;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37488a = obj;
                this.f37489b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC3821f interfaceC3821f, int i8) {
            this.f37486a = interfaceC3821f;
            this.f37487b = i8;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:            r8 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:            r6.o.a(r8, r7);     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // q6.InterfaceC3821f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q6.InterfaceC3822g r7, U5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q6.AbstractC3831p.f.a
                if (r0 == 0) goto L13
                r0 = r8
                q6.p$f$a r0 = (q6.AbstractC3831p.f.a) r0
                int r1 = r0.f37489b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37489b = r1
                goto L18
            L13:
                q6.p$f$a r0 = new q6.p$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f37488a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37489b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f37491d
                q6.g r7 = (q6.InterfaceC3822g) r7
                Q5.t.b(r8)     // Catch: r6.C3931a -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                Q5.t.b(r8)
                kotlin.jvm.internal.Q r8 = new kotlin.jvm.internal.Q
                r8.<init>()
                q6.f r2 = r6.f37486a     // Catch: r6.C3931a -> L2d
                q6.p$g r4 = new q6.p$g     // Catch: r6.C3931a -> L2d
                int r5 = r6.f37487b     // Catch: r6.C3931a -> L2d
                r4.<init>(r8, r5, r7)     // Catch: r6.C3931a -> L2d
                r0.f37491d = r7     // Catch: r6.C3931a -> L2d
                r0.f37489b = r3     // Catch: r6.C3931a -> L2d
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: r6.C3931a -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                r6.o.a(r8, r7)
            L56:
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.f.collect(q6.g, U5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.p$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f37492a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37493b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37494c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q6.p$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37495a;

            /* renamed from: c, reason: collision with root package name */
            int f37497c;

            a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37495a = obj;
                this.f37497c |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        g(Q q8, int i8, InterfaceC3822g interfaceC3822g) {
            this.f37492a = q8;
            this.f37493b = i8;
            this.f37494c = interfaceC3822g;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q6.AbstractC3831p.g.a
                if (r0 == 0) goto L13
                r0 = r7
                q6.p$g$a r0 = (q6.AbstractC3831p.g.a) r0
                int r1 = r0.f37497c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37497c = r1
                goto L18
            L13:
                q6.p$g$a r0 = new q6.p$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37495a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37497c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Q5.t.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                Q5.t.b(r7)
                goto L51
            L38:
                Q5.t.b(r7)
                kotlin.jvm.internal.Q r7 = r5.f37492a
                int r2 = r7.f34571a
                int r2 = r2 + r4
                r7.f34571a = r2
                int r7 = r5.f37493b
                if (r2 >= r7) goto L54
                q6.g r7 = r5.f37494c
                r0.f37497c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                Q5.I r6 = Q5.I.f8786a
                return r6
            L54:
                q6.g r7 = r5.f37494c
                r0.f37497c = r3
                java.lang.Object r6 = q6.AbstractC3831p.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.g.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    /* renamed from: q6.p$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f37498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37499b;

        /* renamed from: q6.p$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37500a;

            /* renamed from: b, reason: collision with root package name */
            int f37501b;

            /* renamed from: d, reason: collision with root package name */
            Object f37503d;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37500a = obj;
                this.f37501b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
            this.f37498a = interfaceC3821f;
            this.f37499b = interfaceC2072n;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // q6.InterfaceC3821f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(q6.InterfaceC3822g r6, U5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof q6.AbstractC3831p.h.a
                if (r0 == 0) goto L13
                r0 = r7
                q6.p$h$a r0 = (q6.AbstractC3831p.h.a) r0
                int r1 = r0.f37501b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37501b = r1
                goto L18
            L13:
                q6.p$h$a r0 = new q6.p$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f37500a
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37501b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f37503d
                q6.p$i r6 = (q6.AbstractC3831p.i) r6
                Q5.t.b(r7)     // Catch: r6.C3931a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                Q5.t.b(r7)
                q6.f r7 = r5.f37498a
                q6.p$i r2 = new q6.p$i
                c6.n r4 = r5.f37499b
                r2.<init>(r4, r6)
                r0.f37503d = r2     // Catch: r6.C3931a -> L4e
                r0.f37501b = r3     // Catch: r6.C3931a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: r6.C3931a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                r6.o.a(r7, r6)
            L53:
                Q5.I r6 = Q5.I.f8786a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.h.collect(q6.g, U5.d):java.lang.Object");
        }
    }

    /* renamed from: q6.p$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC3822g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f37504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f37505b;

        /* renamed from: q6.p$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f37506a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37507b;

            /* renamed from: c, reason: collision with root package name */
            int f37508c;

            /* renamed from: e, reason: collision with root package name */
            Object f37510e;

            public a(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f37507b = obj;
                this.f37508c |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(InterfaceC2072n interfaceC2072n, InterfaceC3822g interfaceC3822g) {
            this.f37504a = interfaceC2072n;
            this.f37505b = interfaceC3822g;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // q6.InterfaceC3822g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, U5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof q6.AbstractC3831p.i.a
                if (r0 == 0) goto L13
                r0 = r9
                q6.p$i$a r0 = (q6.AbstractC3831p.i.a) r0
                int r1 = r0.f37508c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37508c = r1
                goto L18
            L13:
                q6.p$i$a r0 = new q6.p$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f37507b
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f37508c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f37506a
                q6.p$i r8 = (q6.AbstractC3831p.i) r8
                Q5.t.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f37510e
                java.lang.Object r2 = r0.f37506a
                q6.p$i r2 = (q6.AbstractC3831p.i) r2
                Q5.t.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                Q5.t.b(r9)
                c6.n r9 = r7.f37504a
                r0.f37506a = r7
                r0.f37510e = r8
                r0.f37508c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC3290w.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC3290w.c(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                q6.g r2 = r8.f37505b
                r0.f37506a = r8
                r5 = 0
                r0.f37510e = r5
                r0.f37508c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                Q5.I r8 = Q5.I.f8786a
                return r8
            L81:
                r6.a r9 = new r6.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.i.emit(java.lang.Object, U5.d):java.lang.Object");
        }
    }

    public static final InterfaceC3821f b(InterfaceC3821f interfaceC3821f, int i8) {
        if (i8 >= 0) {
            return new a(interfaceC3821f, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final InterfaceC3821f c(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
        return new c(interfaceC3821f, interfaceC2072n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(q6.InterfaceC3822g r4, java.lang.Object r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof q6.AbstractC3831p.e
            if (r0 == 0) goto L13
            r0 = r6
            q6.p$e r0 = (q6.AbstractC3831p.e) r0
            int r1 = r0.f37485c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37485c = r1
            goto L18
        L13:
            q6.p$e r0 = new q6.p$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37484b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37485c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f37483a
            q6.g r4 = (q6.InterfaceC3822g) r4
            Q5.t.b(r6)
            goto L43
        L35:
            Q5.t.b(r6)
            r0.f37483a = r4
            r0.f37485c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r6.a r5 = new r6.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC3831p.d(q6.g, java.lang.Object, U5.d):java.lang.Object");
    }

    public static final InterfaceC3821f e(InterfaceC3821f interfaceC3821f, int i8) {
        if (i8 > 0) {
            return new f(interfaceC3821f, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " should be positive").toString());
    }

    public static final InterfaceC3821f f(InterfaceC3821f interfaceC3821f, InterfaceC2072n interfaceC2072n) {
        return new h(interfaceC3821f, interfaceC2072n);
    }
}
