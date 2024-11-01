package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;

/* renamed from: p7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3592d extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final int f36453a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36454b;

    /* renamed from: c, reason: collision with root package name */
    private final I7.a f36455c;

    public C3592d(int i8, int i9, I7.a aVar) {
        this.f36453a = i8;
        this.f36454b = i9;
        this.f36455c = new I7.a(aVar);
    }

    public static C3592d m(Object obj) {
        if (obj instanceof C3592d) {
            return (C3592d) obj;
        }
        if (obj != null) {
            return new C3592d(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(this.f36453a));
        c1478e.a(new C1485k(this.f36454b));
        c1478e.a(new C1471a0(this.f36455c.c()));
        return new C1479e0(c1478e);
    }

    public I7.a l() {
        return new I7.a(this.f36455c);
    }

    public int n() {
        return this.f36453a;
    }

    public int o() {
        return this.f36454b;
    }

    private C3592d(AbstractC1494u abstractC1494u) {
        this.f36453a = ((C1485k) abstractC1494u.v(0)).B();
        this.f36454b = ((C1485k) abstractC1494u.v(1)).B();
        this.f36455c = new I7.a(((AbstractC1489o) abstractC1494u.v(2)).y());
    }
}
