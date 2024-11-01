package q0;

import com.google.android.gms.tasks.Task;

/* renamed from: q0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3614E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36608a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f36609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3614E(F f8, Task task) {
        this.f36609b = f8;
        this.f36608a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3622h interfaceC3622h;
        InterfaceC3622h interfaceC3622h2;
        obj = this.f36609b.f36611b;
        synchronized (obj) {
            try {
                F f8 = this.f36609b;
                interfaceC3622h = f8.f36612c;
                if (interfaceC3622h != null) {
                    interfaceC3622h2 = f8.f36612c;
                    interfaceC3622h2.a(this.f36608a.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
