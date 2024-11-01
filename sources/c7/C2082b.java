package c7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1478e;
import W6.C1479e0;
import W6.InterfaceC1476d;
import W6.Q;
import java.util.Enumeration;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2082b extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private C2081a f15975a;

    /* renamed from: b, reason: collision with root package name */
    private Q f15976b;

    public C2082b(AbstractC1494u abstractC1494u) {
        if (abstractC1494u.size() == 2) {
            Enumeration y8 = abstractC1494u.y();
            this.f15975a = C2081a.m(y8.nextElement());
            this.f15976b = Q.C(y8.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1494u.size());
        }
    }

    public static C2082b m(Object obj) {
        if (obj instanceof C2082b) {
            return (C2082b) obj;
        }
        if (obj != null) {
            return new C2082b(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e(2);
        c1478e.a(this.f15975a);
        c1478e.a(this.f15976b);
        return new C1479e0(c1478e);
    }

    public C2081a l() {
        return this.f15975a;
    }

    public Q n() {
        return this.f15976b;
    }

    public AbstractC1492s o() {
        return AbstractC1492s.q(this.f15976b.y());
    }

    public C2082b(C2081a c2081a, InterfaceC1476d interfaceC1476d) {
        this.f15976b = new Q(interfaceC1476d);
        this.f15975a = c2081a;
    }

    public C2082b(C2081a c2081a, byte[] bArr) {
        this.f15976b = new Q(bArr);
        this.f15975a = c2081a;
    }
}
