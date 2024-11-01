package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

/* loaded from: classes4.dex */
final class CryptoUtil {
    private CryptoUtil() {
    }

    public static long getFNV64Hash(String str) {
        long j8 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i8 = 0; i8 < str.length(); i8++) {
            long charAt = j8 ^ str.charAt(i8);
            j8 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j8;
    }
}
