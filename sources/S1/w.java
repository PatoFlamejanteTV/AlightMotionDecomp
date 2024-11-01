package S1;

import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class w {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) {
        try {
            Cipher a9 = i.a("RSA/ECB/PKCS1Padding", provider);
            a9.init(1, rSAPublicKey);
            return a9.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e8) {
            throw new O1.f("RSA block size exception: The RSA key is too short, use a longer one", e8);
        } catch (Exception e9) {
            throw new O1.f("Couldn't encrypt Content Encryption Key (CEK): " + e9.getMessage(), e9);
        }
    }
}
