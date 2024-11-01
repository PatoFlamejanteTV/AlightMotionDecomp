package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Migration_7_8 extends Migration {
    public static final Migration_7_8 INSTANCE = new Migration_7_8();

    private Migration_7_8() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        db.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
