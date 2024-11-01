package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class StartWorkRunnable implements Runnable {
    private final Processor processor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final StartStopToken startStopToken;

    public StartWorkRunnable(Processor processor, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        AbstractC3292y.i(processor, "processor");
        AbstractC3292y.i(startStopToken, "startStopToken");
        this.processor = processor;
        this.startStopToken = startStopToken;
        this.runtimeExtras = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.processor.startWork(this.startStopToken, this.runtimeExtras);
    }
}
