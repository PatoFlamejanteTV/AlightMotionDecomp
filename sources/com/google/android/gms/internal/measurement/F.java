package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class F extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public F() {
        this.f16219a.add(Z.APPLY);
        this.f16219a.add(Z.BLOCK);
        this.f16219a.add(Z.BREAK);
        this.f16219a.add(Z.CASE);
        this.f16219a.add(Z.DEFAULT);
        this.f16219a.add(Z.CONTINUE);
        this.f16219a.add(Z.DEFINE_FUNCTION);
        this.f16219a.add(Z.FN);
        this.f16219a.add(Z.IF);
        this.f16219a.add(Z.QUOTE);
        this.f16219a.add(Z.RETURN);
        this.f16219a.add(Z.SWITCH);
        this.f16219a.add(Z.TERNARY);
    }

    private static InterfaceC2243s c(Y2 y22, List list) {
        AbstractC2262u2.j(Z.FN, 2, list);
        InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
        InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(1));
        if (b10 instanceof C2141g) {
            List t8 = ((C2141g) b10).t();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C2251t(b9.A(), t8, arrayList, y22);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b10.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        InterfaceC2243s interfaceC2243s;
        InterfaceC2243s interfaceC2243s2;
        int i8 = 0;
        switch (I.f16319a[AbstractC2262u2.c(str).ordinal()]) {
            case 1:
                AbstractC2262u2.f(Z.APPLY, 3, list);
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
                String A8 = y22.b((InterfaceC2243s) list.get(1)).A();
                InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(2));
                if (b10 instanceof C2141g) {
                    if (!A8.isEmpty()) {
                        return b9.C(A8, y22, ((C2141g) b10).t());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b10.getClass().getCanonicalName()));
            case 2:
                return y22.d().a(new C2141g(list));
            case 3:
                AbstractC2262u2.f(Z.BREAK, 0, list);
                return InterfaceC2243s.f16974e0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC2243s b11 = y22.b((InterfaceC2243s) list.get(0));
                    if (b11 instanceof C2141g) {
                        return y22.a((C2141g) b11);
                    }
                }
                return InterfaceC2243s.f16971b0;
            case 6:
                AbstractC2262u2.f(Z.BREAK, 0, list);
                return InterfaceC2243s.f16973d0;
            case 7:
                AbstractC2262u2.j(Z.DEFINE_FUNCTION, 2, list);
                C2251t c2251t = (C2251t) c(y22, list);
                if (c2251t.d() == null) {
                    y22.h("", c2251t);
                } else {
                    y22.h(c2251t.d(), c2251t);
                }
                return c2251t;
            case 8:
                return c(y22, list);
            case 9:
                AbstractC2262u2.j(Z.IF, 2, list);
                InterfaceC2243s b12 = y22.b((InterfaceC2243s) list.get(0));
                InterfaceC2243s b13 = y22.b((InterfaceC2243s) list.get(1));
                if (list.size() > 2) {
                    interfaceC2243s = y22.b((InterfaceC2243s) list.get(2));
                } else {
                    interfaceC2243s = null;
                }
                InterfaceC2243s interfaceC2243s3 = InterfaceC2243s.f16971b0;
                if (b12.y().booleanValue()) {
                    interfaceC2243s2 = y22.a((C2141g) b13);
                } else if (interfaceC2243s != null) {
                    interfaceC2243s2 = y22.a((C2141g) interfaceC2243s);
                } else {
                    interfaceC2243s2 = interfaceC2243s3;
                }
                if (interfaceC2243s2 instanceof C2186l) {
                    return interfaceC2243s2;
                }
                return interfaceC2243s3;
            case 10:
                return new C2141g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC2243s.f16975f0;
                }
                AbstractC2262u2.f(Z.RETURN, 1, list);
                return new C2186l("return", y22.b((InterfaceC2243s) list.get(0)));
            case 12:
                AbstractC2262u2.f(Z.SWITCH, 3, list);
                InterfaceC2243s b14 = y22.b((InterfaceC2243s) list.get(0));
                InterfaceC2243s b15 = y22.b((InterfaceC2243s) list.get(1));
                InterfaceC2243s b16 = y22.b((InterfaceC2243s) list.get(2));
                if (b15 instanceof C2141g) {
                    if (b16 instanceof C2141g) {
                        C2141g c2141g = (C2141g) b15;
                        C2141g c2141g2 = (C2141g) b16;
                        boolean z8 = false;
                        while (true) {
                            if (i8 < c2141g.m()) {
                                if (z8 || b14.equals(y22.b(c2141g.e(i8)))) {
                                    InterfaceC2243s b17 = y22.b(c2141g2.e(i8));
                                    if (b17 instanceof C2186l) {
                                        if (!((C2186l) b17).c().equals("break")) {
                                            return b17;
                                        }
                                    } else {
                                        z8 = true;
                                    }
                                }
                                i8++;
                            } else if (c2141g.m() + 1 == c2141g2.m()) {
                                InterfaceC2243s b18 = y22.b(c2141g2.e(c2141g.m()));
                                if (b18 instanceof C2186l) {
                                    String c8 = ((C2186l) b18).c();
                                    if (c8.equals("return") || c8.equals("continue")) {
                                        return b18;
                                    }
                                }
                            }
                        }
                        return InterfaceC2243s.f16971b0;
                    }
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
            case 13:
                AbstractC2262u2.f(Z.TERNARY, 3, list);
                if (y22.b((InterfaceC2243s) list.get(0)).y().booleanValue()) {
                    return y22.b((InterfaceC2243s) list.get(1));
                }
                return y22.b((InterfaceC2243s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
