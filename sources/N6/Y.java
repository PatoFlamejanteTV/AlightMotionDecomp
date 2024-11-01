package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s6.AbstractC3991k;
import s6.C3976B;

/* loaded from: classes5.dex */
public final class Y extends C3976B {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35685e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision");
    private volatile int _decision;

    public Y(U5.g gVar, U5.d dVar) {
        super(gVar, dVar);
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35685e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35685e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35685e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35685e.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s6.C3976B, n6.F0
    public void H(Object obj) {
        J0(obj);
    }

    @Override // s6.C3976B, n6.AbstractC3442a
    protected void J0(Object obj) {
        if (O0()) {
            return;
        }
        AbstractC3991k.c(V5.b.c(this.f39161d), AbstractC3441G.a(obj, this.f39161d), null, 2, null);
    }

    public final Object N0() {
        if (P0()) {
            return V5.b.e();
        }
        Object h8 = G0.h(d0());
        if (!(h8 instanceof C3437C)) {
            return h8;
        }
        throw ((C3437C) h8).f35626a;
    }
}
