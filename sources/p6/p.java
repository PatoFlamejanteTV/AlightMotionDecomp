package p6;

import Q5.AbstractC1410e;
import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.U;
import n6.e1;
import p6.h;
import s6.Q;
import s6.x;

/* loaded from: classes5.dex */
public class p extends b {

    /* renamed from: m, reason: collision with root package name */
    private final int f36427m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC3588a f36428n;

    public p(int i8, EnumC3588a enumC3588a, Function1 function1) {
        super(i8, function1);
        this.f36427m = i8;
        this.f36428n = enumC3588a;
        if (enumC3588a != EnumC3588a.SUSPEND) {
            if (i8 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + U.b(b.class).b() + " instead").toString());
    }

    static /* synthetic */ Object N0(p pVar, Object obj, U5.d dVar) {
        Q d8;
        Object Q02 = pVar.Q0(obj, true);
        if (Q02 instanceof h.a) {
            h.e(Q02);
            Function1 function1 = pVar.f36375b;
            if (function1 != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
                AbstractC1410e.a(d8, pVar.Q());
                throw d8;
            }
            throw pVar.Q();
        }
        return I.f8786a;
    }

    private final Object O0(Object obj, boolean z8) {
        Function1 function1;
        Q d8;
        Object x8 = super.x(obj);
        if (!h.i(x8) && !h.h(x8)) {
            if (z8 && (function1 = this.f36375b) != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
                throw d8;
            }
            return h.f36417b.c(I.f8786a);
        }
        return x8;
    }

    private final Object P0(Object obj) {
        j jVar;
        e1 e1Var;
        Object obj2 = c.f36396d;
        j jVar2 = (j) b.f36369h.get(this);
        while (true) {
            long andIncrement = b.f36365d.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean a02 = a0(andIncrement);
            int i8 = c.f36394b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (jVar2.f39163c != j9) {
                j L8 = L(j9, jVar2);
                if (L8 == null) {
                    if (a02) {
                        return h.f36417b.a(Q());
                    }
                } else {
                    jVar = L8;
                }
            } else {
                jVar = jVar2;
            }
            int I02 = I0(jVar, i9, obj, j8, obj2, a02);
            if (I02 != 0) {
                if (I02 != 1) {
                    if (I02 != 2) {
                        if (I02 != 3) {
                            if (I02 != 4) {
                                if (I02 == 5) {
                                    jVar.b();
                                }
                                jVar2 = jVar;
                            } else {
                                if (j8 < P()) {
                                    jVar.b();
                                }
                                return h.f36417b.a(Q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (a02) {
                            jVar.p();
                            return h.f36417b.a(Q());
                        }
                        if (obj2 instanceof e1) {
                            e1Var = (e1) obj2;
                        } else {
                            e1Var = null;
                        }
                        if (e1Var != null) {
                            q0(e1Var, jVar, i9);
                        }
                        H((jVar.f39163c * i8) + i9);
                        return h.f36417b.c(I.f8786a);
                    }
                } else {
                    return h.f36417b.c(I.f8786a);
                }
            } else {
                jVar.b();
                return h.f36417b.c(I.f8786a);
            }
        }
    }

    private final Object Q0(Object obj, boolean z8) {
        if (this.f36428n == EnumC3588a.DROP_LATEST) {
            return O0(obj, z8);
        }
        return P0(obj);
    }

    @Override // p6.b
    protected boolean b0() {
        if (this.f36428n == EnumC3588a.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    @Override // p6.b, p6.v
    public Object l(Object obj, U5.d dVar) {
        return N0(this, obj, dVar);
    }

    @Override // p6.b, p6.v
    public Object x(Object obj) {
        return Q0(obj, false);
    }
}
