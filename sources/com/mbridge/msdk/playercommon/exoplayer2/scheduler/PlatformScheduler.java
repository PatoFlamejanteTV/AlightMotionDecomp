package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class PlatformScheduler implements Scheduler {
    private static final String KEY_REQUIREMENTS = "requirements";
    private static final String KEY_SERVICE_ACTION = "service_action";
    private static final String KEY_SERVICE_PACKAGE = "service_package";
    private static final String TAG = "PlatformScheduler";
    private final int jobId;
    private final JobScheduler jobScheduler;
    private final ComponentName jobServiceComponentName;

    /* loaded from: classes4.dex */
    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.logd("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new Requirements(extras.getInt(PlatformScheduler.KEY_REQUIREMENTS)).checkRequirements(this)) {
                PlatformScheduler.logd("Requirements are met");
                String string = extras.getString(PlatformScheduler.KEY_SERVICE_ACTION);
                String string2 = extras.getString(PlatformScheduler.KEY_SERVICE_PACKAGE);
                Intent intent = new Intent(string).setPackage(string2);
                PlatformScheduler.logd("Starting service action: " + string + " package: " + string2);
                Util.startForegroundService(this, intent);
                return false;
            }
            PlatformScheduler.logd("Requirements are not met");
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    public PlatformScheduler(Context context, int i8) {
        this.jobId = i8;
        this.jobServiceComponentName = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
    }

    private static JobInfo buildJobInfo(int i8, ComponentName componentName, Requirements requirements, String str, String str2) {
        int i9;
        JobInfo.Builder builder = new JobInfo.Builder(i8, componentName);
        int requiredNetworkType = requirements.getRequiredNetworkType();
        if (requiredNetworkType != 0) {
            if (requiredNetworkType != 1) {
                i9 = 2;
                if (requiredNetworkType != 2) {
                    i9 = 3;
                    if (requiredNetworkType != 3) {
                        i9 = 4;
                        if (requiredNetworkType == 4) {
                            if (Util.SDK_INT < 26) {
                                throw new UnsupportedOperationException();
                            }
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    } else if (Util.SDK_INT < 24) {
                        throw new UnsupportedOperationException();
                    }
                }
            } else {
                i9 = 1;
            }
        } else {
            i9 = 0;
        }
        builder.setRequiredNetworkType(i9);
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt(KEY_REQUIREMENTS, requirements.getRequirementsData());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.Scheduler
    public final boolean cancel() {
        logd("Canceling job: " + this.jobId);
        this.jobScheduler.cancel(this.jobId);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.Scheduler
    public final boolean schedule(Requirements requirements, String str, String str2) {
        int schedule = this.jobScheduler.schedule(buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str));
        logd("Scheduling job: " + this.jobId + " result: " + schedule);
        if (schedule == 1) {
            return true;
        }
        return false;
    }
}
