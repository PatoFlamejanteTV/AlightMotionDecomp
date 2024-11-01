package P1;

import O1.p;
import O1.q;
import O1.s;
import S1.m;
import S1.r;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;

/* loaded from: classes4.dex */
public class c extends r implements s {

    /* renamed from: d, reason: collision with root package name */
    private final m f7998d;

    /* renamed from: e, reason: collision with root package name */
    private final ECPublicKey f7999e;

    public c(ECPublicKey eCPublicKey) {
        this(eCPublicKey, null);
    }

    @Override // O1.s
    public boolean c(q qVar, byte[] bArr, d2.c cVar) {
        p t8 = qVar.t();
        if (g().contains(t8)) {
            if (!this.f7998d.d(qVar)) {
                return false;
            }
            byte[] a9 = cVar.a();
            if (S1.q.a(qVar.t()) != a9.length) {
                return false;
            }
            try {
                byte[] e8 = S1.q.e(a9);
                Signature b9 = S1.q.b(t8, d().a());
                try {
                    b9.initVerify(this.f7999e);
                    b9.update(bArr);
                    return b9.verify(e8);
                } catch (InvalidKeyException e9) {
                    throw new O1.f("Invalid EC public key: " + e9.getMessage(), e9);
                } catch (SignatureException unused) {
                    return false;
                }
            } catch (O1.f unused2) {
                return false;
            }
        }
        throw new O1.f(S1.e.d(t8, g()));
    }

    public c(ECPublicKey eCPublicKey, Set set) {
        super(S1.q.d(eCPublicKey));
        m mVar = new m();
        this.f7998d = mVar;
        this.f7999e = eCPublicKey;
        if (T1.b.b(eCPublicKey, ((V1.a) V1.a.b(h()).iterator().next()).f())) {
            mVar.e(set);
            return;
        }
        throw new O1.f("Curve / public key parameters mismatch");
    }
}
