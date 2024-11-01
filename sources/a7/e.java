package A7;

import W6.AbstractC1492s;
import b7.C1992b;
import c7.C2082b;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import m7.InterfaceC3380a;
import p7.C3589a;
import p7.C3590b;
import p7.InterfaceC3593e;
import r7.C3933b;

/* loaded from: classes5.dex */
public class e extends KeyFactorySpi implements InterfaceC3380a {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C1992b m8 = C1992b.m(AbstractC1492s.q(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (InterfaceC3593e.f36494n.o(m8.n().l())) {
                        C3589a o8 = C3589a.o(m8.r());
                        return new a(new C3933b(o8.r(), o8.q(), o8.m(), o8.n(), o8.s(), g.b(o8.l()).e()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e8) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e8);
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C2082b m8 = C2082b.m(AbstractC1492s.q(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (InterfaceC3593e.f36494n.o(m8.l().l())) {
                        C3590b n8 = C3590b.n(m8.o());
                        return new b(new r7.c(n8.o(), n8.q(), n8.m(), g.b(n8.l()).e()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException e8) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e8.getMessage());
                }
            } catch (IOException e9) {
                throw new InvalidKeySpecException(e9.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        return null;
    }
}
