package com.mbridge.msdk.f;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes4.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            if (!sQLiteDatabase.isOpen()) {
                return false;
            }
            if (sQLiteDatabase.isReadOnly()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
