package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class M implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final M f31576a = new M();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31577b = o.p.f25754h;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31578c = false;

    private M() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.i(EnumC2749a.f31302e, EnumC2749a.f31304g);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return N.f31579a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return true;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31578c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31577b;
    }
}
