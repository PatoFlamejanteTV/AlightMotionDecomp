package q0;

import Q.AbstractC1396p;
import com.google.android.gms.tasks.Task;

/* renamed from: q0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3612C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36603a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3613D f36604b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3612C(C3613D c3613d, Task task) {
        this.f36604b = c3613d;
        this.f36603a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3621g interfaceC3621g;
        InterfaceC3621g interfaceC3621g2;
        obj = this.f36604b.f36606b;
        synchronized (obj) {
            try {
                C3613D c3613d = this.f36604b;
                interfaceC3621g = c3613d.f36607c;
                if (interfaceC3621g != null) {
                    interfaceC3621g2 = c3613d.f36607c;
                    interfaceC3621g2.d((Exception) AbstractC1396p.l(this.f36603a.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
