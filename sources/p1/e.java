package P1;

import O1.i;
import O1.j;
import O1.l;
import O1.m;
import S1.A;
import S1.B;
import S1.w;
import S1.x;
import j$.util.DesugarCollections;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class e extends x implements l {

    /* renamed from: f, reason: collision with root package name */
    private final RSAPublicKey f8001f;

    /* renamed from: g, reason: collision with root package name */
    private final SecretKey f8002g;

    public e(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // O1.l
    public j a(m mVar, byte[] bArr) {
        d2.c e8;
        i t8 = mVar.t();
        O1.d v8 = mVar.v();
        SecretKey secretKey = this.f8002g;
        if (secretKey == null) {
            secretKey = S1.l.d(v8, g().b());
        }
        if (t8.equals(i.f6966d)) {
            e8 = d2.c.e(w.a(this.f8001f, secretKey, g().e()));
        } else if (t8.equals(i.f6967e)) {
            e8 = d2.c.e(A.a(this.f8001f, secretKey, g().e()));
        } else if (t8.equals(i.f6968f)) {
            e8 = d2.c.e(B.a(this.f8001f, secretKey, 256, g().e()));
        } else if (t8.equals(i.f6969g)) {
            e8 = d2.c.e(B.a(this.f8001f, secretKey, 384, g().e()));
        } else if (t8.equals(i.f6970h)) {
            e8 = d2.c.e(B.a(this.f8001f, secretKey, 512, g().e()));
        } else {
            throw new O1.f(S1.e.c(t8, x.f9398d));
        }
        return S1.l.c(mVar, bArr, secretKey, e8, g());
    }

    public e(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f8001f = rSAPublicKey;
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && unmodifiableSet.contains(secretKey.getAlgorithm())) {
                    this.f8002g = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.f8002g = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
