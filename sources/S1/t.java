package S1;

import f7.C2873a;
import g7.C2924a;
import i7.C2980a;
import i7.C2982c;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class t {
    public static C2873a a(SecretKey secretKey, boolean z8) {
        C2873a c2873a = new C2873a();
        c2873a.b(z8, new C2982c(secretKey.getEncoded()));
        return c2873a;
    }

    private static C2924a b(SecretKey secretKey, boolean z8, byte[] bArr, byte[] bArr2) {
        C2924a c2924a = new C2924a(a(secretKey, z8));
        c2924a.i(z8, new C2980a(new C2982c(secretKey.getEncoded()), 128, bArr, bArr2));
        return c2924a;
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C2924a b9 = b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[b9.h(length)];
        try {
            b9.b(bArr6, b9.m(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (d7.f e8) {
            throw new O1.f("Couldn't validate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }

    public static f d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C2924a b9 = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[b9.h(bArr2.length)];
        int m8 = b9.m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int b10 = (m8 + b9.b(bArr4, m8)) - 16;
            byte[] bArr5 = new byte[b10];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, b10);
            System.arraycopy(bArr4, b10, bArr6, 0, 16);
            return new f(bArr5, bArr6);
        } catch (d7.f e8) {
            throw new O1.f("Couldn't generate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }
}
