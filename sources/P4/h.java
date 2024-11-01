package p4;

import D6.o;
import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import r4.C3900a0;
import r4.C3902b0;
import r4.C3911j;
import r4.C3912k;
import r4.C3925y;
import r4.G;
import r4.Y;
import r4.o0;
import r4.q0;
import r4.r0;
import r4.s0;
import r4.v0;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final D6.a f36321a = o.b(null, b.f36323a, 1, null);

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36322a;

        static {
            int[] iArr = new int[EnumC3581f.values().length];
            try {
                iArr[EnumC3581f.f36283k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3581f.f36281i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36322a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36323a = new b();

        b() {
            super(1);
        }

        public final void a(D6.d Json) {
            AbstractC3292y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D6.d) obj);
            return I.f8786a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List a(List list) {
        List m8 = AbstractC1435t.m();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            o0 o0Var = (o0) obj;
            if (i9 < list.size() && d((o0) list.get(i8), (o0) list.get(i9))) {
                List p8 = AbstractC1435t.p(list.get(i8), list.get(i9));
                m8 = AbstractC1435t.H0(m8, new C3902b0(G.Companion.a("row_" + UUID.randomUUID().getLeastSignificantBits()), p8, new C3900a0(p8)));
            } else if (AbstractC1435t.z0(m8) instanceof C3902b0) {
                m8 = AbstractC1435t.H0(m8, null);
            } else {
                m8 = AbstractC1435t.H0(m8, o0Var);
            }
            i8 = i9;
        }
        return AbstractC1435t.j0(m8);
    }

    private static final int b(C3580e c3580e) {
        if (c3580e != null && c3580e.c()) {
            return KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();
        }
        return KeyboardType.Companion.m4899getTextPjHm6EE();
    }

    private static final boolean c(G g8) {
        G.b bVar = G.Companion;
        if (!AbstractC3292y.d(g8, bVar.u()) && !AbstractC3292y.d(g8, bVar.k())) {
            return false;
        }
        return true;
    }

    private static final boolean d(o0 o0Var, o0 o0Var2) {
        if (c(o0Var.a()) && c(o0Var2.a())) {
            return true;
        }
        return false;
    }

    private static final v0 e(EnumC3581f enumC3581f, int i8, int i9, int i10, String str) {
        if (a.f36322a[enumC3581f.ordinal()] == 2) {
            return new Y(i8, null, str, 2, null);
        }
        return new r0(Integer.valueOf(i8), i9, i10, null, 8, null);
    }

    private static final o0 f(EnumC3581f enumC3581f, G g8, int i8, int i9, int i10, String str, boolean z8) {
        C3911j.a bVar;
        q0 q0Var = new q0(g8, new s0(e(enumC3581f, i8, i9, i10, str), z8, null, 4, null));
        if (a.f36322a[enumC3581f.ordinal()] == 1 && AbstractC1435t.p("CA", "US").contains(str)) {
            if (AbstractC3292y.d(str, "CA")) {
                bVar = new C3911j.a.C0869a(0, null, 3, null);
            } else if (AbstractC3292y.d(str, "US")) {
                bVar = new C3911j.a.b(0, null, 3, null);
            } else {
                throw new IllegalArgumentException();
            }
            return new C3912k(g8, new C3925y(new C3911j(bVar), null, 2, null));
        }
        return q0Var;
    }

    public static final List g(List list, String countryCode) {
        o0 o0Var;
        int d8;
        EnumC3582g b9;
        AbstractC3292y.i(list, "<this>");
        AbstractC3292y.i(countryCode, "countryCode");
        ArrayList<C3579d> arrayList = new ArrayList();
        for (Object obj : list) {
            C3579d c3579d = (C3579d) obj;
            if (c3579d.d() != EnumC3581f.f36282j && c3579d.d() != EnumC3581f.f36280h) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C3579d c3579d2 : arrayList) {
            EnumC3581f d9 = c3579d2.d();
            if (d9 != null) {
                G e8 = c3579d2.d().e();
                C3580e c8 = c3579d2.c();
                if (c8 != null && (b9 = c8.b()) != null) {
                    d8 = b9.c();
                } else {
                    d8 = c3579d2.d().d();
                }
                o0Var = f(d9, e8, d8, c3579d2.d().c(), b(c3579d2.c()), countryCode, !c3579d2.b());
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                arrayList2.add(o0Var);
            }
        }
        return a(arrayList2);
    }
}
