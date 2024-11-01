package P1;

import O1.i;
import O1.j;
import O1.l;
import O1.m;
import O1.u;
import S1.o;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class b extends o implements l {
    public b(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // O1.l
    public j a(m mVar, byte[] bArr) {
        i t8 = mVar.t();
        if (t8.equals(i.f6974l)) {
            O1.d v8 = mVar.v();
            if (v8.c() == d2.e.f(i().getEncoded())) {
                return S1.l.c(mVar, bArr, i(), null, g());
            }
            throw new u(v8.c(), v8);
        }
        throw new O1.f(S1.e.c(t8, o.f9388e));
    }
}
