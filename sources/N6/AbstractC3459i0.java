package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;
import n6.W;
import s6.C3980F;

/* renamed from: n6.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3459i0 extends AbstractC3461j0 implements W {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35726d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3459i0.class, Object.class, "_queue");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35727e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3459i0.class, Object.class, "_delayed");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35728f = AtomicIntegerFieldUpdater.newUpdater(AbstractC3459i0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: n6.i0$a */
    /* loaded from: classes5.dex */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3470o f35729c;

        public a(long j8, InterfaceC3470o interfaceC3470o) {
            super(j8);
            this.f35729c = interfaceC3470o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35729c.e(AbstractC3459i0.this, Q5.I.f8786a);
        }

        @Override // n6.AbstractC3459i0.c
        public String toString() {
            return super.toString() + this.f35729c;
        }
    }

    /* renamed from: n6.i0$b */
    /* loaded from: classes5.dex */
    private static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f35731c;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f35731c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35731c.run();
        }

        @Override // n6.AbstractC3459i0.c
        public String toString() {
            return super.toString() + this.f35731c;
        }
    }

    /* renamed from: n6.i0$c */
    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable, Comparable, InterfaceC3449d0, s6.O {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f35732a;

        /* renamed from: b, reason: collision with root package name */
        private int f35733b = -1;

        public c(long j8) {
            this.f35732a = j8;
        }

        @Override // s6.O
        public void a(s6.N n8) {
            C3980F c3980f;
            Object obj = this._heap;
            c3980f = AbstractC3465l0.f35736a;
            if (obj != c3980f) {
                this._heap = n8;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // s6.O
        public s6.N c() {
            Object obj = this._heap;
            if (obj instanceof s6.N) {
                return (s6.N) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j8 = this.f35732a - cVar.f35732a;
            if (j8 > 0) {
                return 1;
            }
            if (j8 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // n6.InterfaceC3449d0
        public final void dispose() {
            C3980F c3980f;
            d dVar;
            C3980F c3980f2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c3980f = AbstractC3465l0.f35736a;
                    if (obj == c3980f) {
                        return;
                    }
                    if (obj instanceof d) {
                        dVar = (d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    c3980f2 = AbstractC3465l0.f35736a;
                    this._heap = c3980f2;
                    Q5.I i8 = Q5.I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j8, d dVar, AbstractC3459i0 abstractC3459i0) {
            C3980F c3980f;
            synchronized (this) {
                Object obj = this._heap;
                c3980f = AbstractC3465l0.f35736a;
                if (obj == c3980f) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC3459i0.b()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f35734c = j8;
                        } else {
                            long j9 = cVar.f35732a;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.f35734c > 0) {
                                dVar.f35734c = j8;
                            }
                        }
                        long j10 = this.f35732a;
                        long j11 = dVar.f35734c;
                        if (j10 - j11 < 0) {
                            this.f35732a = j11;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean f(long j8) {
            if (j8 - this.f35732a >= 0) {
                return true;
            }
            return false;
        }

        @Override // s6.O
        public int getIndex() {
            return this.f35733b;
        }

        @Override // s6.O
        public void setIndex(int i8) {
            this.f35733b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f35732a + ']';
        }
    }

    /* renamed from: n6.i0$d */
    /* loaded from: classes5.dex */
    public static final class d extends s6.N {

        /* renamed from: c, reason: collision with root package name */
        public long f35734c;

        public d(long j8) {
            this.f35734c = j8;
        }
    }

    private final void U() {
        C3980F c3980f;
        C3980F c3980f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35726d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35726d;
                c3980f = AbstractC3465l0.f35737b;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, c3980f)) {
                    return;
                }
            } else if (!(obj instanceof s6.s)) {
                c3980f2 = AbstractC3465l0.f35737b;
                if (obj == c3980f2) {
                    return;
                }
                s6.s sVar = new s6.s(8, true);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f35726d, this, obj, sVar)) {
                    return;
                }
            } else {
                ((s6.s) obj).d();
                return;
            }
        }
    }

    private final Runnable V() {
        C3980F c3980f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35726d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof s6.s)) {
                c3980f = AbstractC3465l0.f35737b;
                if (obj == c3980f) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f35726d, this, obj, null)) {
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s6.s sVar = (s6.s) obj;
                Object j8 = sVar.j();
                if (j8 != s6.s.f39220h) {
                    return (Runnable) j8;
                }
                androidx.concurrent.futures.a.a(f35726d, this, obj, sVar.i());
            }
        }
    }

    private final boolean X(Runnable runnable) {
        C3980F c3980f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35726d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (b()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f35726d, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof s6.s)) {
                c3980f = AbstractC3465l0.f35737b;
                if (obj == c3980f) {
                    return false;
                }
                s6.s sVar = new s6.s(8, true);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                sVar.a(runnable);
                if (androidx.concurrent.futures.a.a(f35726d, this, obj, sVar)) {
                    return true;
                }
            } else {
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s6.s sVar2 = (s6.s) obj;
                int a9 = sVar2.a(runnable);
                if (a9 == 0) {
                    return true;
                }
                if (a9 != 1) {
                    if (a9 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.a.a(f35726d, this, obj, sVar2.i());
                }
            }
        }
    }

    private final void Z() {
        c cVar;
        AbstractC3446c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f35727e.get(this);
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                R(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        if (f35728f.get(this) != 0) {
            return true;
        }
        return false;
    }

    private final int c0(long j8, c cVar) {
        if (b()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35727e;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, new d(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            AbstractC3292y.f(obj);
            dVar = (d) obj;
        }
        return cVar.e(j8, dVar, this);
    }

    private final void e0(boolean z8) {
        f35728f.set(this, z8 ? 1 : 0);
    }

    private final boolean f0(c cVar) {
        c cVar2;
        d dVar = (d) f35727e.get(this);
        if (dVar != null) {
            cVar2 = (c) dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    @Override // n6.AbstractC3457h0
    protected long I() {
        c cVar;
        C3980F c3980f;
        if (super.I() == 0) {
            return 0L;
        }
        Object obj = f35726d.get(this);
        if (obj != null) {
            if (!(obj instanceof s6.s)) {
                c3980f = AbstractC3465l0.f35737b;
                if (obj != c3980f) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((s6.s) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f35727e.get(this);
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.f35732a;
        AbstractC3446c.a();
        return i6.m.e(j8 - System.nanoTime(), 0L);
    }

    @Override // n6.AbstractC3457h0
    public long N() {
        s6.O o8;
        boolean z8;
        if (O()) {
            return 0L;
        }
        d dVar = (d) f35727e.get(this);
        if (dVar != null && !dVar.d()) {
            AbstractC3446c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        s6.O b9 = dVar.b();
                        o8 = null;
                        if (b9 != null) {
                            c cVar = (c) b9;
                            if (cVar.f(nanoTime)) {
                                z8 = X(cVar);
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                o8 = dVar.h(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) o8) != null);
        }
        Runnable V8 = V();
        if (V8 != null) {
            V8.run();
            return 0L;
        }
        return I();
    }

    public void W(Runnable runnable) {
        if (X(runnable)) {
            S();
        } else {
            S.f35677g.W(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        C3980F c3980f;
        if (!M()) {
            return false;
        }
        d dVar = (d) f35727e.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f35726d.get(this);
        if (obj != null) {
            if (!(obj instanceof s6.s)) {
                c3980f = AbstractC3465l0.f35737b;
                if (obj != c3980f) {
                    return false;
                }
            } else {
                return ((s6.s) obj).g();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a0() {
        f35726d.set(this, null);
        f35727e.set(this, null);
    }

    public final void b0(long j8, c cVar) {
        int c02 = c0(j8, cVar);
        if (c02 != 0) {
            if (c02 != 1) {
                if (c02 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                R(j8, cVar);
                return;
            }
        }
        if (f0(cVar)) {
            S();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3449d0 d0(long j8, Runnable runnable) {
        long c8 = AbstractC3465l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC3446c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c8 + nanoTime, runnable);
            b0(nanoTime, bVar);
            return bVar;
        }
        return M0.f35666a;
    }

    @Override // n6.I
    public final void dispatch(U5.g gVar, Runnable runnable) {
        W(runnable);
    }

    @Override // n6.W
    public void i(long j8, InterfaceC3470o interfaceC3470o) {
        long c8 = AbstractC3465l0.c(j8);
        if (c8 < 4611686018427387903L) {
            AbstractC3446c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c8 + nanoTime, interfaceC3470o);
            b0(nanoTime, aVar);
            r.a(interfaceC3470o, aVar);
        }
    }

    @Override // n6.AbstractC3457h0
    public void shutdown() {
        X0.f35683a.c();
        e0(true);
        U();
        do {
        } while (N() <= 0);
        Z();
    }

    public InterfaceC3449d0 t(long j8, Runnable runnable, U5.g gVar) {
        return W.a.a(this, j8, runnable, gVar);
    }
}
