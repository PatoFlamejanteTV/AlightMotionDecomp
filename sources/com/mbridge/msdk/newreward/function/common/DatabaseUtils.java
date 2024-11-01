package com.mbridge.msdk.newreward.function.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
    }

    public static void beginTransaction(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseUtils", "beginTransaction", e8);
            }
        }
    }

    public static void closeCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseUtils", "closeCursor", e8);
            }
        }
    }

    public static void endTransaction(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase) && sQLiteDatabase.inTransaction()) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("DatabaseUtils", "endTransaction", e8);
                }
            }
        }
    }

    public static boolean isDatabaseAvailable(SQLiteDatabase sQLiteDatabase) {
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

    public static void setTransactionSuccessful(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseUtils", "setTransactionSuccessful", e8);
            }
        }
    }
}
