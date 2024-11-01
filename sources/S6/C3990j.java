package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3441G;
import n6.AbstractC3457h0;
import n6.C3438D;
import n6.C3472p;
import n6.InterfaceC3470o;
import n6.X0;
import n6.Z;

/* renamed from: s6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3990j extends Z implements kotlin.coroutines.jvm.internal.e, U5.d {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39195h = AtomicReferenceFieldUpdater.newUpdater(C3990j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final n6.I f39196d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.d f39197e;

    /* renamed from: f, reason: collision with root package name */
    public Object f39198f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f39199g;

    public C3990j(n6.I i8, U5.d dVar) {
        super(-1);
        this.f39196d = i8;
        this.f39197e = dVar;
        this.f39198f = AbstractC3991k.a();
        this.f39199g = J.b(getContext());
    }

    private final C3472p q() {
        Object obj = f39195h.get(this);
        if (obj instanceof C3472p) {
            return (C3472p) obj;
        }
        return null;
    }

    @Override // n6.Z
    public void c(Object obj, Throwable th) {
        if (obj instanceof C3438D) {
            ((C3438D) obj).f35628b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        U5.d dVar = this.f39197e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // U5.d
    public U5.g getContext() {
        return this.f39197e.getContext();
    }

    @Override // n6.Z
    public Object j() {
        Object obj = this.f39198f;
        this.f39198f = AbstractC3991k.a();
        return obj;
    }

    public final void k() {
        do {
        } while (f39195h.get(this) == AbstractC3991k.f39201b);
    }

    public final C3472p l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39195h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f39195h.set(this, AbstractC3991k.f39201b);
                return null;
            }
            if (obj instanceof C3472p) {
                if (androidx.concurrent.futures.a.a(f39195h, this, obj, AbstractC3991k.f39201b)) {
                    return (C3472p) obj;
                }
            } else if (obj != AbstractC3991k.f39201b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void p(U5.g gVar, Object obj) {
        this.f39198f = obj;
        this.f35687c = 1;
        this.f39196d.dispatchYield(gVar, this);
    }

    public final boolean r() {
        if (f39195h.get(this) != null) {
            return true;
        }
        return false;
    }

    @Override // U5.d
    public void resumeWith(Object obj) {
        U5.g context = this.f39197e.getContext();
        Object d8 = AbstractC3441G.d(obj, null, 1, null);
        if (this.f39196d.isDispatchNeeded(context)) {
            this.f39198f = d8;
            this.f35687c = 0;
            this.f39196d.dispatch(context, this);
            return;
        }
        AbstractC3457h0 b9 = X0.f35683a.b();
        if (b9.L()) {
            this.f39198f = d8;
            this.f35687c = 0;
            b9.H(this);
            return;
        }
        b9.J(true);
        try {
            U5.g context2 = getContext();
            Object c8 = J.c(context2, this.f39199g);
            try {
                this.f39197e.resumeWith(obj);
                Q5.I i8 = Q5.I.f8786a;
                do {
                } while (b9.O());
            } finally {
                J.a(context2, c8);
            }
        } catch (Throwable th) {
            try {
                i(th, null);
            } finally {
                b9.E(true);
            }
        }
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39195h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3980F c3980f = AbstractC3991k.f39201b;
            if (AbstractC3292y.d(obj, c3980f)) {
                if (androidx.concurrent.futures.a.a(f39195h, this, c3980f, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f39195h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f39196d + ", " + n6.Q.c(this.f39197e) + ']';
    }

    public final void u() {
        k();
        C3472p q8 = q();
        if (q8 != null) {
            q8.s();
        }
    }

    public final Throwable v(InterfaceC3470o interfaceC3470o) {
        C3980F c3980f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39195h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c3980f = AbstractC3991k.f39201b;
            if (obj != c3980f) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f39195h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f39195h, this, c3980f, interfaceC3470o));
        return null;
    }

    @Override // n6.Z
    public U5.d d() {
        return this;
    }
}
