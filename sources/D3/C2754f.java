package d3;

import Q5.InterfaceC1416k;
import Q5.l;
import R5.AbstractC1435t;
import R5.a0;
import e3.C2789B;
import e3.C2792a;
import e3.C2794c;
import e3.C2796e;
import e3.C2798g;
import e3.C2800i;
import e3.C2802k;
import e3.C2804m;
import e3.C2806o;
import e3.C2808q;
import e3.C2809s;
import e3.C2811u;
import e3.C2813w;
import e3.C2816z;
import e3.E;
import e3.G;
import e3.I;
import e3.K;
import e3.M;
import e3.O;
import e3.Q;
import e3.T;
import e3.V;
import e3.X;
import e3.Z;
import e3.b0;
import e3.d0;
import e3.f0;
import e3.h0;
import e3.j0;
import e3.l0;
import e3.n0;
import e3.p0;
import e3.r0;
import e3.t0;
import e3.v0;
import e3.x0;
import i6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: d3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2754f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2754f f31326a = new C2754f();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f31327b = a0.i(C2792a.f31603a, C2794c.f31611a, C2796e.f31619a, C2798g.f31627a, C2800i.f31635a, C2802k.f31643a, C2804m.f31651a, C2806o.f31659a, C2808q.f31667a, C2809s.f31675a, C2811u.f31683a, C2813w.f31691a, C2816z.f31701a, C2789B.f31554a, E.f31560a, G.f31564a, I.f31568a, K.f31572a, M.f31576a, O.f31580a, Q.f31584a, T.f31588a, V.f31592a, X.f31596a, Z.f31600a, b0.f31608a, d0.f31616a, f0.f31624a, h0.f31632a, j0.f31640a, l0.f31648a, n0.f31656a, p0.f31664a, r0.f31672a, t0.f31680a, v0.f31688a, x0.f31696a);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1416k f31328c = l.b(a.f31330a);

    /* renamed from: d, reason: collision with root package name */
    public static final int f31329d = 8;

    /* renamed from: d3.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31330a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            Set a9 = C2754f.f31326a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(R5.Q.d(AbstractC1435t.x(a9, 10)), 16));
            for (Object obj : a9) {
                linkedHashMap.put(((InterfaceC2750b) obj).getType().f25773a, obj);
            }
            return linkedHashMap;
        }
    }

    private C2754f() {
    }

    public final Set a() {
        return f31327b;
    }

    public final Map b() {
        return (Map) f31328c.getValue();
    }
}
