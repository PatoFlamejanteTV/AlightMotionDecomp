package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function1 function1) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = function1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final T invoke(SupportSQLiteDatabase db) {
        String str;
        AbstractC3292y.i(db, "db");
        str = this.this$0.sql;
        SupportSQLiteStatement compileStatement = db.compileStatement(str);
        this.this$0.doBinds(compileStatement);
        return this.$block.invoke(compileStatement);
    }
}
