package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
final class Util {
    public static final Charset UTF_8 = Charset.forName(C.UTF8_NAME);

    private Util() {
    }

    public static boolean arrayRangeEquals(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11 + i8] != bArr2[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static void checkOffsetAndCount(long j8, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j8 && j8 - j9 >= j10) {
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10)));
        }
    }

    public static int reverseBytesInt(int i8) {
        return ((i8 & 255) << 24) | (((-16777216) & i8) >>> 24) | ((16711680 & i8) >>> 8) | ((65280 & i8) << 8);
    }

    public static long reverseBytesLong(long j8) {
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public static short reverseBytesShort(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    public static void sneakyRethrow(Throwable th) {
        sneakyThrow2(th);
    }

    private static <T extends Throwable> void sneakyThrow2(Throwable th) throws Throwable {
        throw th;
    }
}
