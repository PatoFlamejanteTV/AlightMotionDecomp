package S1;

import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes4.dex */
public abstract class B {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i8, Provider provider) {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i8) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = "SHA-256";
        } else if (384 == i8) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else if (512 == i8) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        } else {
            throw new O1.f("Unsupported SHA-2 bit size: " + i8);
        }
        try {
            AlgorithmParameters a9 = d.a("OAEP", provider);
            a9.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher a10 = i.a(str, provider);
            a10.init(1, rSAPublicKey, a9);
            return a10.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e8) {
            throw new O1.f("RSA block size exception: The RSA key is too short, use a longer one", e8);
        } catch (Exception e9) {
            throw new O1.f(e9.getMessage(), e9);
        }
    }
}
