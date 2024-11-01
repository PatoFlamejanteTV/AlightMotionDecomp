package androidx.work;

import Q5.I;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3488x0;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class JobListenableFuture<R> implements InterfaceFutureC4260d {
    private final InterfaceC3488x0 job;
    private final SettableFuture<R> underlying;

    /* renamed from: androidx.work.JobListenableFuture$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ JobListenableFuture<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JobListenableFuture<R> jobListenableFuture) {
            super(1);
            this.this$0 = jobListenableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    ((JobListenableFuture) this.this$0).underlying.cancel(true);
                    return;
                }
                SettableFuture settableFuture = ((JobListenableFuture) this.this$0).underlying;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                settableFuture.setException(th);
            }
        }
    }

    public JobListenableFuture(InterfaceC3488x0 job, SettableFuture<R> underlying) {
        AbstractC3292y.i(job, "job");
        AbstractC3292y.i(underlying, "underlying");
        this.job = job;
        this.underlying = underlying;
        job.u(new AnonymousClass1(this));
    }

    @Override // z0.InterfaceFutureC4260d
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.underlying.cancel(z8);
    }

    public final void complete(R r8) {
        this.underlying.set(r8);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long j8, TimeUnit timeUnit) {
        return this.underlying.get(j8, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ JobListenableFuture(n6.InterfaceC3488x0 r1, androidx.work.impl.utils.futures.SettableFuture r2, int r3, kotlin.jvm.internal.AbstractC3284p r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.JobListenableFuture.<init>(n6.x0, androidx.work.impl.utils.futures.SettableFuture, int, kotlin.jvm.internal.p):void");
    }
}
