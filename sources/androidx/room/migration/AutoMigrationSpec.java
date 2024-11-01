package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes3.dex */
public interface AutoMigrationSpec {
    void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
}
