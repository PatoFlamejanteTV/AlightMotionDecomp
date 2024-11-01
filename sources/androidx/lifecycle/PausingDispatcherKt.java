package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c6.InterfaceC2072n;
import n6.AbstractC3458i;
import n6.C3445b0;

/* loaded from: classes3.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC2072n, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC2072n, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC2072n, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.c().G(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, interfaceC2072n, null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC2072n, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC2072n, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC2072n, dVar);
    }
}
