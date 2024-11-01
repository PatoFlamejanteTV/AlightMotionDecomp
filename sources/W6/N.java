package W6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class N implements InterfaceC1476d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10809a;

    /* renamed from: b, reason: collision with root package name */
    private int f10810b;

    /* renamed from: c, reason: collision with root package name */
    private C1498y f10811c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(boolean z8, int i8, C1498y c1498y) {
        this.f10809a = z8;
        this.f10810b = i8;
        this.f10811c = c1498y;
    }

    @Override // W6.InterfaceC1476d
    public AbstractC1492s d() {
        try {
            return e();
        } catch (IOException e8) {
            throw new r(e8.getMessage());
        }
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return this.f10811c.c(this.f10809a, this.f10810b);
    }
}
