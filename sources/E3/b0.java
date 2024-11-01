package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b0 implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f31608a = new b0();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31609b = o.p.f25771y;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31610c = false;

    private b0() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.f();
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return c0.f31614a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31610c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31609b;
    }
}
