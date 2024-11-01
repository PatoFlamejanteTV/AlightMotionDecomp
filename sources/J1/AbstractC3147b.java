package j1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3147b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC3146a f33661a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC3146a f33662b;

    /* renamed from: j1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0771b implements InterfaceC3146a {
        private C0771b() {
        }

        @Override // j1.InterfaceC3146a
        public ExecutorService a(ThreadFactory threadFactory, EnumC3148c enumC3148c) {
            return b(1, threadFactory, enumC3148c);
        }

        public ExecutorService b(int i8, ThreadFactory threadFactory, EnumC3148c enumC3148c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0771b c0771b = new C0771b();
        f33661a = c0771b;
        f33662b = c0771b;
    }

    public static InterfaceC3146a a() {
        return f33662b;
    }
}
