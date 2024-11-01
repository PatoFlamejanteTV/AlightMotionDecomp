package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private static String f20450a = "ReplaceTempDao";

    /* renamed from: b, reason: collision with root package name */
    private static m f20451b;

    private m(g gVar) {
        super(gVar);
    }

    public static m a(g gVar) {
        if (f20451b == null) {
            synchronized (f.class) {
                try {
                    if (f20451b == null) {
                        f20451b = new m(gVar);
                    }
                } finally {
                }
            }
        }
        return f20451b;
    }

    private boolean b(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key='" + str + "'", null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
                return false;
            } catch (Exception unused2) {
                return false;
            }
        }
        return false;
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!b(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = '" + str + "'", null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:            r4.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:            if (r4 == null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:            if (r4 != null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:            return r1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT * FROM c_replace_temp WHERE d_key = '"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r3.getReadableDatabase()
            android.database.Cursor r4 = r0.rawQuery(r4, r1)
            if (r4 == 0) goto L4d
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L4b
            if (r0 <= 0) goto L4d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            r1 = r0
        L34:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L6a
            java.lang.String r0 = "d_value"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L4b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            r1 = r2
            goto L34
        L4b:
            r0 = move-exception
            goto L53
        L4d:
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L69
            goto L6a
        L53:
            java.lang.String r2 = com.mbridge.msdk.foundation.db.m.f20450a     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L62
            com.mbridge.msdk.foundation.tools.ad.b(r2, r0)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L6d
        L5e:
            r4.close()     // Catch: java.lang.Exception -> L6d
            goto L6d
        L62:
            r0 = move-exception
            if (r4 == 0) goto L68
            r4.close()     // Catch: java.lang.Exception -> L68
        L68:
            throw r0
        L69:
        L6a:
            if (r4 == 0) goto L6d
            goto L5e
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a() {
        /*
            r6 = this;
            r0 = 604800000(0x240c8400, float:3.046947E-17)
            long r0 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()     // Catch: java.lang.Exception -> L24
            if (r0 != 0) goto L10
            goto L28
        L10:
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "c_replace_temp"
            java.lang.String r4 = "time<?"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Exception -> L24
            r0.delete(r1, r4, r2)     // Catch: java.lang.Exception -> L24
            goto L28
        L24:
            r0 = move-exception
            r0.printStackTrace()
        L28:
            java.lang.String r0 = "SELECT * FROM c_replace_temp"
            android.database.sqlite.SQLiteDatabase r1 = r6.getReadableDatabase()
            r2 = 0
            android.database.Cursor r0 = r1.rawQuery(r0, r2)
            if (r0 == 0) goto L6c
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L67
            if (r1 <= 0) goto L6c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
        L40:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L65
            java.lang.String r2 = "d_key"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "d_value"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L63
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L63
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L63
            goto L40
        L63:
            r2 = move-exception
            goto L72
        L65:
            r2 = r1
            goto L88
        L67:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L72
        L6c:
            if (r0 == 0) goto L88
            r0.close()     // Catch: java.lang.Throwable -> L67
            goto L88
        L72:
            java.lang.String r3 = com.mbridge.msdk.foundation.db.m.f20450a     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L81
            com.mbridge.msdk.foundation.tools.ad.b(r3, r2)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.lang.Exception -> L8e
            goto L8e
        L81:
            r1 = move-exception
            if (r0 == 0) goto L87
            r0.close()     // Catch: java.lang.Exception -> L87
        L87:
            throw r1
        L88:
            if (r0 == 0) goto L8d
            r0.close()     // Catch: java.lang.Exception -> L8d
        L8d:
            r1 = r2
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.a():org.json.JSONObject");
    }
}
