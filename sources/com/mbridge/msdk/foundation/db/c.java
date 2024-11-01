package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20415a = "com.mbridge.msdk.foundation.db.c";

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f20416b;

    private c(g gVar) {
        super(gVar);
    }

    public static c a(g gVar) {
        if (f20416b == null) {
            synchronized (c.class) {
                try {
                    if (f20416b == null) {
                        f20416b = new c(gVar);
                    }
                } finally {
                }
            }
        }
        return f20416b;
    }

    public final void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1 , show_time = " + System.currentTimeMillis() + " WHERE " + ("rid='" + str + "' AND unitid = '" + str3 + "' AND state = 1"));
        }
    }

    public final long a(String str, String str2, String str3, int i8) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i8));
        return getWritableDatabase().update("CacheCampaign", r4, "rid='" + str + "' AND unitid = '" + str3 + "' AND state = 0", null);
    }

    private synchronized boolean a(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid='" + str + "' AND unitid = '" + str2 + "'", null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public final synchronized void a(String str, int i8) {
        String str2;
        SQLiteDatabase writableDatabase;
        if (i8 <= 0) {
            i8 = 1;
        }
        try {
            str2 = "unitid = '" + str + "' AND ( (" + CampaignEx.JSON_KEY_ST_TS + " + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= " + i8 + " )";
            writableDatabase = getWritableDatabase();
        } catch (Exception e8) {
            ad.b("CacheCampaignDao", e8.getLocalizedMessage());
        }
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.execSQL("delete from CacheCampaign where " + str2);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        try {
            if (a(str2, str)) {
                String str4 = "unitid = '" + str + "' AND rid = '" + str2 + "'";
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.execSQL("delete from CacheCampaign where " + str4);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.b("CampaignDao", e9.getLocalizedMessage());
        }
    }

    public final long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                        if (b9 == null) {
                            com.mbridge.msdk.c.h.a();
                            b9 = com.mbridge.msdk.c.i.a();
                        }
                        candidateCacheTime = b9.ac();
                    }
                }
                try {
                    if (af.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid='" + campaignEx.getRequestId() + "' AND lrid='" + campaignEx.getLocalRequestId() + "' AND unitid = '" + str + "' AND state = 1", null);
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e9) {
                e9.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:            if (r9 == null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x012f, code lost:            if (r9 != null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x013d, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0131, code lost:            r9.close();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.b.b> a(java.lang.String r7, int r8, long r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }
}
