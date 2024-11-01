package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d0 implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f31616a = new d0();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31617b = o.p.f25736F;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31618c = false;

    private d0() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.f();
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return e0.f31622a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31618c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31617b;
    }
}
