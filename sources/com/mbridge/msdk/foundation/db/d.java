package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aj;

/* loaded from: classes4.dex */
public class d extends a<JumpLoaderResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20417a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static d f20418b;

    private d(g gVar) {
        super(gVar);
    }

    public static synchronized d a(g gVar) {
        d dVar;
        synchronized (d.class) {
            try {
                if (f20418b == null) {
                    f20418b = new d(gVar);
                }
                dVar = f20418b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    private synchronized boolean c(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id='" + str + "' AND unitid= '" + str2 + "'", null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:            if (r11 != null) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:            if (r11 != null) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:            r11.close();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.click.entity.JumpLoaderResult b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = "campaignclick"
            java.lang.String r4 = "id=? AND unitid=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r8 = 0
            r9 = 0
            r3 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r11 == 0) goto L47
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            if (r12 <= 0) goto L47
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            if (r12 == 0) goto L47
            java.lang.String r12 = "result"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            if (r1 != 0) goto L47
            java.lang.Object r12 = com.mbridge.msdk.foundation.tools.aj.a(r12)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            com.mbridge.msdk.click.entity.JumpLoaderResult r12 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r12     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            r11.close()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r12
        L40:
            r11 = move-exception
            goto L69
        L42:
            r12 = move-exception
            r0 = r11
            goto L63
        L45:
            r12 = move-exception
            goto L51
        L47:
            if (r11 == 0) goto L61
        L49:
            r11.close()     // Catch: java.lang.Throwable -> L40
            goto L61
        L4d:
            r12 = move-exception
            goto L63
        L4f:
            r12 = move-exception
            r11 = r0
        L51:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L5e
            java.lang.String r1 = com.mbridge.msdk.foundation.db.d.f20417a     // Catch: java.lang.Throwable -> L42
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L42
            com.mbridge.msdk.foundation.tools.ad.b(r1, r12)     // Catch: java.lang.Throwable -> L42
        L5e:
            if (r11 == 0) goto L61
            goto L49
        L61:
            monitor-exit(r10)
            return r0
        L63:
            if (r0 == 0) goto L68
            r0.close()     // Catch: java.lang.Throwable -> L40
        L68:
            throw r12     // Catch: java.lang.Throwable -> L40
        L69:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.d.b(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public final synchronized void a() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - " + CampaignEx.JSON_KEY_ST_TS + ") > cti", null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f20417a, e8.getMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                String a9 = aj.a(campaignEx.getJumpResult());
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                contentValues.put("unitid", str);
                contentValues.put("result", a9);
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
                if (b9 != null && b9.Z() > 0) {
                    contentValues.put("cpei", Integer.valueOf(b9.Z() * 1000));
                }
                if (b9 != null && b9.aa() > 0) {
                    contentValues.put("cpoci", Integer.valueOf(b9.aa() * 1000));
                }
                if (c(campaignEx.getId(), str)) {
                    String str2 = "id = " + campaignEx.getId() + " AND unitid = " + str;
                    if (getWritableDatabase() == null) {
                        return -1L;
                    }
                    return getWritableDatabase().update("campaignclick", contentValues, str2, null);
                }
                return getWritableDatabase().insert("campaignclick", null, contentValues);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(f20417a, e8.getMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id='" + str + "' AND unitid='" + str2 + "' AND cti + " + CampaignEx.JSON_KEY_ST_TS + " > " + System.currentTimeMillis(), null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f20417a, e8.getMessage());
            }
            return false;
        }
    }
}
