package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2806o implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2806o f31659a = new C2806o();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31660b = o.p.f25765s;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31661c = false;

    private C2806o() {
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
        return C2807p.f31663a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31661c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31660b;
    }
}
