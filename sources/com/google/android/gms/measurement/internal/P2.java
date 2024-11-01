package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class P2 extends AbstractC2485z3 {

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicLong f17500l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private T2 f17501c;

    /* renamed from: d, reason: collision with root package name */
    private T2 f17502d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f17503e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f17504f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f17505g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f17506h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f17507i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f17508j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f17509k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(S2 s22) {
        super(s22);
        this.f17507i = new Object();
        this.f17508j = new Semaphore(2);
        this.f17503e = new PriorityBlockingQueue();
        this.f17504f = new LinkedBlockingQueue();
        this.f17505g = new R2(this, "Thread death: Uncaught exception on worker thread");
        this.f17506h = new R2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void v(Q2 q22) {
        synchronized (this.f17507i) {
            try {
                this.f17503e.add(q22);
                T2 t22 = this.f17501c;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Worker", this.f17503e);
                    this.f17501c = t23;
                    t23.setUncaughtExceptionHandler(this.f17505g);
                    this.f17501c.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future B(Callable callable) {
        m();
        AbstractC1396p.l(callable);
        Q2 q22 = new Q2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f17501c) {
            q22.run();
        } else {
            v(q22);
        }
        return q22;
    }

    public final void D(Runnable runnable) {
        m();
        AbstractC1396p.l(runnable);
        v(new Q2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        m();
        AbstractC1396p.l(runnable);
        v(new Q2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        if (Thread.currentThread() == this.f17501c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final void i() {
        if (Thread.currentThread() == this.f17502d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final void k() {
        if (Thread.currentThread() == this.f17501c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485z3
    protected final boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object s(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            f().D(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                a().L().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            a().L().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future t(Callable callable) {
        m();
        AbstractC1396p.l(callable);
        Q2 q22 = new Q2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f17501c) {
            if (!this.f17503e.isEmpty()) {
                a().L().a("Callable skipped the worker queue.");
            }
            q22.run();
        } else {
            v(q22);
        }
        return q22;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    public final void z(Runnable runnable) {
        m();
        AbstractC1396p.l(runnable);
        Q2 q22 = new Q2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f17507i) {
            try {
                this.f17504f.add(q22);
                T2 t22 = this.f17502d;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Network", this.f17504f);
                    this.f17502d = t23;
                    t23.setUncaughtExceptionHandler(this.f17506h);
                    this.f17502d.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
