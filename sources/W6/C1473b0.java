package W6;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: W6.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1473b0 implements InterfaceC1490p {

    /* renamed from: a, reason: collision with root package name */
    private x0 f10829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1473b0(x0 x0Var) {
        this.f10829a = x0Var;
    }

    @Override // W6.InterfaceC1490p
    public InputStream c() {
        return this.f10829a;
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
        return new C1471a0(this.f10829a.i());
    }
}
