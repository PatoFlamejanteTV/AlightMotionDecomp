package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2163i3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f16760h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile AbstractC2255t3 f16761i;

    /* renamed from: j, reason: collision with root package name */
    private static C2287x3 f16762j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f16763k;

    /* renamed from: a, reason: collision with root package name */
    private final C2232q3 f16764a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16765b;

    /* renamed from: c, reason: collision with root package name */
    private Object f16766c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f16767d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f16768e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16769f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f16770g;

    static {
        new AtomicReference();
        f16762j = new C2287x3(new InterfaceC2279w3() { // from class: com.google.android.gms.internal.measurement.n3
            @Override // com.google.android.gms.internal.measurement.InterfaceC2279w3
            public final boolean w() {
                return AbstractC2163i3.n();
            }
        });
        f16763k = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC2163i3 a(C2232q3 c2232q3, String str, Boolean bool, boolean z8) {
        return new C2224p3(c2232q3, str, bool, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC2163i3 b(C2232q3 c2232q3, String str, Double d8, boolean z8) {
        return new C2216o3(c2232q3, str, d8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC2163i3 c(C2232q3 c2232q3, String str, Long l8, boolean z8) {
        return new C2199m3(c2232q3, str, l8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC2163i3 d(C2232q3 c2232q3, String str, String str2, boolean z8) {
        return new C2239r3(c2232q3, str, str2, true);
    }

    private final Object f(AbstractC2255t3 abstractC2255t3) {
        w0.c cVar;
        String h8;
        C2232q3 c2232q3 = this.f16764a;
        if (!c2232q3.f16942e && ((cVar = c2232q3.f16946i) == null || ((Boolean) cVar.apply(abstractC2255t3.a())).booleanValue())) {
            C2100b3 a9 = C2100b3.a(abstractC2255t3.a());
            C2232q3 c2232q32 = this.f16764a;
            if (c2232q32.f16942e) {
                h8 = null;
            } else {
                h8 = h(c2232q32.f16940c);
            }
            Object c8 = a9.c(h8);
            if (c8 != null) {
                return g(c8);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f16765b;
        }
        return str + this.f16765b;
    }

    private final Object j(AbstractC2255t3 abstractC2255t3) {
        InterfaceC2091a3 b9;
        Object c8;
        if (this.f16764a.f16939b != null) {
            if (AbstractC2154h3.b(abstractC2255t3.a(), this.f16764a.f16939b)) {
                if (this.f16764a.f16945h) {
                    b9 = T2.a(abstractC2255t3.a().getContentResolver(), AbstractC2172j3.a(AbstractC2172j3.b(abstractC2255t3.a(), this.f16764a.f16939b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.l3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2163i3.m();
                        }
                    });
                } else {
                    b9 = T2.a(abstractC2255t3.a().getContentResolver(), this.f16764a.f16939b, new Runnable() { // from class: com.google.android.gms.internal.measurement.l3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2163i3.m();
                        }
                    });
                }
            } else {
                b9 = null;
            }
        } else {
            b9 = C2271v3.b(abstractC2255t3.a(), this.f16764a.f16938a, new Runnable() { // from class: com.google.android.gms.internal.measurement.l3
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2163i3.m();
                }
            });
        }
        if (b9 == null || (c8 = b9.c(k())) == null) {
            return null;
        }
        return g(c8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:            throw r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.t3 r0 = com.google.android.gms.internal.measurement.AbstractC2163i3.f16761i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC2163i3.f16760h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.t3 r1 = com.google.android.gms.internal.measurement.AbstractC2163i3.f16761i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.t3 r1 = com.google.android.gms.internal.measurement.AbstractC2163i3.f16761i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.T2.e()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C2271v3.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C2100b3.b()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.k3 r1 = new com.google.android.gms.internal.measurement.k3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            w0.k r1 = w0.l.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.U2 r2 = new com.google.android.gms.internal.measurement.U2     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.AbstractC2163i3.f16761i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC2163i3.f16763k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2163i3.l(android.content.Context):void");
    }

    public static void m() {
        f16763k.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean n() {
        return true;
    }

    private final Object o() {
        return this.f16766c;
    }

    public final Object e() {
        boolean z8;
        Object j8;
        if (!this.f16769f) {
            w0.h.o(f16762j.a(this.f16765b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i8 = f16763k.get();
        if (this.f16767d < i8) {
            synchronized (this) {
                try {
                    if (this.f16767d < i8) {
                        AbstractC2255t3 abstractC2255t3 = f16761i;
                        w0.g a9 = w0.g.a();
                        String str = null;
                        if (abstractC2255t3 != null) {
                            a9 = (w0.g) abstractC2255t3.b().get();
                            if (a9.c()) {
                                InterfaceC2145g3 interfaceC2145g3 = (InterfaceC2145g3) a9.b();
                                C2232q3 c2232q3 = this.f16764a;
                                str = interfaceC2145g3.a(c2232q3.f16939b, c2232q3.f16938a, c2232q3.f16941d, this.f16765b);
                            }
                        }
                        if (abstractC2255t3 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        w0.h.o(z8, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.f16764a.f16943f ? (j8 = j(abstractC2255t3)) == null && (j8 = f(abstractC2255t3)) == null : (j8 = f(abstractC2255t3)) == null && (j8 = j(abstractC2255t3)) == null) {
                            j8 = o();
                        }
                        if (a9.c()) {
                            if (str == null) {
                                j8 = o();
                            } else {
                                j8 = g(str);
                            }
                        }
                        this.f16768e = j8;
                        this.f16767d = i8;
                    }
                } finally {
                }
            }
        }
        return this.f16768e;
    }

    abstract Object g(Object obj);

    public final String k() {
        return h(this.f16764a.f16941d);
    }

    private AbstractC2163i3(C2232q3 c2232q3, String str, Object obj, boolean z8) {
        this.f16767d = -1;
        String str2 = c2232q3.f16938a;
        if (str2 == null && c2232q3.f16939b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c2232q3.f16939b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f16764a = c2232q3;
        this.f16765b = str;
        this.f16766c = obj;
        this.f16769f = z8;
        this.f16770g = false;
    }
}
