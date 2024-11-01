package com.mbridge.msdk.foundation.download.utils;

/* loaded from: classes4.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j8, long j9) {
        if (j8 == 0 || j9 == 0) {
            return 0;
        }
        if (j8 == j9) {
            return 100;
        }
        return (int) (((j9 * 1.0d) / (j8 * 1.0d)) * 100.0d);
    }
}
