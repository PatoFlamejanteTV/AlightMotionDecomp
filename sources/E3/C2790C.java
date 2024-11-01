package e3;

import b3.C1969a;
import c3.C2027g;
import c3.C2028h;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import j4.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2790C implements InterfaceC2756h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2790C f31557a = new C2790C();

    private C2790C() {
    }

    @Override // d3.InterfaceC2756h.c
    public List a(C2752d c2752d, H0 h02, C2028h c2028h) {
        return InterfaceC2756h.c.a.b(this, c2752d, h02, c2028h);
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
        return new C2027g(C2789B.f31554a, sharedDataSpec, g4.n.f32389Z, g4.k.f32348q, false, null, 48, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.c.a.f(this, interfaceC2750b, list);
    }
}
