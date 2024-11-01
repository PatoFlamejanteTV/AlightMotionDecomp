package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2226p5 {

    /* renamed from: a, reason: collision with root package name */
    private static final D5 f16933a = new F5();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2092a4.P(i8, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.E(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.g0(c2264u4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.g0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void F(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.A(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i8, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.a0(i42.f(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.a0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void I(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.L(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.o0(c2264u4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.o0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void L(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.H(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.j0(i42.f(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.j0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void O(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.k(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.v0(c2264u4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.v0(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void R(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.c(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.n0(i42.f(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.n0(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static void U(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.t(i8, list, z8);
        }
    }

    public static void V(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.u(i8, list, z8);
        }
    }

    public static void W(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.q(i8, list, z8);
        }
    }

    public static void X(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.G(i8, list, z8);
        }
    }

    public static void Y(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.C(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8, Object obj, InterfaceC2210n5 interfaceC2210n5) {
        return AbstractC2092a4.R(i8, (Y4) obj, interfaceC2210n5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = size * AbstractC2092a4.s0(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            s02 += AbstractC2092a4.A((J3) list.get(i9));
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i8, List list, InterfaceC2210n5 interfaceC2210n5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += AbstractC2092a4.x(i8, (Y4) list.get(i10), interfaceC2210n5);
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2092a4.z(i8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List list) {
        return list.size();
    }

    public static D5 f() {
        return f16933a;
    }

    static Object g(Object obj, int i8, int i9, Object obj2, D5 d52) {
        if (obj2 == null) {
            obj2 = d52.i(obj);
        }
        d52.f(obj2, i8, i9);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, int i8, List list, InterfaceC2272v4 interfaceC2272v4, Object obj2, D5 d52) {
        if (interfaceC2272v4 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int intValue = num.intValue();
                if (interfaceC2272v4.a(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = g(obj, i8, intValue, obj2, d52);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC2272v4.a(intValue2)) {
                    obj2 = g(obj, i8, intValue2, obj2, d52);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i8, List list, V5 v52) {
        if (list != null && !list.isEmpty()) {
            v52.O(i8, list);
        }
    }

    public static void j(int i8, List list, V5 v52, InterfaceC2210n5 interfaceC2210n5) {
        if (list != null && !list.isEmpty()) {
            v52.l(i8, list, interfaceC2210n5);
        }
    }

    public static void k(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.i(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(AbstractC2146g4 abstractC2146g4, Object obj, Object obj2) {
        C2182k4 b9 = abstractC2146g4.b(obj2);
        if (!b9.f16800a.isEmpty()) {
            abstractC2146g4.e(obj).f(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Q4 q42, Object obj, Object obj2, long j8) {
        E5.j(obj, j8, q42.e(E5.B(obj, j8), E5.B(obj2, j8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(D5 d52, Object obj, Object obj2) {
        d52.j(obj, d52.b(d52.k(obj), d52.k(obj2)));
    }

    public static void o(Class cls) {
        AbstractC2240r4.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i8, List list) {
        int C8;
        int C9;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int s02 = AbstractC2092a4.s0(i8) * size;
        if (list instanceof F4) {
            F4 f42 = (F4) list;
            while (i9 < size) {
                Object a9 = f42.a(i9);
                if (a9 instanceof J3) {
                    C9 = AbstractC2092a4.A((J3) a9);
                } else {
                    C9 = AbstractC2092a4.C((String) a9);
                }
                s02 += C9;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof J3) {
                    C8 = AbstractC2092a4.A((J3) obj);
                } else {
                    C8 = AbstractC2092a4.C((String) obj);
                }
                s02 += C8;
                i9++;
            }
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i8, List list, InterfaceC2210n5 interfaceC2210n5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s02 = AbstractC2092a4.s0(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            s02 += AbstractC2092a4.g((Y4) list.get(i9), interfaceC2210n5);
        }
        return s02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * AbstractC2092a4.s0(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.X(c2264u4.d(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += AbstractC2092a4.X(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static void u(int i8, List list, V5 v52) {
        if (list != null && !list.isEmpty()) {
            v52.I(i8, list);
        }
    }

    public static void v(int i8, List list, V5 v52, InterfaceC2210n5 interfaceC2210n5) {
        if (list != null && !list.isEmpty()) {
            v52.d(i8, list, interfaceC2210n5);
        }
    }

    public static void w(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.r(i8, list, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * AbstractC2092a4.h0(i8, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i8, List list, V5 v52, boolean z8) {
        if (list != null && !list.isEmpty()) {
            v52.p(i8, list, z8);
        }
    }
}
