package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import n6.M;
import n6.N;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final M coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(M m8) {
        this.coroutineScope = m8;
    }

    public final M getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        N.c(this.coroutineScope, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        N.c(this.coroutineScope, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
