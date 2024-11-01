package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class CancelWorkRunnable implements Runnable {
    private final OperationImpl mOperation = new OperationImpl();

    @NonNull
    public static CancelWorkRunnable forAll(@NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.4
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            void runInternal() {
                WorkDatabase workDatabase = WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                    while (it.hasNext()) {
                        cancel(WorkManagerImpl.this, it.next());
                    }
                    new PreferenceUtils(WorkManagerImpl.this.getWorkDatabase()).setLastCancelAllTimeMillis(WorkManagerImpl.this.getConfiguration().getClock().currentTimeMillis());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    @NonNull
    public static CancelWorkRunnable forId(@NonNull final UUID uuid, @NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            void runInternal() {
                WorkDatabase workDatabase = WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    cancel(WorkManagerImpl.this, uuid.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(WorkManagerImpl.this);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    @NonNull
    public static CancelWorkRunnable forName(@NonNull final String str, @NonNull final WorkManagerImpl workManagerImpl, final boolean z8) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            void runInternal() {
                WorkDatabase workDatabase = WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
                    while (it.hasNext()) {
                        cancel(WorkManagerImpl.this, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (z8) {
                        reschedulePendingWorkers(WorkManagerImpl.this);
                    }
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    @NonNull
    public static CancelWorkRunnable forTag(@NonNull final String str, @NonNull final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            @WorkerThread
            void runInternal() {
                WorkDatabase workDatabase = WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
                    while (it.hasNext()) {
                        cancel(WorkManagerImpl.this, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(WorkManagerImpl.this);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    private void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    void cancel(WorkManagerImpl workManagerImpl, String str) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), str);
        workManagerImpl.getProcessor().stopAndCancelWork(str, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    @NonNull
    public Operation getOperation() {
        return this.mOperation;
    }

    void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runInternal();
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }

    abstract void runInternal();
}
