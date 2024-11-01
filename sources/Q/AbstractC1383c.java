package Q;

import N.C1339b;
import N.C1341d;
import N.C1345h;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Q.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1383c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f8180A;

    /* renamed from: B, reason: collision with root package name */
    private volatile h0 f8181B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f8182C;

    /* renamed from: a, reason: collision with root package name */
    private int f8183a;

    /* renamed from: b, reason: collision with root package name */
    private long f8184b;

    /* renamed from: c, reason: collision with root package name */
    private long f8185c;

    /* renamed from: d, reason: collision with root package name */
    private int f8186d;

    /* renamed from: e, reason: collision with root package name */
    private long f8187e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f8188f;

    /* renamed from: g, reason: collision with root package name */
    s0 f8189g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f8190h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f8191i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC1388h f8192j;

    /* renamed from: k, reason: collision with root package name */
    private final C1345h f8193k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f8194l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f8195m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f8196n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1392l f8197o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0162c f8198p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f8199q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f8200r;

    /* renamed from: s, reason: collision with root package name */
    private e0 f8201s;

    /* renamed from: t, reason: collision with root package name */
    private int f8202t;

    /* renamed from: u, reason: collision with root package name */
    private final a f8203u;

    /* renamed from: v, reason: collision with root package name */
    private final b f8204v;

    /* renamed from: w, reason: collision with root package name */
    private final int f8205w;

    /* renamed from: x, reason: collision with root package name */
    private final String f8206x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f8207y;

    /* renamed from: z, reason: collision with root package name */
    private C1339b f8208z;

    /* renamed from: E, reason: collision with root package name */
    private static final C1341d[] f8179E = new C1341d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f8178D = {"service_esmobile", "service_googleme"};

    /* renamed from: Q.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        void h(int i8);

        void k(Bundle bundle);
    }

    /* renamed from: Q.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        void i(C1339b c1339b);
    }

    /* renamed from: Q.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0162c {
        void b(C1339b c1339b);
    }

    /* renamed from: Q.c$d */
    /* loaded from: classes3.dex */
    protected class d implements InterfaceC0162c {
        public d() {
        }

        @Override // Q.AbstractC1383c.InterfaceC0162c
        public final void b(C1339b c1339b) {
            if (c1339b.z()) {
                AbstractC1383c abstractC1383c = AbstractC1383c.this;
                abstractC1383c.m(null, abstractC1383c.C());
            } else if (AbstractC1383c.this.f8204v != null) {
                AbstractC1383c.this.f8204v.i(c1339b);
            }
        }
    }

    /* renamed from: Q.c$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1383c(android.content.Context r10, android.os.Looper r11, int r12, Q.AbstractC1383c.a r13, Q.AbstractC1383c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            Q.h r3 = Q.AbstractC1388h.a(r10)
            N.h r4 = N.C1345h.f()
            Q.AbstractC1396p.l(r13)
            Q.AbstractC1396p.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC1383c.<init>(android.content.Context, android.os.Looper, int, Q.c$a, Q.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c0(AbstractC1383c abstractC1383c, h0 h0Var) {
        r I8;
        abstractC1383c.f8181B = h0Var;
        if (abstractC1383c.S()) {
            C1385e c1385e = h0Var.f8268d;
            C1397q b9 = C1397q.b();
            if (c1385e == null) {
                I8 = null;
            } else {
                I8 = c1385e.I();
            }
            b9.c(I8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d0(AbstractC1383c abstractC1383c, int i8) {
        int i9;
        int i10;
        synchronized (abstractC1383c.f8195m) {
            i9 = abstractC1383c.f8202t;
        }
        if (i9 == 3) {
            abstractC1383c.f8180A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC1383c.f8194l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC1383c.f8182C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean g0(AbstractC1383c abstractC1383c, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC1383c.f8195m) {
            try {
                if (abstractC1383c.f8202t != i8) {
                    return false;
                }
                abstractC1383c.i0(i9, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "<parameter1>" is null
        	at java.base/java.util.BitSet.or(Unknown Source)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean h0(Q.AbstractC1383c r2) {
        /*
            boolean r0 = r2.f8180A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC1383c.h0(Q.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i8, IInterface iInterface) {
        boolean z8;
        boolean z9;
        s0 s0Var;
        s0 s0Var2;
        boolean z10 = false;
        if (i8 != 4) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (iInterface == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 == z9) {
            z10 = true;
        }
        AbstractC1396p.a(z10);
        synchronized (this.f8195m) {
            try {
                this.f8202t = i8;
                this.f8199q = iInterface;
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        if (i8 == 4) {
                            AbstractC1396p.l(iInterface);
                            K(iInterface);
                        }
                    } else {
                        e0 e0Var = this.f8201s;
                        if (e0Var != null && (s0Var2 = this.f8189g) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + s0Var2.b() + " on " + s0Var2.a());
                            AbstractC1388h abstractC1388h = this.f8192j;
                            String b9 = this.f8189g.b();
                            AbstractC1396p.l(b9);
                            abstractC1388h.d(b9, this.f8189g.a(), 4225, e0Var, X(), this.f8189g.c());
                            this.f8182C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.f8182C.get());
                        this.f8201s = e0Var2;
                        if (this.f8202t == 3 && B() != null) {
                            s0Var = new s0(y().getPackageName(), B(), true, 4225, false);
                        } else {
                            s0Var = new s0(G(), F(), false, 4225, I());
                        }
                        this.f8189g = s0Var;
                        if (s0Var.c() && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8189g.b())));
                        }
                        AbstractC1388h abstractC1388h2 = this.f8192j;
                        String b10 = this.f8189g.b();
                        AbstractC1396p.l(b10);
                        if (!abstractC1388h2.e(new l0(b10, this.f8189g.a(), 4225, this.f8189g.c()), e0Var2, X(), w())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f8189g.b() + " on " + this.f8189g.a());
                            e0(16, null, this.f8182C.get());
                        }
                    }
                } else {
                    e0 e0Var3 = this.f8201s;
                    if (e0Var3 != null) {
                        AbstractC1388h abstractC1388h3 = this.f8192j;
                        String b11 = this.f8189g.b();
                        AbstractC1396p.l(b11);
                        abstractC1388h3.d(b11, this.f8189g.a(), 4225, e0Var3, X(), this.f8189g.c());
                        this.f8201s = null;
                    }
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f8195m) {
            try {
                if (this.f8202t != 5) {
                    r();
                    iInterface = this.f8199q;
                    AbstractC1396p.m(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C1385e H() {
        h0 h0Var = this.f8181B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8268d;
    }

    protected boolean I() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.f8181B != null) {
            return true;
        }
        return false;
    }

    protected void K(IInterface iInterface) {
        this.f8185c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(C1339b c1339b) {
        this.f8186d = c1339b.s();
        this.f8187e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i8) {
        this.f8183a = i8;
        this.f8184b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f8194l.sendMessage(this.f8194l.obtainMessage(1, i9, -1, new f0(this, i8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f8207y = str;
    }

    public void Q(int i8) {
        this.f8194l.sendMessage(this.f8194l.obtainMessage(6, this.f8182C.get(), i8));
    }

    protected void R(InterfaceC0162c interfaceC0162c, int i8, PendingIntent pendingIntent) {
        AbstractC1396p.m(interfaceC0162c, "Connection progress callbacks cannot be null.");
        this.f8198p = interfaceC0162c;
        this.f8194l.sendMessage(this.f8194l.obtainMessage(3, this.f8182C.get(), i8, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f8206x;
        if (str == null) {
            return this.f8190h.getClass().getName();
        }
        return str;
    }

    public void b() {
        this.f8182C.incrementAndGet();
        synchronized (this.f8200r) {
            try {
                int size = this.f8200r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((c0) this.f8200r.get(i8)).d();
                }
                this.f8200r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8196n) {
            this.f8197o = null;
        }
        i0(1, null);
    }

    public void d(String str) {
        this.f8188f = str;
        b();
    }

    public void e(e eVar) {
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0(int i8, Bundle bundle, int i9) {
        this.f8194l.sendMessage(this.f8194l.obtainMessage(7, i9, -1, new g0(this, i8, null)));
    }

    public boolean f() {
        boolean z8;
        synchronized (this.f8195m) {
            int i8 = this.f8202t;
            z8 = true;
            if (i8 != 2 && i8 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    public String g() {
        s0 s0Var;
        if (h() && (s0Var = this.f8189g) != null) {
            return s0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public boolean h() {
        boolean z8;
        synchronized (this.f8195m) {
            if (this.f8202t == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public boolean i() {
        return true;
    }

    public void j(InterfaceC0162c interfaceC0162c) {
        AbstractC1396p.m(interfaceC0162c, "Connection progress callbacks cannot be null.");
        this.f8198p = interfaceC0162c;
        i0(2, null);
    }

    public abstract int k();

    public final C1341d[] l() {
        h0 h0Var = this.f8181B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8266b;
    }

    public void m(InterfaceC1390j interfaceC1390j, Set set) {
        Bundle A8 = A();
        String str = this.f8207y;
        int i8 = C1345h.f6365a;
        Scope[] scopeArr = C1386f.f8238o;
        Bundle bundle = new Bundle();
        int i9 = this.f8205w;
        C1341d[] c1341dArr = C1386f.f8239p;
        C1386f c1386f = new C1386f(6, i9, i8, null, null, scopeArr, bundle, null, c1341dArr, c1341dArr, true, 0, false, str);
        c1386f.f8243d = this.f8190h.getPackageName();
        c1386f.f8246g = A8;
        if (set != null) {
            c1386f.f8245f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u8 = u();
            if (u8 == null) {
                u8 = new Account("<<default account>>", "com.google");
            }
            c1386f.f8247h = u8;
            if (interfaceC1390j != null) {
                c1386f.f8244e = interfaceC1390j.asBinder();
            }
        } else if (O()) {
            c1386f.f8247h = u();
        }
        c1386f.f8248i = f8179E;
        c1386f.f8249j = v();
        if (S()) {
            c1386f.f8252m = true;
        }
        try {
            synchronized (this.f8196n) {
                try {
                    InterfaceC1392l interfaceC1392l = this.f8197o;
                    if (interfaceC1392l != null) {
                        interfaceC1392l.c0(new d0(this, this.f8182C.get()), c1386f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            Q(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8182C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8182C.get());
        }
    }

    public String n() {
        return this.f8188f;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h8 = this.f8193k.h(this.f8190h, k());
        if (h8 != 0) {
            i0(1, null);
            R(new d(), h8, null);
        } else {
            j(new d());
        }
    }

    protected final void r() {
        if (h()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C1341d[] v() {
        return f8179E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f8190h;
    }

    public int z() {
        return this.f8205w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1383c(Context context, Looper looper, AbstractC1388h abstractC1388h, C1345h c1345h, int i8, a aVar, b bVar, String str) {
        this.f8188f = null;
        this.f8195m = new Object();
        this.f8196n = new Object();
        this.f8200r = new ArrayList();
        this.f8202t = 1;
        this.f8208z = null;
        this.f8180A = false;
        this.f8181B = null;
        this.f8182C = new AtomicInteger(0);
        AbstractC1396p.m(context, "Context must not be null");
        this.f8190h = context;
        AbstractC1396p.m(looper, "Looper must not be null");
        this.f8191i = looper;
        AbstractC1396p.m(abstractC1388h, "Supervisor must not be null");
        this.f8192j = abstractC1388h;
        AbstractC1396p.m(c1345h, "API availability must not be null");
        this.f8193k = c1345h;
        this.f8194l = new b0(this, looper);
        this.f8205w = i8;
        this.f8203u = aVar;
        this.f8204v = bVar;
        this.f8206x = str;
    }
}
