package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class H implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final int f33276a;

    /* renamed from: b, reason: collision with root package name */
    final Object f33277b;

    /* renamed from: c, reason: collision with root package name */
    final Predicate f33278c;

    /* renamed from: d, reason: collision with root package name */
    final Supplier f33279d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(boolean z8, EnumC3042f3 enumC3042f3, Object obj, Predicate predicate, Supplier supplier) {
        this.f33276a = (z8 ? 0 : EnumC3037e3.f33487r) | EnumC3037e3.f33490u;
        this.f33277b = obj;
        this.f33278c = predicate;
        this.f33279d = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        L3 l32 = (L3) this.f33279d.get();
        abstractC3018b.R(spliterator, l32);
        Object obj = l32.get();
        return obj != null ? obj : this.f33277b;
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return new N(this, EnumC3037e3.ORDERED.r(abstractC3018b.G()), abstractC3018b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return this.f33276a;
    }
}
