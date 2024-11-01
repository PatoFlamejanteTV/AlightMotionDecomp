package E6;

import com.mbridge.msdk.MBridgeConstans;
import l6.AbstractC3331A;

/* renamed from: E6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1057o {
    public static /* synthetic */ String a(long j8, int i8) {
        long a9;
        if (j8 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (j8 > 0) {
            return Long.toString(j8, i8);
        }
        if (i8 < 2 || i8 > 36) {
            i8 = 10;
        }
        int i9 = 64;
        char[] cArr = new char[64];
        int i10 = i8 - 1;
        if ((i8 & i10) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
            do {
                i9--;
                cArr[i9] = Character.forDigit(((int) j8) & i10, i8);
                j8 >>>= numberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            if ((i8 & 1) == 0) {
                a9 = (j8 >>> 1) / (i8 >>> 1);
            } else {
                a9 = AbstractC3331A.a(j8, i8);
            }
            long j9 = i8;
            cArr[63] = Character.forDigit((int) (j8 - (a9 * j9)), i8);
            i9 = 63;
            while (a9 > 0) {
                i9--;
                cArr[i9] = Character.forDigit((int) (a9 % j9), i8);
                a9 /= j9;
            }
        }
        return new String(cArr, i9, 64 - i9);
    }
}
