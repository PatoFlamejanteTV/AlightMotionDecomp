package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SharedSQLiteStatement$stmt$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SharedSQLiteStatement this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.this$0 = sharedSQLiteStatement;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SupportSQLiteStatement invoke() {
        SupportSQLiteStatement createNewStatement;
        createNewStatement = this.this$0.createNewStatement();
        return createNewStatement;
    }
}
