package androidx.sqlite.db.framework;

import Q5.InterfaceC1416k;
import Q5.l;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;
    private final SupportSQLiteOpenHelper.Callback callback;
    private final Context context;
    private final InterfaceC1416k lazyDelegate;
    private final String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DBRefHolder {
        private FrameworkSQLiteDatabase db;

        public DBRefHolder(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        public final FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        public final void setDb(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final Companion Companion = new Companion(null);
        private final boolean allowDataLossOnRecovery;
        private final SupportSQLiteOpenHelper.Callback callback;
        private final Context context;
        private final DBRefHolder dbRef;
        private final ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName, Throwable cause) {
                super(cause);
                AbstractC3292y.i(callbackName, "callbackName");
                AbstractC3292y.i(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* loaded from: classes3.dex */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final FrameworkSQLiteDatabase getWrappedDb(DBRefHolder refHolder, SQLiteDatabase sqLiteDatabase) {
                AbstractC3292y.i(refHolder, "refHolder");
                AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase db = refHolder.getDb();
                if (db == null || !db.isDelegate(sqLiteDatabase)) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                    refHolder.setDb(frameworkSQLiteDatabase);
                    return frameworkSQLiteDatabase;
                }
                return db;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dbRef, final SupportSQLiteOpenHelper.Callback callback, boolean z8) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(SupportSQLiteOpenHelper.Callback.this, dbRef, sQLiteDatabase);
                }
            });
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(dbRef, "dbRef");
            AbstractC3292y.i(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z8;
            if (str == null) {
                str = UUID.randomUUID().toString();
                AbstractC3292y.h(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            AbstractC3292y.h(cacheDir, "context.cacheDir");
            this.lock = new ProcessLock(str, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SupportSQLiteOpenHelper.Callback callback, DBRefHolder dbRef, SQLiteDatabase dbObj) {
            AbstractC3292y.i(callback, "$callback");
            AbstractC3292y.i(dbRef, "$dbRef");
            Companion companion = Companion;
            AbstractC3292y.h(dbObj, "dbObj");
            callback.onCorruption(companion.getWrappedDb(dbRef, dbObj));
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z8) {
            if (z8) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC3292y.h(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC3292y.h(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase innerGetDatabase(boolean z8) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(FrameworkSQLiteOpenHelper.TAG, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(z8);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z8);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i8 = WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 != 4) {
                                        if (!(cause instanceof SQLiteException)) {
                                            throw cause;
                                        }
                                    } else {
                                        throw cause;
                                    }
                                } else {
                                    throw cause;
                                }
                            } else {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.allowDataLossOnRecovery) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(z8);
                    } catch (CallbackException e8) {
                        throw e8.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        public final SupportSQLiteOpenHelper.Callback getCallback() {
            return this.callback;
        }

        public final Context getContext() {
            return this.context;
        }

        public final DBRefHolder getDbRef() {
            return this.dbRef;
        }

        public final SupportSQLiteDatabase getSupportDatabase(boolean z8) {
            boolean z9;
            try {
                ProcessLock processLock = this.lock;
                if (!this.opened && getDatabaseName() != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                processLock.lock(z9);
                this.migrated = false;
                SQLiteDatabase innerGetDatabase = innerGetDatabase(z8);
                if (this.migrated) {
                    close();
                    SupportSQLiteDatabase supportDatabase = getSupportDatabase(z8);
                    this.lock.unlock();
                    return supportDatabase;
                }
                FrameworkSQLiteDatabase wrappedDb = getWrappedDb(innerGetDatabase);
                this.lock.unlock();
                return wrappedDb;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }

        public final FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase sqLiteDatabase) {
            AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
            return Companion.getWrappedDb(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            try {
                this.callback.onConfigure(getWrappedDb(db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i8, int i9) {
            AbstractC3292y.i(db, "db");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(db), i8, i9);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            AbstractC3292y.i(db, "db");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i8, int i9) {
            AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sqLiteDatabase), i8, i9);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(callback, "callback");
    }

    private final OpenHelper getDelegate() {
        return (OpenHelper) this.lazyDelegate.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.name;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z8) {
        if (this.lazyDelegate.isInitialized()) {
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(getDelegate(), z8);
        }
        this.writeAheadLoggingEnabled = z8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z8) {
        this(context, str, callback, z8, false, 16, null);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(callback, "callback");
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z8, boolean z9) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z8;
        this.allowDataLossOnRecovery = z9;
        this.lazyDelegate = l.b(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z8, boolean z9, int i8, AbstractC3284p abstractC3284p) {
        this(context, str, callback, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? false : z9);
    }
}
