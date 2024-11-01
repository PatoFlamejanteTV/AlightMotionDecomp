package androidx.core.util;

import Q5.s;
import androidx.annotation.RequiresApi;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(24)
/* loaded from: classes3.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final U5.d continuation;

    public ContinuationConsumer(U5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t8) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(s.b(t8));
        }
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
