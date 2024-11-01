package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class T implements InterfaceC1476d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private C1498y f10816a;

    public T(C1498y c1498y) {
        this.f10816a = c1498y;
    }

    @Override // W6.InterfaceC1476d
    public AbstractC1492s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r("unable to get DER object", e8);
        } catch (IllegalArgumentException e9) {
            throw new r("unable to get DER object", e9);
        }
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        try {
            return new o0(this.f10816a.d());
        } catch (IllegalArgumentException e8) {
            throw new C1481g(e8.getMessage(), e8);
        }
    }
}
