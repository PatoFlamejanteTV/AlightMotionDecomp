package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2811u implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2811u f31683a = new C2811u();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31684b = o.p.f25747Q;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31685c = false;

    private C2811u() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.d(EnumC2749a.f31301d);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2812v.f31687a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31685c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31684b;
    }
}
