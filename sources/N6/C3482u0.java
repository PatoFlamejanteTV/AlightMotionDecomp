package n6;

import kotlin.jvm.functions.Function1;

/* renamed from: n6.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3482u0 extends AbstractC3466m {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f35752a;

    public C3482u0(Function1 function1) {
        this.f35752a = function1;
    }

    @Override // n6.AbstractC3468n
    public void a(Throwable th) {
        this.f35752a.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Q5.I.f8786a;
    }

    public String toString() {
        return "InvokeOnCancel[" + Q.a(this.f35752a) + '@' + Q.b(this) + ']';
    }
}
