package W6;

/* loaded from: classes5.dex */
public class w0 extends AbstractC1499z {
    public w0(boolean z8, int i8, InterfaceC1476d interfaceC1476d) {
        super(z8, i8, interfaceC1476d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int i8;
        AbstractC1492s t8 = this.f10893c.d().t();
        if (!this.f10892b && !t8.r()) {
            i8 = 128;
        } else {
            i8 = 160;
        }
        c1491q.v(z8, i8, this.f10891a);
        if (this.f10892b) {
            c1491q.r(t8.n());
        }
        c1491q.e().u(t8, this.f10892b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int b9;
        int n8 = this.f10893c.d().t().n();
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
        if (!this.f10892b && !this.f10893c.d().t().r()) {
            return false;
        }
        return true;
    }

    @Override // W6.AbstractC1499z, W6.AbstractC1492s
    AbstractC1492s t() {
        return this;
    }
}
