package S1;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class s {
    public static byte[] a(String str, byte[] bArr, byte[] bArr2, Provider provider) {
        return b(new SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, Provider provider) {
        Mac c8 = c(secretKey, provider);
        c8.update(bArr);
        return c8.doFinal();
    }

    public static Mac c(SecretKey secretKey, Provider provider) {
        Mac mac;
        try {
            if (provider != null) {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } else {
                mac = Mac.getInstance(secretKey.getAlgorithm());
            }
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e8) {
            throw new O1.f("Invalid HMAC key: " + e8.getMessage(), e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new O1.f("Unsupported HMAC algorithm: " + e9.getMessage(), e9);
        }
    }
}
