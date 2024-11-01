package K0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.AbstractC3628n;
import q0.C3616b;
import q0.C3626l;
import q0.InterfaceC3617c;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f4546a = new androidx.privacysandbox.ads.adservices.adid.g();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task b(C3626l c3626l, AtomicBoolean atomicBoolean, C3616b c3616b, Task task) {
        if (task.n()) {
            c3626l.e(task.j());
        } else if (task.i() != null) {
            c3626l.d(task.i());
        } else if (atomicBoolean.getAndSet(true)) {
            c3616b.a();
        }
        return AbstractC3628n.e(null);
    }

    public static Task c(Task task, Task task2) {
        final C3616b c3616b = new C3616b();
        final C3626l c3626l = new C3626l(c3616b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC3617c interfaceC3617c = new InterfaceC3617c() { // from class: K0.a
            @Override // q0.InterfaceC3617c
            public final Object a(Task task3) {
                Task b9;
                b9 = b.b(C3626l.this, atomicBoolean, c3616b, task3);
                return b9;
            }
        };
        Executor executor = f4546a;
        task.h(executor, interfaceC3617c);
        task2.h(executor, interfaceC3617c);
        return c3626l.a();
    }
}
