package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36610a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36611b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3622h f36612c;

    public F(Executor executor, InterfaceC3622h interfaceC3622h) {
        this.f36610a = executor;
        this.f36612c = interfaceC3622h;
    }

    @Override // q0.I
    public final void c(Task task) {
        if (task.n()) {
            synchronized (this.f36611b) {
                try {
                    if (this.f36612c == null) {
                        return;
                    }
                    this.f36610a.execute(new RunnableC3614E(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
