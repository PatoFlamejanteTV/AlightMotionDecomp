package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.PreferenceUtils;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class RescheduleMigration extends Migration {
    private final Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleMigration(Context mContext, int i8, int i9) {
        super(i8, i9);
        AbstractC3292y.i(mContext, "mContext");
        this.mContext = mContext;
    }

    public final Context getMContext() {
        return this.mContext;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        if (this.endVersion >= 10) {
            db.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{PreferenceUtils.KEY_RESCHEDULE_NEEDED, 1});
        } else {
            this.mContext.getSharedPreferences(PreferenceUtils.PREFERENCES_FILE_NAME, 0).edit().putBoolean(PreferenceUtils.KEY_RESCHEDULE_NEEDED, true).apply();
        }
    }
}
