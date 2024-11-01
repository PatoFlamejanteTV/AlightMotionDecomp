package S1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9392a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f9393b = {0, 0, 0, 0};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f9394c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9395d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, O1.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f9392a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(d2.i.a(length / 2));
            byteArrayOutputStream.write(dVar.toString().getBytes(d2.m.f31296a));
            if (bArr != null) {
                byteArrayOutputStream.write(d2.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f9393b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(d2.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f9393b);
            }
            byteArrayOutputStream.write(f9394c);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e8) {
                throw new O1.f(e8.getMessage(), e8);
            }
        } catch (IOException e9) {
            throw new O1.f(e9.getMessage(), e9);
        }
    }

    public static SecretKey b(SecretKey secretKey, O1.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f9392a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(d2.i.a(length));
            byteArrayOutputStream.write(dVar.toString().getBytes(d2.m.f31296a));
            if (bArr != null) {
                byteArrayOutputStream.write(d2.i.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f9393b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(d2.i.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f9393b);
            }
            byteArrayOutputStream.write(f9395d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e8) {
                throw new O1.f(e8.getMessage(), e8);
            }
        } catch (IOException e9) {
            throw new O1.f(e9.getMessage(), e9);
        }
    }
}
