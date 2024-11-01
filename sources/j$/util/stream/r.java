package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class r extends AbstractC3051h2 {
    static P0 U(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        C3068l c3068l = new C3068l(28);
        C3068l c3068l2 = new C3068l(29);
        C3083o c3083o = new C3083o(0);
        Objects.requireNonNull(c3068l);
        Objects.requireNonNull(c3068l2);
        Objects.requireNonNull(c3083o);
        return new P0((Collection) new F1(EnumC3042f3.REFERENCE, c3083o, c3068l2, c3068l, 3).c(abstractC3018b, spliterator));
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3037e3.DISTINCT.r(abstractC3018b.G())) {
            return abstractC3018b.y(spliterator, false, intFunction);
        }
        if (EnumC3037e3.ORDERED.r(abstractC3018b.G())) {
            return U(abstractC3018b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C3073m c3073m = new C3073m(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c3073m);
        new S(c3073m, false).e(abstractC3018b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new P0(keySet);
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return EnumC3037e3.DISTINCT.r(abstractC3018b.G()) ? abstractC3018b.T(spliterator) : EnumC3037e3.ORDERED.r(abstractC3018b.G()) ? U(abstractC3018b, spliterator).spliterator() : new C3082n3(abstractC3018b.T(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        Objects.requireNonNull(interfaceC3096q2);
        return EnumC3037e3.DISTINCT.r(i8) ? interfaceC3096q2 : EnumC3037e3.SORTED.r(i8) ? new C3088p(interfaceC3096q2) : new C3093q(interfaceC3096q2);
    }
}
