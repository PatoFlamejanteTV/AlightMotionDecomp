package c7;

import W6.AbstractC1487m;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1478e;
import W6.C1479e0;
import W6.C1488n;
import W6.InterfaceC1476d;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2081a extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private C1488n f15973a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1476d f15974b;

    public C2081a(C1488n c1488n) {
        this.f15973a = c1488n;
    }

    public static C2081a m(Object obj) {
        if (obj instanceof C2081a) {
            return (C2081a) obj;
        }
        if (obj != null) {
            return new C2081a(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e(2);
        c1478e.a(this.f15973a);
        InterfaceC1476d interfaceC1476d = this.f15974b;
        if (interfaceC1476d != null) {
            c1478e.a(interfaceC1476d);
        }
        return new C1479e0(c1478e);
    }

    public C1488n l() {
        return this.f15973a;
    }

    public InterfaceC1476d n() {
        return this.f15974b;
    }

    public C2081a(C1488n c1488n, InterfaceC1476d interfaceC1476d) {
        this.f15973a = c1488n;
        this.f15974b = interfaceC1476d;
    }

    private C2081a(AbstractC1494u abstractC1494u) {
        if (abstractC1494u.size() >= 1 && abstractC1494u.size() <= 2) {
            this.f15973a = C1488n.B(abstractC1494u.v(0));
            this.f15974b = abstractC1494u.size() == 2 ? abstractC1494u.v(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1494u.size());
        }
    }
}
