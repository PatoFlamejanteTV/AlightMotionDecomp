package androidx.work.impl;

import R5.AbstractC1428l;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import c6.InterfaceC2076r;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class WorkManagerImplExtKt$schedulers$1 extends AbstractC3293z implements InterfaceC2076r {
    final /* synthetic */ Scheduler[] $schedulers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerImplExtKt$schedulers$1(Scheduler[] schedulerArr) {
        super(6);
        this.$schedulers = schedulerArr;
    }

    @Override // c6.InterfaceC2076r
    public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        AbstractC3292y.i(context, "<anonymous parameter 0>");
        AbstractC3292y.i(configuration, "<anonymous parameter 1>");
        AbstractC3292y.i(taskExecutor, "<anonymous parameter 2>");
        AbstractC3292y.i(workDatabase, "<anonymous parameter 3>");
        AbstractC3292y.i(trackers, "<anonymous parameter 4>");
        AbstractC3292y.i(processor, "<anonymous parameter 5>");
        return AbstractC1428l.V0(this.$schedulers);
    }
}
