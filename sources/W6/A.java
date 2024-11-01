package W6;

/* loaded from: classes5.dex */
public class A extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f10785a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f10785a = bArr;
            if (u(0) && u(1)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    private boolean u(int i8) {
        byte b9;
        byte[] bArr = this.f10785a;
        if (bArr.length > i8 && (b9 = bArr[i8]) >= 48 && b9 <= 57) {
            return true;
        }
        return false;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10785a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof A)) {
            return false;
        }
        return J7.a.a(this.f10785a, ((A) abstractC1492s).f10785a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 23, this.f10785a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int length = this.f10785a.length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    public String toString() {
        return J7.h.b(this.f10785a);
    }
}
