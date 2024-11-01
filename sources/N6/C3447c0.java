package n6;

import java.util.concurrent.Future;

/* renamed from: n6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3447c0 implements InterfaceC3449d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Future f35700a;

    public C3447c0(Future future) {
        this.f35700a = future;
    }

    @Override // n6.InterfaceC3449d0
    public void dispose() {
        this.f35700a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f35700a + ']';
    }
}
