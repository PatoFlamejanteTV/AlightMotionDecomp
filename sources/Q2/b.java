package Q2;

import Q5.I;
import Q5.p;
import Q5.s;
import Y2.l;
import g3.C2916o;
import g3.r;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.w;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final P2.d f8352a;

    /* renamed from: b, reason: collision with root package name */
    private final U2.c f8353b;

    /* renamed from: c, reason: collision with root package name */
    private final R2.e f8354c;

    /* renamed from: d, reason: collision with root package name */
    private final p3.i f8355d;

    /* renamed from: e, reason: collision with root package name */
    private final w f8356e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f8357f;

    /* renamed from: g, reason: collision with root package name */
    private volatile String f8358g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3821f f8359h;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8360a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8361b;

        static {
            int[] iArr = new int[T2.a.values().length];
            try {
                iArr[T2.a.f9960a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T2.a.f9961b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T2.a.f9962c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[T2.a.f9963d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[T2.a.f9964e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8360a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.f12027a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l.f12028b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l.f12029c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[l.f12030d.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[l.f12031e.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f8361b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0163b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8362a;

        /* renamed from: b, reason: collision with root package name */
        Object f8363b;

        /* renamed from: c, reason: collision with root package name */
        Object f8364c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8365d;

        /* renamed from: f, reason: collision with root package name */
        int f8367f;

        C0163b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8365d = obj;
            this.f8367f |= Integer.MIN_VALUE;
            Object d8 = b.this.d(null, this);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8368a;

        /* renamed from: c, reason: collision with root package name */
        int f8370c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8368a = obj;
            this.f8370c |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8371a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8372b;

        /* renamed from: d, reason: collision with root package name */
        int f8374d;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8372b = obj;
            this.f8374d |= Integer.MIN_VALUE;
            Object i8 = b.this.i(this);
            if (i8 == V5.b.e()) {
                return i8;
            }
            return s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8375a;

        /* renamed from: b, reason: collision with root package name */
        boolean f8376b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8377c;

        /* renamed from: e, reason: collision with root package name */
        int f8379e;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8377c = obj;
            this.f8379e |= Integer.MIN_VALUE;
            Object j8 = b.this.j(null, false, this);
            if (j8 == V5.b.e()) {
                return j8;
            }
            return s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f8380a;

        /* renamed from: c, reason: collision with root package name */
        int f8382c;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8380a = obj;
            this.f8382c |= Integer.MIN_VALUE;
            Object p8 = b.this.p(null, this);
            if (p8 == V5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8383a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8384b;

        /* renamed from: d, reason: collision with root package name */
        int f8386d;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8384b = obj;
            this.f8386d |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, null, null, null, this);
            if (q8 == V5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8387a;

        /* renamed from: b, reason: collision with root package name */
        Object f8388b;

        /* renamed from: c, reason: collision with root package name */
        Object f8389c;

        /* renamed from: d, reason: collision with root package name */
        Object f8390d;

        /* renamed from: e, reason: collision with root package name */
        Object f8391e;

        /* renamed from: f, reason: collision with root package name */
        Object f8392f;

        /* renamed from: g, reason: collision with root package name */
        Object f8393g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f8394h;

        /* renamed from: j, reason: collision with root package name */
        int f8396j;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8394h = obj;
            this.f8396j |= Integer.MIN_VALUE;
            Object r8 = b.this.r(null, null, null, null, null, this);
            if (r8 == V5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f8397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f8398b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3822g f8399a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f8400b;

            /* renamed from: Q2.b$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0164a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f8401a;

                /* renamed from: b, reason: collision with root package name */
                int f8402b;

                /* renamed from: c, reason: collision with root package name */
                Object f8403c;

                public C0164a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f8401a = obj;
                    this.f8402b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3822g interfaceC3822g, b bVar) {
                this.f8399a = interfaceC3822g;
                this.f8400b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // q6.InterfaceC3822g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, U5.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Q2.b.i.a.C0164a
                    if (r0 == 0) goto L13
                    r0 = r8
                    Q2.b$i$a$a r0 = (Q2.b.i.a.C0164a) r0
                    int r1 = r0.f8402b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8402b = r1
                    goto L18
                L13:
                    Q2.b$i$a$a r0 = new Q2.b$i$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f8401a
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f8402b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    Q5.t.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f8403c
                    q6.g r7 = (q6.InterfaceC3822g) r7
                    Q5.t.b(r8)
                    goto L53
                L3c:
                    Q5.t.b(r8)
                    q6.g r8 = r6.f8399a
                    T2.b r7 = (T2.b) r7
                    Q2.b r2 = r6.f8400b
                    r0.f8403c = r8
                    r0.f8402b = r4
                    java.lang.Object r7 = Q2.b.a(r2, r7, r0)
                    if (r7 != r1) goto L50
                    return r1
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f8403c = r2
                    r0.f8402b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    Q5.I r7 = Q5.I.f8786a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Q2.b.i.a.emit(java.lang.Object, U5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3821f interfaceC3821f, b bVar) {
            this.f8397a = interfaceC3821f;
            this.f8398b = bVar;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            Object collect = this.f8397a.collect(new a(interfaceC3822g, this.f8398b), dVar);
            if (collect == V5.b.e()) {
                return collect;
            }
            return I.f8786a;
        }
    }

    public b(P2.d config, U2.c linkRepository, R2.e linkEventsReporter, p3.i errorReporter) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(linkRepository, "linkRepository");
        AbstractC3292y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f8352a = config;
        this.f8353b = linkRepository;
        this.f8354c = linkEventsReporter;
        this.f8355d = errorReporter;
        w a9 = AbstractC3815N.a(null);
        this.f8356e = a9;
        this.f8357f = a9;
        this.f8359h = new i(a9, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T2.b r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Q2.b.c
            if (r0 == 0) goto L14
            r0 = r10
            Q2.b$c r0 = (Q2.b.c) r0
            int r1 = r0.f8370c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8370c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            Q2.b$c r0 = new Q2.b$c
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f8368a
            java.lang.Object r0 = V5.b.e()
            int r1 = r4.f8370c
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r9 = r10.j()
            goto L5f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            Q5.t.b(r10)
            if (r9 == 0) goto L45
            T2.a r9 = r9.c()
            if (r9 != 0) goto L88
        L45:
            P2.d r9 = r8.f8352a
            P2.d$c r9 = r9.b()
            java.lang.String r9 = r9.b()
            if (r9 == 0) goto L82
            r4.f8370c = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            boolean r10 = Q5.s.h(r9)
            if (r10 == 0) goto L72
            T2.b r9 = (T2.b) r9
            if (r9 == 0) goto L6d
            T2.a r7 = r9.c()
        L6d:
            java.lang.Object r9 = Q5.s.b(r7)
            goto L76
        L72:
            java.lang.Object r9 = Q5.s.b(r9)
        L76:
            java.lang.Throwable r10 = Q5.s.e(r9)
            if (r10 != 0) goto L7d
            goto L7f
        L7d:
            T2.a r9 = T2.a.f9964e
        L7f:
            r7 = r9
            T2.a r7 = (T2.a) r7
        L82:
            if (r7 != 0) goto L87
            T2.a r9 = T2.a.f9963d
            goto L88
        L87:
            r9 = r7
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.e(T2.b, U5.d):java.lang.Object");
    }

    private final r g(l lVar) {
        int i8 = a.f8361b[lVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            return r.f32223f;
                        }
                        throw new p();
                    }
                    return r.f32222e;
                }
                return r.f32221d;
            }
            return r.f32220c;
        }
        return r.f32219b;
    }

    public static /* synthetic */ Object k(b bVar, String str, boolean z8, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return bVar.j(str, z8, dVar);
    }

    private final void l(String str, String str2) {
        String str3;
        if (str2 != null) {
            this.f8358g = str2;
            return;
        }
        T2.b bVar = (T2.b) this.f8356e.getValue();
        if (bVar != null) {
            str3 = bVar.e();
        } else {
            str3 = null;
        }
        if (!AbstractC3292y.d(str3, str)) {
            this.f8358g = null;
        }
    }

    private final T2.b m(C2916o c2916o, String str) {
        l(c2916o.b(), str);
        T2.b bVar = new T2.b(c2916o);
        this.f8356e.setValue(bVar);
        return bVar;
    }

    private final T2.b n(C2916o c2916o, String str) {
        T2.b m8;
        if (c2916o == null || (m8 = m(c2916o, str)) == null) {
            this.f8356e.setValue(null);
            this.f8358g = null;
            return null;
        }
        return m8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, Y2.l r13, U5.d r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof Q2.b.g
            if (r0 == 0) goto L14
            r0 = r14
            Q2.b$g r0 = (Q2.b.g) r0
            int r1 = r0.f8386d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8386d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            Q2.b$g r0 = new Q2.b$g
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f8384b
            java.lang.Object r0 = V5.b.e()
            int r1 = r7.f8386d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r9 = r7.f8383a
            Q2.b r9 = (Q2.b) r9
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r10 = r14.j()
            goto L56
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            Q5.t.b(r14)
            U2.c r1 = r8.f8353b
            g3.r r6 = r8.g(r13)
            r7.f8383a = r8
            r7.f8386d = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L55
            return r0
        L55:
            r9 = r8
        L56:
            boolean r11 = Q5.s.h(r10)
            if (r11 == 0) goto L6f
            g3.q r10 = (g3.q) r10
            g3.o r11 = r10.a()
            java.lang.String r10 = r10.b()
            T2.b r9 = r9.m(r11, r10)
            java.lang.Object r9 = Q5.s.b(r9)
            goto L73
        L6f:
            java.lang.Object r9 = Q5.s.b(r10)
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, Y2.l, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, Y2.l r22, U5.d r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.r(java.lang.String, java.lang.String, java.lang.String, java.lang.String, Y2.l, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.stripe.android.model.p r17, U5.d r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.d(com.stripe.android.model.p, U5.d):java.lang.Object");
    }

    public final InterfaceC3821f f() {
        return this.f8359h;
    }

    public final InterfaceC3813L h() {
        return this.f8357f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(U5.d r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.i(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r5, boolean r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof Q2.b.e
            if (r0 == 0) goto L13
            r0 = r7
            Q2.b$e r0 = (Q2.b.e) r0
            int r1 = r0.f8379e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8379e = r1
            goto L18
        L13:
            Q2.b$e r0 = new Q2.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8377c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f8379e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.f8376b
            java.lang.Object r5 = r0.f8375a
            Q2.b r5 = (Q2.b) r5
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r7 = r7.j()
            goto L50
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            Q5.t.b(r7)
            U2.c r7 = r4.f8353b
            r0.f8375a = r4
            r0.f8376b = r6
            r0.f8379e = r3
            java.lang.Object r7 = r7.c(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            java.lang.Throwable r0 = Q5.s.e(r7)
            if (r0 == 0) goto L5b
            R2.e r1 = r5.f8354c
            r1.i(r0)
        L5b:
            boolean r0 = Q5.s.h(r7)
            if (r0 == 0) goto L6c
            g3.p r7 = (g3.p) r7
            T2.b r5 = r5.o(r7, r6)
            java.lang.Object r5 = Q5.s.b(r5)
            goto L70
        L6c:
            java.lang.Object r5 = Q5.s.b(r7)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.j(java.lang.String, boolean, U5.d):java.lang.Object");
    }

    public final T2.b o(g3.p lookup, boolean z8) {
        AbstractC3292y.i(lookup, "lookup");
        C2916o a9 = lookup.a();
        if (a9 != null) {
            if (z8) {
                return n(a9, lookup.b());
            }
            return new T2.b(a9);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Y2.m r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Q2.b.f
            if (r0 == 0) goto L14
            r0 = r10
            Q2.b$f r0 = (Q2.b.f) r0
            int r1 = r0.f8382c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8382c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            Q2.b$f r0 = new Q2.b$f
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f8380a
            java.lang.Object r0 = V5.b.e()
            int r1 = r7.f8382c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L47
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r9 = r10.j()
            goto Laf
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            Q5.t.b(r10)
            Q5.s r10 = (Q5.s) r10
            java.lang.Object r9 = r10.j()
            goto L62
        L47:
            Q5.t.b(r10)
            boolean r10 = r9 instanceof Y2.m.a
            if (r10 == 0) goto L8a
            Y2.m$a r9 = (Y2.m.a) r9
            java.lang.String r2 = r9.a()
            r7.f8382c = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r4 = r7
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L62
            return r0
        L62:
            boolean r10 = Q5.s.h(r9)
            if (r10 == 0) goto L85
            T2.b r9 = (T2.b) r9     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L73
            java.lang.Object r9 = Q5.s.b(r9)     // Catch: java.lang.Throwable -> L71
            goto L89
        L71:
            r9 = move-exception
            goto L7f
        L73:
            java.lang.String r9 = "Error fetching user account"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L71
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L7f:
            Q5.s$a r10 = Q5.s.f8810b
            java.lang.Object r9 = Q5.t.a(r9)
        L85:
            java.lang.Object r9 = Q5.s.b(r9)
        L89:
            return r9
        L8a:
            boolean r10 = r9 instanceof Y2.m.b
            if (r10 == 0) goto Lb0
            Y2.m$b r9 = (Y2.m.b) r9
            java.lang.String r10 = r9.c()
            java.lang.String r4 = r9.b()
            java.lang.String r3 = r9.e()
            java.lang.String r5 = r9.d()
            Y2.l r6 = r9.a()
            r7.f8382c = r2
            r1 = r8
            r2 = r10
            java.lang.Object r9 = r1.r(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Laf
            return r0
        Laf:
            return r9
        Lb0:
            Q5.p r9 = new Q5.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.b.p(Y2.m, U5.d):java.lang.Object");
    }
}
