package androidx.core.util;

import Q5.I;
import Q5.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final U5.d continuation;

    public ContinuationRunnable(U5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            U5.d dVar = this.continuation;
            s.a aVar = s.f8810b;
            dVar.resumeWith(s.b(I.f8786a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
