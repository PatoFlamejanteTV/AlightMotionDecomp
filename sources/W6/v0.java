package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v0 implements InterfaceC1497x {

    /* renamed from: a, reason: collision with root package name */
    private C1498y f10880a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(C1498y c1498y) {
        this.f10880a = c1498y;
    }

    @Override // W6.InterfaceC1476d
    public AbstractC1492s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r(e8.getMessage(), e8);
        }
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return new u0(this.f10880a.d());
    }
}
