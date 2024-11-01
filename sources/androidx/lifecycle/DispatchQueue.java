package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.J0;

/* loaded from: classes3.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue this$0, Runnable runnable) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(runnable, "$runnable");
        this$0.enqueue(runnable);
    }

    @MainThread
    private final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            drainQueue();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    @MainThread
    public final boolean canRun() {
        if (!this.finished && this.paused) {
            return false;
        }
        return true;
    }

    @AnyThread
    public final void dispatchAndEnqueue(U5.g context, final Runnable runnable) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(runnable, "runnable");
        J0 G8 = C3445b0.c().G();
        if (!G8.isDispatchNeeded(context) && !canRun()) {
            enqueue(runnable);
        } else {
            G8.dispatch(context, new Runnable() { // from class: androidx.lifecycle.d
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue.this, runnable);
                }
            });
        }
    }

    @MainThread
    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @MainThread
    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    @MainThread
    public final void pause() {
        this.paused = true;
    }

    @MainThread
    public final void resume() {
        if (!this.paused) {
            return;
        }
        if (!this.finished) {
            this.paused = false;
            drainQueue();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}
