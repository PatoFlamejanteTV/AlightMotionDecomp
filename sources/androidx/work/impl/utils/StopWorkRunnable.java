package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class StopWorkRunnable implements Runnable {
    private final Processor processor;
    private final int reason;
    private final boolean stopInForeground;
    private final StartStopToken token;

    public StopWorkRunnable(Processor processor, StartStopToken token, boolean z8, int i8) {
        AbstractC3292y.i(processor, "processor");
        AbstractC3292y.i(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z8;
        this.reason = i8;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean stopWork;
        if (this.stopInForeground) {
            stopWork = this.processor.stopForegroundWork(this.token, this.reason);
        } else {
            stopWork = this.processor.stopWork(this.token, this.reason);
        }
        Logger.get().debug(Logger.tagWithPrefix("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + stopWork);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(Processor processor, StartStopToken token, boolean z8) {
        this(processor, token, z8, WorkInfo.STOP_REASON_UNKNOWN);
        AbstractC3292y.i(processor, "processor");
        AbstractC3292y.i(token, "token");
    }
}
