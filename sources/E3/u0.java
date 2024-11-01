package e3;

import R5.AbstractC1435t;
import b3.C1969a;
import c3.C2027g;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
final class u0 implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f31686a = new u0();

    private u0() {
    }

    @Override // d3.InterfaceC2756h.d
    public C1969a c(boolean z8) {
        return C1969a.b(i().c(), C2.d.a(g4.n.f32373J), false, 0, null, null, false, 60, null);
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
        return AbstractC1435t.m();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(t0.f31680a.getType().f25773a, g4.n.f32431u0, g4.k.f32342k, true, (String) null, (String) null, (C2.c) null, 64, (AbstractC3284p) null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
