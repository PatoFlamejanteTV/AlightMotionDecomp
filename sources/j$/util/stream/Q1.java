package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
final class Q1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f33351h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f33352i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(EnumC3042f3 enumC3042f3, IntBinaryOperator intBinaryOperator, int i8) {
        super(enumC3042f3);
        this.f33351h = intBinaryOperator;
        this.f33352i = i8;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        return new P1(this.f33352i, this.f33351h);
    }
}
