package n6;

/* loaded from: classes5.dex */
final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final I f35675a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3470o f35676b;

    public R0(I i8, InterfaceC3470o interfaceC3470o) {
        this.f35675a = i8;
        this.f35676b = interfaceC3470o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f35676b.e(this.f35675a, Q5.I.f8786a);
    }
}
