package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import Q5.t;
import U5.g;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.C3472p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final Function0 onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {
        private final U5.d continuation;
        private final Function1 onFrame;

        public FrameAwaiter(Function1 function1, U5.d dVar) {
            this.onFrame = function1;
            this.continuation = dVar;
        }

        public final U5.d getContinuation() {
            return this.continuation;
        }

        public final Function1 getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j8) {
            Object b9;
            U5.d dVar = this.continuation;
            try {
                s.a aVar = s.f8810b;
                b9 = s.b(this.onFrame.invoke(Long.valueOf(j8)));
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            dVar.resumeWith(b9);
        }
    }

    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = th;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    U5.d continuation = list.get(i8).getContinuation();
                    s.a aVar = s.f8810b;
                    continuation.resumeWith(s.b(t.a(th)));
                }
                this.awaiters.clear();
                I i9 = I.f8786a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC2072n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        boolean z8;
        synchronized (this.lock) {
            z8 = !this.awaiters.isEmpty();
        }
        return z8;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g
    public U5.g plus(U5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public final void sendFrame(long j8) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list.get(i8).resume(j8);
                }
                list.clear();
                I i9 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1 function1, U5.d dVar) {
        FrameAwaiter frameAwaiter;
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        T t8 = new T();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                s.a aVar = s.f8810b;
                c3472p.resumeWith(s.b(t.a(th)));
            } else {
                t8.f34573a = new FrameAwaiter(function1, c3472p);
                boolean z8 = !this.awaiters.isEmpty();
                List list = this.awaiters;
                Object obj = t8.f34573a;
                if (obj == null) {
                    AbstractC3292y.y("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) obj;
                }
                list.add(frameAwaiter);
                boolean z9 = !z8;
                c3472p.f(new BroadcastFrameClock$withFrameNanos$2$1(this, t8));
                if (z9 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public BroadcastFrameClock(Function0 function0) {
        this.onNewAwaiters = function0;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : function0);
    }
}
