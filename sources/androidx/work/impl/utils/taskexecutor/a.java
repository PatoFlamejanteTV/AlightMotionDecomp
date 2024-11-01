package androidx.work.impl.utils.taskexecutor;

import n6.AbstractC3473p0;
import n6.I;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    public static I b(TaskExecutor taskExecutor) {
        return AbstractC3473p0.a(taskExecutor.getSerialTaskExecutor());
    }
}
