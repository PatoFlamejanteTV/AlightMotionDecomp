package S1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class k implements U1.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9383a;

    /* renamed from: b, reason: collision with root package name */
    private final U1.b f9384b = new U1.b();

    public k(String str) {
        if (str != null) {
            this.f9383a = str;
            return;
        }
        throw new IllegalArgumentException("The JCA hash algorithm must not be null");
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return d2.e.d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int h(int i8, int i9) {
        return ((i9 + i8) - 1) / i8;
    }

    public static byte[] k(d2.c cVar) {
        byte[] bArr;
        if (cVar != null) {
            bArr = cVar.a();
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return d2.e.d(d2.i.a(bArr.length), bArr);
    }

    public static byte[] m(int i8) {
        return d2.i.a(i8);
    }

    public static byte[] n() {
        return new byte[0];
    }

    public static byte[] o(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(d2.m.f31296a);
        } else {
            bArr = null;
        }
        return l(bArr);
    }

    private MessageDigest p() {
        Provider a9 = d().a();
        try {
            if (a9 == null) {
                return MessageDigest.getInstance(this.f9383a);
            }
            return MessageDigest.getInstance(this.f9383a, a9);
        } catch (NoSuchAlgorithmException e8) {
            throw new O1.f("Couldn't get message digest for KDF: " + e8.getMessage(), e8);
        }
    }

    @Override // U1.a
    public U1.b d() {
        return this.f9384b;
    }

    public SecretKey i(SecretKey secretKey, int i8, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest p8 = p();
        for (int i9 = 1; i9 <= h(d2.e.e(p8.getDigestLength()), i8); i9++) {
            p8.update(d2.i.a(i9));
            p8.update(secretKey.getEncoded());
            if (bArr != null) {
                p8.update(bArr);
            }
            try {
                byteArrayOutputStream.write(p8.digest());
            } catch (IOException e8) {
                throw new O1.f("Couldn't write derived key: " + e8.getMessage(), e8);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int c8 = d2.e.c(i8);
        if (byteArray.length == c8) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(d2.e.g(byteArray, 0, c8), "AES");
    }

    public SecretKey j(SecretKey secretKey, int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return i(secretKey, i8, g(bArr, bArr2, bArr3, bArr4, bArr5));
    }
}
