package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class FlowExtKt {
    public static final <T> InterfaceC3821f flowWithLifecycle(InterfaceC3821f interfaceC3821f, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        AbstractC3292y.i(lifecycle, "lifecycle");
        AbstractC3292y.i(minActiveState, "minActiveState");
        return AbstractC3823h.e(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, interfaceC3821f, null));
    }

    public static /* synthetic */ InterfaceC3821f flowWithLifecycle$default(InterfaceC3821f interfaceC3821f, Lifecycle lifecycle, Lifecycle.State state, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC3821f, lifecycle, state);
    }
}
