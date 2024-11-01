package e3;

import R5.AbstractC1435t;
import com.stripe.android.paymentsheet.w;
import j4.C3158A;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;
import r4.Q;

/* renamed from: e3.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2814x {

    /* renamed from: e3.x$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31695a;

        static {
            int[] iArr = new int[w.d.a.values().length];
            try {
                iArr[w.d.a.f27911a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.d.a.f27912b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.d.a.f27913c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31695a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r4.D c(g4.c cVar, Map map, Map map2) {
        r4.e0 e0Var;
        Boolean L02;
        if (map2 != null) {
            G.b bVar = r4.G.Companion;
            String str = (String) map2.get(bVar.w());
            if (str != null && (L02 = l6.n.L0(str)) != null) {
                e0Var = new r4.e0(bVar.w(), new r4.d0(L02.booleanValue()));
                return r4.h0.f38430f.a(AbstractC1435t.r(new C3158A(r4.G.Companion.a("credit_billing"), map, z2.d.f41472a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(g4.n.f32408j));
            }
        }
        e0Var = null;
        return r4.h0.f38430f.a(AbstractC1435t.r(new C3158A(r4.G.Companion.a("credit_billing"), map, z2.d.f41472a.h(), null, e0Var, map2, cVar, 8, null), e0Var), Integer.valueOf(g4.n.f32408j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r4.D d(Map map, boolean z8, boolean z9) {
        G.b bVar = r4.G.Companion;
        j4.X x8 = new j4.X(null, (String) map.get(bVar.n()), null, 5, null);
        if (!z8) {
            x8 = null;
        }
        r4.G t8 = bVar.t();
        Q.a aVar = r4.Q.f38111r;
        String str = (String) map.get(bVar.t());
        if (str == null) {
            str = "";
        }
        r4.S s8 = new r4.S(t8, Q.a.b(aVar, str, null, null, false, false, 30, null));
        if (!z9) {
            s8 = null;
        }
        List r8 = AbstractC1435t.r(x8, s8);
        if (r8.isEmpty()) {
            return null;
        }
        return r4.h0.f38430f.a(r8, Integer.valueOf(g4.n.f32416n));
    }

    public static final g4.c e(w.d.a aVar) {
        AbstractC3292y.i(aVar, "<this>");
        int i8 = a.f31695a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return g4.c.f32287c;
                }
                throw new Q5.p();
            }
            return g4.c.f32286b;
        }
        return g4.c.f32285a;
    }
}
