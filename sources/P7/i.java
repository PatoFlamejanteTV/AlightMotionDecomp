package p7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import c7.C2081a;

/* loaded from: classes5.dex */
public class i extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final C1485k f36523a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36524b;

    /* renamed from: c, reason: collision with root package name */
    private final C2081a f36525c;

    public i(int i8, C2081a c2081a) {
        this.f36523a = new C1485k(0L);
        this.f36524b = i8;
        this.f36525c = c2081a;
    }

    public static i m(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(this.f36523a);
        c1478e.a(new C1485k(this.f36524b));
        c1478e.a(this.f36525c);
        return new C1479e0(c1478e);
    }

    public int l() {
        return this.f36524b;
    }

    public C2081a n() {
        return this.f36525c;
    }

    private i(AbstractC1494u abstractC1494u) {
        this.f36523a = C1485k.v(abstractC1494u.v(0));
        this.f36524b = C1485k.v(abstractC1494u.v(1)).B();
        this.f36525c = C2081a.m(abstractC1494u.v(2));
    }
}
