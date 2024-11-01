package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2794c implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2794c f31611a = new C2794c();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31612b = o.p.f25772z;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31613c = false;

    private C2794c() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.i(EnumC2749a.f31300c, EnumC2749a.f31299b);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2795d.f31615a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31613c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31612b;
    }
}
