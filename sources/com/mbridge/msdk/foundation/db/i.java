package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class i extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20445a = "com.mbridge.msdk.foundation.db.i";

    /* renamed from: b, reason: collision with root package name */
    private static i f20446b;

    private i(g gVar) {
        super(gVar);
    }

    public static i a(g gVar) {
        if (f20446b == null) {
            synchronized (i.class) {
                try {
                    if (f20446b == null) {
                        f20446b = new i(gVar);
                    }
                } finally {
                }
            }
        }
        return f20446b;
    }

    private synchronized boolean b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id='" + str + "'", null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private synchronized void c(String str) {
        try {
        } catch (Throwable unused) {
            ad.c(f20445a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = '" + str + "'", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d0, code lost:            if (r1 != null) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:            if (r1 == null) goto L40;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: all -> 0x006b, Exception -> 0x006f, TryCatch #7 {Exception -> 0x006f, all -> 0x006b, blocks: (B:48:0x003f, B:50:0x0045, B:52:0x0066, B:19:0x0078, B:20:0x0081), top: B:47:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.i.a(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:            if (r0 != null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:            r0.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:            if (r0 == null) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "SELECT * FROM dailyplaycap where unit_id ='"
            r2.append(r3)     // Catch: java.lang.Throwable -> L59
            r2.append(r11)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L59
            android.database.sqlite.SQLiteDatabase r3 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L59
            android.database.Cursor r0 = r3.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L63
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L59
            if (r2 <= 0) goto L63
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L63
            java.lang.String r2 = "first_insert_timestamp"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L59
            long r2 = r0.getLong(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "play_time"
            int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L59
            int r4 = r0.getInt(r4)     // Catch: java.lang.Throwable -> L59
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L59
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L63
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 - r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L5b
            r10.c(r11)     // Catch: java.lang.Throwable -> L59
            goto L63
        L59:
            r11 = move-exception
            goto L69
        L5b:
            if (r12 <= 0) goto L63
            long r11 = (long) r12
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 < 0) goto L63
            r1 = 1
        L63:
            if (r0 == 0) goto L82
        L65:
            r0.close()     // Catch: java.lang.Throwable -> L82
            goto L82
        L69:
            java.lang.String r12 = com.mbridge.msdk.foundation.db.i.f20445a     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "isOverCap is error"
            r2.append(r3)     // Catch: java.lang.Throwable -> L83
            r2.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L83
            com.mbridge.msdk.foundation.tools.ad.c(r12, r11)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L82
            goto L65
        L82:
            return r1
        L83:
            r11 = move-exception
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.lang.Throwable -> L89
        L89:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.i.a(java.lang.String, int):boolean");
    }
}
