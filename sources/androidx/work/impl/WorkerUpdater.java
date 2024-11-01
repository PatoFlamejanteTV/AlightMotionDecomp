package androidx.work.impl;

import R5.AbstractC1435t;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class WorkerUpdater {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Operation enqueueUniquelyNamedPeriodic(final WorkManagerImpl workManagerImpl, final String name, final WorkRequest workRequest) {
        AbstractC3292y.i(workManagerImpl, "<this>");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(workRequest, "workRequest");
        final OperationImpl operationImpl = new OperationImpl();
        final WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 workerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 = new WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(workRequest, workManagerImpl, name, operationImpl);
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.impl.k
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.enqueueUniquelyNamedPeriodic$lambda$4(WorkManagerImpl.this, name, operationImpl, workerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1, workRequest);
            }
        });
        return operationImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueueUniquelyNamedPeriodic$lambda$4(WorkManagerImpl this_enqueueUniquelyNamedPeriodic, String name, OperationImpl operation, Function0 enqueueNew, WorkRequest workRequest) {
        AbstractC3292y.i(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        AbstractC3292y.i(name, "$name");
        AbstractC3292y.i(operation, "$operation");
        AbstractC3292y.i(enqueueNew, "$enqueueNew");
        AbstractC3292y.i(workRequest, "$workRequest");
        WorkSpecDao workSpecDao = this_enqueueUniquelyNamedPeriodic.getWorkDatabase().workSpecDao();
        List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(name);
        if (workSpecIdAndStatesForName.size() > 1) {
            failWorkTypeChanged(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) AbstractC1435t.o0(workSpecIdAndStatesForName);
        if (idAndState == null) {
            enqueueNew.invoke();
            return;
        }
        WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
        if (workSpec == null) {
            operation.markState(new Operation.State.FAILURE(new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!workSpec.isPeriodic()) {
            failWorkTypeChanged(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (idAndState.state == WorkInfo.State.CANCELLED) {
            workSpecDao.delete(idAndState.id);
            enqueueNew.invoke();
            return;
        }
        WorkSpec copy$default = WorkSpec.copy$default(workRequest.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388606, null);
        try {
            Processor processor = this_enqueueUniquelyNamedPeriodic.getProcessor();
            AbstractC3292y.h(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.getWorkDatabase();
            AbstractC3292y.h(workDatabase, "workDatabase");
            Configuration configuration = this_enqueueUniquelyNamedPeriodic.getConfiguration();
            AbstractC3292y.h(configuration, "configuration");
            List<Scheduler> schedulers = this_enqueueUniquelyNamedPeriodic.getSchedulers();
            AbstractC3292y.h(schedulers, "schedulers");
            updateWorkImpl(processor, workDatabase, configuration, schedulers, copy$default, workRequest.getTags());
            operation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            operation.markState(new Operation.State.FAILURE(th));
        }
    }

    private static final void failWorkTypeChanged(OperationImpl operationImpl, String str) {
        operationImpl.markState(new Operation.State.FAILURE(new UnsupportedOperationException(str)));
    }

    private static final WorkManager.UpdateResult updateWorkImpl(Processor processor, final WorkDatabase workDatabase, Configuration configuration, final List<? extends Scheduler> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.id;
        final WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 != null) {
            if (workSpec2.state.isFinished()) {
                return WorkManager.UpdateResult.NOT_APPLIED;
            }
            if (!(workSpec2.isPeriodic() ^ workSpec.isPeriodic())) {
                final boolean isEnqueued = processor.isEnqueued(str);
                if (!isEnqueued) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((Scheduler) it.next()).cancel(str);
                    }
                }
                workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkerUpdater.updateWorkImpl$lambda$2(WorkDatabase.this, workSpec2, workSpec, list, str, set, isEnqueued);
                    }
                });
                if (!isEnqueued) {
                    Schedulers.schedule(configuration, workDatabase, list);
                }
                return isEnqueued ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
            }
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = WorkerUpdater$updateWorkImpl$type$1.INSTANCE;
            throw new UnsupportedOperationException("Can't update " + ((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec2)) + " Worker to " + ((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec)) + " Worker. Update operation must preserve worker's type.");
        }
        throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec oldWorkSpec, WorkSpec newWorkSpec, List schedulers, String workSpecId, Set tags, boolean z8) {
        AbstractC3292y.i(workDatabase, "$workDatabase");
        AbstractC3292y.i(oldWorkSpec, "$oldWorkSpec");
        AbstractC3292y.i(newWorkSpec, "$newWorkSpec");
        AbstractC3292y.i(schedulers, "$schedulers");
        AbstractC3292y.i(workSpecId, "$workSpecId");
        AbstractC3292y.i(tags, "$tags");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkSpec copy$default = WorkSpec.copy$default(newWorkSpec, null, oldWorkSpec.state, null, null, null, null, 0L, 0L, 0L, null, oldWorkSpec.runAttemptCount, null, 0L, oldWorkSpec.lastEnqueueTime, 0L, 0L, false, null, oldWorkSpec.getPeriodCount(), oldWorkSpec.getGeneration() + 1, oldWorkSpec.getNextScheduleTimeOverride(), oldWorkSpec.getNextScheduleTimeOverrideGeneration(), 0, 4447229, null);
        if (newWorkSpec.getNextScheduleTimeOverrideGeneration() == 1) {
            copy$default.setNextScheduleTimeOverride(newWorkSpec.getNextScheduleTimeOverride());
            copy$default.setNextScheduleTimeOverrideGeneration(copy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(schedulers, copy$default));
        workTagDao.deleteByWorkSpecId(workSpecId);
        workTagDao.insertTags(workSpecId, tags);
        if (!z8) {
            workSpecDao.markWorkSpecScheduled(workSpecId, -1L);
            workDatabase.workProgressDao().delete(workSpecId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$3(SettableFuture settableFuture, WorkManagerImpl this_updateWorkImpl, WorkRequest workRequest) {
        AbstractC3292y.i(this_updateWorkImpl, "$this_updateWorkImpl");
        AbstractC3292y.i(workRequest, "$workRequest");
        if (settableFuture.isCancelled()) {
            return;
        }
        try {
            Processor processor = this_updateWorkImpl.getProcessor();
            AbstractC3292y.h(processor, "processor");
            WorkDatabase workDatabase = this_updateWorkImpl.getWorkDatabase();
            AbstractC3292y.h(workDatabase, "workDatabase");
            Configuration configuration = this_updateWorkImpl.getConfiguration();
            AbstractC3292y.h(configuration, "configuration");
            List<Scheduler> schedulers = this_updateWorkImpl.getSchedulers();
            AbstractC3292y.h(schedulers, "schedulers");
            settableFuture.set(updateWorkImpl(processor, workDatabase, configuration, schedulers, workRequest.getWorkSpec(), workRequest.getTags()));
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static final InterfaceFutureC4260d updateWorkImpl(final WorkManagerImpl workManagerImpl, final WorkRequest workRequest) {
        AbstractC3292y.i(workManagerImpl, "<this>");
        AbstractC3292y.i(workRequest, "workRequest");
        final SettableFuture future = SettableFuture.create();
        workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.impl.j
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.updateWorkImpl$lambda$3(SettableFuture.this, workManagerImpl, workRequest);
            }
        });
        AbstractC3292y.h(future, "future");
        return future;
    }
}
