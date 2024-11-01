package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class H implements InterfaceC3622h, InterfaceC3621g, InterfaceC3619e, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36615a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3625k f36616b;

    /* renamed from: c, reason: collision with root package name */
    private final N f36617c;

    public H(Executor executor, InterfaceC3625k interfaceC3625k, N n8) {
        this.f36615a = executor;
        this.f36616b = interfaceC3625k;
        this.f36617c = n8;
    }

    @Override // q0.InterfaceC3622h
    public final void a(Object obj) {
        this.f36617c.r(obj);
    }

    @Override // q0.InterfaceC3619e
    public final void b() {
        this.f36617c.s();
    }

    @Override // q0.I
    public final void c(Task task) {
        this.f36615a.execute(new G(this, task));
    }

    @Override // q0.InterfaceC3621g
    public final void d(Exception exc) {
        this.f36617c.q(exc);
    }
}
