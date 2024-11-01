package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final AutoCloser autoCloser;
    private final SupportSQLiteOpenHelper.Factory delegate;

    public AutoClosingRoomOpenHelperFactory(SupportSQLiteOpenHelper.Factory delegate, AutoCloser autoCloser) {
        AbstractC3292y.i(delegate, "delegate");
        AbstractC3292y.i(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public AutoClosingRoomOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC3292y.i(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
