package W6;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class M extends AbstractC1499z {
    public M(boolean z8, int i8, InterfaceC1476d interfaceC1476d) {
        super(z8, i8, interfaceC1476d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        Enumeration z9;
        c1491q.v(z8, 160, this.f10891a);
        c1491q.f(128);
        if (!this.f10892b) {
            InterfaceC1476d interfaceC1476d = this.f10893c;
            if (interfaceC1476d instanceof AbstractC1489o) {
                if (interfaceC1476d instanceof E) {
                    z9 = ((E) interfaceC1476d).C();
                } else {
                    z9 = new E(((AbstractC1489o) interfaceC1476d).y()).C();
                }
            } else if (interfaceC1476d instanceof AbstractC1494u) {
                z9 = ((AbstractC1494u) interfaceC1476d).y();
            } else if (interfaceC1476d instanceof AbstractC1496w) {
                z9 = ((AbstractC1496w) interfaceC1476d).z();
            } else {
                throw new C1481g("not implemented: " + this.f10893c.getClass().getName());
            }
            c1491q.h(z9);
        } else {
            c1491q.u(this.f10893c.d(), true);
        }
        c1491q.f(0);
        c1491q.f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int b9;
        int n8 = this.f10893c.d().n();
        if (this.f10892b) {
            b9 = E0.b(this.f10891a) + E0.a(n8);
        } else {
            n8--;
            b9 = E0.b(this.f10891a);
        }
        return b9 + n8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        if (!this.f10892b && !this.f10893c.d().r()) {
            return false;
        }
        return true;
    }
}
