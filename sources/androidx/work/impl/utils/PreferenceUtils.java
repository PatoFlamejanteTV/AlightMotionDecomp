package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class PreferenceUtils {
    public static final String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    public static final String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    private static final String KEY_LAST_FORCE_STOP_MS = "last_force_stop_ms";
    public static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
    private final WorkDatabase mWorkDatabase;

    public PreferenceUtils(@NonNull WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getLastCancelAllTimeMillisLiveData$0(Long l8) {
        long j8;
        if (l8 != null) {
            j8 = l8.longValue();
        } else {
            j8 = 0;
        }
        return Long.valueOf(j8);
    }

    public static void migrateLegacyPreferences(@NonNull Context context, @NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        if (sharedPreferences.contains(KEY_RESCHEDULE_NEEDED) || sharedPreferences.contains(KEY_LAST_CANCEL_ALL_TIME_MS)) {
            long j8 = 0;
            long j9 = sharedPreferences.getLong(KEY_LAST_CANCEL_ALL_TIME_MS, 0L);
            if (sharedPreferences.getBoolean(KEY_RESCHEDULE_NEEDED, false)) {
                j8 = 1;
            }
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(INSERT_PREFERENCE, new Object[]{KEY_LAST_CANCEL_ALL_TIME_MS, Long.valueOf(j9)});
                supportSQLiteDatabase.execSQL(INSERT_PREFERENCE, new Object[]{KEY_RESCHEDULE_NEEDED, Long.valueOf(j8)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    @NonNull
    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return Transformations.map(this.mWorkDatabase.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new Function() { // from class: androidx.work.impl.utils.i
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Long lambda$getLastCancelAllTimeMillisLiveData$0;
                lambda$getLastCancelAllTimeMillisLiveData$0 = PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
                return lambda$getLastCancelAllTimeMillisLiveData$0;
            }
        });
    }

    public long getLastForceStopEventMillis() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_LAST_FORCE_STOP_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        if (longValue != null && longValue.longValue() == 1) {
            return true;
        }
        return false;
    }

    public void setLastCancelAllTimeMillis(long j8) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_LAST_CANCEL_ALL_TIME_MS, Long.valueOf(j8)));
    }

    public void setLastForceStopEventMillis(long j8) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_LAST_FORCE_STOP_MS, Long.valueOf(j8)));
    }

    public void setNeedsReschedule(boolean z8) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(KEY_RESCHEDULE_NEEDED, z8));
    }
}
