package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class IdGenerator {
    private final WorkDatabase workDatabase;

    public IdGenerator(WorkDatabase workDatabase) {
        AbstractC3292y.i(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextAlarmManagerId$lambda$1(IdGenerator this$0) {
        int nextId;
        AbstractC3292y.i(this$0, "this$0");
        nextId = IdGeneratorKt.nextId(this$0.workDatabase, IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY);
        return Integer.valueOf(nextId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextJobSchedulerIdWithRange$lambda$0(IdGenerator this$0, int i8, int i9) {
        int nextId;
        AbstractC3292y.i(this$0, "this$0");
        nextId = IdGeneratorKt.nextId(this$0.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i8 > nextId || nextId > i9) {
            IdGeneratorKt.updatePreference(this$0.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i8 + 1);
        } else {
            i8 = nextId;
        }
        return Integer.valueOf(i8);
    }

    public final int nextAlarmManagerId() {
        Object runInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer nextAlarmManagerId$lambda$1;
                nextAlarmManagerId$lambda$1 = IdGenerator.nextAlarmManagerId$lambda$1(IdGenerator.this);
                return nextAlarmManagerId$lambda$1;
            }
        });
        AbstractC3292y.h(runInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) runInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i8, final int i9) {
        Object runInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer nextJobSchedulerIdWithRange$lambda$0;
                nextJobSchedulerIdWithRange$lambda$0 = IdGenerator.nextJobSchedulerIdWithRange$lambda$0(IdGenerator.this, i8, i9);
                return nextJobSchedulerIdWithRange$lambda$0;
            }
        });
        AbstractC3292y.h(runInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) runInTransaction).intValue();
    }
}
