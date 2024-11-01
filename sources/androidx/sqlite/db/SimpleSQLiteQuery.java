package androidx.sqlite.db;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public static final Companion Companion = new Companion(null);
    private final Object[] bindArgs;
    private final String query;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void bind(SupportSQLiteProgram statement, Object[] objArr) {
            AbstractC3292y.i(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i8 = 0;
            while (i8 < length) {
                Object obj = objArr[i8];
                i8++;
                bind(statement, i8, obj);
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i8, Object obj) {
            if (obj == null) {
                supportSQLiteProgram.bindNull(i8);
                return;
            }
            if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i8, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                supportSQLiteProgram.bindDouble(i8, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                supportSQLiteProgram.bindDouble(i8, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                supportSQLiteProgram.bindLong(i8, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                supportSQLiteProgram.bindLong(i8, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                supportSQLiteProgram.bindLong(i8, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                supportSQLiteProgram.bindLong(i8, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                supportSQLiteProgram.bindString(i8, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                supportSQLiteProgram.bindLong(i8, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i8 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }
    }

    public SimpleSQLiteQuery(String query, Object[] objArr) {
        AbstractC3292y.i(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @SuppressLint({"SyntheticAccessor"})
    public static final void bind(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        Companion.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        AbstractC3292y.i(statement, "statement");
        Companion.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return this.query;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(String query) {
        this(query, null);
        AbstractC3292y.i(query, "query");
    }
}
