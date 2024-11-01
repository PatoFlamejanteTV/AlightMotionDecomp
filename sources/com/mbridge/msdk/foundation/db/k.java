package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class k extends a<com.mbridge.msdk.foundation.entity.g> {

    /* renamed from: a, reason: collision with root package name */
    private static k f20448a;

    private k(g gVar) {
        super(gVar);
    }

    public static k a(g gVar) {
        if (f20448a == null) {
            synchronized (k.class) {
                try {
                    if (f20448a == null) {
                        f20448a = new k(gVar);
                    }
                } finally {
                }
            }
        }
        return f20448a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:            if (r0 == null) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:            if (r0 != null) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:            r0.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:            return null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long[] b() {
        /*
            r7 = this;
            java.lang.String r0 = "SELECT id FROM frequence WHERE fc_a<impression_count"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getReadableDatabase()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            if (r0 == 0) goto L37
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r2 <= 0) goto L37
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            long[] r2 = new long[r2]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r3 = 0
        L1a:
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r4 == 0) goto L33
            java.lang.String r4 = "id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            long r4 = r0.getLong(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r2[r3] = r4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            int r3 = r3 + 1
            goto L1a
        L2f:
            r1 = move-exception
            goto L45
        L31:
            goto L4b
        L33:
            r0.close()
            return r2
        L37:
            if (r0 == 0) goto L4e
        L39:
            r0.close()
            goto L4e
        L3d:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L45
        L42:
            r0 = r1
            goto L4b
        L45:
            if (r0 == 0) goto L4a
            r0.close()
        L4a:
            throw r1
        L4b:
            if (r0 == 0) goto L4e
            goto L39
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.k.b():long[]");
    }

    public final synchronized void a() {
        try {
            String str = "ts<" + (System.currentTimeMillis() - 86400000);
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", str, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean b(String str) {
        Cursor cursor = null;
        try {
            try {
                synchronized (str) {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id='" + str + "'", null);
                    if (rawQuery != null && rawQuery.getCount() > 0) {
                        rawQuery.close();
                        return true;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception unused) {
            if (0 != 0) {
                cursor.close();
            }
            return false;
        }
    }

    public final synchronized void a(String str) {
        if (b(str)) {
            String str2 = "UPDATE frequence Set impression_count=impression_count+1 WHERE id=" + str;
            if (getReadableDatabase() != null) {
                getReadableDatabase().execSQL(str2);
            }
        }
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.g gVar) {
        if (!b(gVar.a())) {
            b(gVar);
        }
    }

    private synchronized long b(com.mbridge.msdk.foundation.entity.g gVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", gVar.a());
            contentValues.put("fc_a", Integer.valueOf(gVar.c()));
            contentValues.put("fc_b", Integer.valueOf(gVar.d()));
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(gVar.f()));
            contentValues.put("impression_count", Integer.valueOf(gVar.e()));
            contentValues.put("click_count", Integer.valueOf(gVar.b()));
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(gVar.f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
