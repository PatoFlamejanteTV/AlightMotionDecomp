package c3;

import Q5.p;
import R5.AbstractC1435t;
import d3.InterfaceC2756h;
import j4.AbstractC3179f0;
import j4.C3168a;
import j4.C3169a0;
import j4.C3174d;
import j4.C3180g;
import j4.C3184i;
import j4.C3190l;
import j4.C3193m0;
import j4.C3194n;
import j4.C3196o;
import j4.C3197o0;
import j4.C3199p0;
import j4.C3208x;
import j4.G0;
import j4.L0;
import j4.N;
import j4.O;
import j4.O0;
import j4.W;
import j4.Y;
import j4.Z;
import j4.u0;
import j4.w0;
import j4.x0;
import j4.y0;
import j4.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import r4.D;
import r4.G;

/* renamed from: c3.h */
/* loaded from: classes4.dex */
public final class C2028h {

    /* renamed from: a */
    private final InterfaceC2756h.a f15471a;

    public C2028h(InterfaceC2756h.a arguments) {
        AbstractC3292y.i(arguments, "arguments");
        this.f15471a = arguments;
    }

    public static /* synthetic */ List b(C2028h c2028h, List list, List list2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list2 = AbstractC1435t.m();
        }
        return c2028h.a(list, list2);
    }

    public final List a(List specs, List placeholderOverrideList) {
        D i8;
        AbstractC3292y.i(specs, "specs");
        AbstractC3292y.i(placeholderOverrideList, "placeholderOverrideList");
        List<AbstractC3179f0> f8 = B3.f.f605a.f(specs, placeholderOverrideList, this.f15471a.h(), this.f15471a.a());
        ArrayList arrayList = new ArrayList();
        for (AbstractC3179f0 abstractC3179f0 : f8) {
            if (abstractC3179f0 instanceof O0) {
                i8 = ((O0) abstractC3179f0).i();
            } else if (abstractC3179f0 instanceof C3180g) {
                i8 = ((C3180g) abstractC3179f0).i();
            } else if (abstractC3179f0 instanceof C3174d) {
                i8 = ((C3174d) abstractC3179f0).i();
            } else {
                G g8 = null;
                byte b9 = 0;
                byte b10 = 0;
                if (abstractC3179f0 instanceof C3169a0) {
                    i8 = new Z(g8, b10 == true ? 1 : 0, 3, b9 == true ? 1 : 0);
                } else if (abstractC3179f0 instanceof u0) {
                    i8 = ((u0) abstractC3179f0).i(this.f15471a.f());
                } else if (abstractC3179f0 instanceof C3190l) {
                    i8 = ((C3190l) abstractC3179f0).i(this.f15471a.f());
                } else if (abstractC3179f0 instanceof C3194n) {
                    i8 = ((C3194n) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3196o) {
                    i8 = ((C3196o) abstractC3179f0).i(this.f15471a.f(), this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3208x) {
                    i8 = ((C3208x) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof x0) {
                    i8 = ((x0) abstractC3179f0).l();
                } else if (abstractC3179f0 instanceof w0) {
                    i8 = ((w0) abstractC3179f0).l(this.f15471a.d());
                } else if (abstractC3179f0 instanceof Y) {
                    i8 = ((Y) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof y0) {
                    i8 = ((y0) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof L0) {
                    i8 = ((L0) abstractC3179f0).l(this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3184i) {
                    i8 = ((C3184i) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3193m0) {
                    i8 = ((C3193m0) abstractC3179f0).i(this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3197o0) {
                    i8 = ((C3197o0) abstractC3179f0).i();
                } else if (abstractC3179f0 instanceof W) {
                    i8 = ((W) abstractC3179f0).l(this.f15471a.d());
                } else if (abstractC3179f0 instanceof O) {
                    i8 = ((O) abstractC3179f0).l(this.f15471a.d());
                } else if (abstractC3179f0 instanceof C3168a) {
                    i8 = ((C3168a) abstractC3179f0).s(this.f15471a.d(), this.f15471a.j());
                } else if (abstractC3179f0 instanceof G0) {
                    i8 = ((G0) abstractC3179f0).i(this.f15471a.f());
                } else if (abstractC3179f0 instanceof z0) {
                    i8 = null;
                } else if (abstractC3179f0 instanceof N) {
                    i8 = ((N) abstractC3179f0).i(this.f15471a.f());
                } else if (abstractC3179f0 instanceof C3199p0) {
                    i8 = ((C3199p0) abstractC3179f0).i(this.f15471a.f());
                } else {
                    throw new p();
                }
            }
            if (i8 != null) {
                arrayList.add(i8);
            }
        }
        return arrayList;
    }
}
