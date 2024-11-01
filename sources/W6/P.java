package W6;

/* loaded from: classes5.dex */
public class P extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f10815a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(char[] cArr) {
        if (cArr != null) {
            this.f10815a = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.m(this.f10815a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof P)) {
            return false;
        }
        return J7.a.b(this.f10815a, ((P) abstractC1492s).f10815a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int length = this.f10815a.length;
        if (z8) {
            c1491q.f(30);
        }
        c1491q.r(length * 2);
        byte[] bArr = new byte[8];
        int i8 = length & (-4);
        int i9 = 0;
        while (i9 < i8) {
            char[] cArr = this.f10815a;
            char c8 = cArr[i9];
            char c9 = cArr[i9 + 1];
            char c10 = cArr[i9 + 2];
            char c11 = cArr[i9 + 3];
            i9 += 4;
            bArr[0] = (byte) (c8 >> '\b');
            bArr[1] = (byte) c8;
            bArr[2] = (byte) (c9 >> '\b');
            bArr[3] = (byte) c9;
            bArr[4] = (byte) (c10 >> '\b');
            bArr[5] = (byte) c10;
            bArr[6] = (byte) (c11 >> '\b');
            bArr[7] = (byte) c11;
            c1491q.g(bArr, 0, 8);
        }
        if (i9 < length) {
            int i10 = 0;
            do {
                char c12 = this.f10815a[i9];
                i9++;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (c12 >> '\b');
                i10 += 2;
                bArr[i11] = (byte) c12;
            } while (i9 < length);
            c1491q.g(bArr, 0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10815a.length * 2) + 1 + (this.f10815a.length * 2);
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
        return new String(this.f10815a);
    }
}
