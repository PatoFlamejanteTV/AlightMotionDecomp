package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemJobService extends JobService implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("SystemJobService");
    private final Map<WorkGenerationalId, JobParameters> mJobParameters = new HashMap();
    private final StartStopTokens mStartStopTokens = new StartStopTokens();
    private WorkLauncher mWorkLauncher;
    private WorkManagerImpl mWorkManagerImpl;

    @RequiresApi(24)
    /* loaded from: classes3.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static String[] getTriggeredContentAuthorities(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @DoNotInline
        static Uri[] getTriggeredContentUris(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @RequiresApi(28)
    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Network getNetwork(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @RequiresApi(31)
    /* loaded from: classes3.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static int getStopReason(JobParameters jobParameters) {
            return SystemJobService.stopReason(jobParameters.getStopReason());
        }
    }

    static int stopReason(int i8) {
        switch (i8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i8;
            default:
                return WorkInfo.STOP_REASON_UNKNOWN;
        }
    }

    @Nullable
    private static WorkGenerationalId workGenerationalIdFromJobParameters(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
            this.mWorkManagerImpl = workManagerImpl;
            Processor processor = workManagerImpl.getProcessor();
            this.mWorkLauncher = new WorkLauncherImpl(processor, this.mWorkManagerImpl.getWorkTaskExecutor());
            processor.addExecutionListener(this);
        } catch (IllegalStateException e8) {
            if (Application.class.equals(getApplication().getClass())) {
                Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z8) {
        JobParameters remove;
        Logger.get().debug(TAG, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(workGenerationalId);
        }
        this.mStartStopTokens.remove(workGenerationalId);
        if (remove != null) {
            jobFinished(remove, z8);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        WorkerParameters.RuntimeExtras runtimeExtras;
        if (this.mWorkManagerImpl == null) {
            Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.mJobParameters) {
            try {
                if (this.mJobParameters.containsKey(workGenerationalIdFromJobParameters)) {
                    Logger.get().debug(TAG, "Job is already being executed by SystemJobService: " + workGenerationalIdFromJobParameters);
                    return false;
                }
                Logger.get().debug(TAG, "onStartJob for " + workGenerationalIdFromJobParameters);
                this.mJobParameters.put(workGenerationalIdFromJobParameters, jobParameters);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 24) {
                    runtimeExtras = new WorkerParameters.RuntimeExtras();
                    if (Api24Impl.getTriggeredContentUris(jobParameters) != null) {
                        runtimeExtras.triggeredContentUris = Arrays.asList(Api24Impl.getTriggeredContentUris(jobParameters));
                    }
                    if (Api24Impl.getTriggeredContentAuthorities(jobParameters) != null) {
                        runtimeExtras.triggeredContentAuthorities = Arrays.asList(Api24Impl.getTriggeredContentAuthorities(jobParameters));
                    }
                    if (i8 >= 28) {
                        runtimeExtras.network = Api28Impl.getNetwork(jobParameters);
                    }
                } else {
                    runtimeExtras = null;
                }
                this.mWorkLauncher.startWork(this.mStartStopTokens.tokenFor(workGenerationalIdFromJobParameters), runtimeExtras);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        int i8;
        if (this.mWorkManagerImpl == null) {
            Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(jobParameters);
        if (workGenerationalIdFromJobParameters == null) {
            Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        Logger.get().debug(TAG, "onStopJob for " + workGenerationalIdFromJobParameters);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(workGenerationalIdFromJobParameters);
        }
        StartStopToken remove = this.mStartStopTokens.remove(workGenerationalIdFromJobParameters);
        if (remove != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i8 = Api31Impl.getStopReason(jobParameters);
            } else {
                i8 = WorkInfo.STOP_REASON_UNKNOWN;
            }
            this.mWorkLauncher.stopWorkWithReason(remove, i8);
        }
        return !this.mWorkManagerImpl.getProcessor().isCancelled(workGenerationalIdFromJobParameters.getWorkSpecId());
    }
}
