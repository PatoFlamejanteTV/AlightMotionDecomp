package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3613D implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36605a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36606b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3621g f36607c;

    public C3613D(Executor executor, InterfaceC3621g interfaceC3621g) {
        this.f36605a = executor;
        this.f36607c = interfaceC3621g;
    }

    @Override // q0.I
    public final void c(Task task) {
        if (!task.n() && !task.l()) {
            synchronized (this.f36606b) {
                try {
                    if (this.f36607c == null) {
                        return;
                    }
                    this.f36605a.execute(new RunnableC3612C(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
