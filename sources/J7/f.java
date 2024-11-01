package J7;

/* loaded from: classes5.dex */
public abstract class f {
    public static int a(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    public static long b(byte[] bArr, int i8) {
        return (a(bArr, i8 + 4) & 4294967295L) | ((a(bArr, i8) & 4294967295L) << 32);
    }

    public static void c(byte[] bArr, int i8, long[] jArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i9 + i11] = b(bArr, i8);
            i8 += 8;
        }
    }

    public static void d(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i8 >>> 24);
        bArr[i9 + 1] = (byte) (i8 >>> 16);
        bArr[i9 + 2] = (byte) (i8 >>> 8);
        bArr[i9 + 3] = (byte) i8;
    }

    public static void e(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >>> 8);
        bArr[i9 + 2] = (byte) (i8 >>> 16);
        bArr[i9 + 3] = (byte) (i8 >>> 24);
    }

    public static int f(byte[] bArr, int i8) {
        return (bArr[i8 + 3] << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static long g(byte[] bArr, int i8) {
        return ((f(bArr, i8 + 4) & 4294967295L) << 32) | (f(bArr, i8) & 4294967295L);
    }

    public static short h(byte[] bArr, int i8) {
        return (short) (((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255));
    }

    public static void i(long j8, byte[] bArr, int i8) {
        d((int) (j8 >>> 32), bArr, i8);
        d((int) (j8 & 4294967295L), bArr, i8 + 4);
    }

    public static void j(long[] jArr, int i8, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            i(jArr[i8 + i11], bArr, i10);
            i10 += 8;
        }
    }

    public static void k(long j8, byte[] bArr, int i8) {
        e((int) (4294967295L & j8), bArr, i8);
        e((int) (j8 >>> 32), bArr, i8 + 4);
    }

    public static void l(long[] jArr, int i8, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            k(jArr[i8 + i11], bArr, i10);
            i10 += 8;
        }
    }

    public static void m(short s8, byte[] bArr, int i8) {
        bArr[i8] = (byte) (s8 >>> 8);
        bArr[i8 + 1] = (byte) s8;
    }

    public static void n(short s8, byte[] bArr, int i8) {
        bArr[i8] = (byte) s8;
        bArr[i8 + 1] = (byte) (s8 >>> 8);
    }
}
