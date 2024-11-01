package n6;

import R5.C1427k;
import s6.AbstractC3994n;

/* renamed from: n6.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3457h0 extends I {

    /* renamed from: a, reason: collision with root package name */
    private long f35723a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35724b;

    /* renamed from: c, reason: collision with root package name */
    private C1427k f35725c;

    public static /* synthetic */ void F(AbstractC3457h0 abstractC3457h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC3457h0.E(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long G(boolean z8) {
        if (z8) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void K(AbstractC3457h0 abstractC3457h0, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            abstractC3457h0.J(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void E(boolean z8) {
        long G8 = this.f35723a - G(z8);
        this.f35723a = G8;
        if (G8 <= 0 && this.f35724b) {
            shutdown();
        }
    }

    public final void H(Z z8) {
        C1427k c1427k = this.f35725c;
        if (c1427k == null) {
            c1427k = new C1427k();
            this.f35725c = c1427k;
        }
        c1427k.e(z8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long I() {
        C1427k c1427k = this.f35725c;
        if (c1427k == null || c1427k.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void J(boolean z8) {
        this.f35723a += G(z8);
        if (!z8) {
            this.f35724b = true;
        }
    }

    public final boolean L() {
        if (this.f35723a >= G(true)) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        C1427k c1427k = this.f35725c;
        if (c1427k != null) {
            return c1427k.isEmpty();
        }
        return true;
    }

    public abstract long N();

    public final boolean O() {
        Z z8;
        C1427k c1427k = this.f35725c;
        if (c1427k == null || (z8 = (Z) c1427k.z()) == null) {
            return false;
        }
        z8.run();
        return true;
    }

    public boolean P() {
        return false;
    }

    @Override // n6.I
    public final I limitedParallelism(int i8) {
        AbstractC3994n.a(i8);
        return this;
    }

    public abstract void shutdown();
}
