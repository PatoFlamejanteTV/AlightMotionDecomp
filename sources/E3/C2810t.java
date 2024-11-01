package e3;

import b3.C1969a;
import c3.C2022b;
import c3.C2027g;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import j4.C3203s;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import r4.h0;

/* renamed from: e3.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2810t implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2810t f31679a = new C2810t();

    private C2810t() {
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
        return new C2022b(arguments).b(h0.a.c(r4.h0.f38430f, new C3203s(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, 2, null)).a();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(C2809s.f31675a, null, g4.n.f32384U, g4.k.f32344m, false, null, 50, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
