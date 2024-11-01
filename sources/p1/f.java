package P1;

import O1.q;
import O1.s;
import S1.m;
import S1.y;
import S1.z;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class f extends z implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f8003d;

    /* renamed from: e, reason: collision with root package name */
    private final RSAPublicKey f8004e;

    public f(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // O1.s
    public boolean c(q qVar, byte[] bArr, d2.c cVar) {
        if (!this.f8003d.d(qVar)) {
            return false;
        }
        Signature a9 = y.a(qVar.t(), d().a());
        try {
            a9.initVerify(this.f8004e);
            try {
                a9.update(bArr);
                return a9.verify(cVar.a());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e8) {
            throw new O1.f("Invalid public RSA key: " + e8.getMessage(), e8);
        }
    }

    public f(RSAPublicKey rSAPublicKey, Set set) {
        m mVar = new m();
        this.f8003d = mVar;
        if (rSAPublicKey != null) {
            this.f8004e = rSAPublicKey;
            mVar.e(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
