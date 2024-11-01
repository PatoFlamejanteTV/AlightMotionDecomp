package e3;

import b3.C1969a;
import c3.C2022b;
import c3.C2027g;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
final class o0 implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f31662a = new o0();

    private o0() {
    }

    @Override // d3.InterfaceC2756h.d
    public C1969a c(boolean z8) {
        return InterfaceC2756h.d.a.b(this, z8);
    }

    @Override // d3.InterfaceC2756h
    public List d(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, InterfaceC2756h.a aVar) {
        return InterfaceC2756h.d.a.c(this, interfaceC2750b, c2752d, list, aVar);
    }

    @Override // d3.InterfaceC2756h
    public C1969a e(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, boolean z8) {
        return InterfaceC2756h.d.a.d(this, interfaceC2750b, c2752d, list, z8);
    }

    @Override // d3.InterfaceC2756h.d
    public List f(C2752d metadata, InterfaceC2756h.a arguments) {
        AbstractC3292y.i(metadata, "metadata");
        AbstractC3292y.i(arguments, "arguments");
        return new C2022b(arguments).a();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(n0.f31656a, null, g4.n.f32425r0, g4.k.f32326G, false, null, 50, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
