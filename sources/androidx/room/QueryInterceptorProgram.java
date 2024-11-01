package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i8, Object obj) {
        int size;
        int i9 = i8 - 1;
        if (i9 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i9) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i9) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i9, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i8, byte[] value) {
        AbstractC3292y.i(value, "value");
        saveArgsToCache(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i8, double d8) {
        saveArgsToCache(i8, Double.valueOf(d8));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i8, long j8) {
        saveArgsToCache(i8, Long.valueOf(j8));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i8) {
        saveArgsToCache(i8, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i8, String value) {
        AbstractC3292y.i(value, "value");
        saveArgsToCache(i8, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }
}
