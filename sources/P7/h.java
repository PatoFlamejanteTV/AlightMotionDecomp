package p7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import c7.C2081a;

/* loaded from: classes5.dex */
public class h extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final C1485k f36521a;

    /* renamed from: b, reason: collision with root package name */
    private final C2081a f36522b;

    private h(AbstractC1494u abstractC1494u) {
        this.f36521a = C1485k.v(abstractC1494u.v(0));
        this.f36522b = C2081a.m(abstractC1494u.v(1));
    }

    public static final h l(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(this.f36521a);
        c1478e.a(this.f36522b);
        return new C1479e0(c1478e);
    }

    public C2081a m() {
        return this.f36522b;
    }

    public h(C2081a c2081a) {
        this.f36521a = new C1485k(0L);
        this.f36522b = c2081a;
    }
}
