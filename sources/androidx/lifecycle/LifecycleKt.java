package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.U0;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC3292y.i(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, U0.b(null, 1, null).plus(C3445b0.c().G()));
        } while (!androidx.compose.animation.core.d.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final InterfaceC3821f getEventFlow(Lifecycle lifecycle) {
        AbstractC3292y.i(lifecycle, "<this>");
        return AbstractC3823h.C(AbstractC3823h.e(new LifecycleKt$eventFlow$1(lifecycle, null)), C3445b0.c().G());
    }
}
