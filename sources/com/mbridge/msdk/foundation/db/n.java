package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* loaded from: classes4.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private static n f20452a;

    private n(g gVar) {
        super(gVar);
    }

    public static n a(g gVar) {
        if (f20452a == null) {
            synchronized (n.class) {
                try {
                    if (f20452a == null) {
                        f20452a = new n(gVar);
                    }
                } finally {
                }
            }
        }
        return f20452a;
    }

    private synchronized int b(int i8) {
        try {
        } catch (Exception unused) {
            return -1;
        }
        return getWritableDatabase().rawQuery("DELETE from reporterror where count >= " + i8, null).getCount();
    }

    private synchronized boolean b(String str, String str2, long j8) {
        if (str == null) {
            str = "";
        }
        try {
            if (getWritableDatabase() == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("select * from reporterror where url='");
            sb.append(str2);
            sb.append("' and ");
            sb.append(DataSchemeDataSource.SCHEME_DATA);
            sb.append("='");
            sb.append(str);
            sb.append("' and ");
            sb.append("time_stamp");
            sb.append("=");
            sb.append(j8);
            return getReadableDatabase().rawQuery(sb.toString(), null).getCount() > 0;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        } finally {
        }
    }

    public final synchronized void a(String str, String str2, long j8) {
        if (str == null) {
            str = "";
        }
        try {
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().execSQL("DELETE from reporterror where url='" + str2 + "' and " + DataSchemeDataSource.SCHEME_DATA + "='" + str + "' and time_stamp=" + j8 + " or count > 5 ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:            if (r9 == null) goto L23;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = " count(*) "
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            java.lang.String r2 = "reporterror"
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r9 == 0) goto L29
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r1 == 0) goto L29
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            goto L29
        L25:
            r0 = move-exception
            goto L39
        L27:
            r1 = move-exception
            goto L31
        L29:
            if (r9 == 0) goto L37
        L2b:
            r9.close()     // Catch: java.lang.Throwable -> L2f
            goto L37
        L2f:
            r0 = move-exception
            goto L3f
        L31:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L25
            if (r9 == 0) goto L37
            goto L2b
        L37:
            monitor-exit(r10)
            return r0
        L39:
            if (r9 == 0) goto L3e
            r9.close()     // Catch: java.lang.Throwable -> L2f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L2f
        L3f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a():int");
    }

    public final synchronized int b() {
        int i8;
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().query("reporterror", new String[]{" count(*) "}, null, null, null, null, null, null);
                i8 = cursor.getCount();
                cursor.close();
            } catch (Exception e8) {
                e8.printStackTrace();
                i8 = 0;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #4 {, blocks: (B:26:0x00a6, B:7:0x0095, B:34:0x00ae, B:35:0x00b1), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.l> a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 5
            r1 = 0
            r12.b(r0)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r3 = "reporterror"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r0.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r0.append(r13)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r13 = ""
            r0.append(r13)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r13 == 0) goto L93
            int r0 = r13.getCount()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8e
            if (r0 <= 0) goto L93
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8e
        L34:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            if (r1 == 0) goto L8c
            java.lang.String r1 = "url"
            int r1 = r13.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r1 = r13.getString(r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r3 = "method"
            int r3 = r13.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r4 = "unitId"
            int r4 = r13.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r5 = "count"
            int r5 = r13.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            int r5 = r13.getInt(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            java.lang.String r6 = "time_stamp"
            int r6 = r13.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            long r6 = r13.getLong(r6)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            com.mbridge.msdk.foundation.entity.l r8 = new com.mbridge.msdk.foundation.entity.l     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            r8.<init>(r1, r3, r2, r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            int r5 = r5 + 1
            r8.a(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            r8.a(r6)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            r0.add(r8)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            goto L34
        L87:
            r0 = move-exception
            r1 = r13
            goto Lac
        L8a:
            r1 = move-exception
            goto La1
        L8c:
            r1 = r0
            goto L93
        L8e:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto La1
        L93:
            if (r13 == 0) goto Laa
            r13.close()     // Catch: java.lang.Throwable -> L99
            goto Laa
        L99:
            r13 = move-exception
            goto Lb2
        L9b:
            r0 = move-exception
            goto Lac
        L9d:
            r13 = move-exception
            r0 = r1
            r1 = r13
            r13 = r0
        La1:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L87
            if (r13 == 0) goto La9
            r13.close()     // Catch: java.lang.Throwable -> L99
        La9:
            r1 = r0
        Laa:
            monitor-exit(r12)
            return r1
        Lac:
            if (r1 == 0) goto Lb1
            r1.close()     // Catch: java.lang.Throwable -> L99
        Lb1:
            throw r0     // Catch: java.lang.Throwable -> L99
        Lb2:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L99
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(int):java.util.List");
    }

    public final synchronized int a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
                return -1;
            }
            return getWritableDatabase().delete("reporterror", "url=?", strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final synchronized long a(com.mbridge.msdk.foundation.entity.l lVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", lVar.f());
            contentValues.put("method", lVar.b());
            contentValues.put(DataSchemeDataSource.SCHEME_DATA, lVar.a());
            contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, lVar.e());
            contentValues.put("time_stamp", Long.valueOf(lVar.c()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            if (b(lVar.a(), lVar.f(), lVar.c())) {
                return getWritableDatabase().rawQuery("UPDATE reporterror SET count = " + lVar.d() + " where url='" + lVar.f() + "' and " + DataSchemeDataSource.SCHEME_DATA + "='" + lVar.a() + "' and time_stamp=" + lVar.c(), null).getCount();
            }
            contentValues.put("count", Integer.valueOf(lVar.d()));
            return getWritableDatabase().insert("reporterror", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}
