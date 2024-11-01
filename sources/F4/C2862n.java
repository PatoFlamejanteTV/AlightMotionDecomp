package f4;

import Q5.I;
import Q5.t;
import android.graphics.Bitmap;
import c6.InterfaceC2072n;
import e4.InterfaceC2818b;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;

/* renamed from: f4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2862n {

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f31899a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2818b f31900b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31901c;

    /* renamed from: f4.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: f4.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0735a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final Z3.c f31902a;

            /* renamed from: b, reason: collision with root package name */
            private final U5.g f31903b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: f4.n$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0736a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f31904a;

                /* renamed from: b, reason: collision with root package name */
                Object f31905b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f31906c;

                /* renamed from: e, reason: collision with root package name */
                int f31908e;

                C0736a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f31906c = obj;
                    this.f31908e |= Integer.MIN_VALUE;
                    return C0735a.this.a(null, this);
                }
            }

            public C0735a(Z3.c errorReporter, U5.g workContext) {
                AbstractC3292y.i(errorReporter, "errorReporter");
                AbstractC3292y.i(workContext, "workContext");
                this.f31902a = errorReporter;
                this.f31903b = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // f4.C2862n.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object a(java.lang.String r13, U5.d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof f4.C2862n.a.C0735a.C0736a
                    if (r0 == 0) goto L13
                    r0 = r14
                    f4.n$a$a$a r0 = (f4.C2862n.a.C0735a.C0736a) r0
                    int r1 = r0.f31908e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31908e = r1
                    goto L18
                L13:
                    f4.n$a$a$a r0 = new f4.n$a$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f31906c
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f31908e
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r13 = r0.f31905b
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object r0 = r0.f31904a
                    f4.n$a$a r0 = (f4.C2862n.a.C0735a) r0
                    Q5.t.b(r14)     // Catch: java.lang.Throwable -> L32
                    goto L5d
                L32:
                    r14 = move-exception
                    goto L78
                L34:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3c:
                    Q5.t.b(r14)
                    Q5.s$a r14 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L76
                    com.stripe.android.stripe3ds2.transaction.r r14 = new com.stripe.android.stripe3ds2.transaction.r     // Catch: java.lang.Throwable -> L76
                    Z3.c r8 = r12.f31902a     // Catch: java.lang.Throwable -> L76
                    U5.g r9 = r12.f31903b     // Catch: java.lang.Throwable -> L76
                    r10 = 2
                    r11 = 0
                    r7 = 0
                    r5 = r14
                    r6 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
                    r0.f31904a = r12     // Catch: java.lang.Throwable -> L76
                    r0.f31905b = r13     // Catch: java.lang.Throwable -> L76
                    r0.f31908e = r3     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r14 = r14.h(r0)     // Catch: java.lang.Throwable -> L76
                    if (r14 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r12
                L5d:
                    java.io.InputStream r14 = (java.io.InputStream) r14     // Catch: java.lang.Throwable -> L32
                    if (r14 == 0) goto L70
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r14)     // Catch: java.lang.Throwable -> L69
                    a6.AbstractC1677b.a(r14, r4)     // Catch: java.lang.Throwable -> L32
                    goto L71
                L69:
                    r1 = move-exception
                    throw r1     // Catch: java.lang.Throwable -> L6b
                L6b:
                    r2 = move-exception
                    a6.AbstractC1677b.a(r14, r1)     // Catch: java.lang.Throwable -> L32
                    throw r2     // Catch: java.lang.Throwable -> L32
                L70:
                    r1 = r4
                L71:
                    java.lang.Object r14 = Q5.s.b(r1)     // Catch: java.lang.Throwable -> L32
                    goto L82
                L76:
                    r14 = move-exception
                    r0 = r12
                L78:
                    Q5.s$a r1 = Q5.s.f8810b
                    java.lang.Object r14 = Q5.t.a(r14)
                    java.lang.Object r14 = Q5.s.b(r14)
                L82:
                    java.lang.Throwable r1 = Q5.s.e(r14)
                    if (r1 == 0) goto La8
                    Z3.c r0 = r0.f31902a
                    java.lang.RuntimeException r2 = new java.lang.RuntimeException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "Could not get bitmap from url: "
                    r3.append(r5)
                    r3.append(r13)
                    java.lang.String r13 = "."
                    r3.append(r13)
                    java.lang.String r13 = r3.toString()
                    r2.<init>(r13, r1)
                    r0.l(r2)
                La8:
                    boolean r13 = Q5.s.g(r14)
                    if (r13 == 0) goto Laf
                    goto Lb0
                Laf:
                    r4 = r14
                Lb0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: f4.C2862n.a.C0735a.a(java.lang.String, U5.d):java.lang.Object");
            }
        }

        Object a(String str, U5.d dVar);
    }

    /* renamed from: f4.n$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f31909a;

        /* renamed from: b, reason: collision with root package name */
        Object f31910b;

        /* renamed from: c, reason: collision with root package name */
        int f31911c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31912d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2862n f31913e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C2862n c2862n, U5.d dVar) {
            super(2, dVar);
            this.f31912d = str;
            this.f31913e = c2862n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f31912d, this.f31913e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C2862n c2862n;
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f31911c;
            if (i8 != 0) {
                if (i8 == 1) {
                    str = (String) this.f31910b;
                    c2862n = (C2862n) this.f31909a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                String str2 = this.f31912d;
                if (str2 != null) {
                    c2862n = this.f31913e;
                    Bitmap f8 = c2862n.f(str2);
                    if (f8 == null) {
                        this.f31909a = c2862n;
                        this.f31910b = str2;
                        this.f31911c = 1;
                        Object g8 = c2862n.g(str2, this);
                        if (g8 == e8) {
                            return e8;
                        }
                        str = str2;
                        obj = g8;
                    } else {
                        return f8;
                    }
                } else {
                    return null;
                }
            }
            Bitmap bitmap = (Bitmap) obj;
            c2862n.d(str, bitmap);
            return bitmap;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C2862n(U5.g workContext, InterfaceC2818b imageCache, a imageSupplier) {
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(imageCache, "imageCache");
        AbstractC3292y.i(imageSupplier, "imageSupplier");
        this.f31899a = workContext;
        this.f31900b = imageCache;
        this.f31901c = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.f31900b.a(str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap f(String str) {
        return this.f31900b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, U5.d dVar) {
        return this.f31901c.a(str, dVar);
    }

    public final Object e(String str, U5.d dVar) {
        return AbstractC3458i.g(this.f31899a, new b(str, this, null), dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2862n(Z3.c errorReporter, U5.g workContext) {
        this(workContext, InterfaceC2818b.a.f31705a, new a.C0735a(errorReporter, workContext));
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
    }
}
