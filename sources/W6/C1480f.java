package W6;

/* renamed from: W6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1480f extends AbstractC1492s {

    /* renamed from: c, reason: collision with root package name */
    private static C1480f[] f10839c = new C1480f[12];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10840a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10841b;

    public C1480f(byte[] bArr) {
        if (!C1485k.C(bArr)) {
            if ((bArr[0] & 128) == 0) {
                this.f10840a = J7.a.d(bArr);
                this.f10841b = C1485k.F(bArr);
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1480f u(byte[] bArr) {
        if (bArr.length > 1) {
            return new C1480f(bArr);
        }
        if (bArr.length != 0) {
            int i8 = bArr[0] & 255;
            C1480f[] c1480fArr = f10839c;
            if (i8 >= c1480fArr.length) {
                return new C1480f(bArr);
            }
            C1480f c1480f = c1480fArr[i8];
            if (c1480f == null) {
                C1480f c1480f2 = new C1480f(bArr);
                c1480fArr[i8] = c1480f2;
                return c1480f2;
            }
            return c1480f;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10840a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof C1480f)) {
            return false;
        }
        return J7.a.a(this.f10840a, ((C1480f) abstractC1492s).f10840a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 10, this.f10840a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10840a.length) + 1 + this.f10840a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }
}
