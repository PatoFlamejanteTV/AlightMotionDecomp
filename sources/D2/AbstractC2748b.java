package d2;

import java.util.Arrays;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2748b {
    private static int a(long j8) {
        int i8 = (int) j8;
        if (i8 == j8) {
            return i8;
        }
        throw new IllegalArgumentException(j8 + " cannot be cast to int without changing its value.");
    }

    static int b(int i8, boolean z8) {
        if (i8 == 0) {
            return 0;
        }
        if (z8) {
            int i9 = (i8 / 3) << 2;
            int i10 = i8 % 3;
            if (i10 != 0) {
                return i9 + i10 + 1;
            }
            return i9;
        }
        return (((i8 - 1) / 3) + 1) << 2;
    }

    public static byte[] c(String str) {
        if (str != null && !str.isEmpty()) {
            byte[] bytes = str.getBytes(m.f31296a);
            int length = bytes.length;
            byte[] bArr = new byte[a((length * 6) >> 3)];
            int i8 = 0;
            int i9 = 0;
            while (i8 < bytes.length) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < 4 && i8 < length) {
                    int i12 = i8 + 1;
                    int d8 = d(bytes[i8]);
                    if (d8 >= 0) {
                        i11 |= d8 << (18 - (i10 * 6));
                        i10++;
                    }
                    i8 = i12;
                }
                if (i10 >= 2) {
                    int i13 = i9 + 1;
                    bArr[i9] = (byte) (i11 >> 16);
                    if (i10 >= 3) {
                        int i14 = i9 + 2;
                        bArr[i13] = (byte) (i11 >> 8);
                        if (i10 >= 4) {
                            i9 += 3;
                            bArr[i14] = (byte) i11;
                        } else {
                            i9 = i14;
                        }
                    } else {
                        i9 = i13;
                    }
                }
            }
            return Arrays.copyOf(bArr, i9);
        }
        return new byte[0];
    }

    static int d(byte b9) {
        int i8 = i(b9, 64) & j(b9, 91);
        int i9 = i(b9, 96) & j(b9, 123);
        int i10 = i(b9, 47) & j(b9, 58);
        int h8 = h(b9, 45) | h(b9, 43);
        int h9 = h(b9, 47) | h(b9, 95);
        return k(i10, b9 + 4, 0) | k(i8, b9 - 65, 0) | k(i9, b9 - 71, 0) | k(h8, 62, 0) | k(h9, 63, 0) | k(i8 | i9 | i10 | h8 | h9, 0, -1);
    }

    static byte e(int i8) {
        int j8 = j(i8, 26);
        int i9 = i(i8, 25) & j(i8, 52);
        return (byte) (k(i(i8, 51) & j(i8, 62), i8 - 4, 0) | k(j8, i8 + 65, 0) | k(i9, i8 + 71, 0) | k(h(i8, 62), 43, 0) | k(h(i8, 63), 47, 0));
    }

    static byte f(int i8) {
        int j8 = j(i8, 26);
        int i9 = i(i8, 25) & j(i8, 52);
        return (byte) (k(i(i8, 51) & j(i8, 62), i8 - 4, 0) | k(j8, i8 + 65, 0) | k(i9, i8 + 71, 0) | k(h(i8, 62), 45, 0) | k(h(i8, 63), 95, 0));
    }

    public static String g(byte[] bArr, boolean z8) {
        int i8;
        byte b9;
        int i9 = 0;
        if (bArr != null) {
            i8 = bArr.length;
        } else {
            i8 = 0;
        }
        if (i8 == 0) {
            return "";
        }
        int i10 = (i8 / 3) * 3;
        int b10 = b(i8, z8);
        byte[] bArr2 = new byte[b10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            if (z8) {
                bArr2[i12] = f((i15 >>> 18) & 63);
                bArr2[i12 + 1] = f((i15 >>> 12) & 63);
                int i16 = i12 + 3;
                bArr2[i12 + 2] = f((i15 >>> 6) & 63);
                i12 += 4;
                bArr2[i16] = f(i15 & 63);
            } else {
                bArr2[i12] = e((i15 >>> 18) & 63);
                bArr2[i12 + 1] = e((i15 >>> 12) & 63);
                int i17 = i12 + 3;
                bArr2[i12 + 2] = e((i15 >>> 6) & 63);
                i12 += 4;
                bArr2[i17] = e(i15 & 63);
            }
        }
        int i18 = i8 - i10;
        if (i18 > 0) {
            int i19 = (bArr[i10] & 255) << 10;
            if (i18 == 2) {
                i9 = (bArr[i8 - 1] & 255) << 2;
            }
            int i20 = i19 | i9;
            if (z8) {
                if (i18 == 2) {
                    bArr2[b10 - 3] = f(i20 >> 12);
                    bArr2[b10 - 2] = f((i20 >>> 6) & 63);
                    bArr2[b10 - 1] = f(i20 & 63);
                } else {
                    bArr2[b10 - 2] = f(i20 >> 12);
                    bArr2[b10 - 1] = f((i20 >>> 6) & 63);
                }
            } else {
                bArr2[b10 - 4] = e(i20 >> 12);
                bArr2[b10 - 3] = e((i20 >>> 6) & 63);
                int i21 = b10 - 2;
                if (i18 == 2) {
                    b9 = e(i20 & 63);
                } else {
                    b9 = 61;
                }
                bArr2[i21] = b9;
                bArr2[b10 - 1] = 61;
            }
        }
        return new String(bArr2, m.f31296a);
    }

    static int h(int i8, int i9) {
        int i10 = i8 ^ i9;
        return ((~i10) & (i10 - 1)) >>> 63;
    }

    static int i(int i8, int i9) {
        return (int) ((i9 - i8) >>> 63);
    }

    static int j(int i8, int i9) {
        return (int) ((i8 - i9) >>> 63);
    }

    static int k(int i8, int i9, int i10) {
        return ((i8 - 1) & (i10 ^ i9)) ^ i9;
    }
}
