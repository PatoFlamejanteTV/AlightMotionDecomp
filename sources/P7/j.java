package p7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import c7.C2081a;

/* loaded from: classes5.dex */
public class j extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final C1485k f36526a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36527b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36528c;

    /* renamed from: d, reason: collision with root package name */
    private final C2081a f36529d;

    public j(int i8, int i9, C2081a c2081a) {
        this.f36526a = new C1485k(0L);
        this.f36527b = i8;
        this.f36528c = i9;
        this.f36529d = c2081a;
    }

    public static j m(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(this.f36526a);
        c1478e.a(new C1485k(this.f36527b));
        c1478e.a(new C1485k(this.f36528c));
        c1478e.a(this.f36529d);
        return new C1479e0(c1478e);
    }

    public int l() {
        return this.f36527b;
    }

    public int n() {
        return this.f36528c;
    }

    public C2081a o() {
        return this.f36529d;
    }

    private j(AbstractC1494u abstractC1494u) {
        this.f36526a = C1485k.v(abstractC1494u.v(0));
        this.f36527b = C1485k.v(abstractC1494u.v(1)).B();
        this.f36528c = C1485k.v(abstractC1494u.v(2)).B();
        this.f36529d = C2081a.m(abstractC1494u.v(3));
    }
}
