package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2154h3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile w0.g f16742a = w0.g.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f16743b = new Object();

    private static boolean a(Context context) {
        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:            if ("com.google.android.gms".equals(r0.packageName) != false) goto L30;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6)
            return r1
        L24:
            w0.g r6 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a
            boolean r6 = r6.c()
            if (r6 == 0) goto L39
            w0.g r5 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L39:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16743b
            monitor-enter(r6)
            w0.g r0 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L54
            w0.g r5 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r5 = move-exception
            goto La0
        L54:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L61
            goto L81
        L61:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r4 = 29
            if (r3 >= r4) goto L6f
            r3 = 0
            goto L71
        L6f:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L71:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L52
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
        L81:
            boolean r5 = a(r5)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L88
            r1 = 1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L52
            w0.g r5 = w0.g.d(r5)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a = r5     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            w0.g r5 = com.google.android.gms.internal.measurement.AbstractC2154h3.f16742a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2154h3.b(android.content.Context, android.net.Uri):boolean");
    }
}
