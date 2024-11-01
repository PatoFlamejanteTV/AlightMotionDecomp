package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class j extends a<com.mbridge.msdk.foundation.entity.f> {

    /* renamed from: a, reason: collision with root package name */
    private static j f20447a;

    private j(g gVar) {
        super(gVar);
    }

    public static synchronized j a(g gVar) {
        j jVar;
        synchronized (j.class) {
            try {
                if (f20447a == null) {
                    f20447a = new j(gVar);
                }
                jVar = f20447a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final synchronized void a(String str) {
        try {
            String str2 = "time<" + (System.currentTimeMillis() - 86400000) + " and " + CampaignEx.JSON_KEY_CAMPAIGN_UNITID + "=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", str2, strArr);
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.f fVar) {
        try {
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (getWritableDatabase() == null) {
                return;
            }
            if (fVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", fVar.a());
                contentValues.put("time", Long.valueOf(fVar.b()));
                contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, fVar.d());
                contentValues.put("type", Integer.valueOf(fVar.c()));
                if (a(fVar.d(), fVar.a())) {
                    getWritableDatabase().update("fq_info", contentValues, "id = " + fVar.a() + " AND " + CampaignEx.JSON_KEY_CAMPAIGN_UNITID + " = " + fVar.d(), null);
                } else {
                    getWritableDatabase().insert("fq_info", null, contentValues);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean a(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId='" + str + "' and id='" + str2 + "'", null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
