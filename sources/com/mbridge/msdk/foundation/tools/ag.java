package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f21231a = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: b, reason: collision with root package name */
    static String f21232b = "";

    /* renamed from: c, reason: collision with root package name */
    static boolean f21233c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f21234d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f21235e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f21236f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f21237g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static int f21238h = -1;

    public static int a() {
        Context c8;
        long longValue;
        long currentTimeMillis;
        try {
            c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            longValue = ((Long) al.a(c8, "freeExternalSize", 0L)).longValue();
            currentTimeMillis = System.currentTimeMillis();
        } catch (Throwable th) {
            ad.a("SameSDCardTool", th.getMessage(), th);
        }
        if (currentTimeMillis - longValue <= 1800000) {
            if (f21235e == -1) {
            }
            return f21235e;
        }
        f21235e = Long.valueOf((c() / 1000) / 1000).intValue();
        al.b(c8, "freeExternalSize", Long.valueOf(currentTimeMillis));
        return f21235e;
    }

    public static int b() {
        if (f21238h == -1) {
            try {
                f21238h = new Long((e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                ad.a("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f21238h;
    }

    private static long c() {
        if (d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean d() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            ad.b("", "hasSDCard is failed");
            return false;
        }
    }

    private static long e() {
        if (d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return 0L;
    }

    private static void b(Context context) {
        com.mbridge.msdk.foundation.same.b.e.a(new com.mbridge.msdk.foundation.same.b.d(c(context)));
        com.mbridge.msdk.foundation.same.b.e.a().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:            if (c() > 31457280) goto L16;     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(android.content.Context r7) {
        /*
            r0 = 0
            java.io.File r1 = r7.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L14
            java.io.File r1 = a(r1)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r1 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.ad.a(r2, r3, r1)
        L14:
            r1 = r0
        L15:
            boolean r2 = com.mbridge.msdk.foundation.tools.ag.f21233c
            if (r2 == 0) goto L5f
            if (r1 != 0) goto L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r3 = "Android"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "data"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r7.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
        L54:
            long r2 = c()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 == 0) goto L68
            boolean r1 = r0.exists()
            if (r1 != 0) goto L70
        L68:
            java.io.File r7 = r7.getFilesDir()
            java.io.File r0 = r7.getAbsoluteFile()
        L70:
            java.lang.String r7 = r0.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ag.c(android.content.Context):java.lang.String");
    }

    public static void a(Context context) {
        if (context == null || f21236f) {
            return;
        }
        try {
            try {
                f21232b = context.getFilesDir().getAbsolutePath() + File.separator;
                f21233c = false;
                b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            f21232b = context.getFilesDir().getAbsolutePath() + File.separator;
            b(context);
        }
        f21236f = true;
    }

    private static File a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }
}
