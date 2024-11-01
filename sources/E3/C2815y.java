package e3;

import R5.AbstractC1435t;
import androidx.compose.ui.unit.Dp;
import b3.C1969a;
import c3.AbstractC2026f;
import c3.C2027g;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import d3.InterfaceC2750b;
import d3.InterfaceC2756h;
import f3.C2848a;
import j4.C0;
import j4.C3165H;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2815y implements InterfaceC2756h.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2815y f31699a = new C2815y();

    private C2815y() {
    }

    private final j4.t0 k(String str, Y2.k kVar, boolean z8) {
        float m5155constructorimpl;
        r4.G a9 = r4.G.Companion.a("card_mandate");
        int i8 = v3.w.f40579C;
        if (kVar == Y2.k.f12024b) {
            m5155constructorimpl = Dp.m5155constructorimpl(0);
        } else if (kVar == Y2.k.f12023a) {
            m5155constructorimpl = Dp.m5155constructorimpl(4);
        } else if (z8) {
            m5155constructorimpl = Dp.m5155constructorimpl(6);
        } else {
            m5155constructorimpl = Dp.m5155constructorimpl(2);
        }
        return new j4.t0(a9, i8, AbstractC1435t.e(str), m5155constructorimpl, null, 16, null);
    }

    private final boolean l(C2752d c2752d) {
        return AbstractC2026f.a(o.p.f25755i.f25773a, c2752d.U(), c2752d.W(), c2752d.z());
    }

    @Override // d3.InterfaceC2756h.d
    public C1969a c(boolean z8) {
        int i8;
        if (z8) {
            i8 = g4.n.f32371H;
        } else {
            i8 = g4.n.f32370G;
        }
        return C1969a.b(i().c(), C2.d.a(i8), false, 0, null, null, false, 60, null);
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
        r4.D d8;
        Y2.k kVar;
        r4.D c8;
        AbstractC3292y.i(metadata, "metadata");
        AbstractC3292y.i(arguments, "arguments");
        w.d v8 = metadata.v();
        List c9 = AbstractC1435t.c();
        d8 = AbstractC2814x.d(arguments.d(), v8.h(), v8.l());
        if (d8 != null) {
            c9.add(d8);
        }
        c9.add(new C3165H(arguments.b(), arguments.d(), v8.i(), arguments.c(), r4.G.Companion.a("card_details"), null, 32, null));
        if (v8.a() != w.d.a.f27912b) {
            c8 = AbstractC2814x.c(AbstractC2814x.e(v8.a()), arguments.d(), arguments.j());
            c9.add(c8);
        }
        C2815y c2815y = f31699a;
        boolean l8 = c2815y.l(metadata);
        if (l8) {
            c9.add(new C0(arguments.i(), arguments.f()));
        }
        if (metadata.I() != null && arguments.e() != null) {
            c9.add(new C2848a(metadata.I(), arguments.e(), arguments.g()));
            kVar = metadata.I().b();
        } else {
            kVar = null;
        }
        if (metadata.Y()) {
            c9.add(c2815y.k(metadata.Q(), kVar, l8));
        }
        return AbstractC1435t.a(c9);
    }

    @Override // d3.InterfaceC2756h
    public boolean g(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.a(this, interfaceC2750b, list);
    }

    @Override // d3.InterfaceC2756h.d
    public C2027g i() {
        return new C2027g(C2813w.f31691a, null, g4.n.f32386W, g4.k.f32346o, true, null, 34, null);
    }

    @Override // d3.InterfaceC2756h
    public C2027g j(InterfaceC2750b interfaceC2750b, List list) {
        return InterfaceC2756h.d.a.e(this, interfaceC2750b, list);
    }
}
