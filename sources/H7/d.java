package h7;

import J7.f;
import o7.AbstractC3549b;

/* loaded from: classes5.dex */
public abstract class d {
    public static byte a(byte[] bArr, byte[] bArr2) {
        int i8 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            i8 |= bArr[i9] ^ bArr2[i9];
        }
        return (byte) ((((i8 >>> 1) | (i8 & 1)) - 1) >> 31);
    }

    public static void b(long[] jArr, byte[] bArr) {
        f.j(jArr, 0, 2, bArr, 0);
    }

    public static void c(byte[] bArr, long[] jArr) {
        f.c(bArr, 0, jArr, 0, 2);
    }

    public static long[] d(byte[] bArr) {
        long[] jArr = new long[2];
        f.c(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void e(byte[] bArr, byte[] bArr2) {
        for (int i8 = 0; i8 < 16; i8++) {
            bArr2[i8] = bArr[i8];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = j8 >> 63;
        jArr2[0] = ((j8 ^ ((-2233785415175766016L) & j10)) << 1) | (j9 >>> 63);
        jArr2[1] = (j9 << 1) | (-j10);
    }

    private static long h(long j8, long j9) {
        long j10 = j8 & 1229782938247303441L;
        long j11 = j8 & 2459565876494606882L;
        long j12 = j8 & 4919131752989213764L;
        long j13 = j8 & (-8608480567731124088L);
        long j14 = j9 & 1229782938247303441L;
        long j15 = j9 & 2459565876494606882L;
        long j16 = j9 & 4919131752989213764L;
        long j17 = j9 & (-8608480567731124088L);
        long j18 = (((j10 * j14) ^ (j11 * j17)) ^ (j12 * j16)) ^ (j13 * j15);
        long j19 = (((j10 * j15) ^ (j11 * j14)) ^ (j12 * j17)) ^ (j13 * j16);
        long j20 = (((j10 * j16) ^ (j11 * j15)) ^ (j12 * j14)) ^ (j13 * j17);
        return (j18 & 1229782938247303441L) | (j19 & 2459565876494606882L) | (j20 & 4919131752989213764L) | (((((j10 * j17) ^ (j11 * j16)) ^ (j12 * j15)) ^ (j13 * j14)) & (-8608480567731124088L));
    }

    public static void i(byte[] bArr, byte[] bArr2) {
        long[] d8 = d(bArr);
        j(d8, d(bArr2));
        b(d8, bArr);
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr2[0];
        long j11 = jArr2[1];
        long a9 = J7.e.a(j8);
        long a10 = J7.e.a(j9);
        long a11 = J7.e.a(j10);
        long a12 = J7.e.a(j11);
        long a13 = J7.e.a(h(a9, a11));
        long h8 = h(j8, j10) << 1;
        long a14 = J7.e.a(h(a10, a12));
        long h9 = h(j9, j11);
        long j12 = h9 << 1;
        long a15 = J7.e.a(h(a9 ^ a10, a11 ^ a12));
        long h10 = ((h(j8 ^ j9, j10 ^ j11) << 1) ^ ((a14 ^ h8) ^ j12)) ^ ((h9 << 63) ^ (h9 << 58));
        jArr[0] = a13 ^ (((h10 >>> 2) ^ ((h10 >>> 1) ^ h10)) ^ (h10 >>> 7));
        jArr[1] = ((h10 << 57) ^ ((h10 << 63) ^ (h10 << 62))) ^ ((a15 ^ ((h8 ^ a13) ^ a14)) ^ (((j12 ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7)));
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = j9 << 57;
        jArr2[0] = (j10 >>> 7) ^ ((((j8 >>> 7) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2));
        jArr2[1] = (j8 << 57) | (j9 >>> 7);
    }

    public static long[] l() {
        return new long[]{Long.MIN_VALUE};
    }

    public static void m(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        AbstractC3549b.a(jArr[0], jArr3, 0);
        AbstractC3549b.a(jArr[1], jArr3, 2);
        long j8 = jArr3[0];
        long j9 = jArr3[1];
        long j10 = jArr3[2];
        long j11 = jArr3[3];
        long j12 = j10 ^ ((j11 << 57) ^ ((j11 << 63) ^ (j11 << 62)));
        jArr2[0] = j8 ^ ((((j12 >>> 1) ^ j12) ^ (j12 >>> 2)) ^ (j12 >>> 7));
        jArr2[1] = (j9 ^ ((((j11 >>> 1) ^ j11) ^ (j11 >>> 2)) ^ (j11 >>> 7))) ^ ((j12 << 57) ^ ((j12 << 63) ^ (j12 << 62)));
    }

    public static void n(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        while (true) {
            i10--;
            if (i10 >= 0) {
                int i11 = i8 + i10;
                bArr[i11] = (byte) (bArr[i11] ^ bArr2[i9 + i10]);
            } else {
                return;
            }
        }
    }

    public static void o(byte[] bArr, int i8, byte[] bArr2, int i9, byte[] bArr3, int i10) {
        int i11 = 0;
        do {
            bArr3[i10 + i11] = (byte) (bArr[i8 + i11] ^ bArr2[i9 + i11]);
            int i12 = i11 + 1;
            bArr3[i10 + i12] = (byte) (bArr2[i12 + i9] ^ bArr[i8 + i12]);
            int i13 = i11 + 2;
            bArr3[i10 + i13] = (byte) (bArr2[i13 + i9] ^ bArr[i8 + i13]);
            int i14 = i11 + 3;
            bArr3[i10 + i14] = (byte) (bArr2[i14 + i9] ^ bArr[i8 + i14]);
            i11 += 4;
        } while (i11 < 16);
    }

    public static void p(byte[] bArr, byte[] bArr2) {
        int i8 = 0;
        do {
            bArr[i8] = (byte) (bArr[i8] ^ bArr2[i8]);
            int i9 = i8 + 1;
            bArr[i9] = (byte) (bArr[i9] ^ bArr2[i9]);
            int i10 = i8 + 2;
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i8 + 3;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            i8 += 4;
        } while (i8 < 16);
    }

    public static void q(byte[] bArr, byte[] bArr2, int i8) {
        int i9 = 0;
        do {
            bArr[i9] = (byte) (bArr[i9] ^ bArr2[i8 + i9]);
            int i10 = i9 + 1;
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i8 + i10]);
            int i11 = i9 + 2;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i8 + i11]);
            int i12 = i9 + 3;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i8 + i12]);
            i9 += 4;
        } while (i9 < 16);
    }

    public static void r(byte[] bArr, byte[] bArr2, int i8, int i9) {
        while (true) {
            i9--;
            if (i9 >= 0) {
                bArr[i9] = (byte) (bArr[i9] ^ bArr2[i8 + i9]);
            } else {
                return;
            }
        }
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
