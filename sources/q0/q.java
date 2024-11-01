package q0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f36636a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(p pVar) {
    }

    @Override // q0.InterfaceC3622h
    public final void a(Object obj) {
        this.f36636a.countDown();
    }

    @Override // q0.InterfaceC3619e
    public final void b() {
        this.f36636a.countDown();
    }

    public final void c() {
        this.f36636a.await();
    }

    @Override // q0.InterfaceC3621g
    public final void d(Exception exc) {
        this.f36636a.countDown();
    }

    public final boolean e(long j8, TimeUnit timeUnit) {
        return this.f36636a.await(j8, timeUnit);
    }
}
