package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class RemoteWorkManager {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected RemoteWorkManager() {
    }

    @NonNull
    public static RemoteWorkManager getInstance(@NonNull Context context) {
        RemoteWorkManager remoteWorkManager = WorkManagerImpl.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @NonNull
    public final RemoteWorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract RemoteWorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public final RemoteWorkContinuation beginWith(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return beginWith(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract RemoteWorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract InterfaceFutureC4260d cancelAllWork();

    @NonNull
    public abstract InterfaceFutureC4260d cancelAllWorkByTag(@NonNull String str);

    @NonNull
    public abstract InterfaceFutureC4260d cancelUniqueWork(@NonNull String str);

    @NonNull
    public abstract InterfaceFutureC4260d cancelWorkById(@NonNull UUID uuid);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract InterfaceFutureC4260d enqueue(@NonNull WorkContinuation workContinuation);

    @NonNull
    public abstract InterfaceFutureC4260d enqueue(@NonNull WorkRequest workRequest);

    @NonNull
    public abstract InterfaceFutureC4260d enqueue(@NonNull List<WorkRequest> list);

    @NonNull
    public abstract InterfaceFutureC4260d enqueueUniquePeriodicWork(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWorkRequest);

    @NonNull
    public final InterfaceFutureC4260d enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public abstract InterfaceFutureC4260d enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public abstract InterfaceFutureC4260d getWorkInfos(@NonNull WorkQuery workQuery);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract InterfaceFutureC4260d setForegroundAsync(@NonNull String str, @NonNull ForegroundInfo foregroundInfo);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract InterfaceFutureC4260d setProgress(@NonNull UUID uuid, @NonNull Data data);
}
