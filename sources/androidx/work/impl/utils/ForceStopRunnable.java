package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.os.UserManagerCompat;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ForceStopRunnable implements Runnable {

    @VisibleForTesting
    static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final long BACKOFF_DURATION_MS = 300;

    @VisibleForTesting
    static final int MAX_ATTEMPTS = 3;
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
    private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650);
    private final Context mContext;
    private final PreferenceUtils mPreferenceUtils;
    private int mRetryCount = 0;
    private final WorkManagerImpl mWorkManager;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent != null && ForceStopRunnable.ACTION_FORCE_STOP_RESCHEDULE.equals(intent.getAction())) {
                Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.setAlarm(context);
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mPreferenceUtils = workManagerImpl.getPreferenceUtils();
    }

    @VisibleForTesting
    static Intent getIntent(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction(ACTION_FORCE_STOP_RESCHEDULE);
        return intent;
    }

    private static PendingIntent getPendingIntent(Context context, int i8) {
        return PendingIntent.getBroadcast(context, -1, getIntent(context), i8);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void setAlarm(Context context) {
        int i8;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = 167772160;
        } else {
            i8 = 134217728;
        }
        PendingIntent pendingIntent = getPendingIntent(context, i8);
        long currentTimeMillis = System.currentTimeMillis() + TEN_YEARS;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, pendingIntent);
        }
    }

    @VisibleForTesting
    public boolean cleanUp() {
        boolean z8;
        boolean z9;
        if (Build.VERSION.SDK_INT >= 23) {
            z8 = SystemJobScheduler.reconcileJobs(this.mContext, this.mWorkManager.getWorkDatabase());
        } else {
            z8 = false;
        }
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            if (runningWork != null && !runningWork.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.setStopReason(workSpec.id, WorkInfo.STOP_REASON_UNKNOWN);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (!z9 && !z8) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    @VisibleForTesting
    public void forceStopRunnable() {
        boolean cleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            Logger.get().debug(TAG, "Rescheduling Workers.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mWorkManager.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(TAG, "Application was force-stopped, rescheduling.");
            this.mWorkManager.rescheduleEligibleWork();
            this.mPreferenceUtils.setLastForceStopEventMillis(this.mWorkManager.getConfiguration().getClock().currentTimeMillis());
        } else if (cleanUp) {
            Logger.get().debug(TAG, "Found unfinished work, scheduling it.");
            Schedulers.schedule(this.mWorkManager.getConfiguration(), this.mWorkManager.getWorkDatabase(), this.mWorkManager.getSchedulers());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean isForceStopped() {
        int i8;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                i8 = 570425344;
            } else {
                i8 = 536870912;
            }
            PendingIntent pendingIntent = getPendingIntent(this.mContext, i8);
            if (i9 >= 30) {
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.mContext.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long lastForceStopEventMillis = this.mPreferenceUtils.getLastForceStopEventMillis();
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        ApplicationExitInfo a9 = b.a(historicalProcessExitReasons.get(i10));
                        reason = a9.getReason();
                        if (reason == 10) {
                            timestamp = a9.getTimestamp();
                            if (timestamp >= lastForceStopEventMillis) {
                                return true;
                            }
                        }
                    }
                }
            } else if (pendingIntent == null) {
                setAlarm(this.mContext);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e8) {
            e = e8;
            Logger.get().warning(TAG, "Ignoring exception", e);
            return true;
        } catch (SecurityException e9) {
            e = e9;
            Logger.get().warning(TAG, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    public boolean multiProcessChecks() {
        Configuration configuration = this.mWorkManager.getConfiguration();
        if (TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            Logger.get().debug(TAG, "The default process name was not specified.");
            return true;
        }
        boolean isDefaultProcess = ProcessUtils.isDefaultProcess(this.mContext, configuration);
        Logger.get().debug(TAG, "Is default app process = " + isDefaultProcess);
        return isDefaultProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i8;
        String str;
        try {
            if (!multiProcessChecks()) {
                return;
            }
            while (true) {
                try {
                    WorkDatabasePathHelper.migrateDatabase(this.mContext);
                    Logger.get().debug(TAG, "Performing cleanup operations.");
                    try {
                        forceStopRunnable();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e8) {
                        i8 = this.mRetryCount + 1;
                        this.mRetryCount = i8;
                        if (i8 >= 3) {
                            if (UserManagerCompat.isUserUnlocked(this.mContext)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            Logger logger = Logger.get();
                            String str2 = TAG;
                            logger.error(str2, str, e8);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e8);
                            Consumer<Throwable> initializationExceptionHandler = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                            if (initializationExceptionHandler != null) {
                                Logger.get().debug(str2, "Routing exception to the specified exception handler", illegalStateException);
                                initializationExceptionHandler.accept(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            long j8 = i8 * BACKOFF_DURATION_MS;
                            Logger.get().debug(TAG, "Retrying after " + j8, e8);
                            sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                        }
                    }
                    long j82 = i8 * BACKOFF_DURATION_MS;
                    Logger.get().debug(TAG, "Retrying after " + j82, e8);
                    sleep(((long) this.mRetryCount) * BACKOFF_DURATION_MS);
                } catch (SQLiteException e9) {
                    Logger.get().error(TAG, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e9);
                    Consumer<Throwable> initializationExceptionHandler2 = this.mWorkManager.getConfiguration().getInitializationExceptionHandler();
                    if (initializationExceptionHandler2 != null) {
                        initializationExceptionHandler2.accept(illegalStateException2);
                    } else {
                        throw illegalStateException2;
                    }
                }
            }
        } finally {
            this.mWorkManager.onForceStopRunnableCompleted();
        }
    }

    @VisibleForTesting
    public boolean shouldRescheduleWorkers() {
        return this.mWorkManager.getPreferenceUtils().getNeedsReschedule();
    }

    @VisibleForTesting
    public void sleep(long j8) {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException unused) {
        }
    }
}
