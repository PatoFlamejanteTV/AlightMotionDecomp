package com.mbridge.msdk.foundation.db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a<T> {
    protected g mHelper;

    public a(g gVar) {
        this.mHelper = gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseDao", "getReadableDatabase error");
                return null;
            }
            return null;
        }
        return this.mHelper.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseDao", "getWritableDatabase error");
                return null;
            }
            return null;
        }
        return this.mHelper.d();
    }
}
