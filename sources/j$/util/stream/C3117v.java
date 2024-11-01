package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3117v extends AbstractC3051h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33591m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33592n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3117v(AbstractC3018b abstractC3018b, int i8, Object obj, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33591m = i9;
        this.f33592n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117v(AbstractC3018b abstractC3018b, Consumer consumer) {
        super(abstractC3018b, 0, 1);
        this.f33591m = 3;
        this.f33592n = consumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33591m) {
            case 0:
                return new C3112u(this, interfaceC3096q2, 0);
            case 1:
                return new X(this, interfaceC3096q2, 0);
            case 2:
                return new C3044g0(this, interfaceC3096q2, 0);
            case 3:
                return new C3093q(this, interfaceC3096q2, 1);
            default:
                return new C3093q(this, interfaceC3096q2, 2);
        }
    }
}
