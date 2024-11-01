package u6;

import Q5.I;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import g6.AbstractC2923c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3446c;
import n6.Q;
import s6.C3975A;
import s6.C3980F;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC4090a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0905a f40327h = new C0905a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40328i = AtomicLongFieldUpdater.newUpdater(ExecutorC4090a.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40329j = AtomicLongFieldUpdater.newUpdater(ExecutorC4090a.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40330k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4090a.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final C3980F f40331l = new C3980F("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f40332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40333b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40334c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f40335d;

    /* renamed from: e, reason: collision with root package name */
    public final C4093d f40336e;

    /* renamed from: f, reason: collision with root package name */
    public final C4093d f40337f;

    /* renamed from: g, reason: collision with root package name */
    public final C3975A f40338g;
    private volatile long parkedWorkersStack;

    /* renamed from: u6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0905a {
        private C0905a() {
        }

        public /* synthetic */ C0905a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: u6.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40339a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40339a = iArr;
        }
    }

    /* renamed from: u6.a$d */
    /* loaded from: classes5.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC4090a(int i8, int i9, long j8, String str) {
        this.f40332a = i8;
        this.f40333b = i9;
        this.f40334c = j8;
        this.f40335d = str;
        if (i8 >= 1) {
            if (i9 >= i8) {
                if (i9 <= 2097150) {
                    if (j8 > 0) {
                        this.f40336e = new C4093d();
                        this.f40337f = new C4093d();
                        this.f40338g = new C3975A((i8 + 1) * 2);
                        this.controlState = i8 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
    }

    private final AbstractRunnableC4097h E(c cVar, AbstractRunnableC4097h abstractRunnableC4097h, boolean z8) {
        if (cVar == null) {
            return abstractRunnableC4097h;
        }
        if (cVar.f40343c == d.TERMINATED) {
            return abstractRunnableC4097h;
        }
        if (abstractRunnableC4097h.f40365b.b() == 0 && cVar.f40343c == d.BLOCKING) {
            return abstractRunnableC4097h;
        }
        cVar.f40347g = true;
        return cVar.f40341a.a(abstractRunnableC4097h, z8);
    }

    private final boolean F(long j8) {
        if (i6.m.d(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f40332a) {
            int g8 = g();
            if (g8 == 1 && this.f40332a > 1) {
                g();
            }
            if (g8 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean G(ExecutorC4090a executorC4090a, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f40329j.get(executorC4090a);
        }
        return executorC4090a.F(j8);
    }

    private final boolean H() {
        c q8;
        do {
            q8 = q();
            if (q8 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(q8, -1, 0));
        LockSupport.unpark(q8);
        return true;
    }

    private final boolean b(AbstractRunnableC4097h abstractRunnableC4097h) {
        if (abstractRunnableC4097h.f40365b.b() == 1) {
            return this.f40337f.a(abstractRunnableC4097h);
        }
        return this.f40336e.a(abstractRunnableC4097h);
    }

    private final int g() {
        synchronized (this.f40338g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f40329j;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                int d8 = i6.m.d(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (d8 >= this.f40332a) {
                    return 0;
                }
                if (i8 >= this.f40333b) {
                    return 0;
                }
                int i9 = ((int) (f40329j.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f40338g.b(i9) == null) {
                    c cVar = new c(this, i9);
                    this.f40338g.c(i9, cVar);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = d8 + 1;
                        cVar.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c i() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3292y.d(ExecutorC4090a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void k(ExecutorC4090a executorC4090a, Runnable runnable, InterfaceC4098i interfaceC4098i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC4098i = AbstractC4101l.f40374g;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        executorC4090a.j(runnable, interfaceC4098i, z8);
    }

    private final int p(c cVar) {
        Object i8 = cVar.i();
        while (i8 != f40331l) {
            if (i8 == null) {
                return 0;
            }
            c cVar2 = (c) i8;
            int h8 = cVar2.h();
            if (h8 != 0) {
                return h8;
            }
            i8 = cVar2.i();
        }
        return -1;
    }

    private final c q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40328i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f40338g.b((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            int p8 = p(cVar);
            if (p8 >= 0 && f40328i.compareAndSet(this, j8, p8 | j9)) {
                cVar.r(f40331l);
                return cVar;
            }
        }
    }

    private final void z(long j8, boolean z8) {
        if (z8 || H() || F(j8)) {
            return;
        }
        H();
    }

    public final void B() {
        if (H() || G(this, 0L, 1, null)) {
            return;
        }
        H();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    public final AbstractRunnableC4097h h(Runnable runnable, InterfaceC4098i interfaceC4098i) {
        long a9 = AbstractC4101l.f40373f.a();
        if (runnable instanceof AbstractRunnableC4097h) {
            AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) runnable;
            abstractRunnableC4097h.f40364a = a9;
            abstractRunnableC4097h.f40365b = interfaceC4098i;
            return abstractRunnableC4097h;
        }
        return new C4100k(runnable, a9, interfaceC4098i);
    }

    public final boolean isTerminated() {
        if (f40330k.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final void j(Runnable runnable, InterfaceC4098i interfaceC4098i, boolean z8) {
        boolean z9;
        long j8;
        AbstractC3446c.a();
        AbstractRunnableC4097h h8 = h(runnable, interfaceC4098i);
        boolean z10 = false;
        if (h8.f40365b.b() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j8 = f40329j.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        } else {
            j8 = 0;
        }
        c i8 = i();
        AbstractRunnableC4097h E8 = E(i8, h8, z8);
        if (E8 != null && !b(E8)) {
            throw new RejectedExecutionException(this.f40335d + " was terminated");
        }
        if (z8 && i8 != null) {
            z10 = true;
        }
        if (z9) {
            z(j8, z10);
        } else {
            if (z10) {
                return;
            }
            B();
        }
    }

    public final boolean r(c cVar) {
        long j8;
        long j9;
        int h8;
        if (cVar.i() != f40331l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40328i;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            h8 = cVar.h();
            cVar.r(this.f40338g.b((int) (2097151 & j8)));
        } while (!f40328i.compareAndSet(this, j8, j9 | h8));
        return true;
    }

    public final void t(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40328i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j8) & (-2097152);
            if (i10 == i8) {
                if (i9 == 0) {
                    i10 = p(cVar);
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0 && f40328i.compareAndSet(this, j8, j9 | i10)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a9 = this.f40338g.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a9; i13++) {
            c cVar = (c) this.f40338g.b(i13);
            if (cVar != null) {
                int e8 = cVar.f40341a.e();
                int i14 = b.f40339a[cVar.f40343c.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    i12++;
                                }
                            } else {
                                i11++;
                                if (e8 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(e8);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i8++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e8);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i9++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e8);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                }
            }
        }
        long j8 = f40329j.get(this);
        return this.f40335d + '@' + Q.b(this) + "[Pool Size {core = " + this.f40332a + ", max = " + this.f40333b + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f40336e.c() + ", global blocking queue size = " + this.f40337f.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f40332a - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    public final void u(AbstractRunnableC4097h abstractRunnableC4097h) {
        try {
            abstractRunnableC4097h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void v(long j8) {
        int i8;
        AbstractRunnableC4097h abstractRunnableC4097h;
        if (!f40330k.compareAndSet(this, 0, 1)) {
            return;
        }
        c i9 = i();
        synchronized (this.f40338g) {
            i8 = (int) (f40329j.get(this) & 2097151);
        }
        if (1 <= i8) {
            int i10 = 1;
            while (true) {
                Object b9 = this.f40338g.b(i10);
                AbstractC3292y.f(b9);
                c cVar = (c) b9;
                if (cVar != i9) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j8);
                    }
                    cVar.f40341a.f(this.f40337f);
                }
                if (i10 == i8) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f40337f.b();
        this.f40336e.b();
        while (true) {
            if (i9 != null) {
                abstractRunnableC4097h = i9.g(true);
                if (abstractRunnableC4097h != null) {
                    continue;
                    u(abstractRunnableC4097h);
                }
            }
            abstractRunnableC4097h = (AbstractRunnableC4097h) this.f40336e.d();
            if (abstractRunnableC4097h == null && (abstractRunnableC4097h = (AbstractRunnableC4097h) this.f40337f.d()) == null) {
                break;
            }
            u(abstractRunnableC4097h);
        }
        if (i9 != null) {
            i9.u(d.TERMINATED);
        }
        f40328i.set(this, 0L);
        f40329j.set(this, 0L);
    }

    /* renamed from: u6.a$c */
    /* loaded from: classes5.dex */
    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f40340i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a, reason: collision with root package name */
        public final C4103n f40341a;

        /* renamed from: b, reason: collision with root package name */
        private final T f40342b;

        /* renamed from: c, reason: collision with root package name */
        public d f40343c;

        /* renamed from: d, reason: collision with root package name */
        private long f40344d;

        /* renamed from: e, reason: collision with root package name */
        private long f40345e;

        /* renamed from: f, reason: collision with root package name */
        private int f40346f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f40347g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f40341a = new C4103n();
            this.f40342b = new T();
            this.f40343c = d.DORMANT;
            this.nextParkedWorker = ExecutorC4090a.f40331l;
            this.f40346f = AbstractC2923c.f32467a.b();
        }

        private final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            ExecutorC4090a.f40329j.addAndGet(ExecutorC4090a.this, -2097152L);
            if (this.f40343c != d.TERMINATED) {
                this.f40343c = d.DORMANT;
            }
        }

        private final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                ExecutorC4090a.this.B();
            }
        }

        private final void d(AbstractRunnableC4097h abstractRunnableC4097h) {
            int b9 = abstractRunnableC4097h.f40365b.b();
            k(b9);
            c(b9);
            ExecutorC4090a.this.u(abstractRunnableC4097h);
            b(b9);
        }

        private final AbstractRunnableC4097h e(boolean z8) {
            boolean z9;
            AbstractRunnableC4097h o8;
            AbstractRunnableC4097h o9;
            if (z8) {
                if (m(ExecutorC4090a.this.f40332a * 2) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && (o9 = o()) != null) {
                    return o9;
                }
                AbstractRunnableC4097h g8 = this.f40341a.g();
                if (g8 != null) {
                    return g8;
                }
                if (!z9 && (o8 = o()) != null) {
                    return o8;
                }
            } else {
                AbstractRunnableC4097h o10 = o();
                if (o10 != null) {
                    return o10;
                }
            }
            return v(3);
        }

        private final AbstractRunnableC4097h f() {
            AbstractRunnableC4097h h8 = this.f40341a.h();
            if (h8 == null) {
                AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) ExecutorC4090a.this.f40337f.d();
                if (abstractRunnableC4097h == null) {
                    return v(1);
                }
                return abstractRunnableC4097h;
            }
            return h8;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f40340i;
        }

        private final void k(int i8) {
            this.f40344d = 0L;
            if (this.f40343c == d.PARKING) {
                this.f40343c = d.BLOCKING;
            }
        }

        private final boolean l() {
            if (this.nextParkedWorker != ExecutorC4090a.f40331l) {
                return true;
            }
            return false;
        }

        private final void n() {
            if (this.f40344d == 0) {
                this.f40344d = System.nanoTime() + ExecutorC4090a.this.f40334c;
            }
            LockSupport.parkNanos(ExecutorC4090a.this.f40334c);
            if (System.nanoTime() - this.f40344d >= 0) {
                this.f40344d = 0L;
                w();
            }
        }

        private final AbstractRunnableC4097h o() {
            if (m(2) == 0) {
                AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) ExecutorC4090a.this.f40336e.d();
                if (abstractRunnableC4097h != null) {
                    return abstractRunnableC4097h;
                }
                return (AbstractRunnableC4097h) ExecutorC4090a.this.f40337f.d();
            }
            AbstractRunnableC4097h abstractRunnableC4097h2 = (AbstractRunnableC4097h) ExecutorC4090a.this.f40337f.d();
            if (abstractRunnableC4097h2 != null) {
                return abstractRunnableC4097h2;
            }
            return (AbstractRunnableC4097h) ExecutorC4090a.this.f40336e.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z8 = false;
                while (!ExecutorC4090a.this.isTerminated() && this.f40343c != d.TERMINATED) {
                    AbstractRunnableC4097h g8 = g(this.f40347g);
                    if (g8 != null) {
                        this.f40345e = 0L;
                        d(g8);
                    } else {
                        this.f40347g = false;
                        if (this.f40345e != 0) {
                            if (!z8) {
                                z8 = true;
                            } else {
                                u(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f40345e);
                                this.f40345e = 0L;
                            }
                        } else {
                            t();
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j8;
            if (this.f40343c == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC4090a executorC4090a = ExecutorC4090a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4090a.f40329j;
            do {
                j8 = atomicLongFieldUpdater.get(executorC4090a);
                if (((int) ((9223367638808264704L & j8) >> 42)) != 0) {
                } else {
                    return false;
                }
            } while (!ExecutorC4090a.f40329j.compareAndSet(executorC4090a, j8, j8 - 4398046511104L));
            this.f40343c = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                ExecutorC4090a.this.r(this);
                return;
            }
            f40340i.set(this, -1);
            while (l() && f40340i.get(this) == -1 && !ExecutorC4090a.this.isTerminated() && this.f40343c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final AbstractRunnableC4097h v(int i8) {
            int i9 = (int) (ExecutorC4090a.f40329j.get(ExecutorC4090a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int m8 = m(i9);
            ExecutorC4090a executorC4090a = ExecutorC4090a.this;
            long j8 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                m8++;
                if (m8 > i9) {
                    m8 = 1;
                }
                c cVar = (c) executorC4090a.f40338g.b(m8);
                if (cVar != null && cVar != this) {
                    long n8 = cVar.f40341a.n(i8, this.f40342b);
                    if (n8 == -1) {
                        T t8 = this.f40342b;
                        AbstractRunnableC4097h abstractRunnableC4097h = (AbstractRunnableC4097h) t8.f34573a;
                        t8.f34573a = null;
                        return abstractRunnableC4097h;
                    }
                    if (n8 > 0) {
                        j8 = Math.min(j8, n8);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.f40345e = j8;
            return null;
        }

        private final void w() {
            ExecutorC4090a executorC4090a = ExecutorC4090a.this;
            synchronized (executorC4090a.f40338g) {
                try {
                    if (executorC4090a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC4090a.f40329j.get(executorC4090a) & 2097151)) <= executorC4090a.f40332a) {
                        return;
                    }
                    if (!f40340i.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i8 = this.indexInArray;
                    q(0);
                    executorC4090a.t(this, i8, 0);
                    int andDecrement = (int) (ExecutorC4090a.f40329j.getAndDecrement(executorC4090a) & 2097151);
                    if (andDecrement != i8) {
                        Object b9 = executorC4090a.f40338g.b(andDecrement);
                        AbstractC3292y.f(b9);
                        c cVar = (c) b9;
                        executorC4090a.f40338g.c(i8, cVar);
                        cVar.q(i8);
                        executorC4090a.t(cVar, andDecrement, i8);
                    }
                    executorC4090a.f40338g.c(andDecrement, null);
                    I i9 = I.f8786a;
                    this.f40343c = d.TERMINATED;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final AbstractRunnableC4097h g(boolean z8) {
            if (s()) {
                return e(z8);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i8) {
            int i9 = this.f40346f;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f40346f = i12;
            int i13 = i8 - 1;
            if ((i13 & i8) == 0) {
                return i12 & i13;
            }
            return (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void q(int i8) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC4090a.this.f40335d);
            sb.append("-worker-");
            if (i8 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i8);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            boolean z8;
            d dVar2 = this.f40343c;
            if (dVar2 == d.CPU_ACQUIRED) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                ExecutorC4090a.f40329j.addAndGet(ExecutorC4090a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f40343c = dVar;
            }
            return z8;
        }

        public c(ExecutorC4090a executorC4090a, int i8) {
            this();
            q(i8);
        }
    }
}
