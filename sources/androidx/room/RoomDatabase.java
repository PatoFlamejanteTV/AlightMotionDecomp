package androidx.room;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* loaded from: classes3.dex */
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SupportSQLiteOpenHelper.Factory factory;
        private JournalMode journalMode;
        private final Class<T> klass;
        private final MigrationContainer migrationContainer;
        private Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private Executor queryCallbackExecutor;
        private Executor queryExecutor;
        private boolean requireMigration;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder(Context context, Class<T> klass, String str) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec autoMigrationSpec) {
            AbstractC3292y.i(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            AbstractC3292y.i(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public Builder<T> addMigrations(Migration... migrations) {
            AbstractC3292y.i(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Migration migration : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                AbstractC3292y.f(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                AbstractC3292y.f(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public Builder<T> addTypeConverter(Object typeConverter) {
            AbstractC3292y.i(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T build() {
            SupportSQLiteOpenHelper.Factory factory;
            int i8;
            int i9;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                AbstractC3292y.f(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!(!this.migrationsNotRequiredFrom.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory factory2 = this.factory;
            if (factory2 == null) {
                factory2 = new FrameworkSQLiteOpenHelperFactory();
            }
            if (factory2 != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name != null) {
                        long j8 = this.autoCloseTimeout;
                        TimeUnit timeUnit = this.autoCloseTimeUnit;
                        if (timeUnit != null) {
                            Executor executor2 = this.queryExecutor;
                            if (executor2 != null) {
                                factory2 = new AutoClosingRoomOpenHelperFactory(factory2, new AutoCloser(j8, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name != null) {
                        int i10 = 0;
                        if (str == null) {
                            i8 = 0;
                        } else {
                            i8 = 1;
                        }
                        File file = this.copyFromFile;
                        if (file == null) {
                            i9 = 0;
                        } else {
                            i9 = 1;
                        }
                        Callable<InputStream> callable = this.copyFromInputStream;
                        if (callable != null) {
                            i10 = 1;
                        }
                        if (i8 + i9 + i10 == 1) {
                            factory2 = new SQLiteCopyOpenHelperFactory(str, file, callable, factory2);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                factory2 = null;
            }
            if (factory2 != null) {
                QueryCallback queryCallback = this.queryCallback;
                if (queryCallback != null) {
                    Executor executor3 = this.queryCallbackExecutor;
                    if (executor3 != null) {
                        if (queryCallback != null) {
                            factory = new QueryInterceptorOpenHelperFactory(factory2, executor3, queryCallback);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    factory = factory2;
                }
                Context context = this.context;
                String str2 = this.name;
                MigrationContainer migrationContainer = this.migrationContainer;
                List<Callback> list = this.callbacks;
                boolean z8 = this.allowMainThreadQueries;
                JournalMode resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
                Executor executor4 = this.queryExecutor;
                if (executor4 != null) {
                    Executor executor5 = this.transactionExecutor;
                    if (executor5 != null) {
                        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z8, resolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
                        T t8 = (T) Room.getGeneratedImplementation(this.klass, "_Impl");
                        t8.init(databaseConfiguration);
                        return t8;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public Builder<T> createFromAsset(String databaseFilePath) {
            AbstractC3292y.i(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public Builder<T> createFromFile(File databaseFile) {
            AbstractC3292y.i(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable) {
            AbstractC3292y.i(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            Intent intent;
            if (this.name != null) {
                intent = new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class);
            } else {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(int... startVersions) {
            AbstractC3292y.i(startVersions, "startVersions");
            for (int i8 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i8));
            }
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long j8, TimeUnit autoCloseTimeUnit) {
            AbstractC3292y.i(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j8 >= 0) {
                this.autoCloseTimeout = j8;
                this.autoCloseTimeUnit = autoCloseTimeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            AbstractC3292y.i(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent invalidationServiceIntent) {
            AbstractC3292y.i(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback queryCallback, Executor executor) {
            AbstractC3292y.i(queryCallback, "queryCallback");
            AbstractC3292y.i(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            AbstractC3292y.i(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            AbstractC3292y.i(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromAsset(String databaseFilePath, PrepackagedDatabaseCallback callback) {
            AbstractC3292y.i(databaseFilePath, "databaseFilePath");
            AbstractC3292y.i(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public Builder<T> createFromFile(File databaseFile, PrepackagedDatabaseCallback callback) {
            AbstractC3292y.i(databaseFile, "databaseFile");
            AbstractC3292y.i(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable, PrepackagedDatabaseCallback callback) {
            AbstractC3292y.i(inputStreamCallable, "inputStreamCallable");
            AbstractC3292y.i(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public void onCreate(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }

        public void onOpen(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            AbstractC3292y.i(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!isLowRamDevice((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
        }
    }

    /* loaded from: classes3.dex */
    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC3292y.h(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (!inTransaction()) {
            getInvalidationTracker().refreshVersionsAsync();
        }
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (this.allowMainThreadQueries || (!isMainThread$room_runtime_release())) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$beginTransaction$1(this));
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            AbstractC3292y.h(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC3292y.i(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    protected abstract InvalidationTracker createInvalidationTracker();

    protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$endTransaction$1(this));
        }
    }

    protected final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        AbstractC3292y.i(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC1435t.m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        AbstractC3292y.h(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper == null) {
            AbstractC3292y.y("internalOpenHelper");
            return null;
        }
        return supportSQLiteOpenHelper;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            AbstractC3292y.y("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return a0.f();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Q.h();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            AbstractC3292y.y("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    public <T> T getTypeConverter(Class<T> klass) {
        AbstractC3292y.i(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(DatabaseConfiguration configuration) {
        boolean z8 = false;
        AbstractC3292y.i(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        for (Class<? extends AutoMigrationSpec> cls : requiredAutoMigrationSpecs) {
            int size = configuration.autoMigrationSpecs.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i8 = size - 1;
                    if (cls.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                        bitSet.set(size);
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        size = i8;
                    }
                }
            }
            size = -1;
            if (size >= 0) {
                this.autoMigrationSpecs.put(cls, configuration.autoMigrationSpecs.get(size));
            } else {
                throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
        }
        int size2 = configuration.autoMigrationSpecs.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i9 = size2 - 1;
                if (bitSet.get(size2)) {
                    if (i9 < 0) {
                        break;
                    } else {
                        size2 = i9;
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                }
            }
        }
        for (Migration migration : getAutoMigrations(this.autoMigrationSpecs)) {
            if (!configuration.migrationContainer.contains(migration.startVersion, migration.endVersion)) {
                configuration.migrationContainer.addMigrations(migration);
            }
        }
        SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
        if (sQLiteCopyOpenHelper != null) {
            sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
            getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
        }
        if (configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
            z8 = true;
        }
        getOpenHelper().setWriteAheadLoggingEnabled(z8);
        this.mCallbacks = configuration.callbacks;
        this.internalQueryExecutor = configuration.queryExecutor;
        this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        this.writeAheadLoggingEnabled = z8;
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name != null) {
                getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
        BitSet bitSet2 = new BitSet();
        for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
            Class<?> key = entry.getKey();
            for (Class<?> cls2 : entry.getValue()) {
                int size3 = configuration.typeConverters.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i10 = size3 - 1;
                        if (cls2.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                            bitSet2.set(size3);
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size3 = i10;
                        }
                    }
                }
                size3 = -1;
                if (size3 >= 0) {
                    this.typeConverters.put(cls2, configuration.typeConverters.get(size3));
                } else {
                    throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                }
            }
        }
        int size4 = configuration.typeConverters.size() - 1;
        if (size4 < 0) {
            return;
        }
        while (true) {
            int i11 = size4 - 1;
            if (bitSet2.get(size4)) {
                if (i11 >= 0) {
                    size4 = i11;
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void internalInitInvalidationTracker(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db);
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            isOpen = autoCloser.isActive();
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase != null) {
                isOpen = supportSQLiteDatabase.isOpen();
            } else {
                bool = null;
                return AbstractC3292y.d(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return AbstractC3292y.d(bool, Boolean.TRUE);
    }

    public final Cursor query(SupportSQLiteQuery query) {
        AbstractC3292y.i(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        AbstractC3292y.i(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public Cursor query(String query, Object[] objArr) {
        AbstractC3292y.i(query, "query");
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    /* loaded from: classes3.dex */
    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        private final void addMigration(Migration migration) {
            int i8 = migration.startVersion;
            int i9 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i8);
            TreeMap<Integer, Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i9))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i9)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i9), migration);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r6.migrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                kotlin.jvm.internal.AbstractC3292y.h(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                kotlin.jvm.internal.AbstractC3292y.h(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                kotlin.jvm.internal.AbstractC3292y.f(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public void addMigrations(List<? extends Migration> migrations) {
            AbstractC3292y.i(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i8, int i9) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (migrations.containsKey(Integer.valueOf(i8))) {
                Map<Integer, Migration> map = migrations.get(Integer.valueOf(i8));
                if (map == null) {
                    map = Q.h();
                }
                return map.containsKey(Integer.valueOf(i9));
            }
            return false;
        }

        public List<Migration> findMigrationPath(int i8, int i9) {
            boolean z8;
            if (i8 == i9) {
                return AbstractC1435t.m();
            }
            if (i9 > i8) {
                z8 = true;
            } else {
                z8 = false;
            }
            return findUpMigrationPath(new ArrayList(), z8, i8, i9);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public void addMigrations(Migration... migrations) {
            AbstractC3292y.i(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC3292y.i(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    public <V> V runInTransaction(Callable<V> body) {
        AbstractC3292y.i(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
