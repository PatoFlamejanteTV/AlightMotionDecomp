package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2800i implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2800i f31635a = new C2800i();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31636b = o.p.f25740J;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31637c = false;

    private C2800i() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.f();
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2801j.f31639a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31637c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31636b;
    }
}
