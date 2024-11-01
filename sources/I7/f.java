package I7;

/* loaded from: classes5.dex */
public abstract class f {
    public static void a(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >>> 8);
        bArr[i9 + 2] = (byte) (i8 >>> 16);
        bArr[i9 + 3] = (byte) (i8 >>> 24);
    }

    public static void b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            bArr[i9 + i11] = (byte) (i8 >>> (i11 * 8));
        }
    }

    public static byte[] c(int i8) {
        return new byte[]{(byte) i8, (byte) (i8 >>> 8), (byte) (i8 >>> 16), (byte) (i8 >>> 24)};
    }

    public static int d(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static int e(byte[] bArr, int i8) {
        int i9 = ((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255);
        return ((bArr[i8 + 3] & 255) << 24) | i9 | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int f(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            i10 |= (bArr[i8 + i11] & 255) << (i11 * 8);
        }
        return i10;
    }
}
