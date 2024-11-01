package W6;

/* renamed from: W6.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1477d0 extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10833a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1477d0(byte[] bArr) {
        this.f10833a = bArr;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof C1477d0)) {
            return false;
        }
        return J7.a.a(this.f10833a, ((C1477d0) abstractC1492s).f10833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 19, this.f10833a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10833a.length) + 1 + this.f10833a.length;
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
        return J7.h.b(this.f10833a);
    }
}
