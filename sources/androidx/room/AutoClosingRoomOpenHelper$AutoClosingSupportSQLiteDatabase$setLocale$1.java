package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Locale $locale;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1(Locale locale) {
        super(1);
        this.$locale = locale;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        db.setLocale(this.$locale);
        return null;
    }
}
