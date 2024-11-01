package W6;

/* loaded from: classes5.dex */
public class K extends AbstractC1496w {
    public K() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.q(z8, 49, this.f10881a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int length = this.f10881a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f10881a[i9].d().n();
        }
        return i8 + 4;
    }

    public K(InterfaceC1476d interfaceC1476d) {
        super(interfaceC1476d);
    }

    public K(C1478e c1478e) {
        super(c1478e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(boolean z8, InterfaceC1476d[] interfaceC1476dArr) {
        super(z8, interfaceC1476dArr);
    }
}
