package androidx.room;

import a6.AbstractC1677b;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public static final Companion Companion = new Companion(null);
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            Cursor query = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z8 = false;
                if (query.moveToFirst()) {
                    if (query.getInt(0) == 0) {
                        z8 = true;
                    }
                }
                AbstractC1677b.a(query, null);
                return z8;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1677b.a(query, th);
                    throw th2;
                }
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            Cursor query = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z8 = false;
                if (query.moveToFirst()) {
                    if (query.getInt(0) != 0) {
                        z8 = true;
                    }
                }
                AbstractC1677b.a(query, null);
                return z8;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1677b.a(query, th);
                    throw th2;
                }
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public static abstract class Delegate {
        public final int version;

        public Delegate(int i8) {
            this.version = i8;
        }

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase database) {
            AbstractC3292y.i(database, "database");
        }

        public void onPreMigrate(SupportSQLiteDatabase database) {
            AbstractC3292y.i(database, "database");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            validateMigration(db);
            return new ValidationResult(true, null);
        }

        protected void validateMigration(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z8, String str) {
            this.isValid = z8;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(delegate, "delegate");
        AbstractC3292y.i(identityHash, "identityHash");
        AbstractC3292y.i(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str;
        if (Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            Cursor query = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                } else {
                    str = null;
                }
                AbstractC1677b.a(query, null);
                if (!AbstractC3292y.d(this.identityHash, str) && !AbstractC3292y.d(this.legacyHash, str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + str);
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1677b.a(query, th);
                    throw th2;
                }
            }
        }
        ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
        if (onValidateSchema.isValid) {
            this.delegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
        } else {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
        }
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        super.onConfigure(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        boolean hasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db);
        this.delegate.createAllTables(db);
        if (!hasEmptySchema$room_runtime_release) {
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db);
        this.delegate.onCreate(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase db, int i8, int i9) {
        AbstractC3292y.i(db, "db");
        onUpgrade(db, i8, i9);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        super.onOpen(db);
        checkIdentity(db);
        this.delegate.onOpen(db);
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase db, int i8, int i9) {
        List<Migration> findMigrationPath;
        AbstractC3292y.i(db, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (findMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i8, i9)) != null) {
            this.delegate.onPreMigrate(db);
            Iterator<T> it = findMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(db);
            }
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db);
            if (onValidateSchema.isValid) {
                this.delegate.onPostMigrate(db);
                updateIdentity(db);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg);
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i8, i9)) {
            this.delegate.dropAllTables(db);
            this.delegate.createAllTables(db);
            return;
        }
        throw new IllegalStateException("A migration from " + i8 + " to " + i9 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(delegate, "delegate");
        AbstractC3292y.i(legacyHash, "legacyHash");
    }
}
