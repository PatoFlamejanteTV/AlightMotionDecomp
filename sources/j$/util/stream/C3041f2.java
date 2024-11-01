package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3041f2 extends AbstractC3051h2 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33499m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function f33500n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3041f2(AbstractC3018b abstractC3018b, int i8, Function function, int i9) {
        super(abstractC3018b, i8, 1);
        this.f33499m = i9;
        this.f33500n = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        switch (this.f33499m) {
            case 0:
                return new C3093q(this, interfaceC3096q2, 3);
            default:
                return new C3088p(this, interfaceC3096q2);
        }
    }
}
