package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import c7.C2081a;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3590b extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final int f36442a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36443b;

    /* renamed from: c, reason: collision with root package name */
    private final I7.a f36444c;

    /* renamed from: d, reason: collision with root package name */
    private final C2081a f36445d;

    public C3590b(int i8, int i9, I7.a aVar, C2081a c2081a) {
        this.f36442a = i8;
        this.f36443b = i9;
        this.f36444c = new I7.a(aVar.c());
        this.f36445d = c2081a;
    }

    public static C3590b n(Object obj) {
        if (obj instanceof C3590b) {
            return (C3590b) obj;
        }
        if (obj != null) {
            return new C3590b(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(this.f36442a));
        c1478e.a(new C1485k(this.f36443b));
        c1478e.a(new C1471a0(this.f36444c.c()));
        c1478e.a(this.f36445d);
        return new C1479e0(c1478e);
    }

    public C2081a l() {
        return this.f36445d;
    }

    public I7.a m() {
        return this.f36444c;
    }

    public int o() {
        return this.f36442a;
    }

    public int q() {
        return this.f36443b;
    }

    private C3590b(AbstractC1494u abstractC1494u) {
        this.f36442a = ((C1485k) abstractC1494u.v(0)).B();
        this.f36443b = ((C1485k) abstractC1494u.v(1)).B();
        this.f36444c = new I7.a(((AbstractC1489o) abstractC1494u.v(2)).y());
        this.f36445d = C2081a.m(abstractC1494u.v(3));
    }
}
