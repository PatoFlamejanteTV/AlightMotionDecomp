package U6;

import U6.C1449e;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1446b {

    /* renamed from: a, reason: collision with root package name */
    private static final C1449e.a f10190a = new C1449e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f10191b = -1234567890;

    public static final boolean a(byte[] a9, int i8, byte[] b9, int i9, int i10) {
        AbstractC3292y.i(a9, "a");
        AbstractC3292y.i(b9, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (a9[i11 + i8] != b9[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j8, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j8 && j8 - j9 >= j10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
    }

    public static final int c() {
        return f10191b;
    }

    public static final int d(C1452h c1452h, int i8) {
        AbstractC3292y.i(c1452h, "<this>");
        if (i8 == f10191b) {
            return c1452h.J();
        }
        return i8;
    }

    public static final int e(int i8) {
        return ((i8 & 255) << 24) | (((-16777216) & i8) >>> 24) | ((16711680 & i8) >>> 8) | ((65280 & i8) << 8);
    }

    public static final long f(long j8) {
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public static final short g(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    public static final String h(byte b9) {
        return l6.n.n(new char[]{V6.b.f()[(b9 >> 4) & 15], V6.b.f()[b9 & 15]});
    }

    public static final String i(int i8) {
        int i9 = 0;
        if (i8 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        char[] cArr = {V6.b.f()[(i8 >> 28) & 15], V6.b.f()[(i8 >> 24) & 15], V6.b.f()[(i8 >> 20) & 15], V6.b.f()[(i8 >> 16) & 15], V6.b.f()[(i8 >> 12) & 15], V6.b.f()[(i8 >> 8) & 15], V6.b.f()[(i8 >> 4) & 15], V6.b.f()[i8 & 15]};
        while (i9 < 8 && cArr[i9] == '0') {
            i9++;
        }
        return l6.n.o(cArr, i9, 8);
    }
}
