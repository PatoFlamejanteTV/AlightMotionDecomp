package j$.util.stream;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3125x extends AbstractC3024c0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33607m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3125x(AbstractC3018b abstractC3018b, int i8, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33607m = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33607m) {
            case 0:
                return new C3112u(this, interfaceC3096q2, 2);
            case 1:
                return new X(this, interfaceC3096q2, 2);
            case 2:
                return interfaceC3096q2;
            case 3:
                return new X(this, interfaceC3096q2, 5);
            default:
                return new C3044g0(this, interfaceC3096q2, 2);
        }
    }
}
