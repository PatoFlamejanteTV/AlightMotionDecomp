package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import q6.InterfaceC3821f;
import z0.InterfaceFutureC4260d;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes3.dex */
public abstract class WorkManager {

    /* loaded from: classes3.dex */
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManager() {
    }

    @NonNull
    @Deprecated
    public static WorkManager getInstance() {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
        if (workManagerImpl != null) {
            return workManagerImpl;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void initialize(@NonNull Context context, @NonNull Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    public static boolean isInitialized() {
        return WorkManagerImpl.isInitialized();
    }

    @NonNull
    public final WorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract WorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public final WorkContinuation beginWith(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract Operation cancelAllWork();

    @NonNull
    public abstract Operation cancelAllWorkByTag(@NonNull String str);

    @NonNull
    public abstract Operation cancelUniqueWork(@NonNull String str);

    @NonNull
    public abstract Operation cancelWorkById(@NonNull UUID uuid);

    @NonNull
    public abstract PendingIntent createCancelPendingIntent(@NonNull UUID uuid);

    @NonNull
    public final Operation enqueue(@NonNull WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @NonNull
    public abstract Operation enqueue(@NonNull List<? extends WorkRequest> list);

    @NonNull
    public abstract Operation enqueueUniquePeriodicWork(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWorkRequest);

    @NonNull
    public Operation enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract Operation enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract Configuration getConfiguration();

    @NonNull
    public abstract InterfaceFutureC4260d getLastCancelAllTimeMillis();

    @NonNull
    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfoById(@NonNull UUID uuid);

    @NonNull
    public abstract InterfaceC3821f getWorkInfoByIdFlow(@NonNull UUID uuid);

    @NonNull
    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID uuid);

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfos(@NonNull WorkQuery workQuery);

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfosByTag(@NonNull String str);

    @NonNull
    public abstract InterfaceC3821f getWorkInfosByTagFlow(@NonNull String str);

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String str);

    @NonNull
    public abstract InterfaceC3821f getWorkInfosFlow(@NonNull WorkQuery workQuery);

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfosForUniqueWork(@NonNull String str);

    @NonNull
    public abstract InterfaceC3821f getWorkInfosForUniqueWorkFlow(@NonNull String str);

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String str);

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(@NonNull WorkQuery workQuery);

    @NonNull
    public abstract Operation pruneWork();

    @NonNull
    public abstract InterfaceFutureC4260d updateWork(@NonNull WorkRequest workRequest);

    @NonNull
    public static WorkManager getInstance(@NonNull Context context) {
        return WorkManagerImpl.getInstance(context);
    }
}
