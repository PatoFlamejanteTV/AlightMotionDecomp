package W6;

/* loaded from: classes5.dex */
public class X extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10819a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X(byte[] bArr) {
        this.f10819a = bArr;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10819a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof X)) {
            return false;
        }
        return J7.a.a(this.f10819a, ((X) abstractC1492s).f10819a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 22, this.f10819a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10819a.length) + 1 + this.f10819a.length;
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
        return J7.h.b(this.f10819a);
    }
}