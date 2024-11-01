package j$.util.stream;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3129y extends AbstractC3069l0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33620m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3129y(AbstractC3018b abstractC3018b, int i8, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33620m = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33620m) {
            case 0:
                return new C3112u(this, interfaceC3096q2, 3);
            case 1:
                return new Z(0, interfaceC3096q2);
            case 2:
                return new X(this, interfaceC3096q2, 3);
            case 3:
                return new C3044g0(this, interfaceC3096q2, 1);
            case 4:
                return interfaceC3096q2;
            default:
                return new C3044g0(this, interfaceC3096q2, 4);
        }
    }
}
