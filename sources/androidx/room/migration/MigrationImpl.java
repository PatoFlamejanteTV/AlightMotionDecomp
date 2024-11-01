package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
final class MigrationImpl extends Migration {
    private final Function1 migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationImpl(int i8, int i9, Function1 migrateCallback) {
        super(i8, i9);
        AbstractC3292y.i(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    public final Function1 getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        AbstractC3292y.i(database, "database");
        this.migrateCallback.invoke(database);
    }
}
