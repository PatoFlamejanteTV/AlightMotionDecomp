package s6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n6.InterfaceC3449d0;
import n6.InterfaceC3470o;
import n6.T;
import n6.W;

/* renamed from: s6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3993m extends n6.I implements W {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39202f = AtomicIntegerFieldUpdater.newUpdater(C3993m.class, "runningWorkers");

    /* renamed from: a, reason: collision with root package name */
    private final n6.I f39203a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39204b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W f39205c;

    /* renamed from: d, reason: collision with root package name */
    private final r f39206d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f39207e;
    private volatile int runningWorkers;

    /* renamed from: s6.m$a */
    /* loaded from: classes5.dex */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f39208a;

        public a(Runnable runnable) {
            this.f39208a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f39208a.run();
                } catch (Throwable th) {
                    n6.K.a(U5.h.f10149a, th);
                }
                Runnable G8 = C3993m.this.G();
                if (G8 == null) {
                    return;
                }
                this.f39208a = G8;
                i8++;
                if (i8 >= 16 && C3993m.this.f39203a.isDispatchNeeded(C3993m.this)) {
                    C3993m.this.f39203a.dispatch(C3993m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3993m(n6.I i8, int i9) {
        W w8;
        this.f39203a = i8;
        this.f39204b = i9;
        if (i8 instanceof W) {
            w8 = (W) i8;
        } else {
            w8 = null;
        }
        this.f39205c = w8 == null ? T.a() : w8;
        this.f39206d = new r(false);
        this.f39207e = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable G() {
        while (true) {
            Runnable runnable = (Runnable) this.f39206d.d();
            if (runnable == null) {
                synchronized (this.f39207e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39202f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f39206d.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    private final boolean H() {
        synchronized (this.f39207e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39202f;
            if (atomicIntegerFieldUpdater.get(this) >= this.f39204b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f39206d.a(runnable);
        if (f39202f.get(this) < this.f39204b && H() && (G8 = G()) != null) {
            this.f39203a.dispatch(this, new a(G8));
        }
    }

    @Override // n6.I
    public void dispatchYield(U5.g gVar, Runnable runnable) {
        Runnable G8;
        this.f39206d.a(runnable);
        if (f39202f.get(this) < this.f39204b && H() && (G8 = G()) != null) {
            this.f39203a.dispatchYield(this, new a(G8));
        }
    }

    @Override // n6.W
    public void i(long j8, InterfaceC3470o interfaceC3470o) {
        this.f39205c.i(j8, interfaceC3470o);
    }

    @Override // n6.I
    public n6.I limitedParallelism(int i8) {
        AbstractC3994n.a(i8);
        if (i8 >= this.f39204b) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // n6.W
    public InterfaceC3449d0 t(long j8, Runnable runnable, U5.g gVar) {
        return this.f39205c.t(j8, runnable, gVar);
    }
}
