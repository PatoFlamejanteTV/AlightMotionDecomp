package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f36652b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, Task task) {
        this.f36652b = xVar;
        this.f36651a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n8;
        N n9;
        N n10;
        InterfaceC3617c interfaceC3617c;
        try {
            interfaceC3617c = this.f36652b.f36654b;
            Task task = (Task) interfaceC3617c.a(this.f36651a);
            if (task == null) {
                this.f36652b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f36652b;
            Executor executor = AbstractC3627m.f36634b;
            task.f(executor, xVar);
            task.d(executor, this.f36652b);
            task.a(executor, this.f36652b);
        } catch (C3624j e8) {
            if (e8.getCause() instanceof Exception) {
                n10 = this.f36652b.f36655c;
                n10.q((Exception) e8.getCause());
            } else {
                n9 = this.f36652b.f36655c;
                n9.q(e8);
            }
        } catch (Exception e9) {
            n8 = this.f36652b.f36655c;
            n8.q(e9);
        }
    }
}
