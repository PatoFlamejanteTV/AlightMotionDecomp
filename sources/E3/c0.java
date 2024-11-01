package e3;

import R5.AbstractC1435t;
import b3.C1969a;
import c3.C2027g;
import c3.C2028h;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import j4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
final class c0 implements InterfaceC2756h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f31614a = new c0();

    private c0() {
    }

    @Override // d3.InterfaceC2756h.c
    public List a(C2752d metadata, H0 sharedDataSpec, C2028h transformSpecToElements) {
        List m8;
        AbstractC3292y.i(metadata, "metadata");
        AbstractC3292y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3292y.i(transformSpecToElements, "transformSpecToElements");
        r4.G g8 = null;
        byte b9 = 0;
        if (metadata.Y()) {
            m8 = AbstractC1435t.e(new j4.u0(g8, g4.n.f32437x0, 1, (AbstractC3284p) (b9 == true ? 1 : 0)));
        } else {
            m8 = AbstractC1435t.m();
        }
        return C2028h.b(transformSpecToElements, AbstractC1435t.G0(sharedDataSpec.b(), m8), null, 2, null);
    }

    @Override // d3.InterfaceC2756h.c
    public C1969a b(H0 h02) {
        return InterfaceC2756h.c.a.c(this, h02);
    }

    @Override // d3.InterfaceC2756h
    public List d(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, InterfaceC2756h.a aVar) {
        return InterfaceC2756h.c.a.d(this, interfaceC2750b, c2752d, list, aVar);
    }

    @Override // d3.InterfaceC2756h
    public C1969a e(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, boolean z8) {
        return InterfaceC2756h.c.a.e(this, interfaceC2750b, c2752d, list, z8);
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.c.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.c
    public C2027g h(H0 sharedDataSpec) {
        AbstractC3292y.i(sharedDataSpec, "sharedDataSpec");
        return new C2027g(b0.f31608a, sharedDataSpec, g4.n.f32413l0, g4.k.f32321B, false, null, 48, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.c.a.f(this, interfaceC2750b, list);
    }
}
