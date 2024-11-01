package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.jvm.internal.AbstractC3292y;
import n6.I;
import n6.InterfaceC3488x0;
import z0.InterfaceFutureC4260d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends ListenableWorker implements OnConstraintsStateChangedListener {
    private volatile boolean areConstraintsUnmet;
    private ListenableWorker delegate;
    private final SettableFuture<ListenableWorker.Result> future;
    private final Object lock;
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    private final void setupAndRunConstraintTrackingWork() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        AbstractC3292y.h(logger, "get()");
        if (string == null || string.length() == 0) {
            str = ConstraintTrackingWorkerKt.TAG;
            logger.error(str, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> future = this.future;
            AbstractC3292y.h(future, "future");
            ConstraintTrackingWorkerKt.setFailed(future);
            return;
        }
        ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            str6 = ConstraintTrackingWorkerKt.TAG;
            logger.debug(str6, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> future2 = this.future;
            AbstractC3292y.h(future2, "future");
            ConstraintTrackingWorkerKt.setFailed(future2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        AbstractC3292y.h(workManagerImpl, "getInstance(applicationContext)");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String uuid = getId().toString();
        AbstractC3292y.h(uuid, "id.toString()");
        WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
        if (workSpec == null) {
            SettableFuture<ListenableWorker.Result> future3 = this.future;
            AbstractC3292y.h(future3, "future");
            ConstraintTrackingWorkerKt.setFailed(future3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        AbstractC3292y.h(trackers, "workManagerImpl.trackers");
        WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
        I taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        AbstractC3292y.h(taskCoroutineDispatcher, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final InterfaceC3488x0 listen = WorkConstraintsTrackerKt.listen(workConstraintsTracker, workSpec, taskCoroutineDispatcher, this);
        this.future.addListener(new Runnable() { // from class: m.b
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$1(InterfaceC3488x0.this);
            }
        }, new SynchronousExecutor());
        if (workConstraintsTracker.areAllConstraintsMet(workSpec)) {
            str3 = ConstraintTrackingWorkerKt.TAG;
            logger.debug(str3, "Constraints met for delegate " + string);
            try {
                ListenableWorker listenableWorker = this.delegate;
                AbstractC3292y.f(listenableWorker);
                final InterfaceFutureC4260d startWork = listenableWorker.startWork();
                AbstractC3292y.h(startWork, "delegate!!.startWork()");
                startWork.addListener(new Runnable() { // from class: m.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$3(ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                str4 = ConstraintTrackingWorkerKt.TAG;
                logger.debug(str4, "Delegated worker " + string + " threw exception in startWork.", th);
                synchronized (this.lock) {
                    try {
                        if (this.areConstraintsUnmet) {
                            str5 = ConstraintTrackingWorkerKt.TAG;
                            logger.debug(str5, "Constraints were unmet, Retrying.");
                            SettableFuture<ListenableWorker.Result> future4 = this.future;
                            AbstractC3292y.h(future4, "future");
                            ConstraintTrackingWorkerKt.setRetry(future4);
                            return;
                        }
                        SettableFuture<ListenableWorker.Result> future5 = this.future;
                        AbstractC3292y.h(future5, "future");
                        ConstraintTrackingWorkerKt.setFailed(future5);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        str2 = ConstraintTrackingWorkerKt.TAG;
        logger.debug(str2, "Constraints not met for delegate " + string + ". Requesting retry.");
        SettableFuture<ListenableWorker.Result> future6 = this.future;
        AbstractC3292y.h(future6, "future");
        ConstraintTrackingWorkerKt.setRetry(future6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$1(InterfaceC3488x0 job) {
        AbstractC3292y.i(job, "$job");
        job.cancel(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$3(ConstraintTrackingWorker this$0, InterfaceFutureC4260d innerFuture) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    SettableFuture<ListenableWorker.Result> future = this$0.future;
                    AbstractC3292y.h(future, "future");
                    ConstraintTrackingWorkerKt.setRetry(future);
                } else {
                    this$0.future.setFuture(innerFuture);
                }
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.setupAndRunConstraintTrackingWork();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final ListenableWorker getDelegate() {
        return this.delegate;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState state) {
        String str;
        AbstractC3292y.i(workSpec, "workSpec");
        AbstractC3292y.i(state, "state");
        Logger logger = Logger.get();
        str = ConstraintTrackingWorkerKt.TAG;
        logger.debug(str, "Constraints changed for " + workSpec);
        if (state instanceof ConstraintsState.ConstraintsNotMet) {
            synchronized (this.lock) {
                this.areConstraintsUnmet = true;
                Q5.I i8 = Q5.I.f8786a;
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        int i8;
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i8 = getStopReason();
            } else {
                i8 = 0;
            }
            listenableWorker.stop(i8);
        }
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC4260d startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: m.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.startWork$lambda$0(ConstraintTrackingWorker.this);
            }
        });
        SettableFuture<ListenableWorker.Result> future = this.future;
        AbstractC3292y.h(future, "future");
        return future;
    }
}
