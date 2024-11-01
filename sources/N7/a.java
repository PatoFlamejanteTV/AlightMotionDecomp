package N7;

import P7.c;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class a implements e {

    /* renamed from: q, reason: collision with root package name */
    private static final String f6858q = M7.b.i(a.class);

    /* renamed from: b, reason: collision with root package name */
    private final h f6860b;

    /* renamed from: d, reason: collision with root package name */
    private final P7.c f6862d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6863e;

    /* renamed from: f, reason: collision with root package name */
    private final l f6864f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f6859a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Semaphore f6861c = new Semaphore(0);

    /* renamed from: g, reason: collision with root package name */
    private volatile int f6865g = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f6866h = 120000;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f6867i = 0;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f6868j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6869k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile d f6870l = d.ALWAYS;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f6871m = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile Thread f6872n = null;

    /* renamed from: o, reason: collision with root package name */
    private List f6873o = null;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f6874p = new RunnableC0131a();

    /* renamed from: N7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0131a implements Runnable {
        RunnableC0131a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean c8;
            a.this.f6867i = 0;
            while (a.this.f6871m) {
                try {
                    long j8 = a.this.f6866h;
                    if (a.this.f6867i > 1) {
                        j8 += Math.min(a.this.f6867i * a.this.f6866h, a.this.f6866h * 5);
                    }
                    a.this.f6861c.tryAcquire(j8, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e8) {
                    V7.a.b(a.f6858q).d(e8);
                }
                if (a.this.f6860b.e(a.this.q())) {
                    ArrayList arrayList = new ArrayList();
                    a.this.f6860b.b(arrayList);
                    V7.a.b(a.f6858q).a("Drained %s events.", Integer.valueOf(arrayList.size()));
                    Iterator it = a.this.f6863e.c(arrayList).iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        j jVar = (j) it.next();
                        if (a.this.f6873o != null) {
                            V7.a.b(a.f6858q).a("DryRun, stored HttpRequest, now %d.", Integer.valueOf(a.this.f6873o.size()));
                            c8 = a.this.f6873o.add(jVar);
                        } else {
                            c8 = a.this.f6864f.c(jVar);
                        }
                        if (c8) {
                            i8 += jVar.a();
                            a.this.f6867i = 0;
                            if (!a.this.q()) {
                                V7.a.b(a.f6858q).a("Disconnected during dispatch loop", new Object[0]);
                                break;
                            }
                        } else {
                            V7.a.b(a.f6858q).a("Failure while trying to send packet", new Object[0]);
                            a.this.f6867i++;
                            break;
                        }
                    }
                    V7.a.b(a.f6858q).a("Dispatched %d events.", Integer.valueOf(i8));
                    if (i8 < arrayList.size()) {
                        V7.a.b(a.f6858q).a("Unable to send all events, requeueing %d events", Integer.valueOf(arrayList.size() - i8));
                        a.this.f6860b.d(arrayList.subList(i8, arrayList.size()));
                        a.this.f6860b.e(a.this.q());
                    }
                }
                synchronized (a.this.f6859a) {
                    try {
                        if (!a.this.f6868j && !a.this.f6860b.c() && a.this.f6866h >= 0) {
                        }
                        a.this.f6871m = false;
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6876a;

        static {
            int[] iArr = new int[d.values().length];
            f6876a = iArr;
            try {
                iArr[d.EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6876a[d.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6876a[d.WIFI_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(h hVar, P7.c cVar, k kVar, l lVar) {
        this.f6862d = cVar;
        this.f6860b = hVar;
        this.f6863e = kVar;
        this.f6864f = lVar;
        lVar.b(this.f6869k);
        lVar.a(this.f6865g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!this.f6862d.b()) {
            return false;
        }
        int i8 = b.f6876a[this.f6870l.ordinal()];
        if (i8 == 2) {
            return true;
        }
        if (i8 != 3 || this.f6862d.a() != c.a.WIFI) {
            return false;
        }
        return true;
    }

    private boolean r() {
        synchronized (this.f6859a) {
            try {
                if (!this.f6871m) {
                    this.f6871m = true;
                    Thread thread = new Thread(this.f6874p);
                    thread.setPriority(1);
                    thread.setName("Matomo-default-dispatcher");
                    this.f6872n = thread;
                    thread.start();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N7.e
    public void a(M7.d dVar) {
        this.f6860b.a(new g(dVar.e()));
        if (this.f6866h != -1) {
            r();
        }
    }

    @Override // N7.e
    public void b(d dVar) {
        this.f6870l = dVar;
    }
}
