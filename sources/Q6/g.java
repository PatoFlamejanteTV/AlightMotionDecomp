package Q6;

import Q6.h;
import U6.C1449e;
import U6.C1452h;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    private static final ExecutorService f8893u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), L6.c.B("OkHttp Http2Connection", true));

    /* renamed from: a, reason: collision with root package name */
    final boolean f8894a;

    /* renamed from: b, reason: collision with root package name */
    final h f8895b;

    /* renamed from: d, reason: collision with root package name */
    final String f8897d;

    /* renamed from: e, reason: collision with root package name */
    int f8898e;

    /* renamed from: f, reason: collision with root package name */
    int f8899f;

    /* renamed from: g, reason: collision with root package name */
    boolean f8900g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f8901h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f8902i;

    /* renamed from: j, reason: collision with root package name */
    final l f8903j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8904k;

    /* renamed from: m, reason: collision with root package name */
    long f8906m;

    /* renamed from: o, reason: collision with root package name */
    final m f8908o;

    /* renamed from: p, reason: collision with root package name */
    boolean f8909p;

    /* renamed from: q, reason: collision with root package name */
    final Socket f8910q;

    /* renamed from: r, reason: collision with root package name */
    final Q6.j f8911r;

    /* renamed from: s, reason: collision with root package name */
    final j f8912s;

    /* renamed from: t, reason: collision with root package name */
    final Set f8913t;

    /* renamed from: c, reason: collision with root package name */
    final Map f8896c = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    long f8905l = 0;

    /* renamed from: n, reason: collision with root package name */
    m f8907n = new m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8914b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q6.b f8915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i8, Q6.b bVar) {
            super(str, objArr);
            this.f8914b = i8;
            this.f8915c = bVar;
        }

        @Override // L6.b
        public void e() {
            try {
                g.this.M(this.f8914b, this.f8915c);
            } catch (IOException unused) {
                g.this.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i8, long j8) {
            super(str, objArr);
            this.f8917b = i8;
            this.f8918c = j8;
        }

        @Override // L6.b
        public void e() {
            try {
                g.this.f8911r.z(this.f8917b, this.f8918c);
            } catch (IOException unused) {
                g.this.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8920b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f8921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i8, List list) {
            super(str, objArr);
            this.f8920b = i8;
            this.f8921c = list;
        }

        @Override // L6.b
        public void e() {
            if (g.this.f8903j.onRequest(this.f8920b, this.f8921c)) {
                try {
                    g.this.f8911r.t(this.f8920b, Q6.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f8913t.remove(Integer.valueOf(this.f8920b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f8924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8925d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i8, List list, boolean z8) {
            super(str, objArr);
            this.f8923b = i8;
            this.f8924c = list;
            this.f8925d = z8;
        }

        @Override // L6.b
        public void e() {
            boolean onHeaders = g.this.f8903j.onHeaders(this.f8923b, this.f8924c, this.f8925d);
            if (onHeaders) {
                try {
                    g.this.f8911r.t(this.f8923b, Q6.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (onHeaders || this.f8925d) {
                synchronized (g.this) {
                    g.this.f8913t.remove(Integer.valueOf(this.f8923b));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class e extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1449e f8928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8929d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8930e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i8, C1449e c1449e, int i9, boolean z8) {
            super(str, objArr);
            this.f8927b = i8;
            this.f8928c = c1449e;
            this.f8929d = i9;
            this.f8930e = z8;
        }

        @Override // L6.b
        public void e() {
            try {
                boolean b9 = g.this.f8903j.b(this.f8927b, this.f8928c, this.f8929d, this.f8930e);
                if (b9) {
                    g.this.f8911r.t(this.f8927b, Q6.b.CANCEL);
                }
                if (b9 || this.f8930e) {
                    synchronized (g.this) {
                        g.this.f8913t.remove(Integer.valueOf(this.f8927b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8932b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q6.b f8933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i8, Q6.b bVar) {
            super(str, objArr);
            this.f8932b = i8;
            this.f8933c = bVar;
        }

        @Override // L6.b
        public void e() {
            g.this.f8903j.a(this.f8932b, this.f8933c);
            synchronized (g.this) {
                g.this.f8913t.remove(Integer.valueOf(this.f8932b));
            }
        }
    }

    /* renamed from: Q6.g$g, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0183g {

        /* renamed from: a, reason: collision with root package name */
        Socket f8935a;

        /* renamed from: b, reason: collision with root package name */
        String f8936b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC1451g f8937c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC1450f f8938d;

        /* renamed from: e, reason: collision with root package name */
        h f8939e = h.f8943a;

        /* renamed from: f, reason: collision with root package name */
        l f8940f = l.f9003a;

        /* renamed from: g, reason: collision with root package name */
        boolean f8941g;

        /* renamed from: h, reason: collision with root package name */
        int f8942h;

        public C0183g(boolean z8) {
            this.f8941g = z8;
        }

        public g a() {
            return new g(this);
        }

        public C0183g b(h hVar) {
            this.f8939e = hVar;
            return this;
        }

        public C0183g c(int i8) {
            this.f8942h = i8;
            return this;
        }

        public C0183g d(Socket socket, String str, InterfaceC1451g interfaceC1451g, InterfaceC1450f interfaceC1450f) {
            this.f8935a = socket;
            this.f8936b = str;
            this.f8937c = interfaceC1451g;
            this.f8938d = interfaceC1450f;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    final class i extends L6.b {

        /* renamed from: b, reason: collision with root package name */
        final boolean f8944b;

        /* renamed from: c, reason: collision with root package name */
        final int f8945c;

        /* renamed from: d, reason: collision with root package name */
        final int f8946d;

        i(boolean z8, int i8, int i9) {
            super("OkHttp %s ping %08x%08x", g.this.f8897d, Integer.valueOf(i8), Integer.valueOf(i9));
            this.f8944b = z8;
            this.f8945c = i8;
            this.f8946d = i9;
        }

        @Override // L6.b
        public void e() {
            g.this.L(this.f8944b, this.f8945c, this.f8946d);
        }
    }

    g(C0183g c0183g) {
        int i8;
        m mVar = new m();
        this.f8908o = mVar;
        this.f8909p = false;
        this.f8913t = new LinkedHashSet();
        this.f8903j = c0183g.f8940f;
        boolean z8 = c0183g.f8941g;
        this.f8894a = z8;
        this.f8895b = c0183g.f8939e;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        this.f8899f = i8;
        if (z8) {
            this.f8899f = i8 + 2;
        }
        if (z8) {
            this.f8907n.i(7, 16777216);
        }
        String str = c0183g.f8936b;
        this.f8897d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, L6.c.B(L6.c.o("OkHttp %s Writer", str), false));
        this.f8901h = scheduledThreadPoolExecutor;
        if (c0183g.f8942h != 0) {
            i iVar = new i(false, 0, 0);
            int i9 = c0183g.f8942h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i9, i9, TimeUnit.MILLISECONDS);
        }
        this.f8902i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), L6.c.B(L6.c.o("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f8906m = mVar.d();
        this.f8910q = c0183g.f8935a;
        this.f8911r = new Q6.j(c0183g.f8938d, z8);
        this.f8912s = new j(new Q6.h(c0183g.f8937c, z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            Q6.b bVar = Q6.b.PROTOCOL_ERROR;
            j(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0016, B:11:0x001a, B:13:0x002d, B:15:0x0035, B:19:0x003f, B:21:0x0045, B:22:0x004e, B:36:0x0073, B:37:0x0078), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Q6.i t(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            Q6.j r7 = r10.f8911r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L57
            int r0 = r10.f8899f     // Catch: java.lang.Throwable -> L13
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L16
            Q6.b r0 = Q6.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r10.H(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r11 = move-exception
            goto L79
        L16:
            boolean r0 = r10.f8900g     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L73
            int r8 = r10.f8899f     // Catch: java.lang.Throwable -> L13
            int r0 = r8 + 2
            r10.f8899f = r0     // Catch: java.lang.Throwable -> L13
            Q6.i r9 = new Q6.i     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L3e
            long r0 = r10.f8906m     // Catch: java.lang.Throwable -> L13
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3e
            long r0 = r9.f8967b     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3c
            goto L3e
        L3c:
            r13 = 0
            goto L3f
        L3e:
            r13 = 1
        L3f:
            boolean r0 = r9.k()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L4e
            java.util.Map r0 = r10.f8896c     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L13
        L4e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            if (r11 != 0) goto L59
            Q6.j r0 = r10.f8911r     // Catch: java.lang.Throwable -> L57
            r0.v(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L57
            goto L62
        L57:
            r11 = move-exception
            goto L7b
        L59:
            boolean r0 = r10.f8894a     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L6b
            Q6.j r0 = r10.f8911r     // Catch: java.lang.Throwable -> L57
            r0.r(r11, r8, r12)     // Catch: java.lang.Throwable -> L57
        L62:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            if (r13 == 0) goto L6a
            Q6.j r11 = r10.f8911r
            r11.flush()
        L6a:
            return r9
        L6b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L57
            throw r11     // Catch: java.lang.Throwable -> L57
        L73:
            Q6.a r11 = new Q6.a     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L57
        L7b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.g.t(int, java.util.List, boolean):Q6.i");
    }

    void B(int i8, List list) {
        synchronized (this) {
            try {
                if (this.f8913t.contains(Integer.valueOf(i8))) {
                    N(i8, Q6.b.PROTOCOL_ERROR);
                    return;
                }
                this.f8913t.add(Integer.valueOf(i8));
                try {
                    this.f8902i.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void E(int i8, Q6.b bVar) {
        this.f8902i.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, bVar));
    }

    boolean F(int i8) {
        if (i8 != 0 && (i8 & 1) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Q6.i G(int i8) {
        Q6.i iVar;
        iVar = (Q6.i) this.f8896c.remove(Integer.valueOf(i8));
        notifyAll();
        return iVar;
    }

    public void H(Q6.b bVar) {
        synchronized (this.f8911r) {
            synchronized (this) {
                if (this.f8900g) {
                    return;
                }
                this.f8900g = true;
                this.f8911r.j(this.f8898e, bVar, L6.c.f5410a);
            }
        }
    }

    public void I() {
        J(true);
    }

    void J(boolean z8) {
        if (z8) {
            this.f8911r.b();
            this.f8911r.u(this.f8907n);
            if (this.f8907n.d() != 65535) {
                this.f8911r.z(0, r5 - 65535);
            }
        }
        new Thread(this.f8912s).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:            throw new java.io.IOException("stream closed");     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:            r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f8911r.p());        r6 = r3;        r8.f8906m -= r6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(int r9, boolean r10, U6.C1449e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            Q6.j r12 = r8.f8911r
            r12.g(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f8906m     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.Map r3 = r8.f8896c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L5e
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            Q6.j r3 = r8.f8911r     // Catch: java.lang.Throwable -> L28
            int r3 = r3.p()     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f8906m     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f8906m = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            Q6.j r4 = r8.f8911r
            if (r10 == 0) goto L53
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r4.g(r5, r9, r11, r3)
            goto Ld
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.g.K(int, boolean, U6.e, long):void");
    }

    void L(boolean z8, int i8, int i9) {
        boolean z9;
        if (!z8) {
            synchronized (this) {
                z9 = this.f8904k;
                this.f8904k = true;
            }
            if (z9) {
                k();
                return;
            }
        }
        try {
            this.f8911r.q(z8, i8, i9);
        } catch (IOException unused) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(int i8, Q6.b bVar) {
        this.f8911r.t(i8, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(int i8, Q6.b bVar) {
        try {
            this.f8901h.execute(new a("OkHttp %s stream %d", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i8, long j8) {
        try {
            this.f8901h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, j8));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(Q6.b.NO_ERROR, Q6.b.CANCEL);
    }

    public void flush() {
        this.f8911r.flush();
    }

    void i(long j8) {
        this.f8906m += j8;
        if (j8 > 0) {
            notifyAll();
        }
    }

    void j(Q6.b bVar, Q6.b bVar2) {
        Q6.i[] iVarArr = null;
        try {
            H(bVar);
            e = null;
        } catch (IOException e8) {
            e = e8;
        }
        synchronized (this) {
            try {
                if (!this.f8896c.isEmpty()) {
                    iVarArr = (Q6.i[]) this.f8896c.values().toArray(new Q6.i[this.f8896c.size()]);
                    this.f8896c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (Q6.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2);
                } catch (IOException e9) {
                    if (e != null) {
                        e = e9;
                    }
                }
            }
        }
        try {
            this.f8911r.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.f8910q.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.f8901h.shutdown();
        this.f8902i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    synchronized Q6.i p(int i8) {
        return (Q6.i) this.f8896c.get(Integer.valueOf(i8));
    }

    public synchronized boolean q() {
        return this.f8900g;
    }

    public synchronized int r() {
        return this.f8908o.e(Integer.MAX_VALUE);
    }

    public Q6.i u(List list, boolean z8) {
        return t(0, list, z8);
    }

    void v(int i8, InterfaceC1451g interfaceC1451g, int i9, boolean z8) {
        C1449e c1449e = new C1449e();
        long j8 = i9;
        interfaceC1451g.require(j8);
        interfaceC1451g.m(c1449e, j8);
        if (c1449e.E() == j8) {
            this.f8902i.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, c1449e, i9, z8));
            return;
        }
        throw new IOException(c1449e.E() + " != " + i9);
    }

    void z(int i8, List list, boolean z8) {
        try {
            this.f8902i.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f8897d, Integer.valueOf(i8)}, i8, list, z8));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class j extends L6.b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        final Q6.h f8948b;

        /* loaded from: classes5.dex */
        class a extends L6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q6.i f8950b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, Q6.i iVar) {
                super(str, objArr);
                this.f8950b = iVar;
            }

            @Override // L6.b
            public void e() {
                try {
                    g.this.f8895b.b(this.f8950b);
                } catch (IOException e8) {
                    S6.f.i().p(4, "Http2Connection.Listener failure for " + g.this.f8897d, e8);
                    try {
                        this.f8950b.d(Q6.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes5.dex */
        class b extends L6.b {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // L6.b
            public void e() {
                g gVar = g.this;
                gVar.f8895b.a(gVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class c extends L6.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f8953b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f8953b = mVar;
            }

            @Override // L6.b
            public void e() {
                try {
                    g.this.f8911r.a(this.f8953b);
                } catch (IOException unused) {
                    g.this.k();
                }
            }
        }

        j(Q6.h hVar) {
            super("OkHttp %s", g.this.f8897d);
            this.f8948b = hVar;
        }

        private void f(m mVar) {
            try {
                g.this.f8901h.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f8897d}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // Q6.h.b
        public void a(boolean z8, int i8, InterfaceC1451g interfaceC1451g, int i9) {
            if (g.this.F(i8)) {
                g.this.v(i8, interfaceC1451g, i9, z8);
                return;
            }
            Q6.i p8 = g.this.p(i8);
            if (p8 == null) {
                g.this.N(i8, Q6.b.PROTOCOL_ERROR);
                interfaceC1451g.skip(i9);
            } else {
                p8.m(interfaceC1451g, i9);
                if (z8) {
                    p8.n();
                }
            }
        }

        @Override // Q6.h.b
        public void b(int i8, Q6.b bVar) {
            if (g.this.F(i8)) {
                g.this.E(i8, bVar);
                return;
            }
            Q6.i G8 = g.this.G(i8);
            if (G8 != null) {
                G8.p(bVar);
            }
        }

        @Override // Q6.h.b
        public void c(boolean z8, m mVar) {
            Q6.i[] iVarArr;
            long j8;
            synchronized (g.this) {
                try {
                    int d8 = g.this.f8908o.d();
                    if (z8) {
                        g.this.f8908o.a();
                    }
                    g.this.f8908o.h(mVar);
                    f(mVar);
                    int d9 = g.this.f8908o.d();
                    iVarArr = null;
                    if (d9 != -1 && d9 != d8) {
                        j8 = d9 - d8;
                        g gVar = g.this;
                        if (!gVar.f8909p) {
                            gVar.i(j8);
                            g.this.f8909p = true;
                        }
                        if (!g.this.f8896c.isEmpty()) {
                            iVarArr = (Q6.i[]) g.this.f8896c.values().toArray(new Q6.i[g.this.f8896c.size()]);
                        }
                    } else {
                        j8 = 0;
                    }
                    g.f8893u.execute(new b("OkHttp %s settings", g.this.f8897d));
                } finally {
                }
            }
            if (iVarArr != null && j8 != 0) {
                for (Q6.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j8);
                    }
                }
            }
        }

        @Override // Q6.h.b
        public void d(int i8, Q6.b bVar, C1452h c1452h) {
            Q6.i[] iVarArr;
            c1452h.J();
            synchronized (g.this) {
                iVarArr = (Q6.i[]) g.this.f8896c.values().toArray(new Q6.i[g.this.f8896c.size()]);
                g.this.f8900g = true;
            }
            for (Q6.i iVar : iVarArr) {
                if (iVar.g() > i8 && iVar.j()) {
                    iVar.p(Q6.b.REFUSED_STREAM);
                    g.this.G(iVar.g());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // L6.b
        protected void e() {
            Q6.b bVar;
            Q6.b bVar2;
            Q6.b bVar3 = Q6.b.INTERNAL_ERROR;
            try {
                try {
                    this.f8948b.g(this);
                    do {
                    } while (this.f8948b.b(false, this));
                    bVar2 = Q6.b.NO_ERROR;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    try {
                        g.this.j(bVar, bVar3);
                    } catch (IOException unused2) {
                    }
                    L6.c.d(this.f8948b);
                    throw th;
                }
                try {
                    bVar3 = Q6.b.CANCEL;
                    g.this.j(bVar2, bVar3);
                    bVar = bVar2;
                } catch (IOException unused3) {
                    bVar3 = Q6.b.PROTOCOL_ERROR;
                    g gVar = g.this;
                    gVar.j(bVar3, bVar3);
                    bVar = gVar;
                    L6.c.d(this.f8948b);
                }
                L6.c.d(this.f8948b);
            } catch (Throwable th2) {
                th = th2;
                g.this.j(bVar, bVar3);
                L6.c.d(this.f8948b);
                throw th;
            }
        }

        @Override // Q6.h.b
        public void headers(boolean z8, int i8, int i9, List list) {
            if (g.this.F(i8)) {
                g.this.z(i8, list, z8);
                return;
            }
            synchronized (g.this) {
                try {
                    Q6.i p8 = g.this.p(i8);
                    if (p8 == null) {
                        g gVar = g.this;
                        if (gVar.f8900g) {
                            return;
                        }
                        if (i8 <= gVar.f8898e) {
                            return;
                        }
                        if (i8 % 2 == gVar.f8899f % 2) {
                            return;
                        }
                        Q6.i iVar = new Q6.i(i8, g.this, false, z8, list);
                        g gVar2 = g.this;
                        gVar2.f8898e = i8;
                        gVar2.f8896c.put(Integer.valueOf(i8), iVar);
                        g.f8893u.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f8897d, Integer.valueOf(i8)}, iVar));
                        return;
                    }
                    p8.o(list);
                    if (z8) {
                        p8.n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Q6.h.b
        public void ping(boolean z8, int i8, int i9) {
            if (z8) {
                synchronized (g.this) {
                    g.this.f8904k = false;
                    g.this.notifyAll();
                }
                return;
            }
            try {
                g.this.f8901h.execute(new i(true, i8, i9));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // Q6.h.b
        public void pushPromise(int i8, int i9, List list) {
            g.this.B(i9, list);
        }

        @Override // Q6.h.b
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f8906m += j8;
                    gVar.notifyAll();
                }
                return;
            }
            Q6.i p8 = g.this.p(i8);
            if (p8 != null) {
                synchronized (p8) {
                    p8.a(j8);
                }
            }
        }

        @Override // Q6.h.b
        public void ackSettings() {
        }

        @Override // Q6.h.b
        public void priority(int i8, int i9, int i10, boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f8943a = new a();

        /* loaded from: classes5.dex */
        final class a extends h {
            a() {
            }

            @Override // Q6.g.h
            public void b(Q6.i iVar) {
                iVar.d(Q6.b.REFUSED_STREAM);
            }
        }

        public abstract void b(Q6.i iVar);

        public void a(g gVar) {
        }
    }
}
