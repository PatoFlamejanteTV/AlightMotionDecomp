package androidx.work;

import Q5.s;
import Q5.t;
import java.util.concurrent.CancellationException;
import n6.InterfaceC3470o;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ InterfaceC3470o $cancellableContinuation;
    final /* synthetic */ InterfaceFutureC4260d $this_await;

    public ListenableFutureKt$await$2$1(InterfaceC3470o interfaceC3470o, InterfaceFutureC4260d interfaceFutureC4260d) {
        this.$cancellableContinuation = interfaceC3470o;
        this.$this_await = interfaceFutureC4260d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC3470o interfaceC3470o = this.$cancellableContinuation;
            s.a aVar = s.f8810b;
            interfaceC3470o.resumeWith(s.b(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.t(cause);
                return;
            }
            InterfaceC3470o interfaceC3470o2 = this.$cancellableContinuation;
            s.a aVar2 = s.f8810b;
            interfaceC3470o2.resumeWith(s.b(t.a(cause)));
        }
    }
}
