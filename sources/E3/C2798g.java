package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2798g implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2798g f31627a = new C2798g();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31628b = o.p.f25741K;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31629c = false;

    private C2798g() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.d(EnumC2749a.f31299b);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2799h.f31631a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31629c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31628b;
    }
}
