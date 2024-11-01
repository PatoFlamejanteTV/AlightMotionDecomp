package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class O3 extends AbstractC3051h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f33337m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(AbstractC3018b abstractC3018b, int i8, Predicate predicate) {
        super(abstractC3018b, i8, 0);
        this.f33337m = predicate;
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        return (L0) new S3(this, abstractC3018b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return EnumC3037e3.ORDERED.r(abstractC3018b.G()) ? K(abstractC3018b, spliterator, new C3039f0(8)).spliterator() : new T3(abstractC3018b.T(spliterator), this.f33337m, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        return new C3088p(this, interfaceC3096q2);
    }
}
