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
import r4.h0;

/* renamed from: e3.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2812v implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2812v f31687a = new C2812v();

    private C2812v() {
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
        r4.G a9 = r4.G.Companion.a("boleto[tax_id]");
        return new C2022b(arguments).e(EnumC2021a.f15447a).e(EnumC2021a.f15449c).b(h0.a.c(r4.h0.f38430f, new r4.q0(a9, new r4.s0(new r4.r0(Integer.valueOf(g4.n.f32412l), KeyboardCapitalization.Companion.m4873getNoneIUNYP9k(), KeyboardType.Companion.m4892getAsciiPjHm6EE(), null, 8, null), false, (String) arguments.d().get(a9), 2, null)), null, 2, null)).c(R5.a0.d("BR")).a();
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(C2811u.f31683a, null, g4.n.f32385V, g4.k.f32345n, false, null, 50, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
