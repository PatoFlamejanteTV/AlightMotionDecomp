package W6;

/* renamed from: W6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1479e0 extends AbstractC1494u {

    /* renamed from: b, reason: collision with root package name */
    private int f10838b;

    public C1479e0(C1478e c1478e) {
        super(c1478e);
        this.f10838b = -1;
    }

    private int A() {
        if (this.f10838b < 0) {
            int length = this.f10876a.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.f10876a[i9].d().s().n();
            }
            this.f10838b = i8;
        }
        return this.f10838b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        if (z8) {
            c1491q.f(48);
        }
        C1475c0 d8 = c1491q.d();
        int length = this.f10876a.length;
        int i8 = 0;
        if (this.f10838b < 0 && length <= 16) {
            AbstractC1492s[] abstractC1492sArr = new AbstractC1492s[length];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC1492s s8 = this.f10876a[i10].d().s();
                abstractC1492sArr[i10] = s8;
                i9 += s8.n();
            }
            this.f10838b = i9;
            c1491q.r(i9);
            while (i8 < length) {
                abstractC1492sArr[i8].m(d8, true);
                i8++;
            }
            return;
        }
        c1491q.r(A());
        while (i8 < length) {
            this.f10876a[i8].d().s().m(d8, true);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int A8 = A();
        return E0.a(A8) + 1 + A8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1479e0(InterfaceC1476d[] interfaceC1476dArr, boolean z8) {
        super(interfaceC1476dArr, z8);
        this.f10838b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u, W6.AbstractC1492s
    public AbstractC1492s s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u, W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
