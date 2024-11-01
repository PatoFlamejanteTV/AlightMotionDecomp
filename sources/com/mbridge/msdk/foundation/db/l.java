package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static l f20449a;

    private l(g gVar) {
        super(gVar);
    }

    public static l a(g gVar) {
        if (f20449a == null) {
            synchronized (l.class) {
                try {
                    if (f20449a == null) {
                        f20449a = new l(gVar);
                    }
                } finally {
                }
            }
        }
        return f20449a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:            if (r1 == null) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from load_stat"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r1 == 0) goto L1e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r2 == 0) goto L1e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            goto L1e
        L1a:
            r0 = move-exception
            goto L2e
        L1c:
            r2 = move-exception
            goto L26
        L1e:
            if (r1 == 0) goto L2c
        L20:
            r1.close()     // Catch: java.lang.Throwable -> L24
            goto L2c
        L24:
            r0 = move-exception
            goto L34
        L26:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2c
            goto L20
        L2c:
            monitor-exit(r4)
            return r0
        L2e:
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L24
        L33:
            throw r0     // Catch: java.lang.Throwable -> L24
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.l.a():int");
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.h hVar) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", hVar.b());
        contentValues.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, Integer.valueOf(hVar.a()));
        contentValues.put("adNum", Integer.valueOf(hVar.c()));
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, hVar.d());
        contentValues.put("fb", Integer.valueOf(hVar.e()));
        contentValues.put(CampaignEx.JSON_KEY_HB, Integer.valueOf(hVar.h()));
        contentValues.put("timeout", Integer.valueOf(hVar.i()));
        contentValues.put("network_type", Integer.valueOf(hVar.g()));
        contentValues.put("network_type_str", hVar.f());
        getWritableDatabase().insert("load_stat", null, contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.mbridge.msdk.foundation.entity.h>] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final synchronized List<com.mbridge.msdk.foundation.entity.h> a(int i8) {
        ?? r12;
        ArrayList arrayList;
        r12 = 0;
        r12 = 0;
        r12 = 0;
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("select * from load_stat LIMIT " + i8, null);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                int i9 = 0;
                                while (rawQuery.moveToNext() && i9 < i8) {
                                    try {
                                        i9++;
                                        int i10 = rawQuery.getInt(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_AD_SOURCE_ID));
                                        String string = rawQuery.getString(rawQuery.getColumnIndex("time"));
                                        int i11 = rawQuery.getInt(rawQuery.getColumnIndex("adNum"));
                                        String string2 = rawQuery.getString(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID));
                                        int i12 = rawQuery.getInt(rawQuery.getColumnIndex("fb"));
                                        int i13 = rawQuery.getInt(rawQuery.getColumnIndex("timeout"));
                                        int i14 = rawQuery.getInt(rawQuery.getColumnIndex("network_type"));
                                        String string3 = rawQuery.getString(rawQuery.getColumnIndex("network_type_str"));
                                        int i15 = rawQuery.getInt(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_HB));
                                        com.mbridge.msdk.foundation.entity.h hVar = new com.mbridge.msdk.foundation.entity.h(i10, string, i11, string2, i12, i13, i14);
                                        hVar.c(string3);
                                        hVar.c(i15);
                                        arrayList.add(hVar);
                                        int i16 = rawQuery.getInt(rawQuery.getColumnIndex("id"));
                                        if (getWritableDatabase() != null) {
                                            getWritableDatabase().delete("load_stat", "id = ?", new String[]{i16 + ""});
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        cursor = rawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        r12 = arrayList;
                                        return r12;
                                    }
                                }
                                r12 = arrayList;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r12 = rawQuery;
                        if (r12 != 0) {
                            r12.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
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
