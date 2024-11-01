package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.Clock;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class CleanupCallback extends RoomDatabase.Callback {
    private final Clock clock;

    public CleanupCallback(Clock clock) {
        AbstractC3292y.i(clock, "clock");
        this.clock = clock;
    }

    private final long getPruneDate() {
        return this.clock.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    private final String getPruneSQL() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + getPruneDate() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public final Clock getClock() {
        return this.clock;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        super.onOpen(db);
        db.beginTransaction();
        try {
            db.execSQL(getPruneSQL());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
