package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q3 extends AbstractC3051h2 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Predicate f33355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(AbstractC3018b abstractC3018b, int i8, Predicate predicate) {
        super(abstractC3018b, i8, 0);
        this.f33355m = predicate;
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        return (L0) new R3(this, abstractC3018b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return EnumC3037e3.ORDERED.r(abstractC3018b.G()) ? K(abstractC3018b, spliterator, new C3039f0(8)).spliterator() : new T3(abstractC3018b.T(spliterator), this.f33355m, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        return new P3(this, interfaceC3096q2, false);
    }
}
