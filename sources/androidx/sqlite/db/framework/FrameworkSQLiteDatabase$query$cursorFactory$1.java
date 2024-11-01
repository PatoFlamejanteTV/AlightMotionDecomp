package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ SupportSQLiteQuery $query;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteDatabase$query$cursorFactory$1(SupportSQLiteQuery supportSQLiteQuery) {
        super(4);
        this.$query = supportSQLiteQuery;
    }

    @Override // c6.InterfaceC2074p
    public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        SupportSQLiteQuery supportSQLiteQuery = this.$query;
        AbstractC3292y.f(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
