package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class X extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public X() {
        this.f16219a.add(Z.ASSIGN);
        this.f16219a.add(Z.CONST);
        this.f16219a.add(Z.CREATE_ARRAY);
        this.f16219a.add(Z.CREATE_OBJECT);
        this.f16219a.add(Z.EXPRESSION_LIST);
        this.f16219a.add(Z.GET);
        this.f16219a.add(Z.GET_INDEX);
        this.f16219a.add(Z.GET_PROPERTY);
        this.f16219a.add(Z.NULL);
        this.f16219a.add(Z.SET_PROPERTY);
        this.f16219a.add(Z.TYPEOF);
        this.f16219a.add(Z.UNDEFINED);
        this.f16219a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2243s b(String str, Y2 y22, List list) {
        String str2;
        int i8 = 0;
        switch (W.f16476a[AbstractC2262u2.c(str).ordinal()]) {
            case 1:
                AbstractC2262u2.f(Z.ASSIGN, 2, list);
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(0));
                if (b9 instanceof C2259u) {
                    if (y22.g(b9.A())) {
                        InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(1));
                        y22.h(b9.A(), b10);
                        return b10;
                    }
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b9.A()));
                }
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b9.getClass().getCanonicalName()));
            case 2:
                AbstractC2262u2.j(Z.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    for (int i9 = 0; i9 < list.size() - 1; i9 += 2) {
                        InterfaceC2243s b11 = y22.b((InterfaceC2243s) list.get(i9));
                        if (b11 instanceof C2259u) {
                            y22.f(b11.A(), y22.b((InterfaceC2243s) list.get(i9 + 1)));
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b11.getClass().getCanonicalName()));
                        }
                    }
                    return InterfaceC2243s.f16971b0;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 3:
                if (list.isEmpty()) {
                    return new C2141g();
                }
                C2141g c2141g = new C2141g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC2243s b12 = y22.b((InterfaceC2243s) it.next());
                    if (!(b12 instanceof C2186l)) {
                        c2141g.q(i8, b12);
                        i8++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return c2141g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 == 0) {
                    r rVar = new r();
                    while (i8 < list.size() - 1) {
                        InterfaceC2243s b13 = y22.b((InterfaceC2243s) list.get(i8));
                        InterfaceC2243s b14 = y22.b((InterfaceC2243s) list.get(i8 + 1));
                        if (!(b13 instanceof C2186l) && !(b14 instanceof C2186l)) {
                            rVar.j(b13.A(), b14);
                            i8 += 2;
                        } else {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                    }
                    return rVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 5:
                AbstractC2262u2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC2243s interfaceC2243s = InterfaceC2243s.f16971b0;
                while (i8 < list.size()) {
                    interfaceC2243s = y22.b((InterfaceC2243s) list.get(i8));
                    if (interfaceC2243s instanceof C2186l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i8++;
                }
                return interfaceC2243s;
            case 6:
                AbstractC2262u2.f(Z.GET, 1, list);
                InterfaceC2243s b15 = y22.b((InterfaceC2243s) list.get(0));
                if (b15 instanceof C2259u) {
                    return y22.c(b15.A());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b15.getClass().getCanonicalName()));
            case 7:
            case 8:
                AbstractC2262u2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC2243s b16 = y22.b((InterfaceC2243s) list.get(0));
                InterfaceC2243s b17 = y22.b((InterfaceC2243s) list.get(1));
                if ((b16 instanceof C2141g) && AbstractC2262u2.l(b17)) {
                    return ((C2141g) b16).e(b17.z().intValue());
                }
                if (b16 instanceof InterfaceC2195m) {
                    return ((InterfaceC2195m) b16).c(b17.A());
                }
                if (b16 instanceof C2259u) {
                    if ("length".equals(b17.A())) {
                        return new C2177k(Double.valueOf(b16.A().length()));
                    }
                    if (AbstractC2262u2.l(b17) && b17.z().doubleValue() < b16.A().length()) {
                        return new C2259u(String.valueOf(b16.A().charAt(b17.z().intValue())));
                    }
                }
                return InterfaceC2243s.f16971b0;
            case 9:
                AbstractC2262u2.f(Z.NULL, 0, list);
                return InterfaceC2243s.f16972c0;
            case 10:
                AbstractC2262u2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC2243s b18 = y22.b((InterfaceC2243s) list.get(0));
                InterfaceC2243s b19 = y22.b((InterfaceC2243s) list.get(1));
                InterfaceC2243s b20 = y22.b((InterfaceC2243s) list.get(2));
                if (b18 != InterfaceC2243s.f16971b0 && b18 != InterfaceC2243s.f16972c0) {
                    if ((b18 instanceof C2141g) && (b19 instanceof C2177k)) {
                        ((C2141g) b18).q(b19.z().intValue(), b20);
                    } else if (b18 instanceof InterfaceC2195m) {
                        ((InterfaceC2195m) b18).j(b19.A(), b20);
                    }
                    return b20;
                }
                throw new IllegalStateException(String.format("Can't set property %s of %s", b19.A(), b18.A()));
            case 11:
                AbstractC2262u2.f(Z.TYPEOF, 1, list);
                InterfaceC2243s b21 = y22.b((InterfaceC2243s) list.get(0));
                if (b21 instanceof C2299z) {
                    str2 = "undefined";
                } else if (b21 instanceof C2150h) {
                    str2 = TypedValues.Custom.S_BOOLEAN;
                } else if (b21 instanceof C2177k) {
                    str2 = "number";
                } else if (b21 instanceof C2259u) {
                    str2 = TypedValues.Custom.S_STRING;
                } else if (b21 instanceof C2251t) {
                    str2 = "function";
                } else {
                    if ((b21 instanceof C2267v) || (b21 instanceof C2186l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b21));
                    }
                    str2 = "object";
                }
                return new C2259u(str2);
            case 12:
                AbstractC2262u2.f(Z.UNDEFINED, 0, list);
                return InterfaceC2243s.f16971b0;
            case 13:
                AbstractC2262u2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC2243s b22 = y22.b((InterfaceC2243s) it2.next());
                    if (b22 instanceof C2259u) {
                        y22.e(b22.A(), InterfaceC2243s.f16971b0);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b22.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC2243s.f16971b0;
            default:
                return super.a(str);
        }
    }
}
