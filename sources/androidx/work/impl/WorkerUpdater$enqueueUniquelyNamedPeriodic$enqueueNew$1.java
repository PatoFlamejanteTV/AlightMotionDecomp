package androidx.work.impl;

import Q5.I;
import R5.AbstractC1435t;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ String $name;
    final /* synthetic */ OperationImpl $operation;
    final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(WorkRequest workRequest, WorkManagerImpl workManagerImpl, String str, OperationImpl operationImpl) {
        super(0);
        this.$workRequest = workRequest;
        this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
        this.$name = str;
        this.$operation = operationImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5459invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5459invoke() {
        new EnqueueRunnable(new WorkContinuationImpl(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, AbstractC1435t.e(this.$workRequest)), this.$operation).run();
    }
}
