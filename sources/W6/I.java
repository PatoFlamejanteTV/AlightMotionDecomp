package W6;

/* loaded from: classes5.dex */
public class I extends AbstractC1494u {
    public I() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.q(z8, 48, this.f10876a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int length = this.f10876a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.f10876a[i9].d().n();
        }
        return i8 + 4;
    }

    public I(C1478e c1478e) {
        super(c1478e);
    }
}
