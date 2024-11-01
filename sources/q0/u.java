package q0;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f36646a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f36647b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar, Task task) {
        this.f36647b = vVar;
        this.f36646a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n8;
        N n9;
        N n10;
        InterfaceC3617c interfaceC3617c;
        N n11;
        N n12;
        if (this.f36646a.l()) {
            n12 = this.f36647b.f36650c;
            n12.s();
            return;
        }
        try {
            interfaceC3617c = this.f36647b.f36649b;
            Object a9 = interfaceC3617c.a(this.f36646a);
            n11 = this.f36647b.f36650c;
            n11.r(a9);
        } catch (C3624j e8) {
            if (e8.getCause() instanceof Exception) {
                n10 = this.f36647b.f36650c;
                n10.q((Exception) e8.getCause());
            } else {
                n9 = this.f36647b.f36650c;
                n9.q(e8);
            }
        } catch (Exception e9) {
            n8 = this.f36647b.f36650c;
            n8.q(e9);
        }
    }
}
