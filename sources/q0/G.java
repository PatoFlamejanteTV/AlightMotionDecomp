package q0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36613a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f36614b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(H h8, Task task) {
        this.f36614b = h8;
        this.f36613a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3625k interfaceC3625k;
        try {
            interfaceC3625k = this.f36614b.f36616b;
            Task a9 = interfaceC3625k.a(this.f36613a.j());
            if (a9 == null) {
                this.f36614b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            H h8 = this.f36614b;
            Executor executor = AbstractC3627m.f36634b;
            a9.f(executor, h8);
            a9.d(executor, this.f36614b);
            a9.a(executor, this.f36614b);
        } catch (CancellationException unused) {
            this.f36614b.b();
        } catch (C3624j e8) {
            if (e8.getCause() instanceof Exception) {
                this.f36614b.d((Exception) e8.getCause());
            } else {
                this.f36614b.d(e8);
            }
        } catch (Exception e9) {
            this.f36614b.d(e9);
        }
    }
}
