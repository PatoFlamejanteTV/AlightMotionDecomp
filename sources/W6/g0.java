package W6;

/* loaded from: classes5.dex */
public class g0 extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f10844a;

    public g0(byte[] bArr) {
        this.f10844a = J7.a.d(bArr);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10844a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof g0)) {
            return false;
        }
        return J7.a.a(this.f10844a, ((g0) abstractC1492s).f10844a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 20, this.f10844a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10844a.length) + 1 + this.f10844a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    public String toString() {
        return u();
    }

    public String u() {
        return J7.h.b(this.f10844a);
    }
}
