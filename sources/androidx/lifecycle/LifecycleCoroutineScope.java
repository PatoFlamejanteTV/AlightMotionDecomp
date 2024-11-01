package androidx.lifecycle;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;

/* loaded from: classes3.dex */
public abstract class LifecycleCoroutineScope implements M {
    @Override // n6.M
    public abstract /* synthetic */ U5.g getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final InterfaceC3488x0 launchWhenCreated(InterfaceC2072n block) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(block, "block");
        d8 = AbstractC3462k.d(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC3488x0 launchWhenResumed(InterfaceC2072n block) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(block, "block");
        d8 = AbstractC3462k.d(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC3488x0 launchWhenStarted(InterfaceC2072n block) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(block, "block");
        d8 = AbstractC3462k.d(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return d8;
    }
}
