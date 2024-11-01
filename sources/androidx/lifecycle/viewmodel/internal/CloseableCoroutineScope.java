package androidx.lifecycle.viewmodel.internal;

import U5.g;
import kotlin.jvm.internal.AbstractC3292y;
import n6.D0;
import n6.M;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, M {
    private final g coroutineContext;

    public CloseableCoroutineScope(g coroutineContext) {
        AbstractC3292y.i(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        D0.e(getCoroutineContext(), null, 1, null);
    }

    @Override // n6.M
    public g getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(M coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        AbstractC3292y.i(coroutineScope, "coroutineScope");
    }
}
