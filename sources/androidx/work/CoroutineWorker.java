package androidx.work;

import U5.d;
import V5.b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3472p;
import n6.D0;
import n6.I;
import n6.InterfaceC3435A;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final I coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final InterfaceC3435A job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        InterfaceC3435A b9;
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(params, "params");
        b9 = D0.b(null, 1, null);
        this.job = b9;
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        AbstractC3292y.h(create, "create()");
        this.future = create;
        create.addListener(new Runnable() { // from class: androidx.work.a
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(CoroutineWorker.this);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = C3445b0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            InterfaceC3488x0.a.a(this$0.job, null, 1, null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d dVar);

    public I getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC4260d getForegroundInfoAsync() {
        InterfaceC3435A b9;
        b9 = D0.b(null, 1, null);
        M a9 = N.a(getCoroutineContext().plus(b9));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b9, null, 2, null);
        AbstractC3462k.d(a9, null, null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_release() {
        return this.future;
    }

    public final InterfaceC3435A getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, d dVar) {
        InterfaceFutureC4260d foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC3292y.h(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C3472p c3472p = new C3472p(b.c(dVar), 1);
            c3472p.B();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(c3472p, foregroundAsync), DirectExecutor.INSTANCE);
            c3472p.f(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object y8 = c3472p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return Q5.I.f8786a;
    }

    public final Object setProgress(Data data, d dVar) {
        InterfaceFutureC4260d progressAsync = setProgressAsync(data);
        AbstractC3292y.h(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C3472p c3472p = new C3472p(b.c(dVar), 1);
            c3472p.B();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(c3472p, progressAsync), DirectExecutor.INSTANCE);
            c3472p.f(new ListenableFutureKt$await$2$2(progressAsync));
            Object y8 = c3472p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return Q5.I.f8786a;
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC4260d startWork() {
        AbstractC3462k.d(N.a(getCoroutineContext().plus(this.job)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
        return this.future;
    }
}
