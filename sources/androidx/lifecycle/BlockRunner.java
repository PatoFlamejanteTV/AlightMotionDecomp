package androidx.lifecycle;

import androidx.annotation.MainThread;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.M;

/* loaded from: classes3.dex */
public final class BlockRunner<T> {
    private final InterfaceC2072n block;
    private InterfaceC3488x0 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final Function0 onDone;
    private InterfaceC3488x0 runningJob;
    private final M scope;
    private final long timeoutInMs;

    public BlockRunner(CoroutineLiveData<T> liveData, InterfaceC2072n block, long j8, M scope, Function0 onDone) {
        AbstractC3292y.i(liveData, "liveData");
        AbstractC3292y.i(block, "block");
        AbstractC3292y.i(scope, "scope");
        AbstractC3292y.i(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j8;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        InterfaceC3488x0 d8;
        if (this.cancellationJob == null) {
            d8 = AbstractC3462k.d(this.scope, C3445b0.c().G(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = d8;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC3488x0 d8;
        InterfaceC3488x0 interfaceC3488x0 = this.cancellationJob;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob == null) {
            d8 = AbstractC3462k.d(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
            this.runningJob = d8;
        }
    }
}
