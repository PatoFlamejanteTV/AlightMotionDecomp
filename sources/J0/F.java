package J0;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f3850b;

        /* renamed from: J0.F$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0070a extends AbstractRunnableC1248e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f3851a;

            C0070a(Runnable runnable) {
                this.f3851a = runnable;
            }

            @Override // J0.AbstractRunnableC1248e
            public void a() {
                this.f3851a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f3849a = str;
            this.f3850b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0070a(runnable));
            newThread.setName(this.f3849a + this.f3850b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AbstractRunnableC1248e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f3854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3855c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f3856d;

        b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
            this.f3853a = str;
            this.f3854b = executorService;
            this.f3855c = j8;
            this.f3856d = timeUnit;
        }

        @Override // J0.AbstractRunnableC1248e
        public void a() {
            try {
                G0.g.f().b("Executing shutdown hook for " + this.f3853a);
                this.f3854b.shutdown();
                if (!this.f3854b.awaitTermination(this.f3855c, this.f3856d)) {
                    G0.g.f().b(this.f3853a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f3854b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                G0.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f3853a));
                this.f3854b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j8, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e8 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e8);
        return e8;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
