package U6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1447c extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f10198i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f10199j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f10200k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f10201l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f10202m;

    /* renamed from: n, reason: collision with root package name */
    private static C1447c f10203n;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10204f;

    /* renamed from: g, reason: collision with root package name */
    private C1447c f10205g;

    /* renamed from: h, reason: collision with root package name */
    private long f10206h;

    /* renamed from: U6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C1447c c1447c) {
            ReentrantLock f8 = C1447c.f10198i.f();
            f8.lock();
            try {
                if (c1447c.f10204f) {
                    c1447c.f10204f = false;
                    for (C1447c c1447c2 = C1447c.f10203n; c1447c2 != null; c1447c2 = c1447c2.f10205g) {
                        if (c1447c2.f10205g == c1447c) {
                            c1447c2.f10205g = c1447c.f10205g;
                            c1447c.f10205g = null;
                            return false;
                        }
                    }
                    f8.unlock();
                    return true;
                }
                return false;
            } finally {
                f8.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1447c c1447c, long j8, boolean z8) {
            ReentrantLock f8 = C1447c.f10198i.f();
            f8.lock();
            try {
                if (!c1447c.f10204f) {
                    c1447c.f10204f = true;
                    if (C1447c.f10203n == null) {
                        C1447c.f10203n = new C1447c();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j8 != 0 && z8) {
                        c1447c.f10206h = Math.min(j8, c1447c.c() - nanoTime) + nanoTime;
                    } else if (j8 != 0) {
                        c1447c.f10206h = j8 + nanoTime;
                    } else if (z8) {
                        c1447c.f10206h = c1447c.c();
                    } else {
                        throw new AssertionError();
                    }
                    long y8 = c1447c.y(nanoTime);
                    C1447c c1447c2 = C1447c.f10203n;
                    AbstractC3292y.f(c1447c2);
                    while (c1447c2.f10205g != null) {
                        C1447c c1447c3 = c1447c2.f10205g;
                        AbstractC3292y.f(c1447c3);
                        if (y8 < c1447c3.y(nanoTime)) {
                            break;
                        }
                        c1447c2 = c1447c2.f10205g;
                        AbstractC3292y.f(c1447c2);
                    }
                    c1447c.f10205g = c1447c2.f10205g;
                    c1447c2.f10205g = c1447c;
                    if (c1447c2 == C1447c.f10203n) {
                        C1447c.f10198i.e().signal();
                    }
                    Q5.I i8 = Q5.I.f8786a;
                    f8.unlock();
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } catch (Throwable th) {
                f8.unlock();
                throw th;
            }
        }

        public final C1447c c() {
            C1447c c1447c = C1447c.f10203n;
            AbstractC3292y.f(c1447c);
            C1447c c1447c2 = c1447c.f10205g;
            if (c1447c2 != null) {
                long y8 = c1447c2.y(System.nanoTime());
                if (y8 <= 0) {
                    C1447c c1447c3 = C1447c.f10203n;
                    AbstractC3292y.f(c1447c3);
                    c1447c3.f10205g = c1447c2.f10205g;
                    c1447c2.f10205g = null;
                    return c1447c2;
                }
                e().await(y8, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            e().await(C1447c.f10201l, TimeUnit.MILLISECONDS);
            C1447c c1447c4 = C1447c.f10203n;
            AbstractC3292y.f(c1447c4);
            if (c1447c4.f10205g == null && System.nanoTime() - nanoTime >= C1447c.f10202m) {
                return C1447c.f10203n;
            }
            return null;
        }

        public final Condition e() {
            return C1447c.f10200k;
        }

        public final ReentrantLock f() {
            return C1447c.f10199j;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U6.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f8;
            C1447c c8;
            while (true) {
                try {
                    a aVar = C1447c.f10198i;
                    f8 = aVar.f();
                    f8.lock();
                    try {
                        c8 = aVar.c();
                    } finally {
                        f8.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c8 == C1447c.f10203n) {
                    C1447c.f10203n = null;
                    return;
                }
                Q5.I i8 = Q5.I.f8786a;
                f8.unlock();
                if (c8 != null) {
                    c8.B();
                }
            }
        }
    }

    /* renamed from: U6.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0216c implements X {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X f10208b;

        C0216c(X x8) {
            this.f10208b = x8;
        }

        @Override // U6.X
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1447c timeout() {
            return C1447c.this;
        }

        @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1447c c1447c = C1447c.this;
            X x8 = this.f10208b;
            c1447c.v();
            try {
                x8.close();
                Q5.I i8 = Q5.I.f8786a;
                if (!c1447c.w()) {
                } else {
                    throw c1447c.p(null);
                }
            } catch (IOException e8) {
                if (!c1447c.w()) {
                    throw e8;
                }
                throw c1447c.p(e8);
            } finally {
                c1447c.w();
            }
        }

        @Override // U6.X
        public void f(C1449e source, long j8) {
            AbstractC3292y.i(source, "source");
            AbstractC1446b.b(source.E(), 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 > 0) {
                    U u8 = source.f10211a;
                    AbstractC3292y.f(u8);
                    while (true) {
                        if (j9 >= 65536) {
                            break;
                        }
                        j9 += u8.f10170c - u8.f10169b;
                        if (j9 >= j8) {
                            j9 = j8;
                            break;
                        } else {
                            u8 = u8.f10173f;
                            AbstractC3292y.f(u8);
                        }
                    }
                    C1447c c1447c = C1447c.this;
                    X x8 = this.f10208b;
                    c1447c.v();
                    try {
                        x8.f(source, j9);
                        Q5.I i8 = Q5.I.f8786a;
                        if (!c1447c.w()) {
                            j8 -= j9;
                        } else {
                            throw c1447c.p(null);
                        }
                    } catch (IOException e8) {
                        if (!c1447c.w()) {
                            throw e8;
                        }
                        throw c1447c.p(e8);
                    } finally {
                        c1447c.w();
                    }
                } else {
                    return;
                }
            }
        }

        @Override // U6.X, java.io.Flushable
        public void flush() {
            C1447c c1447c = C1447c.this;
            X x8 = this.f10208b;
            c1447c.v();
            try {
                x8.flush();
                Q5.I i8 = Q5.I.f8786a;
                if (!c1447c.w()) {
                } else {
                    throw c1447c.p(null);
                }
            } catch (IOException e8) {
                if (!c1447c.w()) {
                    throw e8;
                }
                throw c1447c.p(e8);
            } finally {
                c1447c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f10208b + ')';
        }
    }

    /* renamed from: U6.c$d */
    /* loaded from: classes5.dex */
    public static final class d implements Z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z f10210b;

        d(Z z8) {
            this.f10210b = z8;
        }

        @Override // U6.Z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1447c timeout() {
            return C1447c.this;
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C1447c c1447c = C1447c.this;
            Z z8 = this.f10210b;
            c1447c.v();
            try {
                z8.close();
                Q5.I i8 = Q5.I.f8786a;
                if (!c1447c.w()) {
                } else {
                    throw c1447c.p(null);
                }
            } catch (IOException e8) {
                if (!c1447c.w()) {
                    throw e8;
                }
                throw c1447c.p(e8);
            } finally {
                c1447c.w();
            }
        }

        @Override // U6.Z
        public long m(C1449e sink, long j8) {
            AbstractC3292y.i(sink, "sink");
            C1447c c1447c = C1447c.this;
            Z z8 = this.f10210b;
            c1447c.v();
            try {
                long m8 = z8.m(sink, j8);
                if (!c1447c.w()) {
                    return m8;
                }
                throw c1447c.p(null);
            } catch (IOException e8) {
                if (!c1447c.w()) {
                    throw e8;
                }
                throw c1447c.p(e8);
            } finally {
                c1447c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f10210b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f10199j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC3292y.h(newCondition, "lock.newCondition()");
        f10200k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f10201l = millis;
        f10202m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j8) {
        return this.f10206h - j8;
    }

    public final Z A(Z source) {
        AbstractC3292y.i(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h8 = h();
        boolean e8 = e();
        if (h8 != 0 || e8) {
            f10198i.g(this, h8, e8);
        }
    }

    public final boolean w() {
        return f10198i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final X z(X sink) {
        AbstractC3292y.i(sink, "sink");
        return new C0216c(sink);
    }

    protected void B() {
    }
}
