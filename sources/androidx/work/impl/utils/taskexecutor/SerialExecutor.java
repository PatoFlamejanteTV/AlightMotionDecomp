package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface SerialExecutor extends Executor {
    boolean hasPendingTasks();
}
