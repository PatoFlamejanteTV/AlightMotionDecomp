package U6;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1453i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10226a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10227b;

    /* renamed from: c, reason: collision with root package name */
    private int f10228c;

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f10229d = c0.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U6.i$a */
    /* loaded from: classes5.dex */
    public static final class a implements X {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1453i f10230a;

        /* renamed from: b, reason: collision with root package name */
        private long f10231b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10232c;

        public a(AbstractC1453i fileHandle, long j8) {
            AbstractC3292y.i(fileHandle, "fileHandle");
            this.f10230a = fileHandle;
            this.f10231b = j8;
        }

        @Override // U6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f10232c) {
                return;
            }
            this.f10232c = true;
            ReentrantLock j8 = this.f10230a.j();
            j8.lock();
            try {
                AbstractC1453i abstractC1453i = this.f10230a;
                abstractC1453i.f10228c--;
                if (this.f10230a.f10228c == 0 && this.f10230a.f10227b) {
                    Q5.I i8 = Q5.I.f8786a;
                    j8.unlock();
                    this.f10230a.k();
                }
            } finally {
                j8.unlock();
            }
        }

        @Override // U6.X
        public void f(C1449e source, long j8) {
            AbstractC3292y.i(source, "source");
            if (!this.f10232c) {
                this.f10230a.F(this.f10231b, source, j8);
                this.f10231b += j8;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // U6.X, java.io.Flushable
        public void flush() {
            if (!this.f10232c) {
                this.f10230a.p();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // U6.X
        public a0 timeout() {
            return a0.f10186e;
        }
    }

    /* renamed from: U6.i$b */
    /* loaded from: classes5.dex */
    private static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1453i f10233a;

        /* renamed from: b, reason: collision with root package name */
        private long f10234b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10235c;

        public b(AbstractC1453i fileHandle, long j8) {
            AbstractC3292y.i(fileHandle, "fileHandle");
            this.f10233a = fileHandle;
            this.f10234b = j8;
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f10235c) {
                return;
            }
            this.f10235c = true;
            ReentrantLock j8 = this.f10233a.j();
            j8.lock();
            try {
                AbstractC1453i abstractC1453i = this.f10233a;
                abstractC1453i.f10228c--;
                if (this.f10233a.f10228c == 0 && this.f10233a.f10227b) {
                    Q5.I i8 = Q5.I.f8786a;
                    j8.unlock();
                    this.f10233a.k();
                }
            } finally {
                j8.unlock();
            }
        }

        @Override // U6.Z
        public long m(C1449e sink, long j8) {
            AbstractC3292y.i(sink, "sink");
            if (!this.f10235c) {
                long u8 = this.f10233a.u(this.f10234b, sink, j8);
                if (u8 != -1) {
                    this.f10234b += u8;
                }
                return u8;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // U6.Z
        public a0 timeout() {
            return a0.f10186e;
        }
    }

    public AbstractC1453i(boolean z8) {
        this.f10226a = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j8, C1449e c1449e, long j9) {
        AbstractC1446b.b(c1449e.E(), 0L, j9);
        long j10 = j9 + j8;
        while (j8 < j10) {
            U u8 = c1449e.f10211a;
            AbstractC3292y.f(u8);
            int min = (int) Math.min(j10 - j8, u8.f10170c - u8.f10169b);
            t(j8, u8.f10168a, u8.f10169b, min);
            u8.f10169b += min;
            long j11 = min;
            j8 += j11;
            c1449e.B(c1449e.E() - j11);
            if (u8.f10169b == u8.f10170c) {
                c1449e.f10211a = u8.b();
                V.b(u8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j8, C1449e c1449e, long j9) {
        if (j9 >= 0) {
            long j10 = j9 + j8;
            long j11 = j8;
            while (true) {
                if (j11 >= j10) {
                    break;
                }
                U H8 = c1449e.H(1);
                int q8 = q(j11, H8.f10168a, H8.f10170c, (int) Math.min(j10 - j11, 8192 - r7));
                if (q8 == -1) {
                    if (H8.f10169b == H8.f10170c) {
                        c1449e.f10211a = H8.b();
                        V.b(H8);
                    }
                    if (j8 == j11) {
                        return -1L;
                    }
                } else {
                    H8.f10170c += q8;
                    long j12 = q8;
                    j11 += j12;
                    c1449e.B(c1449e.E() + j12);
                }
            }
            return j11 - j8;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
    }

    public static /* synthetic */ X z(AbstractC1453i abstractC1453i, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            return abstractC1453i.v(j8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public final long B() {
        ReentrantLock reentrantLock = this.f10229d;
        reentrantLock.lock();
        try {
            if (!this.f10227b) {
                Q5.I i8 = Q5.I.f8786a;
                reentrantLock.unlock();
                return r();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Z E(long j8) {
        ReentrantLock reentrantLock = this.f10229d;
        reentrantLock.lock();
        try {
            if (!this.f10227b) {
                this.f10228c++;
                reentrantLock.unlock();
                return new b(this, j8);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f10229d;
        reentrantLock.lock();
        try {
            if (this.f10227b) {
                return;
            }
            this.f10227b = true;
            if (this.f10228c != 0) {
                return;
            }
            Q5.I i8 = Q5.I.f8786a;
            reentrantLock.unlock();
            k();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f10226a) {
            ReentrantLock reentrantLock = this.f10229d;
            reentrantLock.lock();
            try {
                if (!this.f10227b) {
                    Q5.I i8 = Q5.I.f8786a;
                    reentrantLock.unlock();
                    p();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final ReentrantLock j() {
        return this.f10229d;
    }

    protected abstract void k();

    protected abstract void p();

    protected abstract int q(long j8, byte[] bArr, int i8, int i9);

    protected abstract long r();

    protected abstract void t(long j8, byte[] bArr, int i8, int i9);

    public final X v(long j8) {
        if (this.f10226a) {
            ReentrantLock reentrantLock = this.f10229d;
            reentrantLock.lock();
            try {
                if (!this.f10227b) {
                    this.f10228c++;
                    reentrantLock.unlock();
                    return new a(this, j8);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }
}
