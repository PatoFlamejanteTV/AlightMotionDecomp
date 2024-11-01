package q0;

import com.google.android.gms.tasks.Task;

/* renamed from: q0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3610A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3611B f36599b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3610A(C3611B c3611b, Task task) {
        this.f36599b = c3611b;
        this.f36598a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3620f interfaceC3620f;
        InterfaceC3620f interfaceC3620f2;
        obj = this.f36599b.f36601b;
        synchronized (obj) {
            try {
                C3611B c3611b = this.f36599b;
                interfaceC3620f = c3611b.f36602c;
                if (interfaceC3620f != null) {
                    interfaceC3620f2 = c3611b.f36602c;
                    interfaceC3620f2.a(this.f36598a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
