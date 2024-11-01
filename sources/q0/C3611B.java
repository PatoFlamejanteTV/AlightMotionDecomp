package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: q0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3611B implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36600a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36601b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3620f f36602c;

    public C3611B(Executor executor, InterfaceC3620f interfaceC3620f) {
        this.f36600a = executor;
        this.f36602c = interfaceC3620f;
    }

    @Override // q0.I
    public final void c(Task task) {
        synchronized (this.f36601b) {
            try {
                if (this.f36602c == null) {
                    return;
                }
                this.f36600a.execute(new RunnableC3610A(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
