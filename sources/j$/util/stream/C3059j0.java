package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3059j0 extends AbstractC3069l0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33524m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3059j0(AbstractC3018b abstractC3018b, int i8, Object obj, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33524m = i9;
        this.f33525n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3059j0(AbstractC3018b abstractC3018b, LongConsumer longConsumer) {
        super(abstractC3018b, 0, 1);
        this.f33524m = 1;
        this.f33525n = longConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33524m) {
            case 0:
                return new C3054i0(this, interfaceC3096q2);
            case 1:
                return new C3044g0(this, interfaceC3096q2, 5);
            case 2:
                return new C3031d2(this, interfaceC3096q2);
            default:
                return new C3093q(this, interfaceC3096q2, 5);
        }
    }
}
