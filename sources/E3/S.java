package e3;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import b3.C1969a;
import c3.C2022b;
import c3.C2027g;
import c3.EnumC2021a;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;
import r4.h0;

/* loaded from: classes4.dex */
final class S implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final S f31587a = new S();

    private S() {
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
        G.b bVar = r4.G.Companion;
        return new C2022b(arguments).e(EnumC2021a.f15447a).e(EnumC2021a.f15449c).b(h0.a.c(r4.h0.f38430f, new r4.q0(bVar.o(), new r4.s0(new r4.r0(Integer.valueOf(g4.n.f32364C), KeyboardCapitalization.Companion.m4873getNoneIUNYP9k(), KeyboardType.Companion.m4898getPhonePjHm6EE(), null, 8, null), true, (String) arguments.d().get(bVar.o()))), null, 2, null)).a();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(Q.f31584a, null, g4.n.f32403g0, g4.k.f32354w, false, null, 50, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
