package E7;

import W6.AbstractC1492s;
import b7.C1992b;
import c7.C2082b;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import m7.InterfaceC3380a;

/* loaded from: classes5.dex */
public class c extends KeyFactorySpi implements InterfaceC3380a {
    public PrivateKey a(C1992b c1992b) {
        return new a(c1992b);
    }

    public PublicKey b(C2082b c2082b) {
        return new b(c2082b);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(C1992b.m(AbstractC1492s.q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(C2082b.m(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof a) && !(key instanceof b)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }
}
