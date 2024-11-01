package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class v implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36648a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3617c f36649b;

    /* renamed from: c, reason: collision with root package name */
    private final N f36650c;

    public v(Executor executor, InterfaceC3617c interfaceC3617c, N n8) {
        this.f36648a = executor;
        this.f36649b = interfaceC3617c;
        this.f36650c = n8;
    }

    @Override // q0.I
    public final void c(Task task) {
        this.f36648a.execute(new u(this, task));
    }
}
