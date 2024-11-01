package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class H implements InterfaceC1476d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10805a;

    /* renamed from: b, reason: collision with root package name */
    private final C1498y f10806b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(int i8, C1498y c1498y) {
        this.f10805a = i8;
        this.f10806b = c1498y;
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
        return new G(this.f10805a, this.f10806b.d());
    }
}
