package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RoomDatabase$endTransaction$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ RoomDatabase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$endTransaction$1(RoomDatabase roomDatabase) {
        super(1);
        this.this$0 = roomDatabase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(SupportSQLiteDatabase it) {
        AbstractC3292y.i(it, "it");
        this.this$0.internalEndTransaction();
        return null;
    }
}
