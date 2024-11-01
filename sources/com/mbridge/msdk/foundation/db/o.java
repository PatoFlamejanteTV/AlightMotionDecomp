package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class o extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static o f20453a;

    private o(g gVar) {
        super(gVar);
    }

    public static o a(g gVar) {
        if (f20453a == null) {
            synchronized (o.class) {
                try {
                    if (f20453a == null) {
                        f20453a = new o(gVar);
                    }
                } finally {
                }
            }
        }
        return f20453a;
    }

    public final synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public final synchronized void a(String str, String str2, int i8) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("placement_id", str);
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str2);
        contentValues.put("ad_type", Integer.valueOf(i8));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<com.mbridge.msdk.foundation.entity.i>] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i8) {
        ?? r12;
        ArrayList arrayList;
        r12 = 0;
        r12 = 0;
        r12 = 0;
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = " + i8, null);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList(rawQuery.getCount());
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(rawQuery.getString(rawQuery.getColumnIndex("placement_id")), rawQuery.getString(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID)), i8));
                                    } catch (Exception e8) {
                                        e = e8;
                                        cursor = rawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused) {
                                            }
                                        }
                                        r12 = arrayList;
                                        return r12;
                                    }
                                }
                                r12 = arrayList;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r12 = rawQuery;
                            if (r12 != 0) {
                                try {
                                    r12.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        arrayList = null;
                    }
                }
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Exception e10) {
                e = e10;
                arrayList = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return r12;
    }
}
