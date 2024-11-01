package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y extends AbstractC3024c0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33420m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33421n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC3018b abstractC3018b, int i8, Object obj, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33420m = i9;
        this.f33421n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC3018b abstractC3018b, IntConsumer intConsumer) {
        super(abstractC3018b, 0, 1);
        this.f33420m = 0;
        this.f33421n = intConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33420m) {
            case 0:
                return new X(this, interfaceC3096q2, 1);
            case 1:
                return new C3014a0(this, interfaceC3096q2);
            case 2:
                return new C3093q(this, interfaceC3096q2, 4);
            default:
                return new C3031d2(this, interfaceC3096q2);
        }
    }
}
