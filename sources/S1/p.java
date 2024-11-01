package S1;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class p {
    public static SecretKey a(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) {
        KeyAgreement keyAgreement;
        try {
            if (provider != null) {
                keyAgreement = KeyAgreement.getInstance("ECDH", provider);
            } else {
                keyAgreement = KeyAgreement.getInstance("ECDH");
            }
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e8) {
                throw new O1.f("Invalid key for ECDH key agreement: " + e8.getMessage(), e8);
            }
        } catch (NoSuchAlgorithmException e9) {
            throw new O1.f("Couldn't get an ECDH key agreement instance: " + e9.getMessage(), e9);
        }
    }
}
