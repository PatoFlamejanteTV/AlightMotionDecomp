package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121w extends C {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33599m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f33600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3121w(AbstractC3018b abstractC3018b, int i8, Object obj, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33599m = i9;
        this.f33600n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3121w(AbstractC3018b abstractC3018b, DoubleConsumer doubleConsumer) {
        super(abstractC3018b, 0, 1);
        this.f33599m = 2;
        this.f33600n = doubleConsumer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33599m) {
            case 0:
                return new C3112u(this, interfaceC3096q2, 1);
            case 1:
                return new C3133z(this, interfaceC3096q2);
            case 2:
                return new C3112u(this, interfaceC3096q2, 5);
            case 3:
                return new C3093q(this, interfaceC3096q2, 6);
            default:
                return new C3031d2(this, interfaceC3096q2);
        }
    }
}
