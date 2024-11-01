package u;

import java.util.concurrent.Executor;
import y.AbstractC4233a;

/* loaded from: classes3.dex */
class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f40132a;

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f40133a;

        a(Runnable runnable) {
            this.f40133a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f40133a.run();
            } catch (Exception e8) {
                AbstractC4233a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f40132a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f40132a.execute(new a(runnable));
    }
}
