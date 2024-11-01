package androidx.work.impl;

import android.os.Build;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Migration_3_4 extends Migration {
    public static final Migration_3_4 INSTANCE = new Migration_3_4();

    private Migration_3_4() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        if (Build.VERSION.SDK_INT >= 23) {
            db.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
