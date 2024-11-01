package S1;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public abstract class i {
    public static Cipher a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
