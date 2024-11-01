package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class IdGeneratorKt {
    public static final int INITIAL_ID = 0;
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    public static final void migrateLegacyIdGenerator(Context context, SupportSQLiteDatabase sqLiteDatabase) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i8 = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i9 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{NEXT_JOB_SCHEDULER_ID_KEY, Integer.valueOf(i8)});
                sqLiteDatabase.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{NEXT_ALARM_MANAGER_ID_KEY, Integer.valueOf(i9)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextId(WorkDatabase workDatabase, String str) {
        int i8;
        Long longValue = workDatabase.preferenceDao().getLongValue(str);
        int i9 = 0;
        if (longValue != null) {
            i8 = (int) longValue.longValue();
        } else {
            i8 = 0;
        }
        if (i8 != Integer.MAX_VALUE) {
            i9 = i8 + 1;
        }
        updatePreference(workDatabase, str, i9);
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePreference(WorkDatabase workDatabase, String str, int i8) {
        workDatabase.preferenceDao().insertPreference(new Preference(str, Long.valueOf(i8)));
    }
}
