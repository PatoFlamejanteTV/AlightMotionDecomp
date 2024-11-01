package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f20815a;

    /* renamed from: b, reason: collision with root package name */
    private static long f20816b;

    /* renamed from: c, reason: collision with root package name */
    private static long f20817c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0403a {

        /* renamed from: a, reason: collision with root package name */
        private static a f20818a = new a();
    }

    public static a a() {
        return C0403a.f20818a;
    }

    public final synchronized void b() {
        try {
            if (f20817c != 0 && f20816b != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f20817c;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f20816b) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f20815a = 1L;
                            } else {
                                f20815a = totalRxBytes;
                            }
                        } else {
                            f20815a = 0L;
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        f20816b = 0L;
        f20817c = 0L;
    }

    public final long d() {
        return f20815a;
    }

    public final synchronized void e() {
        if (f20817c == 0) {
            f20817c = SystemClock.elapsedRealtime();
            f20816b = TrafficStats.getTotalRxBytes();
        }
    }

    private a() {
    }
}
