package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class Z implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f31600a = new Z();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31601b = o.p.f25764r;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31602c = false;

    private Z() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.d(EnumC2749a.f31299b);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return a0.f31606a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31602c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31601b;
    }
}
