package W6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class F implements InterfaceC1490p {

    /* renamed from: a, reason: collision with root package name */
    private C1498y f10804a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C1498y c1498y) {
        this.f10804a = c1498y;
    }

    @Override // W6.InterfaceC1490p
    public InputStream c() {
        return new O(this.f10804a);
    }

    @Override // W6.InterfaceC1476d
    public AbstractC1492s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r("IOException converting stream to byte array: " + e8.getMessage(), e8);
        }
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return new E(L7.a.b(c()));
    }
}
