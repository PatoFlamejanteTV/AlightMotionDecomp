package W6;

/* loaded from: classes5.dex */
public class u0 extends AbstractC1496w {

    /* renamed from: c, reason: collision with root package name */
    private int f10879c;

    public u0() {
        this.f10879c = -1;
    }

    private int D() {
        if (this.f10879c < 0) {
            int length = this.f10881a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10881a[i9].d().t().n();
            }
            this.f10879c = i8;
        }
        return this.f10879c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        if (z8) {
            c1491q.f(49);
        }
        C1491q e8 = c1491q.e();
        int length = this.f10881a.length;
        int i8 = 0;
        if (this.f10879c < 0 && length <= 16) {
            AbstractC1492s[] abstractC1492sArr = new AbstractC1492s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1492s t8 = this.f10881a[i10].d().t();
                abstractC1492sArr[i10] = t8;
                i9 += t8.n();
            }
            this.f10879c = i9;
            c1491q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1492sArr[i8], true);
                i8++;
            }
            return;
        }
        c1491q.r(D());
        while (i8 < length) {
            e8.u(this.f10881a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int D8 = D();
        return E0.a(D8) + 1 + D8;
    }

    public u0(InterfaceC1476d interfaceC1476d) {
        super(interfaceC1476d);
        this.f10879c = -1;
    }

    public u0(C1478e c1478e) {
        super(c1478e, false);
        this.f10879c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(boolean z8, InterfaceC1476d[] interfaceC1476dArr) {
        super(z8, interfaceC1476dArr);
        this.f10879c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1496w, W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
