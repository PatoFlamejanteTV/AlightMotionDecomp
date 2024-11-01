package p0;

import Q.AbstractC1396p;
import V.g;
import V.n;
import V.p;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import g0.AbstractC2885h;
import g0.C2879b;
import g0.C2886i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3551a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f36077r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f36078s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f36079t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile InterfaceC3555e f36080u = new C3553c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f36081a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f36082b;

    /* renamed from: c, reason: collision with root package name */
    private int f36083c;

    /* renamed from: d, reason: collision with root package name */
    private Future f36084d;

    /* renamed from: e, reason: collision with root package name */
    private long f36085e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f36086f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36087g;

    /* renamed from: h, reason: collision with root package name */
    private int f36088h;

    /* renamed from: i, reason: collision with root package name */
    C2879b f36089i;

    /* renamed from: j, reason: collision with root package name */
    private V.d f36090j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f36091k;

    /* renamed from: l, reason: collision with root package name */
    private final String f36092l;

    /* renamed from: m, reason: collision with root package name */
    private final String f36093m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f36094n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f36095o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f36096p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f36097q;

    public C3551a(Context context, int i8, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f36081a = new Object();
        this.f36083c = 0;
        this.f36086f = new HashSet();
        this.f36087g = true;
        this.f36090j = g.b();
        this.f36095o = new HashMap();
        this.f36096p = new AtomicInteger(0);
        AbstractC1396p.m(context, "WakeLock: context must not be null");
        AbstractC1396p.g(str, "WakeLock: wakeLockName must not be empty");
        this.f36094n = context.getApplicationContext();
        this.f36093m = str;
        this.f36089i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f36092l = str2;
        } else {
            this.f36092l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i8, str);
            this.f36082b = newWakeLock;
            if (p.c(context)) {
                WorkSource b9 = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
                this.f36091k = b9;
                if (b9 != null) {
                    i(newWakeLock, b9);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f36078s;
            if (scheduledExecutorService == null) {
                synchronized (f36079t) {
                    try {
                        scheduledExecutorService = f36078s;
                        if (scheduledExecutorService == null) {
                            AbstractC2885h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f36078s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f36097q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C2886i(sb.toString());
    }

    public static /* synthetic */ void e(C3551a c3551a) {
        synchronized (c3551a.f36081a) {
            try {
                if (!c3551a.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(c3551a.f36092l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c3551a.g();
                if (!c3551a.b()) {
                    return;
                }
                c3551a.f36083c = 1;
                c3551a.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f36087g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f36086f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f36086f);
        this.f36086f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i8) {
        synchronized (this.f36081a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f36087g) {
                    int i9 = this.f36083c - 1;
                    this.f36083c = i9;
                    if (i9 > 0) {
                        return;
                    }
                } else {
                    this.f36083c = 0;
                }
                g();
                Iterator it = this.f36095o.values().iterator();
                while (it.hasNext()) {
                    ((C3554d) it.next()).f36099a = 0;
                }
                this.f36095o.clear();
                Future future = this.f36084d;
                if (future != null) {
                    future.cancel(false);
                    this.f36084d = null;
                    this.f36085e = 0L;
                }
                this.f36088h = 0;
                if (this.f36082b.isHeld()) {
                    try {
                        try {
                            this.f36082b.release();
                            if (this.f36089i != null) {
                                this.f36089i = null;
                            }
                        } catch (RuntimeException e8) {
                            if (e8.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.f36092l).concat(" failed to release!"), e8);
                                if (this.f36089i != null) {
                                    this.f36089i = null;
                                }
                            } else {
                                throw e8;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f36089i != null) {
                            this.f36089i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f36092l).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
            Log.wtf("WakeLock", e8.toString());
        }
    }

    public void a(long j8) {
        this.f36096p.incrementAndGet();
        long j9 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f36077r), 1L);
        if (j8 > 0) {
            max = Math.min(j8, max);
        }
        synchronized (this.f36081a) {
            try {
                if (!b()) {
                    this.f36089i = C2879b.a(false, null);
                    this.f36082b.acquire();
                    this.f36090j.elapsedRealtime();
                }
                this.f36083c++;
                this.f36088h++;
                f(null);
                C3554d c3554d = (C3554d) this.f36095o.get(null);
                if (c3554d == null) {
                    c3554d = new C3554d(null);
                    this.f36095o.put(null, c3554d);
                }
                c3554d.f36099a++;
                long elapsedRealtime = this.f36090j.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j9 = elapsedRealtime + max;
                }
                if (j9 > this.f36085e) {
                    this.f36085e = j9;
                    Future future = this.f36084d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f36084d = this.f36097q.schedule(new Runnable() { // from class: p0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3551a.e(C3551a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z8;
        synchronized (this.f36081a) {
            if (this.f36083c > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void c() {
        if (this.f36096p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f36092l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f36081a) {
            try {
                f(null);
                if (this.f36095o.containsKey(null)) {
                    C3554d c3554d = (C3554d) this.f36095o.get(null);
                    if (c3554d != null) {
                        int i8 = c3554d.f36099a - 1;
                        c3554d.f36099a = i8;
                        if (i8 == 0) {
                            this.f36095o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f36092l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z8) {
        synchronized (this.f36081a) {
            this.f36087g = z8;
        }
    }
}
