package p7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;

/* loaded from: classes5.dex */
public class l extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f36538a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36539b;

    public l(byte[] bArr, byte[] bArr2) {
        this.f36538a = J7.a.d(bArr);
        this.f36539b = J7.a.d(bArr2);
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(0L));
        c1478e.a(new C1471a0(this.f36538a));
        c1478e.a(new C1471a0(this.f36539b));
        return new C1479e0(c1478e);
    }
}
