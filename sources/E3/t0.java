package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class t0 implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f31680a = new t0();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31681b = o.p.f25745O;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31682c = true;

    private t0() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.i(EnumC2749a.f31302e, EnumC2749a.f31303f, EnumC2749a.f31301d);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return u0.f31686a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return true;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31682c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31681b;
    }
}
