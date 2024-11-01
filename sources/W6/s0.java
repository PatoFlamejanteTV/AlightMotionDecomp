package W6;

/* loaded from: classes5.dex */
public class s0 extends AbstractC1494u {

    /* renamed from: b, reason: collision with root package name */
    private int f10871b;

    public s0() {
        this.f10871b = -1;
    }

    private int A() {
        if (this.f10871b < 0) {
            int length = this.f10876a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10876a[i9].d().t().n();
            }
            this.f10871b = i8;
        }
        return this.f10871b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        if (z8) {
            c1491q.f(48);
        }
        C1491q e8 = c1491q.e();
        int length = this.f10876a.length;
        int i8 = 0;
        if (this.f10871b < 0 && length <= 16) {
            AbstractC1492s[] abstractC1492sArr = new AbstractC1492s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1492s t8 = this.f10876a[i10].d().t();
                abstractC1492sArr[i10] = t8;
                i9 += t8.n();
            }
            this.f10871b = i9;
            c1491q.r(i9);
            while (i8 < length) {
                e8.u(abstractC1492sArr[i8], true);
                i8++;
            }
            return;
        }
        c1491q.r(A());
        while (i8 < length) {
            e8.u(this.f10876a[i8].d(), true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int A8 = A();
        return E0.a(A8) + 1 + A8;
    }

    public s0(C1478e c1478e) {
        super(c1478e);
        this.f10871b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(InterfaceC1476d[] interfaceC1476dArr, boolean z8) {
        super(interfaceC1476dArr, z8);
        this.f10871b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u, W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
