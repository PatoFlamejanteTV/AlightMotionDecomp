package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class K implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final K f31572a = new K();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31573b = o.p.f25758l;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31574c = false;

    private K() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        EnumC2749a enumC2749a = EnumC2749a.f31301d;
        if (!z8) {
            enumC2749a = null;
        }
        return R5.a0.j(enumC2749a);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return L.f31575a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31574c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31573b;
    }
}