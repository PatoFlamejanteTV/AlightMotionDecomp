package androidx.lifecycle;

import Q5.I;
import androidx.lifecycle.Lifecycle;
import c6.InterfaceC2072n;
import n6.N;

/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return I.f8786a;
            }
            Object e8 = N.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, interfaceC2072n, null), dVar);
            return e8 == V5.b.e() ? e8 : I.f8786a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC2072n, dVar);
        return repeatOnLifecycle == V5.b.e() ? repeatOnLifecycle : I.f8786a;
    }
}
