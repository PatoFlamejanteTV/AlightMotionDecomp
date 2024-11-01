package n6;

import java.util.concurrent.Future;

/* renamed from: n6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3464l extends AbstractC3466m {

    /* renamed from: a, reason: collision with root package name */
    private final Future f35735a;

    public C3464l(Future future) {
        this.f35735a = future;
    }

    @Override // n6.AbstractC3468n
    public void a(Throwable th) {
        if (th != null) {
            this.f35735a.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Q5.I.f8786a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f35735a + ']';
    }
}
