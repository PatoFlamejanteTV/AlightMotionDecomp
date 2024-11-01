package androidx.room;

import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z9, boolean z10, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
        AbstractC3292y.i(typeConverters, "typeConverters");
        AbstractC3292y.i(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z8;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z9;
        this.allowDestructiveMigrationOnDowngrade = z10;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int i8, int i9) {
        if ((i8 > i9 && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        if (set != null && set.contains(Integer.valueOf(i8))) {
            return false;
        }
        return true;
    }

    public boolean isMigrationRequiredFrom(int i8) {
        return isMigrationRequired(i8, i8 + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, boolean z9, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, queryExecutor, (Intent) null, z9, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) AbstractC1435t.m(), (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) AbstractC1435t.m(), (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) AbstractC1435t.m(), (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) AbstractC1435t.m(), (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, prepackagedDatabaseCallback, (List<? extends Object>) AbstractC1435t.m(), (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, (List<? extends AutoMigrationSpec>) AbstractC1435t.m());
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
        AbstractC3292y.i(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z8, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z8, journalMode, queryExecutor, transactionExecutor, z9 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z10, z11, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC3292y.i(migrationContainer, "migrationContainer");
        AbstractC3292y.i(journalMode, "journalMode");
        AbstractC3292y.i(queryExecutor, "queryExecutor");
        AbstractC3292y.i(transactionExecutor, "transactionExecutor");
        AbstractC3292y.i(typeConverters, "typeConverters");
        AbstractC3292y.i(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
