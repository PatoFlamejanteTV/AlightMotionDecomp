package W6;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class S extends AbstractC1482h {
    public S(C1488n c1488n, C1485k c1485k, AbstractC1492s abstractC1492s, int i8, AbstractC1492s abstractC1492s2) {
        super(c1488n, c1485k, abstractC1492s, i8, abstractC1492s2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1488n c1488n = this.f10845a;
        if (c1488n != null) {
            byteArrayOutputStream.write(c1488n.k("DER"));
        }
        C1485k c1485k = this.f10846b;
        if (c1485k != null) {
            byteArrayOutputStream.write(c1485k.k("DER"));
        }
        AbstractC1492s abstractC1492s = this.f10847c;
        if (abstractC1492s != null) {
            byteArrayOutputStream.write(abstractC1492s.k("DER"));
        }
        byteArrayOutputStream.write(new h0(true, this.f10848d, this.f10849e).k("DER"));
        c1491q.m(z8, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return getEncoded().length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1482h, W6.AbstractC1492s
    public AbstractC1492s s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
