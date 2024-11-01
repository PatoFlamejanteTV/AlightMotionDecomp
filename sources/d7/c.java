package D7;

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
import p7.f;
import p7.g;

/* loaded from: classes5.dex */
public class c extends KeyFactorySpi implements InterfaceC3380a {
    public PrivateKey a(C1992b c1992b) {
        f n8 = f.n(c1992b.r());
        return new a(n8.o(), n8.l(), n8.q(), n8.m(), n8.s(), n8.r());
    }

    public PublicKey b(C2082b c2082b) {
        g q8 = g.q(c2082b.o());
        return new b(q8.o(), q8.l(), q8.n(), q8.m());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof H7.a) {
            return new a((H7.a) keySpec);
        }
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
        if (keySpec instanceof H7.b) {
            return new b((H7.b) keySpec);
        }
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
            if (H7.a.class.isAssignableFrom(cls)) {
                a aVar = (a) key;
                return new H7.a(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
            }
        } else if (key instanceof b) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (H7.b.class.isAssignableFrom(cls)) {
                b bVar = (b) key;
                return new H7.b(bVar.d(), bVar.a(), bVar.c(), bVar.b());
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
