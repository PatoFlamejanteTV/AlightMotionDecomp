package z7;

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

/* renamed from: z7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4276c extends KeyFactorySpi implements InterfaceC3380a {
    public PrivateKey a(C1992b c1992b) {
        return new C4274a(c1992b);
    }

    public PublicKey b(C2082b c2082b) {
        return new C4275b(c2082b);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(C1992b.m(AbstractC1492s.q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString(), e8);
            }
        }
        throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(C2082b.m(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e8) {
                throw new InvalidKeySpecException(e8.toString(), e8);
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof C4274a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (key instanceof C4275b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        } else {
            throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if (!(key instanceof C4274a) && !(key instanceof C4275b)) {
            throw new InvalidKeyException("unsupported key type");
        }
        return key;
    }
}
