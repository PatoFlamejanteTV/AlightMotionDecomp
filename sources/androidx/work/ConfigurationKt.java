package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ConfigurationKt {
    private static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z8) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                String str;
                AbstractC3292y.i(runnable, "runnable");
                if (z8) {
                    str = "WM.task-";
                } else {
                    str = "androidx.work-";
                }
                return new Thread(runnable, str + this.threadCount.incrementAndGet());
            }
        });
        AbstractC3292y.h(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final int getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT() {
        return DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT;
    }
}
