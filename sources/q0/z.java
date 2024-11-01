package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class z implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36657a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36658b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3619e f36659c;

    public z(Executor executor, InterfaceC3619e interfaceC3619e) {
        this.f36657a = executor;
        this.f36659c = interfaceC3619e;
    }

    @Override // q0.I
    public final void c(Task task) {
        if (task.l()) {
            synchronized (this.f36658b) {
                try {
                    if (this.f36659c == null) {
                        return;
                    }
                    this.f36657a.execute(new y(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
