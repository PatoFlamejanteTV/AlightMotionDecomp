package x4;

import Q5.I;
import Q5.s;
import Q5.t;
import android.content.Context;
import android.graphics.Bitmap;
import c6.InterfaceC2072n;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* renamed from: x4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4224g {

    /* renamed from: f, reason: collision with root package name */
    private static final a f41043f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f41044g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final v2.d f41045a;

    /* renamed from: b, reason: collision with root package name */
    private final C4220c f41046b;

    /* renamed from: c, reason: collision with root package name */
    private final C4222e f41047c;

    /* renamed from: d, reason: collision with root package name */
    private final C4219b f41048d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap f41049e;

    /* renamed from: x4.g$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41050a;

        /* renamed from: c, reason: collision with root package name */
        int f41052c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41050a = obj;
            this.f41052c |= Integer.MIN_VALUE;
            Object g8 = C4224g.this.g(null, 0, 0, this);
            if (g8 == V5.b.e()) {
                return g8;
            }
            return s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f41053a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41055c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f41056d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f41057e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f41058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4224g f41059b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f41060c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f41061d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f41062e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4224g c4224g, String str, int i8, int i9, U5.d dVar) {
                super(1, dVar);
                this.f41059b = c4224g;
                this.f41060c = str;
                this.f41061d = i8;
                this.f41062e = i9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(U5.d dVar) {
                return new a(this.f41059b, this.f41060c, this.f41061d, this.f41062e, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(U5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object k8;
                Object e8 = V5.b.e();
                int i8 = this.f41058a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        k8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f41059b.j(this.f41060c);
                    if (j8 != null || (j8 = this.f41059b.i(this.f41060c)) != null) {
                        k8 = j8.j();
                    } else {
                        C4224g c4224g = this.f41059b;
                        String str = this.f41060c;
                        int i9 = this.f41061d;
                        int i10 = this.f41062e;
                        this.f41058a = 1;
                        k8 = c4224g.k(str, i9, i10, this);
                        if (k8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(k8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i8, int i9, U5.d dVar) {
            super(2, dVar);
            this.f41055c = str;
            this.f41056d = i8;
            this.f41057e = i9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f41055c, this.f41056d, this.f41057e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f41053a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C4224g c4224g = C4224g.this;
                String str = this.f41055c;
                a aVar = new a(c4224g, str, this.f41056d, this.f41057e, null);
                this.f41053a = 1;
                obj = c4224g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41063a;

        /* renamed from: c, reason: collision with root package name */
        int f41065c;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41063a = obj;
            this.f41065c |= Integer.MIN_VALUE;
            Object h8 = C4224g.this.h(null, this);
            if (h8 == V5.b.e()) {
                return h8;
            }
            return s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f41066a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41068c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f41069a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4224g f41070b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f41071c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4224g c4224g, String str, U5.d dVar) {
                super(1, dVar);
                this.f41070b = c4224g;
                this.f41071c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(U5.d dVar) {
                return new a(this.f41070b, this.f41071c, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(U5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object l8;
                Object e8 = V5.b.e();
                int i8 = this.f41069a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        l8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f41070b.j(this.f41071c);
                    if (j8 != null || (j8 = this.f41070b.i(this.f41071c)) != null) {
                        l8 = j8.j();
                    } else {
                        C4224g c4224g = this.f41070b;
                        String str = this.f41071c;
                        this.f41069a = 1;
                        l8 = c4224g.l(str, this);
                        if (l8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(l8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, U5.d dVar) {
            super(2, dVar);
            this.f41068c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f41068c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f41066a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C4224g c4224g = C4224g.this;
                String str = this.f41068c;
                a aVar = new a(c4224g, str, null);
                this.f41066a = 1;
                obj = c4224g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41072a;

        /* renamed from: b, reason: collision with root package name */
        Object f41073b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41074c;

        /* renamed from: e, reason: collision with root package name */
        int f41076e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41074c = obj;
            this.f41076e |= Integer.MIN_VALUE;
            Object k8 = C4224g.this.k(null, 0, 0, this);
            if (k8 == V5.b.e()) {
                return k8;
            }
            return s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0937g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41077a;

        /* renamed from: b, reason: collision with root package name */
        Object f41078b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41079c;

        /* renamed from: e, reason: collision with root package name */
        int f41081e;

        C0937g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41079c = obj;
            this.f41081e |= Integer.MIN_VALUE;
            Object l8 = C4224g.this.l(null, this);
            if (l8 == V5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41082a;

        /* renamed from: b, reason: collision with root package name */
        Object f41083b;

        /* renamed from: c, reason: collision with root package name */
        Object f41084c;

        /* renamed from: d, reason: collision with root package name */
        Object f41085d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41086e;

        /* renamed from: g, reason: collision with root package name */
        int f41088g;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41086e = obj;
            this.f41088g |= Integer.MIN_VALUE;
            return C4224g.this.m(null, null, this);
        }
    }

    public C4224g(Context context, v2.d logger, C4220c c4220c, C4222e networkImageDecoder, C4219b c4219b) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(networkImageDecoder, "networkImageDecoder");
        this.f41045a = logger;
        this.f41046b = c4220c;
        this.f41047c = networkImageDecoder;
        this.f41048d = c4219b;
        this.f41049e = new ConcurrentHashMap();
    }

    private final void f(String str) {
        this.f41045a.b("StripeImageLoader: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s i(String str) {
        Bitmap bitmap;
        C4219b c4219b = this.f41048d;
        if (c4219b != null) {
            bitmap = c4219b.e(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            f("Image loaded from disk cache");
        } else {
            f("Image not found on disk cache");
        }
        if (bitmap == null) {
            return null;
        }
        C4220c c4220c = this.f41046b;
        if (c4220c != null) {
            c4220c.b(str, bitmap);
        }
        return s.a(s.b(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s j(String str) {
        Bitmap bitmap;
        C4220c c4220c = this.f41046b;
        if (c4220c != null) {
            bitmap = c4220c.a(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            f("Image loaded from memory cache");
        } else {
            f("Image not found on memory cache");
        }
        if (bitmap == null) {
            return null;
        }
        C4219b c4219b = this.f41048d;
        if (c4219b != null) {
            c4219b.h(str, bitmap);
        }
        return s.a(s.b(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0079, B:14:0x007d, B:16:0x0081, B:17:0x0084, B:19:0x0088, B:20:0x008d), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r5, int r6, int r7, U5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x4.C4224g.f
            if (r0 == 0) goto L13
            r0 = r8
            x4.g$f r0 = (x4.C4224g.f) r0
            int r1 = r0.f41076e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41076e = r1
            goto L18
        L13:
            x4.g$f r0 = new x4.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41074c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41076e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f41073b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.f41072a
            x4.g r6 = (x4.C4224g) r6
            Q5.t.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r5 = move-exception
            goto L94
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Q5.t.b(r8)
            Q5.s$a r8 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = "Image "
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = " loading from internet ("
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = " x "
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = ")"
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L92
            r4.f(r8)     // Catch: java.lang.Throwable -> L92
            x4.e r8 = r4.f41047c     // Catch: java.lang.Throwable -> L92
            r0.f41072a = r4     // Catch: java.lang.Throwable -> L92
            r0.f41073b = r5     // Catch: java.lang.Throwable -> L92
            r0.f41076e = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.c(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L92
            if (r8 != r1) goto L78
            return r1
        L78:
            r6 = r4
        L79:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L8c
            x4.b r7 = r6.f41048d     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L84
            r7.h(r5, r8)     // Catch: java.lang.Throwable -> L31
        L84:
            x4.c r7 = r6.f41046b     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L8d
            r7.b(r5, r8)     // Catch: java.lang.Throwable -> L31
            goto L8d
        L8c:
            r8 = 0
        L8d:
            java.lang.Object r5 = Q5.s.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L9e
        L92:
            r5 = move-exception
            r6 = r4
        L94:
            Q5.s$a r7 = Q5.s.f8810b
            java.lang.Object r5 = Q5.t.a(r5)
            java.lang.Object r5 = Q5.s.b(r5)
        L9e:
            java.lang.Throwable r7 = Q5.s.e(r5)
            if (r7 == 0) goto Lab
            v2.d r6 = r6.f41045a
            java.lang.String r8 = "StripeImageLoader: Could not load image from network"
            r6.a(r8, r7)
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.k(java.lang.String, int, int, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0069, B:14:0x006d, B:16:0x0071, B:17:0x0074, B:19:0x0078, B:20:0x007d), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x4.C4224g.C0937g
            if (r0 == 0) goto L13
            r0 = r6
            x4.g$g r0 = (x4.C4224g.C0937g) r0
            int r1 = r0.f41081e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41081e = r1
            goto L18
        L13:
            x4.g$g r0 = new x4.g$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41079c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41081e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f41078b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f41077a
            x4.g r0 = (x4.C4224g) r0
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Q5.t.b(r6)
            Q5.s$a r6 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Image "
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            r6.append(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = " loading from internet"
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            r4.f(r6)     // Catch: java.lang.Throwable -> L82
            x4.e r6 = r4.f41047c     // Catch: java.lang.Throwable -> L82
            r0.f41077a = r4     // Catch: java.lang.Throwable -> L82
            r0.f41078b = r5     // Catch: java.lang.Throwable -> L82
            r0.f41081e = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r6.d(r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r6 != r1) goto L68
            return r1
        L68:
            r0 = r4
        L69:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7c
            x4.b r1 = r0.f41048d     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L74
            r1.h(r5, r6)     // Catch: java.lang.Throwable -> L31
        L74:
            x4.c r1 = r0.f41046b     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L7d
            r1.b(r5, r6)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L7c:
            r6 = 0
        L7d:
            java.lang.Object r5 = Q5.s.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L82:
            r5 = move-exception
            r0 = r4
        L84:
            Q5.s$a r6 = Q5.s.f8810b
            java.lang.Object r5 = Q5.t.a(r5)
            java.lang.Object r5 = Q5.s.b(r5)
        L8e:
            java.lang.Throwable r6 = Q5.s.e(r5)
            if (r6 == 0) goto L9b
            v2.d r0 = r0.f41045a
            java.lang.String r1 = "StripeImageLoader: Could not load image from network"
            r0.a(r1, r6)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.l(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r8, kotlin.jvm.functions.Function1 r9, U5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof x4.C4224g.h
            if (r0 == 0) goto L13
            r0 = r10
            x4.g$h r0 = (x4.C4224g.h) r0
            int r1 = r0.f41088g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41088g = r1
            goto L18
        L13:
            x4.g$h r0 = new x4.g$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41086e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41088g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.f41084c
            w6.a r8 = (w6.InterfaceC4158a) r8
            java.lang.Object r9 = r0.f41083b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f41082a
            x4.g r0 = (x4.C4224g) r0
            Q5.t.b(r10)     // Catch: java.lang.Throwable -> L3a
            goto La1
        L3a:
            r9 = move-exception
            goto Lac
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            java.lang.Object r8 = r0.f41085d
            w6.a r8 = (w6.InterfaceC4158a) r8
            java.lang.Object r9 = r0.f41084c
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.f41083b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f41082a
            x4.g r4 = (x4.C4224g) r4
            Q5.t.b(r10)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L8d
        L5c:
            Q5.t.b(r10)
            j$.util.concurrent.ConcurrentHashMap r10 = r7.f41049e
            java.lang.Object r2 = r10.get(r8)
            if (r2 != 0) goto L74
            r2 = 0
            w6.a r2 = w6.AbstractC4160c.b(r2, r4, r5)
            java.lang.Object r10 = r10.putIfAbsent(r8, r2)
            if (r10 != 0) goto L73
            goto L74
        L73:
            r2 = r10
        L74:
            java.lang.String r10 = "getOrPut(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r10)
            w6.a r2 = (w6.InterfaceC4158a) r2
            r0.f41082a = r7
            r0.f41083b = r8
            r0.f41084c = r9
            r0.f41085d = r2
            r0.f41088g = r4
            java.lang.Object r10 = r2.a(r5, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            r4 = r7
        L8d:
            r0.f41082a = r4     // Catch: java.lang.Throwable -> Laa
            r0.f41083b = r8     // Catch: java.lang.Throwable -> Laa
            r0.f41084c = r2     // Catch: java.lang.Throwable -> Laa
            r0.f41085d = r5     // Catch: java.lang.Throwable -> Laa
            r0.f41088g = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r10 = r9.invoke(r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r9 = r8
            r8 = r2
            r0 = r4
        La1:
            r8.d(r5)
            j$.util.concurrent.ConcurrentHashMap r8 = r0.f41049e
            r8.remove(r9)
            return r10
        Laa:
            r9 = move-exception
            r8 = r2
        Lac:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.m(java.lang.String, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r11, int r12, int r13, U5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof x4.C4224g.b
            if (r0 == 0) goto L13
            r0 = r14
            x4.g$b r0 = (x4.C4224g.b) r0
            int r1 = r0.f41052c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41052c = r1
            goto L18
        L13:
            x4.g$b r0 = new x4.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f41050a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41052c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Q5.t.b(r14)
            n6.I r14 = n6.C3445b0.b()
            x4.g$c r2 = new x4.g$c
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f41052c = r3
            java.lang.Object r14 = n6.AbstractC3458i.g(r14, r2, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.g(java.lang.String, int, int, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x4.C4224g.d
            if (r0 == 0) goto L13
            r0 = r7
            x4.g$d r0 = (x4.C4224g.d) r0
            int r1 = r0.f41065c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41065c = r1
            goto L18
        L13:
            x4.g$d r0 = new x4.g$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41063a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f41065c
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
            n6.I r7 = n6.C3445b0.b()
            x4.g$e r2 = new x4.g$e
            r4 = 0
            r2.<init>(r6, r4)
            r0.f41065c = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.h(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4224g(android.content.Context r12, v2.d r13, x4.C4220c r14, x4.C4222e r15, x4.C4219b r16, int r17, kotlin.jvm.internal.AbstractC3284p r18) {
        /*
            r11 = this;
            r0 = r17 & 2
            if (r0 == 0) goto Lf
            v2.d$a r0 = v2.d.f40434a
            boolean r1 = x4.AbstractC4225h.a(r12)
            v2.d r0 = r0.a(r1)
            goto L10
        Lf:
            r0 = r13
        L10:
            r1 = r17 & 4
            if (r1 == 0) goto L1d
            x4.c r1 = new x4.c
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            goto L1e
        L1d:
            r1 = r14
        L1e:
            r2 = r17 & 8
            if (r2 == 0) goto L28
            x4.e r2 = new x4.e
            r2.<init>()
            goto L29
        L28:
            r2 = r15
        L29:
            r3 = r17 & 16
            if (r3 == 0) goto L3b
            x4.b r3 = new x4.b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "stripe_image_cache"
            r7 = 0
            r4 = r3
            r5 = r12
            r4.<init>(r5, r6, r7, r9, r10)
            goto L3d
        L3b:
            r3 = r16
        L3d:
            r13 = r11
            r14 = r12
            r15 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C4224g.<init>(android.content.Context, v2.d, x4.c, x4.e, x4.b, int, kotlin.jvm.internal.p):void");
    }
}
