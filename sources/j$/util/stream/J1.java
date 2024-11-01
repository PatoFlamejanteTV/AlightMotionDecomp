package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
final class J1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f33294h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f33295i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(EnumC3042f3 enumC3042f3, DoubleBinaryOperator doubleBinaryOperator, double d8) {
        super(enumC3042f3);
        this.f33294h = doubleBinaryOperator;
        this.f33295i = d8;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        return new E1(this.f33295i, this.f33294h);
    }
}
