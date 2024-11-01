package P1;

import O1.i;
import O1.k;
import S1.l;
import S1.m;
import S1.o;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class a extends o implements k {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7996g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7997h;

    public a(SecretKey secretKey, boolean z8) {
        super(secretKey);
        this.f7997h = new m();
        this.f7996g = z8;
    }

    @Override // O1.k
    public byte[] e(O1.m mVar, d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4) {
        if (!this.f7996g) {
            i t8 = mVar.t();
            if (t8.equals(i.f6974l)) {
                if (cVar != null) {
                    throw new O1.f("Unexpected present JWE encrypted key");
                }
            } else {
                throw new O1.f(S1.e.c(t8, o.f9388e));
            }
        }
        if (cVar2 != null) {
            if (cVar4 != null) {
                this.f7997h.a(mVar);
                return l.b(mVar, null, cVar2, cVar3, cVar4, i(), g());
            }
            throw new O1.f("Missing JWE authentication tag");
        }
        throw new O1.f("Unexpected present JWE initialization vector (IV)");
    }

    public a(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"), false);
    }
}
