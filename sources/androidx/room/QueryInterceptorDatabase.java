package androidx.room;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        AbstractC3292y.i(delegate, "delegate");
        AbstractC3292y.i(queryCallbackExecutor, "queryCallbackExecutor");
        AbstractC3292y.i(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListener$lambda$2(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("END TRANSACTION", AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(QueryInterceptorDatabase this$0, String sql) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(sql, "$sql");
        this$0.queryCallback.onQuery(sql, AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$11(QueryInterceptorDatabase this$0, String sql, List inputArguments) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(sql, "$sql");
        AbstractC3292y.i(inputArguments, "$inputArguments");
        this$0.queryCallback.onQuery(sql, inputArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(QueryInterceptorDatabase this$0, String query) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(query, "$query");
        this$0.queryCallback.onQuery(query, AbstractC1435t.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$7(QueryInterceptorDatabase this$0, String query, Object[] bindArgs) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(query, "$query");
        AbstractC3292y.i(bindArgs, "$bindArgs");
        this$0.queryCallback.onQuery(query, AbstractC1428l.V0(bindArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(query, "$query");
        AbstractC3292y.i(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(query, "$query");
        AbstractC3292y.i(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery("TRANSACTION SUCCESSFUL", AbstractC1435t.m());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.l
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        AbstractC3292y.i(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        AbstractC3292y.i(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.h
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC3292y.i(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        AbstractC3292y.i(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.g
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        AbstractC3292y.i(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql) {
        AbstractC3292y.i(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.k
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(QueryInterceptorDatabase.this, sql);
            }
        });
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int i8, ContentValues values) {
        AbstractC3292y.i(table, "table");
        AbstractC3292y.i(values, "values");
        return this.delegate.insert(table, i8, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i8) {
        return this.delegate.needUpgrade(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String query) {
        AbstractC3292y.i(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.i
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(QueryInterceptorDatabase.this, query);
            }
        });
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z8) {
        this.delegate.setForeignKeyConstraintsEnabled(z8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        AbstractC3292y.i(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i8) {
        this.delegate.setMaxSqlCacheSize(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j8) {
        return this.delegate.setMaximumSize(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j8) {
        this.delegate.setPageSize(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.m
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i8) {
        this.delegate.setVersion(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int i8, ContentValues values, String str, Object[] objArr) {
        AbstractC3292y.i(table, "table");
        AbstractC3292y.i(values, "values");
        return this.delegate.update(table, i8, values, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j8) {
        return this.delegate.yieldIfContendedSafely(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql, Object[] bindArgs) {
        AbstractC3292y.i(sql, "sql");
        AbstractC3292y.i(bindArgs, "bindArgs");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC1435t.e(bindArgs));
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$11(QueryInterceptorDatabase.this, sql, arrayList);
            }
        });
        this.delegate.execSQL(sql, new List[]{arrayList});
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String query, final Object[] bindArgs) {
        AbstractC3292y.i(query, "query");
        AbstractC3292y.i(bindArgs, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.j
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$7(QueryInterceptorDatabase.this, query, bindArgs);
            }
        });
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        AbstractC3292y.i(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC3292y.i(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }
}
