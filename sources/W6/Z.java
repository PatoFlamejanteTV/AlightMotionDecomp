package W6;

/* loaded from: classes5.dex */
public class Z extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10822a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z(byte[] bArr) {
        this.f10822a = bArr;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10822a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof Z)) {
            return false;
        }
        return J7.a.a(this.f10822a, ((Z) abstractC1492s).f10822a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 18, this.f10822a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10822a.length) + 1 + this.f10822a.length;
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
        return J7.h.b(this.f10822a);
    }
}
