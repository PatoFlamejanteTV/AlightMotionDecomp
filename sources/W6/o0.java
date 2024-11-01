package W6;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class o0 extends AbstractC1482h {
    public o0(C1478e c1478e) {
        super(c1478e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1488n c1488n = this.f10845a;
        if (c1488n != null) {
            byteArrayOutputStream.write(c1488n.k("DL"));
        }
        C1485k c1485k = this.f10846b;
        if (c1485k != null) {
            byteArrayOutputStream.write(c1485k.k("DL"));
        }
        AbstractC1492s abstractC1492s = this.f10847c;
        if (abstractC1492s != null) {
            byteArrayOutputStream.write(abstractC1492s.k("DL"));
        }
        byteArrayOutputStream.write(new w0(true, this.f10848d, this.f10849e).k("DL"));
        c1491q.m(z8, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return getEncoded().length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
