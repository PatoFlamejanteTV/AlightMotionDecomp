package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3056i2 extends AbstractC3018b implements Stream {
    @Override // j$.util.stream.AbstractC3018b
    final L0 B(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3134z0.E(abstractC3018b, spliterator, z8, intFunction);
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean D(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        boolean m8;
        do {
            m8 = interfaceC3096q2.m();
            if (m8) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC3096q2));
        return m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final EnumC3042f3 E() {
        return EnumC3042f3.REFERENCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3134z0.D(j8, intFunction);
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator Q(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8) {
        return new AbstractC3047g3(abstractC3018b, supplier, z8);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3134z0.d0(EnumC3122w0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3134z0.d0(EnumC3122w0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream b(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new C3041f2(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object z8;
        if (isParallel() && collector.characteristics().contains(EnumC3053i.CONCURRENT) && (!H() || collector.characteristics().contains(EnumC3053i.UNORDERED))) {
            z8 = collector.supplier().get();
            forEach(new C3073m(4, collector.accumulator(), z8));
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            z8 = z(new M1(EnumC3042f3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(EnumC3053i.IDENTITY_FINISH) ? z8 : collector.finisher().apply(z8);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return z(new F1(EnumC3042f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) z(new H1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC3051h2(this, EnumC3037e3.f33482m | EnumC3037e3.f33489t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i8 = U3.f33409a;
        Objects.requireNonNull(predicate);
        return new Q3(this, U3.f33410b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C3117v(this, EnumC3037e3.f33489t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findAny() {
        return (j$.util.B) z(L.f33304d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findFirst() {
        return (j$.util.B) z(L.f33303c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, true));
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final Iterator iterator() {
        return j$.util.u0.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC3089p0 k(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new C3059j0(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3134z0.e0(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C3041f2(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final G mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C3121w(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new Y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC3089p0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C3059j0(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC3134z0.d0(EnumC3122w0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final IntStream p(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new Y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C3117v(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.B) z(new D1(EnumC3042f3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC3042f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC3042f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3134z0.e0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i8 = U3.f33409a;
        Objects.requireNonNull(predicate);
        return new O3(this, U3.f33409a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C3039f0(9));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC3134z0.N(A(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final G v(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new C3121w(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 4);
    }
}
