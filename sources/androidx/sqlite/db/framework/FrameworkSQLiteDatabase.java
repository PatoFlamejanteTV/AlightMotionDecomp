package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import c6.InterfaceC2074p;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    private final List<Pair<String, String>> attachedDbs;
    private final SQLiteDatabase delegate;
    public static final Companion Companion = new Companion(null);
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final void execPerConnectionSQL(SQLiteDatabase sQLiteDatabase, String sql, Object[] objArr) {
            AbstractC3292y.i(sQLiteDatabase, "sQLiteDatabase");
            AbstractC3292y.i(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
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

    public FrameworkSQLiteDatabase(SQLiteDatabase delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.delegate = delegate;
        this.attachedDbs = delegate.getAttachedDbs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$0(InterfaceC2074p tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC3292y.i(query, "$query");
        AbstractC3292y.f(sQLiteQuery);
        query.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        AbstractC3292y.i(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        AbstractC3292y.i(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC3292y.i(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        AbstractC3292y.h(compileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        AbstractC3292y.i(table, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(table);
        if (str != null && str.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement compileStatement = compileStatement(sb2);
        SimpleSQLiteQuery.Companion.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, Object[] objArr) {
        AbstractC3292y.i(sql, "sql");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql) throws SQLException {
        AbstractC3292y.i(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.attachedDbs;
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
    public long insert(String table, int i8, ContentValues values) throws SQLException {
        AbstractC3292y.i(table, "table");
        AbstractC3292y.i(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(SQLiteDatabase sqLiteDatabase) {
        AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC3292y.d(this.delegate, sqLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
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
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i8) {
        return this.delegate.needUpgrade(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query) {
        AbstractC3292y.i(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z8) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, z8);
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

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m5448setMaximumSize(long j8) {
        this.delegate.setMaximumSize(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j8) {
        this.delegate.setPageSize(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i8) {
        this.delegate.setVersion(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int i8, ContentValues values, String str, Object[] objArr) {
        int length;
        String str2;
        AbstractC3292y.i(table, "table");
        AbstractC3292y.i(values, "values");
        if (values.size() != 0) {
            int size = values.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i8]);
            sb.append(table);
            sb.append(" SET ");
            int i9 = 0;
            for (String str3 : values.keySet()) {
                if (i9 > 0) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(str3);
                objArr2[i9] = values.get(str3);
                sb.append("=?");
                i9++;
            }
            if (objArr != null) {
                for (int i10 = size; i10 < length; i10++) {
                    objArr2[i10] = objArr[i10 - size];
                }
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(" WHERE ");
                sb.append(str);
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            SupportSQLiteStatement compileStatement = compileStatement(sb2);
            SimpleSQLiteQuery.Companion.bind(compileStatement, objArr2);
            return compileStatement.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) throws SQLException {
        AbstractC3292y.i(sql, "sql");
        AbstractC3292y.i(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query, Object[] bindArgs) {
        AbstractC3292y.i(query, "query");
        AbstractC3292y.i(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j8) {
        this.delegate.setMaximumSize(j8);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j8) {
        return this.delegate.yieldIfContendedSafely(j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query) {
        AbstractC3292y.i(query, "query");
        final FrameworkSQLiteDatabase$query$cursorFactory$1 frameworkSQLiteDatabase$query$cursorFactory$1 = new FrameworkSQLiteDatabase$query$cursorFactory$1(query);
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$0;
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0(InterfaceC2074p.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
            }
        }, query.getSql(), EMPTY_STRING_ARRAY, null);
        AbstractC3292y.h(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(16)
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC3292y.i(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        AbstractC3292y.f(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$1;
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1(SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        });
    }
}
