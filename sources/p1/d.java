package P1;

import O1.q;
import O1.s;
import S1.m;
import S1.v;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class d extends v implements s {

    /* renamed from: e, reason: collision with root package name */
    private final m f8000e;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    @Override // O1.s
    public boolean c(q qVar, byte[] bArr, d2.c cVar) {
        if (!this.f8000e.d(qVar)) {
            return false;
        }
        return T1.a.a(S1.s.a(v.h(qVar.t()), i(), bArr, d().a()), cVar.a());
    }

    public d(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public d(byte[] bArr, Set set) {
        super(bArr, v.f9396d);
        m mVar = new m();
        this.f8000e = mVar;
        mVar.e(set);
    }
}
