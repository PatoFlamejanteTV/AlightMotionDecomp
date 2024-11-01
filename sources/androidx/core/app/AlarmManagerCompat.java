package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AlarmManagerCompat {

    @RequiresApi(21)
    /* loaded from: classes.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static AlarmManager.AlarmClockInfo createAlarmClockInfo(long j8, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j8, pendingIntent);
        }

        @DoNotInline
        static void setAlarmClock(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @RequiresApi(23)
    /* loaded from: classes.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static void setAndAllowWhileIdle(AlarmManager alarmManager, int i8, long j8, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i8, j8, pendingIntent);
        }

        @DoNotInline
        static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i8, long j8, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i8, j8, pendingIntent);
        }
    }

    @RequiresApi(31)
    /* loaded from: classes.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    private AlarmManagerCompat() {
    }

    public static boolean canScheduleExactAlarms(@NonNull AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.canScheduleExactAlarms(alarmManager);
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public static void setAlarmClock(@NonNull AlarmManager alarmManager, long j8, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        Api21Impl.setAlarmClock(alarmManager, Api21Impl.createAlarmClockInfo(j8, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(@NonNull AlarmManager alarmManager, int i8, long j8, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setAndAllowWhileIdle(alarmManager, i8, j8, pendingIntent);
        } else {
            alarmManager.set(i8, j8, pendingIntent);
        }
    }

    public static void setExact(@NonNull AlarmManager alarmManager, int i8, long j8, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExact(i8, j8, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(@NonNull AlarmManager alarmManager, int i8, long j8, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setExactAndAllowWhileIdle(alarmManager, i8, j8, pendingIntent);
        } else {
            setExact(alarmManager, i8, j8, pendingIntent);
        }
    }
}
