package androidx.room;

import Q5.I;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class TransactionExecutor implements Executor {
    private Runnable active;
    private final Executor executor;
    private final Object syncLock;
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(Executor executor) {
        AbstractC3292y.i(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable command, TransactionExecutor this$0) {
        AbstractC3292y.i(command, "$command");
        AbstractC3292y.i(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        AbstractC3292y.i(command, "command");
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() { // from class: androidx.room.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransactionExecutor.execute$lambda$1$lambda$0(command, this);
                    }
                });
                if (this.active == null) {
                    scheduleNext();
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            try {
                Runnable poll = this.tasks.poll();
                Runnable runnable = poll;
                this.active = runnable;
                if (poll != null) {
                    this.executor.execute(runnable);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
