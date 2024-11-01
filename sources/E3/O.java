package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class O implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final O f31580a = new O();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31581b = o.p.f25734D;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31582c = false;

    private O() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.f();
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return P.f31583a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31582c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31581b;
    }
}
