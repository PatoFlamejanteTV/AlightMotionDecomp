package K7;

import J7.h;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c f5200a = new c();

    public static byte[] a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] b(byte[] bArr, int i8, int i9) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f5200a.a(bArr, i8, i9, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e8) {
            throw new a("exception encoding Hex string: " + e8.getMessage(), e8);
        }
    }

    public static String c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static String d(byte[] bArr, int i8, int i9) {
        return h.b(b(bArr, i8, i9));
    }
}
