package W6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class B extends AbstractC1470a {
    public B(int i8, C1478e c1478e) {
        super(true, i8, v(c1478e));
    }

    private static byte[] v(C1478e c1478e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != c1478e.f(); i8++) {
            try {
                byteArrayOutputStream.write(((AbstractC1487m) c1478e.d(i8)).k("BER"));
            } catch (IOException e8) {
                throw new r("malformed object: " + e8, e8);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int i8;
        if (this.f10823a) {
            i8 = 96;
        } else {
            i8 = 64;
        }
        c1491q.o(z8, i8, this.f10824b, this.f10825c);
    }
}
