package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class H {
    private static C2141g a(C2141g c2141g, Y2 y22, AbstractC2204n abstractC2204n) {
        return b(c2141g, y22, abstractC2204n, null, null);
    }

    private static C2141g b(C2141g c2141g, Y2 y22, AbstractC2204n abstractC2204n, Boolean bool, Boolean bool2) {
        C2141g c2141g2 = new C2141g();
        Iterator s8 = c2141g.s();
        while (s8.hasNext()) {
            int intValue = ((Integer) s8.next()).intValue();
            if (c2141g.r(intValue)) {
                InterfaceC2243s a9 = abstractC2204n.a(y22, Arrays.asList(c2141g.e(intValue), new C2177k(Double.valueOf(intValue)), c2141g));
                if (a9.y().equals(bool)) {
                    return c2141g2;
                }
                if (bool2 == null || a9.y().equals(bool2)) {
                    c2141g2.q(intValue, a9);
                }
            }
        }
        return c2141g2;
    }

    private static InterfaceC2243s c(C2141g c2141g, Y2 y22, List list, boolean z8) {
        InterfaceC2243s interfaceC2243s;
        int i8;
        int i9;
        int i10;
        AbstractC2262u2.k("reduce", 1, list);
        AbstractC2262u2.n("reduce", 2, list);
        InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
        if (b9 instanceof AbstractC2204n) {
            if (list.size() == 2) {
                interfaceC2243s = y22.b((InterfaceC2243s) list.get(1));
                if (interfaceC2243s instanceof C2186l) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c2141g.m() != 0) {
                interfaceC2243s = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC2204n abstractC2204n = (AbstractC2204n) b9;
            int m8 = c2141g.m();
            if (z8) {
                i8 = 0;
            } else {
                i8 = m8 - 1;
            }
            if (z8) {
                i9 = m8 - 1;
            } else {
                i9 = 0;
            }
            if (z8) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            if (interfaceC2243s == null) {
                interfaceC2243s = c2141g.e(i8);
                i8 += i10;
            }
            while ((i9 - i8) * i10 >= 0) {
                if (c2141g.r(i8)) {
                    interfaceC2243s = abstractC2204n.a(y22, Arrays.asList(interfaceC2243s, c2141g.e(i8), new C2177k(Double.valueOf(i8)), c2141g));
                    if (interfaceC2243s instanceof C2186l) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i8 += i10;
                } else {
                    i8 += i10;
                }
            }
            return interfaceC2243s;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC2243s d(String str, C2141g c2141g, Y2 y22, List list) {
        String str2;
        char c8;
        double d8;
        double a9;
        String str3;
        AbstractC2204n abstractC2204n;
        double min;
        int i8;
        Y2 y23;
        Double d9;
        double d10;
        str.hashCode();
        Double valueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c8 = 1;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c8 = 2;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c8 = 3;
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c8 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c8 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c8 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c8 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c8 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c8 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c8 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c8 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c8 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c8 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c8 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c8 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c8 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c8 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c8 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c8 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c8 = 65535;
                break;
            default:
                str2 = "toString";
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                AbstractC2262u2.g(str2, 0, list);
                return new C2259u(c2141g.toString());
            case 1:
                C2141g c2141g2 = (C2141g) c2141g.b();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2243s b9 = y22.b((InterfaceC2243s) it.next());
                        if (!(b9 instanceof C2186l)) {
                            int m8 = c2141g2.m();
                            if (b9 instanceof C2141g) {
                                C2141g c2141g3 = (C2141g) b9;
                                Iterator s8 = c2141g3.s();
                                while (s8.hasNext()) {
                                    Integer num = (Integer) s8.next();
                                    c2141g2.q(num.intValue() + m8, c2141g3.e(num.intValue()));
                                }
                            } else {
                                c2141g2.q(m8, b9);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return c2141g2;
            case 2:
                AbstractC2262u2.g("filter", 1, list);
                InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(0));
                if (b10 instanceof C2251t) {
                    if (c2141g.d() == 0) {
                        return new C2141g();
                    }
                    C2141g c2141g4 = (C2141g) c2141g.b();
                    C2141g b11 = b(c2141g, y22, (C2251t) b10, null, Boolean.TRUE);
                    C2141g c2141g5 = new C2141g();
                    Iterator s9 = b11.s();
                    while (s9.hasNext()) {
                        c2141g5.l(c2141g4.e(((Integer) s9.next()).intValue()));
                    }
                    return c2141g5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return c(c2141g, y22, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C2141g();
                }
                int a10 = (int) AbstractC2262u2.a(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue());
                if (a10 < 0) {
                    a10 = Math.max(0, a10 + c2141g.m());
                } else if (a10 > c2141g.m()) {
                    a10 = c2141g.m();
                }
                int m9 = c2141g.m();
                C2141g c2141g6 = new C2141g();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) AbstractC2262u2.a(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue()));
                    if (max > 0) {
                        for (int i9 = a10; i9 < Math.min(m9, a10 + max); i9++) {
                            c2141g6.l(c2141g.e(a10));
                            c2141g.o(a10);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i10 = 2; i10 < list.size(); i10++) {
                            InterfaceC2243s b12 = y22.b((InterfaceC2243s) list.get(i10));
                            if (!(b12 instanceof C2186l)) {
                                c2141g.k((a10 + i10) - 2, b12);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                    return c2141g6;
                }
                while (a10 < m9) {
                    c2141g6.l(c2141g.e(a10));
                    c2141g.q(a10, null);
                    a10++;
                }
                return c2141g6;
            case 5:
                AbstractC2262u2.g("forEach", 1, list);
                InterfaceC2243s b13 = y22.b((InterfaceC2243s) list.get(0));
                if (b13 instanceof C2251t) {
                    if (c2141g.d() == 0) {
                        return InterfaceC2243s.f16971b0;
                    }
                    a(c2141g, y22, (C2251t) b13);
                    return InterfaceC2243s.f16971b0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                AbstractC2262u2.n("lastIndexOf", 2, list);
                InterfaceC2243s interfaceC2243s = InterfaceC2243s.f16971b0;
                if (!list.isEmpty()) {
                    interfaceC2243s = y22.b((InterfaceC2243s) list.get(0));
                }
                double m10 = c2141g.m() - 1;
                if (list.size() > 1) {
                    InterfaceC2243s b14 = y22.b((InterfaceC2243s) list.get(1));
                    if (Double.isNaN(b14.z().doubleValue())) {
                        a9 = c2141g.m() - 1;
                    } else {
                        a9 = AbstractC2262u2.a(b14.z().doubleValue());
                    }
                    m10 = a9;
                    d8 = 0.0d;
                    if (m10 < 0.0d) {
                        m10 += c2141g.m();
                    }
                } else {
                    d8 = 0.0d;
                }
                if (m10 < d8) {
                    return new C2177k(valueOf);
                }
                for (int min2 = (int) Math.min(c2141g.m(), m10); min2 >= 0; min2--) {
                    if (c2141g.r(min2) && AbstractC2262u2.h(c2141g.e(min2), interfaceC2243s)) {
                        return new C2177k(Double.valueOf(min2));
                    }
                }
                return new C2177k(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    C2141g c2141g7 = new C2141g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2243s b15 = y22.b((InterfaceC2243s) it2.next());
                        if (!(b15 instanceof C2186l)) {
                            c2141g7.l(b15);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m11 = c2141g7.m();
                    Iterator s10 = c2141g.s();
                    while (s10.hasNext()) {
                        Integer num2 = (Integer) s10.next();
                        c2141g7.q(num2.intValue() + m11, c2141g.e(num2.intValue()));
                    }
                    c2141g.u();
                    Iterator s11 = c2141g7.s();
                    while (s11.hasNext()) {
                        Integer num3 = (Integer) s11.next();
                        c2141g.q(num3.intValue(), c2141g7.e(num3.intValue()));
                    }
                }
                return new C2177k(Double.valueOf(c2141g.m()));
            case '\b':
                AbstractC2262u2.g("map", 1, list);
                InterfaceC2243s b16 = y22.b((InterfaceC2243s) list.get(0));
                if (b16 instanceof C2251t) {
                    if (c2141g.m() == 0) {
                        return new C2141g();
                    }
                    return a(c2141g, y22, (C2251t) b16);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                AbstractC2262u2.g("pop", 0, list);
                int m12 = c2141g.m();
                if (m12 == 0) {
                    return InterfaceC2243s.f16971b0;
                }
                int i11 = m12 - 1;
                InterfaceC2243s e8 = c2141g.e(i11);
                c2141g.o(i11);
                return e8;
            case '\n':
                AbstractC2262u2.n("join", 1, list);
                if (c2141g.m() == 0) {
                    return InterfaceC2243s.f16978i0;
                }
                if (!list.isEmpty()) {
                    InterfaceC2243s b17 = y22.b((InterfaceC2243s) list.get(0));
                    if (!(b17 instanceof C2228q) && !(b17 instanceof C2299z)) {
                        str3 = b17.A();
                    } else {
                        str3 = "";
                    }
                } else {
                    str3 = ",";
                }
                return new C2259u(c2141g.n(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c2141g.l(y22.b((InterfaceC2243s) it3.next()));
                    }
                }
                return new C2177k(Double.valueOf(c2141g.m()));
            case '\f':
                AbstractC2262u2.g("some", 1, list);
                InterfaceC2243s b18 = y22.b((InterfaceC2243s) list.get(0));
                if (b18 instanceof AbstractC2204n) {
                    if (c2141g.m() != 0) {
                        AbstractC2204n abstractC2204n2 = (AbstractC2204n) b18;
                        Iterator s12 = c2141g.s();
                        while (s12.hasNext()) {
                            int intValue = ((Integer) s12.next()).intValue();
                            if (c2141g.r(intValue) && abstractC2204n2.a(y22, Arrays.asList(c2141g.e(intValue), new C2177k(Double.valueOf(intValue)), c2141g)).y().booleanValue()) {
                                return InterfaceC2243s.f16976g0;
                            }
                        }
                    }
                    return InterfaceC2243s.f16977h0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                AbstractC2262u2.n("sort", 1, list);
                if (c2141g.m() >= 2) {
                    List t8 = c2141g.t();
                    if (!list.isEmpty()) {
                        InterfaceC2243s b19 = y22.b((InterfaceC2243s) list.get(0));
                        if (b19 instanceof AbstractC2204n) {
                            abstractC2204n = (AbstractC2204n) b19;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        abstractC2204n = null;
                    }
                    Collections.sort(t8, new K(abstractC2204n, y22));
                    c2141g.u();
                    Iterator it4 = t8.iterator();
                    int i12 = 0;
                    while (it4.hasNext()) {
                        c2141g.q(i12, (InterfaceC2243s) it4.next());
                        i12++;
                    }
                }
                return c2141g;
            case 14:
                AbstractC2262u2.g("every", 1, list);
                InterfaceC2243s b20 = y22.b((InterfaceC2243s) list.get(0));
                if (b20 instanceof C2251t) {
                    if (c2141g.m() != 0 && b(c2141g, y22, (C2251t) b20, Boolean.FALSE, Boolean.TRUE).m() != c2141g.m()) {
                        return InterfaceC2243s.f16977h0;
                    }
                    return InterfaceC2243s.f16976g0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                AbstractC2262u2.g("shift", 0, list);
                if (c2141g.m() == 0) {
                    return InterfaceC2243s.f16971b0;
                }
                InterfaceC2243s e9 = c2141g.e(0);
                c2141g.o(0);
                return e9;
            case 16:
                AbstractC2262u2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c2141g.b();
                }
                double m13 = c2141g.m();
                double a11 = AbstractC2262u2.a(y22.b((InterfaceC2243s) list.get(0)).z().doubleValue());
                if (a11 < 0.0d) {
                    min = Math.max(a11 + m13, 0.0d);
                } else {
                    min = Math.min(a11, m13);
                }
                if (list.size() == 2) {
                    double a12 = AbstractC2262u2.a(y22.b((InterfaceC2243s) list.get(1)).z().doubleValue());
                    if (a12 < 0.0d) {
                        m13 = Math.max(m13 + a12, 0.0d);
                    } else {
                        m13 = Math.min(m13, a12);
                    }
                }
                C2141g c2141g8 = new C2141g();
                for (int i13 = (int) min; i13 < m13; i13++) {
                    c2141g8.l(c2141g.e(i13));
                }
                return c2141g8;
            case 17:
                return c(c2141g, y22, list, false);
            case 18:
                AbstractC2262u2.g("reverse", 0, list);
                int m14 = c2141g.m();
                if (m14 != 0) {
                    int i14 = 0;
                    while (i14 < m14 / 2) {
                        if (c2141g.r(i14)) {
                            InterfaceC2243s e10 = c2141g.e(i14);
                            c2141g.q(i14, null);
                            i8 = 1;
                            int i15 = (m14 - 1) - i14;
                            if (c2141g.r(i15)) {
                                c2141g.q(i14, c2141g.e(i15));
                            }
                            c2141g.q(i15, e10);
                        } else {
                            i8 = 1;
                        }
                        i14 += i8;
                    }
                }
                return c2141g;
            case 19:
                AbstractC2262u2.n("indexOf", 2, list);
                InterfaceC2243s interfaceC2243s2 = InterfaceC2243s.f16971b0;
                if (!list.isEmpty()) {
                    y23 = y22;
                    interfaceC2243s2 = y23.b((InterfaceC2243s) list.get(0));
                } else {
                    y23 = y22;
                }
                if (list.size() > 1) {
                    d10 = AbstractC2262u2.a(y23.b((InterfaceC2243s) list.get(1)).z().doubleValue());
                    if (d10 >= c2141g.m()) {
                        return new C2177k(valueOf);
                    }
                    d9 = valueOf;
                    if (d10 < 0.0d) {
                        d10 += c2141g.m();
                    }
                } else {
                    d9 = valueOf;
                    d10 = 0.0d;
                }
                Iterator s13 = c2141g.s();
                while (s13.hasNext()) {
                    int intValue2 = ((Integer) s13.next()).intValue();
                    double d11 = intValue2;
                    if (d11 >= d10 && AbstractC2262u2.h(c2141g.e(intValue2), interfaceC2243s2)) {
                        return new C2177k(Double.valueOf(d11));
                    }
                }
                return new C2177k(d9);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
