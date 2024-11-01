package n6;

import java.util.concurrent.locks.LockSupport;
import n6.AbstractC3459i0;

/* renamed from: n6.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3461j0 extends AbstractC3457h0 {
    protected abstract Thread Q();

    /* JADX INFO: Access modifiers changed from: protected */
    public void R(long j8, AbstractC3459i0.c cVar) {
        S.f35677g.b0(j8, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        Thread Q8 = Q();
        if (Thread.currentThread() != Q8) {
            AbstractC3446c.a();
            LockSupport.unpark(Q8);
        }
    }
}
