package n6;

import c6.InterfaceC2072n;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3442a extends F0 implements InterfaceC3488x0, U5.d, M {

    /* renamed from: c, reason: collision with root package name */
    private final U5.g f35689c;

    public AbstractC3442a(U5.g gVar, boolean z8, boolean z9) {
        super(z9);
        if (z8) {
            g0((InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0));
        }
        this.f35689c = gVar.plus(this);
    }

    protected void J0(Object obj) {
        H(obj);
    }

    public final void M0(O o8, Object obj, InterfaceC2072n interfaceC2072n) {
        o8.b(interfaceC2072n, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n6.F0
    public String P() {
        return Q.a(this) + " was cancelled";
    }

    @Override // n6.F0
    public final void f0(Throwable th) {
        K.a(this.f35689c, th);
    }

    @Override // U5.d
    public final U5.g getContext() {
        return this.f35689c;
    }

    @Override // n6.M
    public U5.g getCoroutineContext() {
        return this.f35689c;
    }

    @Override // n6.F0, n6.InterfaceC3488x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // n6.F0
    public String o0() {
        String b9 = H.b(this.f35689c);
        if (b9 == null) {
            return super.o0();
        }
        return '\"' + b9 + "\":" + super.o0();
    }

    @Override // U5.d
    public final void resumeWith(Object obj) {
        Object m02 = m0(AbstractC3441G.d(obj, null, 1, null));
        if (m02 == G0.f35649b) {
            return;
        }
        J0(m02);
    }

    @Override // n6.F0
    protected final void t0(Object obj) {
        if (obj instanceof C3437C) {
            C3437C c3437c = (C3437C) obj;
            K0(c3437c.f35626a, c3437c.a());
        } else {
            L0(obj);
        }
    }

    protected void L0(Object obj) {
    }

    protected void K0(Throwable th, boolean z8) {
    }
}
