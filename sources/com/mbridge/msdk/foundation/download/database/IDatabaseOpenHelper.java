package com.mbridge.msdk.foundation.download.database;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes4.dex */
public interface IDatabaseOpenHelper {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
