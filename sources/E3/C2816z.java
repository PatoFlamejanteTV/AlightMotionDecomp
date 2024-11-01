package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2816z implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2816z f31701a = new C2816z();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31702b = o.p.f25746P;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31703c = false;

    private C2816z() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.f();
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2788A.f31553a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31703c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31702b;
    }
}
