package W6;

/* loaded from: classes5.dex */
public class f0 extends AbstractC1496w {

    /* renamed from: c, reason: collision with root package name */
    private int f10842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(boolean z8, InterfaceC1476d[] interfaceC1476dArr) {
        super(D(z8), interfaceC1476dArr);
        this.f10842c = -1;
    }

    private static boolean D(boolean z8) {
        if (z8) {
            return z8;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int E() {
        if (this.f10842c < 0) {
            int length = this.f10881a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10881a[i9].d().s().n();
            }
            this.f10842c = i8;
        }
        return this.f10842c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        if (z8) {
            c1491q.f(49);
        }
        C1475c0 d8 = c1491q.d();
        int length = this.f10881a.length;
        int i8 = 0;
        if (this.f10842c < 0 && length <= 16) {
            AbstractC1492s[] abstractC1492sArr = new AbstractC1492s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1492s s8 = this.f10881a[i10].d().s();
                abstractC1492sArr[i10] = s8;
                i9 += s8.n();
            }
            this.f10842c = i9;
            c1491q.r(i9);
            while (i8 < length) {
                abstractC1492sArr[i8].m(d8, true);
                i8++;
            }
            return;
        }
        c1491q.r(E());
        while (i8 < length) {
            this.f10881a[i8].d().s().m(d8, true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int E8 = E();
        return E0.a(E8) + 1 + E8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1496w, W6.AbstractC1492s
    public AbstractC1492s s() {
        if (this.f10882b) {
            return this;
        }
        return super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1496w, W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
