package e3;

import com.stripe.android.model.o;
import d3.C2752d;
import d3.EnumC2749a;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2792a implements InterfaceC2750b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2792a f31603a = new C2792a();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f31604b = o.p.f25735E;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f31605c = false;

    private C2792a() {
    }

    @Override // d3.InterfaceC2750b
    public Set a(boolean z8) {
        return R5.a0.i(EnumC2749a.f31300c, EnumC2749a.f31299b);
    }

    @Override // d3.InterfaceC2750b
    public InterfaceC2756h b() {
        return C2793b.f31607a;
    }

    @Override // d3.InterfaceC2750b
    public boolean c(C2752d metadata) {
        AbstractC3292y.i(metadata, "metadata");
        return false;
    }

    @Override // d3.InterfaceC2750b
    public boolean d() {
        return f31605c;
    }

    @Override // d3.InterfaceC2750b
    public o.p getType() {
        return f31604b;
    }
}
