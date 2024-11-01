package n6;

/* renamed from: n6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3451e0 extends AbstractC3466m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3449d0 f35712a;

    public C3451e0(InterfaceC3449d0 interfaceC3449d0) {
        this.f35712a = interfaceC3449d0;
    }

    @Override // n6.AbstractC3468n
    public void a(Throwable th) {
        this.f35712a.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Q5.I.f8786a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f35712a + ']';
    }
}
