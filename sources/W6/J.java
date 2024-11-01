package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class J implements InterfaceC1495v {

    /* renamed from: a, reason: collision with root package name */
    private C1498y f10807a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(C1498y c1498y) {
        this.f10807a = c1498y;
    }

    @Override // W6.InterfaceC1476d
    public AbstractC1492s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return new I(this.f10807a.d());
    }
}
