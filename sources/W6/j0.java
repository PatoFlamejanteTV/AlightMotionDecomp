package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class j0 extends AbstractC1492s {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f10855b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10856a;

    public j0(byte[] bArr) {
        this.f10856a = J7.a.d(bArr);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(this.f10856a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof j0)) {
            return false;
        }
        return J7.a.a(this.f10856a, ((j0) abstractC1492s).f10856a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 28, this.f10856a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10856a.length) + 1 + this.f10856a.length;
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
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = f10855b;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new r("internal error encoding UniversalString");
        }
    }
}
