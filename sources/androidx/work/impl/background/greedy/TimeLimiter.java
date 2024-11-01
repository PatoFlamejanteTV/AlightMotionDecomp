package androidx.work.impl.background.greedy;

import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class TimeLimiter {
    private final WorkLauncher launcher;
    private final Object lock;
    private final RunnableScheduler runnableScheduler;
    private final long timeoutMs;
    private final Map<StartStopToken, Runnable> tracked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        AbstractC3292y.i(runnableScheduler, "runnableScheduler");
        AbstractC3292y.i(launcher, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void track$lambda$0(TimeLimiter this$0, StartStopToken token) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(token, "$token");
        this$0.launcher.stopWork(token, 3);
    }

    public final void cancel(StartStopToken token) {
        Runnable remove;
        AbstractC3292y.i(token, "token");
        synchronized (this.lock) {
            remove = this.tracked.remove(token);
        }
        if (remove != null) {
            this.runnableScheduler.cancel(remove);
        }
    }

    public final void track(final StartStopToken token) {
        AbstractC3292y.i(token, "token");
        Runnable runnable = new Runnable() { // from class: androidx.work.impl.background.greedy.a
            @Override // java.lang.Runnable
            public final void run() {
                TimeLimiter.track$lambda$0(TimeLimiter.this, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.scheduleWithDelay(this.timeoutMs, runnable);
    }

    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher launcher, long j8) {
        AbstractC3292y.i(runnableScheduler, "runnableScheduler");
        AbstractC3292y.i(launcher, "launcher");
        this.runnableScheduler = runnableScheduler;
        this.launcher = launcher;
        this.timeoutMs = j8;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    public /* synthetic */ TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j8, int i8, AbstractC3284p abstractC3284p) {
        this(runnableScheduler, workLauncher, (i8 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j8);
    }
}
