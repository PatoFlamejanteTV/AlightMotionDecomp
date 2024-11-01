package n6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s6.AbstractC3983c;

/* renamed from: n6.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3471o0 extends AbstractC3469n0 implements W {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f35740b;

    public C3471o0(Executor executor) {
        this.f35740b = executor;
        AbstractC3983c.a(F());
    }

    private final void E(U5.g gVar, RejectedExecutionException rejectedExecutionException) {
        B0.c(gVar, AbstractC3467m0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture G(ScheduledExecutorService scheduledExecutorService, Runnable runnable, U5.g gVar, long j8) {
        try {
            return scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e8) {
            E(gVar, e8);
            return null;
        }
    }

    public Executor F() {
        return this.f35740b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor F8 = F();
        if (F8 instanceof ExecutorService) {
            executorService = (ExecutorService) F8;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        try {
            Executor F8 = F();
            AbstractC3446c.a();
            F8.execute(runnable);
        } catch (RejectedExecutionException e8) {
            AbstractC3446c.a();
            E(gVar, e8);
            C3445b0.b().dispatch(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3471o0) && ((C3471o0) obj).F() == F()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(F());
    }

    @Override // n6.W
    public void i(long j8, InterfaceC3470o interfaceC3470o) {
        ScheduledExecutorService scheduledExecutorService;
        Executor F8 = F();
        ScheduledFuture scheduledFuture = null;
        if (F8 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) F8;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = G(scheduledExecutorService, new R0(this, interfaceC3470o), interfaceC3470o.getContext(), j8);
        }
        if (scheduledFuture != null) {
            B0.h(interfaceC3470o, scheduledFuture);
        } else {
            S.f35677g.i(j8, interfaceC3470o);
        }
    }

    @Override // n6.W
    public InterfaceC3449d0 t(long j8, Runnable runnable, U5.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor F8 = F();
        ScheduledFuture scheduledFuture = null;
        if (F8 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) F8;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = G(scheduledExecutorService, runnable, gVar, j8);
        }
        if (scheduledFuture != null) {
            return new C3447c0(scheduledFuture);
        }
        return S.f35677g.t(j8, runnable, gVar);
    }

    @Override // n6.I
    public String toString() {
        return F().toString();
    }
}
