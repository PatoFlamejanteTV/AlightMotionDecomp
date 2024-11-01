package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Alarms {
    private static final String TAG = Logger.tagWithPrefix("Alarms");

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(19)
    /* loaded from: classes3.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static void setExact(AlarmManager alarmManager, int i8, long j8, PendingIntent pendingIntent) {
            alarmManager.setExact(i8, j8, pendingIntent);
        }
    }

    private Alarms() {
    }

    public static void cancelAlarm(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, workGenerationalId, systemIdInfo.systemId);
            Logger.get().debug(TAG, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            systemIdInfoDao.removeSystemIdInfo(workGenerationalId);
        }
    }

    private static void cancelExactAlarm(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, int i8) {
        int i9;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent createDelayMetIntent = CommandHandler.createDelayMetIntent(context, workGenerationalId);
        if (Build.VERSION.SDK_INT >= 23) {
            i9 = 603979776;
        } else {
            i9 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i8, createDelayMetIntent, i9);
        if (service != null && alarmManager != null) {
            Logger.get().debug(TAG, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i8 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void setAlarm(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull WorkGenerationalId workGenerationalId, long j8) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, workGenerationalId, systemIdInfo.systemId);
            setExactAlarm(context, workGenerationalId, systemIdInfo.systemId, j8);
        } else {
            int nextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
            systemIdInfoDao.insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalId, nextAlarmManagerId));
            setExactAlarm(context, workGenerationalId, nextAlarmManagerId, j8);
        }
    }

    private static void setExactAlarm(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, int i8, long j8) {
        int i9;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 23) {
            i9 = 201326592;
        } else {
            i9 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i8, CommandHandler.createDelayMetIntent(context, workGenerationalId), i9);
        if (alarmManager != null) {
            Api19Impl.setExact(alarmManager, 0, j8, service);
        }
    }
}
