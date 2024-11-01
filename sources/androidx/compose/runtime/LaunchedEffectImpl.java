package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import n6.AbstractC3462k;
import n6.D0;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    private InterfaceC3488x0 job;
    private final M scope;
    private final InterfaceC2072n task;

    public LaunchedEffectImpl(U5.g gVar, InterfaceC2072n interfaceC2072n) {
        this.task = interfaceC2072n;
        this.scope = N.a(gVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC3488x0 interfaceC3488x0 = this.job;
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC3488x0 interfaceC3488x0 = this.job;
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        InterfaceC3488x0 d8;
        InterfaceC3488x0 interfaceC3488x0 = this.job;
        if (interfaceC3488x0 != null) {
            D0.f(interfaceC3488x0, "Old job was still running!", null, 2, null);
        }
        d8 = AbstractC3462k.d(this.scope, null, null, this.task, 3, null);
        this.job = d8;
    }
}
