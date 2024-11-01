package Q0;

import G0.g;
import J0.A;
import J0.N;
import J0.c0;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.C3626l;
import s.AbstractC3937d;
import s.f;
import s.i;
import s.k;
import u.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f8335a;

    /* renamed from: b, reason: collision with root package name */
    private final double f8336b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8337c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8338d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8339e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f8340f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f8341g;

    /* renamed from: h, reason: collision with root package name */
    private final i f8342h;

    /* renamed from: i, reason: collision with root package name */
    private final N f8343i;

    /* renamed from: j, reason: collision with root package name */
    private int f8344j;

    /* renamed from: k, reason: collision with root package name */
    private long f8345k;

    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final A f8346a;

        /* renamed from: b, reason: collision with root package name */
        private final C3626l f8347b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f8346a, this.f8347b);
            e.this.f8343i.c();
            double g8 = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g8 / 1000.0d)) + " s for report: " + this.f8346a.d());
            e.q(g8);
        }

        private b(A a9, C3626l c3626l) {
            this.f8346a = a9;
            this.f8347b = c3626l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(i iVar, R0.d dVar, N n8) {
        this(dVar.f9117f, dVar.f9118g, dVar.f9119h * 1000, iVar, n8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f8335a) * Math.pow(this.f8336b, h()));
    }

    private int h() {
        int max;
        if (this.f8345k == 0) {
            this.f8345k = o();
        }
        int o8 = (int) ((o() - this.f8345k) / this.f8337c);
        if (l()) {
            max = Math.min(100, this.f8344j + o8);
        } else {
            max = Math.max(0, this.f8344j - o8);
        }
        if (this.f8344j != max) {
            this.f8344j = max;
            this.f8345k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f8340f.size() < this.f8339e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f8340f.size() == this.f8339e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f8342h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C3626l c3626l, boolean z8, A a9, Exception exc) {
        if (exc != null) {
            c3626l.d(exc);
            return;
        }
        if (z8) {
            j();
        }
        c3626l.e(a9);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final A a9, final C3626l c3626l) {
        final boolean z8;
        g.f().b("Sending report through Google DataTransport: " + a9.d());
        if (SystemClock.elapsedRealtime() - this.f8338d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8342h.a(AbstractC3937d.h(a9.b()), new k() { // from class: Q0.c
            @Override // s.k
            public final void a(Exception exc) {
                e.this.n(c3626l, z8, a9, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d8) {
        try {
            Thread.sleep((long) d8);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3626l i(A a9, boolean z8) {
        synchronized (this.f8340f) {
            try {
                C3626l c3626l = new C3626l();
                if (z8) {
                    this.f8343i.b();
                    if (k()) {
                        g.f().b("Enqueueing report: " + a9.d());
                        g.f().b("Queue size: " + this.f8340f.size());
                        this.f8341g.execute(new b(a9, c3626l));
                        g.f().b("Closing task for report: " + a9.d());
                        c3626l.e(a9);
                        return c3626l;
                    }
                    h();
                    g.f().b("Dropping report due to queue being full: " + a9.d());
                    this.f8343i.a();
                    c3626l.e(a9);
                    return c3626l;
                }
                p(a9, c3626l);
                return c3626l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: Q0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        c0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d8, double d9, long j8, i iVar, N n8) {
        this.f8335a = d8;
        this.f8336b = d9;
        this.f8337c = j8;
        this.f8342h = iVar;
        this.f8343i = n8;
        this.f8338d = SystemClock.elapsedRealtime();
        int i8 = (int) d8;
        this.f8339e = i8;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i8);
        this.f8340f = arrayBlockingQueue;
        this.f8341g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f8344j = 0;
        this.f8345k = 0L;
    }
}
