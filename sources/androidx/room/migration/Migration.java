package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes3.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i8, int i9) {
        this.startVersion = i8;
        this.endVersion = i9;
    }

    public abstract void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
}
