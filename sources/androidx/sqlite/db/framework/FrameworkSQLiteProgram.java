package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    private final SQLiteProgram delegate;

    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i8, byte[] value) {
        AbstractC3292y.i(value, "value");
        this.delegate.bindBlob(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i8, double d8) {
        this.delegate.bindDouble(i8, d8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i8, long j8) {
        this.delegate.bindLong(i8, j8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i8) {
        this.delegate.bindNull(i8);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i8, String value) {
        AbstractC3292y.i(value, "value");
        this.delegate.bindString(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
