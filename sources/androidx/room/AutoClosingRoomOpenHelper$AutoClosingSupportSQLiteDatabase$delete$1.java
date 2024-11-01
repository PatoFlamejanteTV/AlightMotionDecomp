package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $table;
    final /* synthetic */ Object[] $whereArgs;
    final /* synthetic */ String $whereClause;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1(String str, String str2, Object[] objArr) {
        super(1);
        this.$table = str;
        this.$whereClause = str2;
        this.$whereArgs = objArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        return Integer.valueOf(db.delete(this.$table, this.$whereClause, this.$whereArgs));
    }
}
