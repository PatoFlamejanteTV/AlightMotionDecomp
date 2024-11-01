package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 extends AbstractC3293z implements Function1 {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(SupportSQLiteStatement obj) {
        AbstractC3292y.i(obj, "obj");
        return Long.valueOf(obj.simpleQueryForLong());
    }
}
