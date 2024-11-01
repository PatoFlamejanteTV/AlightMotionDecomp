package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.I;

/* loaded from: classes3.dex */
public final class PausingDispatcher extends I {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // n6.I
    public void dispatch(U5.g context, Runnable block) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // n6.I
    public boolean isDispatchNeeded(U5.g context) {
        AbstractC3292y.i(context, "context");
        if (C3445b0.c().G().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
