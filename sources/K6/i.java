package K6;

import N6.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f5017g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), L6.c.B("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    private final int f5018a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5019b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f5020c;

    /* renamed from: d, reason: collision with root package name */
    private final Deque f5021d;

    /* renamed from: e, reason: collision with root package name */
    final N6.d f5022e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5023f;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a9 = i.this.a(System.nanoTime());
                if (a9 == -1) {
                    return;
                }
                if (a9 > 0) {
                    long j8 = a9 / 1000000;
                    long j9 = a9 - (1000000 * j8);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j8, (int) j9);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int e(N6.c cVar, long j8) {
        List list = cVar.f6828n;
        int i8 = 0;
        while (i8 < list.size()) {
            Reference reference = (Reference) list.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                S6.f.i().q("A connection to " + cVar.p().a().l() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f6857a);
                list.remove(i8);
                cVar.f6825k = true;
                if (list.isEmpty()) {
                    cVar.f6829o = j8 - this.f5019b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j8) {
        synchronized (this) {
            try {
                N6.c cVar = null;
                long j9 = Long.MIN_VALUE;
                int i8 = 0;
                int i9 = 0;
                for (N6.c cVar2 : this.f5021d) {
                    if (e(cVar2, j8) > 0) {
                        i9++;
                    } else {
                        i8++;
                        long j10 = j8 - cVar2.f6829o;
                        if (j10 > j9) {
                            cVar = cVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f5019b;
                if (j9 < j11 && i8 <= this.f5018a) {
                    if (i8 > 0) {
                        return j11 - j9;
                    }
                    if (i9 > 0) {
                        return j11;
                    }
                    this.f5023f = false;
                    return -1L;
                }
                this.f5021d.remove(cVar);
                L6.c.e(cVar.q());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(N6.c cVar) {
        if (!cVar.f6825k && this.f5018a != 0) {
            notifyAll();
            return false;
        }
        this.f5021d.remove(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket c(C1320a c1320a, N6.g gVar) {
        for (N6.c cVar : this.f5021d) {
            if (cVar.k(c1320a, null) && cVar.m() && cVar != gVar.c()) {
                return gVar.l(cVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N6.c d(C1320a c1320a, N6.g gVar, B b9) {
        for (N6.c cVar : this.f5021d) {
            if (cVar.k(c1320a, b9)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(N6.c cVar) {
        if (!this.f5023f) {
            this.f5023f = true;
            f5017g.execute(this.f5020c);
        }
        this.f5021d.add(cVar);
    }

    public i(int i8, long j8, TimeUnit timeUnit) {
        this.f5020c = new a();
        this.f5021d = new ArrayDeque();
        this.f5022e = new N6.d();
        this.f5018a = i8;
        this.f5019b = timeUnit.toNanos(j8);
        if (j8 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j8);
    }
}
