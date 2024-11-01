package W6;

/* renamed from: W6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1483i extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    protected byte[] f10850a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1483i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f10850a = bArr;
            if (z(0) && z(1) && z(2) && z(3)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    private boolean z(int i8) {
        byte b9;
        byte[] bArr = this.f10850a;
        if (bArr.length > i8 && (b9 = bArr[i8]) >= 48 && b9 <= 57) {
            return true;
        }
        return false;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10850a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof C1483i)) {
            return false;
        }
        return J7.a.a(this.f10850a, ((C1483i) abstractC1492s).f10850a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 24, this.f10850a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int length = this.f10850a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new V(this.f10850a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return new V(this.f10850a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f10850a;
            if (i8 == bArr.length) {
                return false;
            }
            if (bArr[i8] == 46 && i8 == 14) {
                return true;
            }
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v() {
        if (z(10) && z(11)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y() {
        if (z(12) && z(13)) {
            return true;
        }
        return false;
    }
}
