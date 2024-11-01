package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class M1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33313h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f33314i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f33315j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Collector f33316k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(EnumC3042f3 enumC3042f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC3042f3);
        this.f33313h = binaryOperator;
        this.f33314i = biConsumer;
        this.f33315j = supplier;
        this.f33316k = collector;
    }

    @Override // j$.util.stream.AbstractC3134z0, j$.util.stream.K3
    public final int d() {
        if (this.f33316k.characteristics().contains(EnumC3053i.UNORDERED)) {
            return EnumC3037e3.f33487r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        return new N1(this.f33315j, this.f33314i, this.f33313h);
    }
}
