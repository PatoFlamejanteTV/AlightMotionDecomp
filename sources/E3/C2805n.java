package e3;

import R5.AbstractC1435t;
import b3.C1969a;
import c3.C2027g;
import c3.C2028h;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import j4.C3194n;
import j4.C3196o;
import j4.H0;
import j4.z0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

/* renamed from: e3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2805n implements InterfaceC2756h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2805n f31655a = new C2805n();

    private C2805n() {
    }

    @Override // d3.InterfaceC2756h.c
    public List a(C2752d metadata, H0 sharedDataSpec, C2028h transformSpecToElements) {
        AbstractC3292y.i(metadata, "metadata");
        AbstractC3292y.i(sharedDataSpec, "sharedDataSpec");
        AbstractC3292y.i(transformSpecToElements, "transformSpecToElements");
        G.b bVar = r4.G.Companion;
        return transformSpecToElements.a(AbstractC1435t.G0(sharedDataSpec.b(), AbstractC1435t.r(new z0(bVar.r(), z0.d.f34343b), new z0(bVar.n(), z0.d.f34344c), new z0(bVar.t(), z0.d.f34345d), new C3194n(), new z0(bVar.d(), z0.d.f34346e), new C3196o())), AbstractC1435t.p(bVar.r(), bVar.n(), bVar.d()));
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
        return new C2027g(C2804m.f31651a, sharedDataSpec, g4.n.f32381R, g4.k.f32342k, true, null, 32, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.c.a.f(this, interfaceC2750b, list);
    }
}
