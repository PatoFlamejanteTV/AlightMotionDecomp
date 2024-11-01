package n6;

import Q5.C1413h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import s6.AbstractC3977C;
import s6.C3980F;
import s6.C3990j;

/* renamed from: n6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3472p extends Z implements InterfaceC3470o, kotlin.coroutines.jvm.internal.e, e1 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35741f = AtomicIntegerFieldUpdater.newUpdater(C3472p.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35742g = AtomicReferenceFieldUpdater.newUpdater(C3472p.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35743h = AtomicReferenceFieldUpdater.newUpdater(C3472p.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    private final U5.d f35744d;

    /* renamed from: e, reason: collision with root package name */
    private final U5.g f35745e;

    public C3472p(U5.d dVar, int i8) {
        super(i8);
        this.f35744d = dVar;
        this.f35745e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C3448d.f35702a;
    }

    private final String A() {
        Object z8 = z();
        if (z8 instanceof N0) {
            return "Active";
        }
        if (z8 instanceof C3477s) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final InterfaceC3449d0 D() {
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) getContext().get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 == null) {
            return null;
        }
        InterfaceC3449d0 d8 = InterfaceC3488x0.a.d(interfaceC3488x0, true, false, new C3479t(this), 2, null);
        androidx.concurrent.futures.a.a(f35743h, this, null, d8);
        return d8;
    }

    private final void E(Object obj) {
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3448d) {
                if (androidx.concurrent.futures.a.a(f35742g, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC3466m) {
                    z8 = true;
                } else {
                    z8 = obj2 instanceof AbstractC3977C;
                }
                if (z8) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C3437C) {
                        C3437C c3437c = (C3437C) obj2;
                        if (!c3437c.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C3477s) {
                            Throwable th = null;
                            if (!(obj2 instanceof C3437C)) {
                                c3437c = null;
                            }
                            if (c3437c != null) {
                                th = c3437c.f35626a;
                            }
                            if (obj instanceof AbstractC3466m) {
                                l((AbstractC3466m) obj, th);
                                return;
                            } else {
                                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                q((AbstractC3977C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C3436B) {
                        C3436B c3436b = (C3436B) obj2;
                        if (c3436b.f35621b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof AbstractC3977C) {
                            return;
                        }
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC3466m abstractC3466m = (AbstractC3466m) obj;
                        if (c3436b.c()) {
                            l(abstractC3466m, c3436b.f35624e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.a.a(f35742g, this, obj2, C3436B.b(c3436b, null, abstractC3466m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC3977C) {
                            return;
                        }
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.a.a(f35742g, this, obj2, new C3436B(obj2, (AbstractC3466m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (AbstractC3443a0.c(this.f35687c)) {
            U5.d dVar = this.f35744d;
            AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C3990j) dVar).r()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC3466m G(Function1 function1) {
        if (function1 instanceof AbstractC3466m) {
            return (AbstractC3466m) function1;
        }
        return new C3482u0(function1);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i8, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof N0) {
            } else {
                if (obj2 instanceof C3477s) {
                    C3477s c3477s = (C3477s) obj2;
                    if (c3477s.c()) {
                        if (function1 != null) {
                            p(function1, c3477s.f35626a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new C1413h();
            }
        } while (!androidx.concurrent.futures.a.a(f35742g, this, obj2, O((N0) obj2, obj, i8, function1, null)));
        u();
        v(i8);
    }

    static /* synthetic */ void N(C3472p c3472p, Object obj, int i8, Function1 function1, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 4) != 0) {
                function1 = null;
            }
            c3472p.M(obj, i8, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object O(N0 n02, Object obj, int i8, Function1 function1, Object obj2) {
        AbstractC3466m abstractC3466m;
        if (!(obj instanceof C3437C)) {
            if (AbstractC3443a0.b(i8) || obj2 != null) {
                if (function1 != null || (n02 instanceof AbstractC3466m) || obj2 != null) {
                    if (n02 instanceof AbstractC3466m) {
                        abstractC3466m = (AbstractC3466m) n02;
                    } else {
                        abstractC3466m = null;
                    }
                    return new C3436B(obj, abstractC3466m, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean P() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35741f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35741f.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final C3980F Q(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof N0) {
            } else {
                if (!(obj3 instanceof C3436B) || obj2 == null || ((C3436B) obj3).f35623d != obj2) {
                    return null;
                }
                return AbstractC3474q.f35746a;
            }
        } while (!androidx.concurrent.futures.a.a(f35742g, this, obj3, O((N0) obj3, obj, this.f35687c, function1, obj2)));
        u();
        return AbstractC3474q.f35746a;
    }

    private final boolean R() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35741f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35741f.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void q(AbstractC3977C abstractC3977C, Throwable th) {
        int i8 = f35741f.get(this) & 536870911;
        if (i8 != 536870911) {
            try {
                abstractC3977C.o(i8, th, getContext());
                return;
            } catch (Throwable th2) {
                K.a(getContext(), new C3440F("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean r(Throwable th) {
        if (!F()) {
            return false;
        }
        U5.d dVar = this.f35744d;
        AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3990j) dVar).s(th);
    }

    private final void u() {
        if (!F()) {
            s();
        }
    }

    private final void v(int i8) {
        if (P()) {
            return;
        }
        AbstractC3443a0.a(this, i8);
    }

    private final InterfaceC3449d0 x() {
        return (InterfaceC3449d0) f35743h.get(this);
    }

    public void B() {
        InterfaceC3449d0 D8 = D();
        if (D8 != null && b()) {
            D8.dispose();
            f35743h.set(this, M0.f35666a);
        }
    }

    @Override // n6.InterfaceC3470o
    public void C(Object obj) {
        v(this.f35687c);
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (r(th)) {
            return;
        }
        t(th);
        u();
    }

    public final void K() {
        C3990j c3990j;
        Throwable v8;
        U5.d dVar = this.f35744d;
        if (dVar instanceof C3990j) {
            c3990j = (C3990j) dVar;
        } else {
            c3990j = null;
        }
        if (c3990j != null && (v8 = c3990j.v(this)) != null) {
            s();
            t(v8);
        }
    }

    public final boolean L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C3436B) && ((C3436B) obj).f35623d != null) {
            s();
            return false;
        }
        f35741f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C3448d.f35702a);
        return true;
    }

    @Override // n6.e1
    public void a(AbstractC3977C abstractC3977C, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35741f;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        E(abstractC3977C);
    }

    @Override // n6.InterfaceC3470o
    public boolean b() {
        return !(z() instanceof N0);
    }

    @Override // n6.Z
    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof N0)) {
                if (obj2 instanceof C3437C) {
                    return;
                }
                if (obj2 instanceof C3436B) {
                    C3436B c3436b = (C3436B) obj2;
                    if (!c3436b.c()) {
                        if (androidx.concurrent.futures.a.a(f35742g, this, obj2, C3436B.b(c3436b, null, null, null, null, th, 15, null))) {
                            c3436b.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.a.a(f35742g, this, obj2, new C3436B(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // n6.Z
    public final U5.d d() {
        return this.f35744d;
    }

    @Override // n6.InterfaceC3470o
    public void e(I i8, Object obj) {
        C3990j c3990j;
        int i9;
        U5.d dVar = this.f35744d;
        I i10 = null;
        if (dVar instanceof C3990j) {
            c3990j = (C3990j) dVar;
        } else {
            c3990j = null;
        }
        if (c3990j != null) {
            i10 = c3990j.f39196d;
        }
        if (i10 == i8) {
            i9 = 4;
        } else {
            i9 = this.f35687c;
        }
        N(this, obj, i9, null, 4, null);
    }

    @Override // n6.InterfaceC3470o
    public void f(Function1 function1) {
        E(G(function1));
    }

    @Override // n6.Z
    public Throwable g(Object obj) {
        Throwable g8 = super.g(obj);
        if (g8 == null) {
            return null;
        }
        return g8;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        U5.d dVar = this.f35744d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // U5.d
    public U5.g getContext() {
        return this.f35745e;
    }

    @Override // n6.Z
    public Object h(Object obj) {
        if (obj instanceof C3436B) {
            return ((C3436B) obj).f35620a;
        }
        return obj;
    }

    @Override // n6.InterfaceC3470o
    public boolean isActive() {
        return z() instanceof N0;
    }

    @Override // n6.Z
    public Object j() {
        return z();
    }

    public final void l(AbstractC3466m abstractC3466m, Throwable th) {
        try {
            abstractC3466m.a(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C3440F("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // n6.InterfaceC3470o
    public Object m(Throwable th) {
        return Q(new C3437C(th, false, 2, null), null, null);
    }

    @Override // n6.InterfaceC3470o
    public Object n(Object obj, Object obj2, Function1 function1) {
        return Q(obj, obj2, function1);
    }

    @Override // n6.InterfaceC3470o
    public void o(Object obj, Function1 function1) {
        M(obj, this.f35687c, function1);
    }

    public final void p(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new C3440F("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        N(this, AbstractC3441G.c(obj, this), this.f35687c, null, 4, null);
    }

    public final void s() {
        InterfaceC3449d0 x8 = x();
        if (x8 == null) {
            return;
        }
        x8.dispose();
        f35743h.set(this, M0.f35666a);
    }

    @Override // n6.InterfaceC3470o
    public boolean t(Throwable th) {
        Object obj;
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35742g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z8 = false;
            if (!(obj instanceof N0)) {
                return false;
            }
            if ((obj instanceof AbstractC3466m) || (obj instanceof AbstractC3977C)) {
                z8 = true;
            }
        } while (!androidx.concurrent.futures.a.a(f35742g, this, obj, new C3477s(this, th, z8)));
        N0 n02 = (N0) obj;
        if (n02 instanceof AbstractC3466m) {
            l((AbstractC3466m) obj, th);
        } else if (n02 instanceof AbstractC3977C) {
            q((AbstractC3977C) obj, th);
        }
        u();
        v(this.f35687c);
        return true;
    }

    public String toString() {
        return I() + '(' + Q.c(this.f35744d) + "){" + A() + "}@" + Q.b(this);
    }

    public Throwable w(InterfaceC3488x0 interfaceC3488x0) {
        return interfaceC3488x0.q();
    }

    public final Object y() {
        InterfaceC3488x0 interfaceC3488x0;
        boolean F8 = F();
        if (R()) {
            if (x() == null) {
                D();
            }
            if (F8) {
                K();
            }
            return V5.b.e();
        }
        if (F8) {
            K();
        }
        Object z8 = z();
        if (!(z8 instanceof C3437C)) {
            if (AbstractC3443a0.b(this.f35687c) && (interfaceC3488x0 = (InterfaceC3488x0) getContext().get(InterfaceC3488x0.f35757n0)) != null && !interfaceC3488x0.isActive()) {
                CancellationException q8 = interfaceC3488x0.q();
                c(z8, q8);
                throw q8;
            }
            return h(z8);
        }
        throw ((C3437C) z8).f35626a;
    }

    public final Object z() {
        return f35742g.get(this);
    }
}
