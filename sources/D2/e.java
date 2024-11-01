package d2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class e {
    public static int a(int i8) {
        return i8 * 8;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return a(bArr.length);
    }

    public static int c(int i8) {
        return i8 / 8;
    }

    public static byte[] d(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage(), e8);
        }
    }

    public static int e(int i8) {
        long j8 = i8 * 8;
        int i9 = (int) j8;
        if (i9 == j8) {
            return i9;
        }
        throw new h();
    }

    public static int f(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return e(bArr.length);
    }

    public static byte[] g(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return bArr2;
    }
}
