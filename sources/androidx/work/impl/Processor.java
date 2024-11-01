package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import z0.InterfaceFutureC4260d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Processor implements ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();

    @Nullable
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map<String, Set<StartStopToken>> mWorkRuns = new HashMap();

    public Processor(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
    }

    @Nullable
    private WorkerWrapper cleanUpWorkerUnsafe(@NonNull String str) {
        boolean z8;
        WorkerWrapper remove = this.mForegroundWorkMap.remove(str);
        if (remove != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            remove = this.mEnqueuedWorkMap.remove(str);
        }
        this.mWorkRuns.remove(str);
        if (z8) {
            stopForegroundService();
        }
        return remove;
    }

    @Nullable
    private WorkerWrapper getWorkerWrapperUnsafe(@NonNull String str) {
        WorkerWrapper workerWrapper = this.mForegroundWorkMap.get(str);
        if (workerWrapper == null) {
            return this.mEnqueuedWorkMap.get(str);
        }
        return workerWrapper;
    }

    private static boolean interrupt(@NonNull String str, @Nullable WorkerWrapper workerWrapper, int i8) {
        if (workerWrapper != null) {
            workerWrapper.interrupt(i8);
            Logger.get().debug(TAG, "WorkerWrapper interrupted for " + str);
            return true;
        }
        Logger.get().debug(TAG, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnExecuted$2(WorkGenerationalId workGenerationalId, boolean z8) {
        synchronized (this.mLock) {
            try {
                Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workGenerationalId, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WorkSpec lambda$startWork$0(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return this.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWork$1(InterfaceFutureC4260d interfaceFutureC4260d, WorkerWrapper workerWrapper) {
        boolean z8;
        try {
            z8 = ((Boolean) interfaceFutureC4260d.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z8 = true;
        }
        onExecuted(workerWrapper, z8);
    }

    private void onExecuted(@NonNull WorkerWrapper workerWrapper, boolean z8) {
        synchronized (this.mLock) {
            try {
                WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                String workSpecId = workGenerationalId.getWorkSpecId();
                if (getWorkerWrapperUnsafe(workSpecId) == workerWrapper) {
                    cleanUpWorkerUnsafe(workSpecId);
                }
                Logger.get().debug(TAG, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z8);
                Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workGenerationalId, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void runOnExecuted(@NonNull final WorkGenerationalId workGenerationalId, final boolean z8) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                Processor.this.lambda$runOnExecuted$2(workGenerationalId, z8);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            try {
                if (!(!this.mForegroundWorkMap.isEmpty())) {
                    try {
                        this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                    } catch (Throwable th) {
                        Logger.get().error(TAG, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.mForegroundLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.mForegroundLock = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    @Nullable
    public WorkSpec getRunningWorkSpec(@NonNull String str) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapperUnsafe = getWorkerWrapperUnsafe(str);
                if (workerWrapperUnsafe != null) {
                    return workerWrapperUnsafe.getWorkSpec();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasWork() {
        boolean z8;
        synchronized (this.mLock) {
            try {
                if (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    public boolean isCancelled(@NonNull String str) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCancelledIds.contains(str);
        }
        return contains;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean z8;
        synchronized (this.mLock) {
            if (getWorkerWrapperUnsafe(str) != null) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            try {
                Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper remove = this.mEnqueuedWorkMap.remove(str);
                if (remove != null) {
                    if (this.mForegroundLock == null) {
                        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                        this.mForegroundLock = newWakeLock;
                        newWakeLock.acquire();
                    }
                    this.mForegroundWorkMap.put(str, remove);
                    ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, remove.getWorkGenerationalId(), foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean stopAndCancelWork(@NonNull String str, int i8) {
        WorkerWrapper cleanUpWorkerUnsafe;
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Processor cancelling " + str);
            this.mCancelledIds.add(str);
            cleanUpWorkerUnsafe = cleanUpWorkerUnsafe(str);
        }
        return interrupt(str, cleanUpWorkerUnsafe, i8);
    }

    public boolean stopForegroundWork(@NonNull StartStopToken startStopToken, int i8) {
        WorkerWrapper cleanUpWorkerUnsafe;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            cleanUpWorkerUnsafe = cleanUpWorkerUnsafe(workSpecId);
        }
        return interrupt(workSpecId, cleanUpWorkerUnsafe, i8);
    }

    public boolean stopWork(@NonNull StartStopToken startStopToken, int i8) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.get(workSpecId) != null) {
                    Logger.get().debug(TAG, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                    return false;
                }
                Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    return interrupt(workSpecId, cleanUpWorkerUnsafe(workSpecId), i8);
                }
                return false;
            } finally {
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId id = startStopToken.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkSpec lambda$startWork$0;
                lambda$startWork$0 = Processor.this.lambda$startWork$0(arrayList, workSpecId);
                return lambda$startWork$0;
            }
        });
        if (workSpec == null) {
            Logger.get().warning(TAG, "Didn't find WorkSpec for id " + id);
            runOnExecuted(id, false);
            return false;
        }
        synchronized (this.mLock) {
            try {
                if (isEnqueued(workSpecId)) {
                    Set<StartStopToken> set = this.mWorkRuns.get(workSpecId);
                    if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                        set.add(startStopToken);
                        Logger.get().debug(TAG, "Work " + id + " is already enqueued for processing");
                    } else {
                        runOnExecuted(id, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != id.getGeneration()) {
                    runOnExecuted(id, false);
                    return false;
                }
                final WorkerWrapper build = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
                final InterfaceFutureC4260d future = build.getFuture();
                future.addListener(new Runnable() { // from class: androidx.work.impl.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Processor.this.lambda$startWork$1(future, build);
                    }
                }, this.mWorkTaskExecutor.getMainThreadExecutor());
                this.mEnqueuedWorkMap.put(workSpecId, build);
                HashSet hashSet = new HashSet();
                hashSet.add(startStopToken);
                this.mWorkRuns.put(workSpecId, hashSet);
                this.mWorkTaskExecutor.getSerialTaskExecutor().execute(build);
                Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
