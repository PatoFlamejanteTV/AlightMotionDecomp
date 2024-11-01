package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class L extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public L() {
        this.f16219a.add(Z.FOR_IN);
        this.f16219a.add(Z.FOR_IN_CONST);
        this.f16219a.add(Z.FOR_IN_LET);
        this.f16219a.add(Z.FOR_LET);
        this.f16219a.add(Z.FOR_OF);
        this.f16219a.add(Z.FOR_OF_CONST);
        this.f16219a.add(Z.FOR_OF_LET);
        this.f16219a.add(Z.WHILE);
    }

    private static InterfaceC2243s c(P p8, InterfaceC2243s interfaceC2243s, InterfaceC2243s interfaceC2243s2) {
        return d(p8, interfaceC2243s.B(), interfaceC2243s2);
    }

    private static InterfaceC2243s d(P p8, Iterator it, InterfaceC2243s interfaceC2243s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2243s a9 = p8.a((InterfaceC2243s) it.next()).a((C2141g) interfaceC2243s);
                if (a9 instanceof C2186l) {
                    C2186l c2186l = (C2186l) a9;
                    if ("break".equals(c2186l.c())) {
                        return InterfaceC2243s.f16971b0;
                    }
                    if ("return".equals(c2186l.c())) {
                        return c2186l;
                    }
                }
            }
        }
        return InterfaceC2243s.f16971b0;
    }

    private static InterfaceC2243s e(P p8, InterfaceC2243s interfaceC2243s, InterfaceC2243s interfaceC2243s2) {
        if (interfaceC2243s instanceof Iterable) {
            return d(p8, ((Iterable) interfaceC2243s).iterator(), interfaceC2243s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        switch (O.f16410a[AbstractC2262u2.c(str).ordinal()]) {
            case 1:
                AbstractC2262u2.f(Z.FOR_IN, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A8 = ((InterfaceC2243s) list.get(0)).A();
                    return c(new T(y22, A8), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                AbstractC2262u2.f(Z.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A9 = ((InterfaceC2243s) list.get(0)).A();
                    return c(new N(y22, A9), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                AbstractC2262u2.f(Z.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A10 = ((InterfaceC2243s) list.get(0)).A();
                    return c(new Q(y22, A10), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                AbstractC2262u2.f(Z.FOR_LET, 4, list);
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
                if (b9 instanceof C2141g) {
                    C2141g c2141g = (C2141g) b9;
                    InterfaceC2243s interfaceC2243s = (InterfaceC2243s) list.get(1);
                    InterfaceC2243s interfaceC2243s2 = (InterfaceC2243s) list.get(2);
                    InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(3));
                    Y2 d8 = y22.d();
                    for (int i8 = 0; i8 < c2141g.m(); i8++) {
                        String A11 = c2141g.e(i8).A();
                        d8.h(A11, y22.c(A11));
                    }
                    while (y22.b(interfaceC2243s).y().booleanValue()) {
                        InterfaceC2243s a9 = y22.a((C2141g) b10);
                        if (a9 instanceof C2186l) {
                            C2186l c2186l = (C2186l) a9;
                            if (!"break".equals(c2186l.c())) {
                                if ("return".equals(c2186l.c())) {
                                    return c2186l;
                                }
                            } else {
                                return InterfaceC2243s.f16971b0;
                            }
                        }
                        Y2 d9 = y22.d();
                        for (int i9 = 0; i9 < c2141g.m(); i9++) {
                            String A12 = c2141g.e(i9).A();
                            d9.h(A12, d8.c(A12));
                        }
                        d9.b(interfaceC2243s2);
                        d8 = d9;
                    }
                    return InterfaceC2243s.f16971b0;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                AbstractC2262u2.f(Z.FOR_OF, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A13 = ((InterfaceC2243s) list.get(0)).A();
                    return e(new T(y22, A13), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                AbstractC2262u2.f(Z.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A14 = ((InterfaceC2243s) list.get(0)).A();
                    return e(new N(y22, A14), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                AbstractC2262u2.f(Z.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof C2259u) {
                    String A15 = ((InterfaceC2243s) list.get(0)).A();
                    return e(new Q(y22, A15), y22.b((InterfaceC2243s) list.get(1)), y22.b((InterfaceC2243s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                AbstractC2262u2.f(Z.WHILE, 4, list);
                InterfaceC2243s interfaceC2243s3 = (InterfaceC2243s) list.get(0);
                InterfaceC2243s interfaceC2243s4 = (InterfaceC2243s) list.get(1);
                InterfaceC2243s interfaceC2243s5 = (InterfaceC2243s) list.get(2);
                InterfaceC2243s b11 = y22.b((InterfaceC2243s) list.get(3));
                if (y22.b(interfaceC2243s5).y().booleanValue()) {
                    InterfaceC2243s a10 = y22.a((C2141g) b11);
                    if (a10 instanceof C2186l) {
                        C2186l c2186l2 = (C2186l) a10;
                        if (!"break".equals(c2186l2.c())) {
                            if ("return".equals(c2186l2.c())) {
                                return c2186l2;
                            }
                        }
                        return InterfaceC2243s.f16971b0;
                    }
                }
                while (y22.b(interfaceC2243s3).y().booleanValue()) {
                    InterfaceC2243s a11 = y22.a((C2141g) b11);
                    if (a11 instanceof C2186l) {
                        C2186l c2186l3 = (C2186l) a11;
                        if (!"break".equals(c2186l3.c())) {
                            if ("return".equals(c2186l3.c())) {
                                return c2186l3;
                            }
                        } else {
                            return InterfaceC2243s.f16971b0;
                        }
                    }
                    y22.b(interfaceC2243s4);
                }
                return InterfaceC2243s.f16971b0;
            default:
                return super.a(str);
        }
    }
}
