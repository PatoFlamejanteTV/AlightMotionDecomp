package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
