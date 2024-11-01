package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;
    private final String sqlStatement;

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        AbstractC3292y.i(delegate, "delegate");
        AbstractC3292y.i(sqlStatement, "sqlStatement");
        AbstractC3292y.i(queryCallbackExecutor, "queryCallbackExecutor");
        AbstractC3292y.i(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(QueryInterceptorStatement this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void saveArgsToCache(int i8, Object obj) {
        int i9 = i8 - 1;
        if (i9 >= this.bindArgsCache.size()) {
            int size = (i9 - this.bindArgsCache.size()) + 1;
            for (int i10 = 0; i10 < size; i10++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i9, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i8, byte[] value) {
        AbstractC3292y.i(value, "value");
        saveArgsToCache(i8, value);
        this.delegate.bindBlob(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i8, double d8) {
        saveArgsToCache(i8, Double.valueOf(d8));
        this.delegate.bindDouble(i8, d8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i8, long j8) {
        saveArgsToCache(i8, Long.valueOf(j8));
        this.delegate.bindLong(i8, j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i8) {
        Object[] array = this.bindArgsCache.toArray(new Object[0]);
        AbstractC3292y.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        saveArgsToCache(i8, Arrays.copyOf(array, array.length));
        this.delegate.bindNull(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i8, String value) {
        AbstractC3292y.i(value, "value");
        saveArgsToCache(i8, value);
        this.delegate.bindString(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.execute$lambda$0(QueryInterceptorStatement.this);
            }
        });
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForString$lambda$4(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForString();
    }
}
