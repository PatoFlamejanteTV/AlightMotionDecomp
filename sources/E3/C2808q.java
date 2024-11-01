package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2808q implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2808q f31667a = new C2808q();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31668b = o.p.f25738H;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31669c = false;

    private C2808q() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.d(EnumC2749a.f31299b);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return r.f31671a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31669c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31668b;
    }
}
