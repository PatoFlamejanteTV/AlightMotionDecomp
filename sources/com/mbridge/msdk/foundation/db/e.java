package com.mbridge.msdk.foundation.db;

/* loaded from: classes4.dex */
public class e extends a<com.mbridge.msdk.foundation.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    private static e f20419a;

    private e(g gVar) {
        super(gVar);
    }

    public static e a(g gVar) {
        if (f20419a == null) {
            synchronized (e.class) {
                try {
                    if (f20419a == null) {
                        f20419a = new e(gVar);
                    }
                } finally {
                }
            }
        }
        return f20419a;
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
            java.lang.String r2 = "select count(*) from click_time"
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
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0134, code lost:            if (r1 != null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0136, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0145, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0141, code lost:            if (r1 == null) goto L39;     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[Catch: all -> 0x0132, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:27:0x012d, B:14:0x0136, B:39:0x0148, B:40:0x014b), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.e> a(int r27) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(int):java.util.List");
    }
}
