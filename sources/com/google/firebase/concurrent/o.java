package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class o implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f18467a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f18467a = executorService;
        this.f18468b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(final Runnable runnable, final p.b bVar) {
        this.f18467a.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                o.m(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture o(final Runnable runnable, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f18468b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                o.this.n(runnable, bVar);
            }
        }, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future q(final Callable callable, final p.b bVar) {
        return this.f18467a.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.p(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture r(final Callable callable, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f18468b.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future q8;
                q8 = o.this.q(callable, bVar);
                return q8;
            }
        }, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e8) {
            bVar.a(e8);
            throw e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final Runnable runnable, final p.b bVar) {
        this.f18467a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                o.s(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture u(final Runnable runnable, long j8, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f18468b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                o.this.t(runnable, bVar);
            }
        }, j8, j9, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f18467a.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j8, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f18468b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                o.this.v(runnable, bVar);
            }
        }, j8, j9, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f18467a.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f18467a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f18467a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f18467a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f18467a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f18467a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture o8;
                o8 = o.this.o(runnable, j8, timeUnit, bVar);
                return o8;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j8, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture u8;
                u8 = o.this.u(runnable, j8, j9, timeUnit, bVar);
                return u8;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j8, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture w8;
                w8 = o.this.w(runnable, j8, j9, timeUnit, bVar);
                return w8;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f18467a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f18467a.invokeAll(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f18467a.invokeAny(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture r8;
                r8 = o.this.r(callable, j8, timeUnit, bVar);
                return r8;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f18467a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f18467a.submit(runnable);
    }
}
