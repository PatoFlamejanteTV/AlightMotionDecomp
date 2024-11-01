package W6;

/* loaded from: classes5.dex */
public class h0 extends AbstractC1499z {
    public h0(boolean z8, int i8, InterfaceC1476d interfaceC1476d) {
        super(z8, i8, interfaceC1476d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int i8;
        AbstractC1492s s8 = this.f10893c.d().s();
        if (!this.f10892b && !s8.r()) {
            i8 = 128;
        } else {
            i8 = 160;
        }
        c1491q.v(z8, i8, this.f10891a);
        if (this.f10892b) {
            c1491q.r(s8.n());
        }
        s8.m(c1491q.d(), this.f10892b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int b9;
        int n8 = this.f10893c.d().s().n();
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
        if (!this.f10892b && !this.f10893c.d().s().r()) {
            return false;
        }
        return true;
    }

    @Override // W6.AbstractC1499z, W6.AbstractC1492s
    AbstractC1492s s() {
        return this;
    }

    @Override // W6.AbstractC1499z, W6.AbstractC1492s
    AbstractC1492s t() {
        return this;
    }
}
