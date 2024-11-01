package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class C implements InterfaceC1476d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10789a;

    /* renamed from: b, reason: collision with root package name */
    private final C1498y f10790b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(int i8, C1498y c1498y) {
        this.f10789a = i8;
        this.f10790b = c1498y;
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
        return new B(this.f10789a, this.f10790b.d());
    }
}
