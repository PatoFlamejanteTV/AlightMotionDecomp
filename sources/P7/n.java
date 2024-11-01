package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;

/* loaded from: classes5.dex */
public class n extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f36548a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36549b;

    private n(AbstractC1494u abstractC1494u) {
        if (!C1485k.v(abstractC1494u.v(0)).z(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f36548a = J7.a.d(AbstractC1489o.v(abstractC1494u.v(1)).y());
        this.f36549b = J7.a.d(AbstractC1489o.v(abstractC1494u.v(2)).y());
    }

    public static n l(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(0L));
        c1478e.a(new C1471a0(this.f36548a));
        c1478e.a(new C1471a0(this.f36549b));
        return new C1479e0(c1478e);
    }

    public byte[] m() {
        return J7.a.d(this.f36548a);
    }

    public byte[] n() {
        return J7.a.d(this.f36549b);
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f36548a = J7.a.d(bArr);
        this.f36549b = J7.a.d(bArr2);
    }
}
