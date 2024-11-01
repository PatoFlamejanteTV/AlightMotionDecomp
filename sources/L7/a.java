package L7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f5430a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) {
        int i8 = f5430a;
        byte[] bArr = new byte[i8];
        while (true) {
            int read = inputStream.read(bArr, 0, i8);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int c(InputStream inputStream, byte[] bArr) {
        return d(inputStream, bArr, 0, bArr.length);
    }

    public static int d(InputStream inputStream, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i8 + i10, i9 - i10);
            if (read < 0) {
                break;
            }
            i10 += read;
        }
        return i10;
    }
}
