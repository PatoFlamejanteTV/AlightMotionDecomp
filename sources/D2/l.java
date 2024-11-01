package d2;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class l {
    public static SecretKey a(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), "AES");
    }
}
