package androidx.work.impl;

import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkLauncherImpl implements WorkLauncher {
    private final Processor processor;
    private final TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(Processor processor, TaskExecutor workTaskExecutor) {
        AbstractC3292y.i(processor, "processor");
        AbstractC3292y.i(workTaskExecutor, "workTaskExecutor");
        this.processor = processor;
        this.workTaskExecutor = workTaskExecutor;
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public /* synthetic */ void startWork(StartStopToken startStopToken) {
        g.a(this, startStopToken);
    }

    @Override // androidx.work.impl.WorkLauncher
    public /* synthetic */ void stopWork(StartStopToken startStopToken) {
        g.b(this, startStopToken);
    }

    @Override // androidx.work.impl.WorkLauncher
    public /* synthetic */ void stopWorkWithReason(StartStopToken startStopToken, int i8) {
        g.c(this, startStopToken, i8);
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(StartStopToken workSpecId, WorkerParameters.RuntimeExtras runtimeExtras) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new StartWorkRunnable(this.processor, workSpecId, runtimeExtras));
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(StartStopToken workSpecId, int i8) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        this.workTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this.processor, workSpecId, false, i8));
    }
}
