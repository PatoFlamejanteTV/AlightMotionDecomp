package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class x implements InterfaceC3622h, InterfaceC3621g, InterfaceC3619e, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36653a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3617c f36654b;

    /* renamed from: c, reason: collision with root package name */
    private final N f36655c;

    public x(Executor executor, InterfaceC3617c interfaceC3617c, N n8) {
        this.f36653a = executor;
        this.f36654b = interfaceC3617c;
        this.f36655c = n8;
    }

    @Override // q0.InterfaceC3622h
    public final void a(Object obj) {
        this.f36655c.r(obj);
    }

    @Override // q0.InterfaceC3619e
    public final void b() {
        this.f36655c.s();
    }

    @Override // q0.I
    public final void c(Task task) {
        this.f36653a.execute(new w(this, task));
    }

    @Override // q0.InterfaceC3621g
    public final void d(Exception exc) {
        this.f36655c.q(exc);
    }
}
