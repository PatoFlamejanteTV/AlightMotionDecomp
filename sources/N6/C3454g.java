package n6;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3454g extends AbstractC3442a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f35719d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3457h0 f35720e;

    public C3454g(U5.g gVar, Thread thread, AbstractC3457h0 abstractC3457h0) {
        super(gVar, true, true);
        this.f35719d = thread;
        this.f35720e = abstractC3457h0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n6.F0
    public void H(Object obj) {
        if (!AbstractC3292y.d(Thread.currentThread(), this.f35719d)) {
            Thread thread = this.f35719d;
            AbstractC3446c.a();
            LockSupport.unpark(thread);
        }
    }

    public final Object N0() {
        long j8;
        AbstractC3446c.a();
        try {
            AbstractC3457h0 abstractC3457h0 = this.f35720e;
            C3437C c3437c = null;
            if (abstractC3457h0 != null) {
                AbstractC3457h0.K(abstractC3457h0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC3457h0 abstractC3457h02 = this.f35720e;
                    if (abstractC3457h02 != null) {
                        j8 = abstractC3457h02.N();
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (!b()) {
                        AbstractC3446c.a();
                        LockSupport.parkNanos(this, j8);
                    } else {
                        AbstractC3457h0 abstractC3457h03 = this.f35720e;
                        if (abstractC3457h03 != null) {
                            AbstractC3457h0.F(abstractC3457h03, false, 1, null);
                        }
                        AbstractC3446c.a();
                        Object h8 = G0.h(d0());
                        if (h8 instanceof C3437C) {
                            c3437c = (C3437C) h8;
                        }
                        if (c3437c == null) {
                            return h8;
                        }
                        throw c3437c.f35626a;
                    }
                } catch (Throwable th) {
                    AbstractC3457h0 abstractC3457h04 = this.f35720e;
                    if (abstractC3457h04 != null) {
                        AbstractC3457h0.F(abstractC3457h04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            K(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC3446c.a();
            throw th2;
        }
    }

    @Override // n6.F0
    protected boolean h0() {
        return true;
    }
}
