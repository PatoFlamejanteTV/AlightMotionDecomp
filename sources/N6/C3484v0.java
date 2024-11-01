package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: n6.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3484v0 extends AbstractC3492z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35754f = AtomicIntegerFieldUpdater.newUpdater(C3484v0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f35755e;

    public C3484v0(Function1 function1) {
        this.f35755e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Q5.I.f8786a;
    }

    @Override // n6.AbstractC3439E
    public void r(Throwable th) {
        if (f35754f.compareAndSet(this, 0, 1)) {
            this.f35755e.invoke(th);
        }
    }
}
