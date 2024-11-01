package K0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q0.AbstractC3628n;
import q0.InterfaceC3617c;

/* loaded from: classes3.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f4549a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4550b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private Task f4551c = AbstractC3628n.e(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ExecutorService executorService) {
        this.f4549a = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task d(Runnable runnable, Task task) {
        runnable.run();
        return AbstractC3628n.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task e(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService c() {
        return this.f4549a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4549a.execute(runnable);
    }

    public Task f(final Runnable runnable) {
        Task h8;
        synchronized (this.f4550b) {
            h8 = this.f4551c.h(this.f4549a, new InterfaceC3617c() { // from class: K0.d
                @Override // q0.InterfaceC3617c
                public final Object a(Task task) {
                    Task d8;
                    d8 = e.d(runnable, task);
                    return d8;
                }
            });
            this.f4551c = h8;
        }
        return h8;
    }

    public Task g(final Callable callable) {
        Task h8;
        synchronized (this.f4550b) {
            h8 = this.f4551c.h(this.f4549a, new InterfaceC3617c() { // from class: K0.c
                @Override // q0.InterfaceC3617c
                public final Object a(Task task) {
                    Task e8;
                    e8 = e.e(callable, task);
                    return e8;
                }
            });
            this.f4551c = h8;
        }
        return h8;
    }
}
