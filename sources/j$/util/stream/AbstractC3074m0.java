package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m0 */
/* loaded from: classes2.dex */
abstract class AbstractC3074m0 extends AbstractC3018b implements InterfaceC3089p0 {
    public static /* bridge */ /* synthetic */ j$.util.c0 U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.c0 V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (!N3.f33328a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        N3.a(AbstractC3018b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 B(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3134z0.H(abstractC3018b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean D(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        LongConsumer c3034e0;
        boolean m8;
        j$.util.c0 V8 = V(spliterator);
        if (interfaceC3096q2 instanceof LongConsumer) {
            c3034e0 = (LongConsumer) interfaceC3096q2;
        } else {
            if (N3.f33328a) {
                N3.a(AbstractC3018b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3096q2);
            c3034e0 = new C3034e0(interfaceC3096q2);
        }
        do {
            m8 = interfaceC3096q2.m();
            if (m8) {
                break;
            }
        } while (V8.tryAdvance(c3034e0));
        return m8;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final EnumC3042f3 E() {
        return EnumC3042f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3134z0.V(j8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator Q(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8) {
        return new AbstractC3047g3(abstractC3018b, supplier, z8);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 a() {
        Objects.requireNonNull(null);
        return new C3129y(this, EnumC3037e3.f33489t, 5);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final G asDoubleStream() {
        return new A(this, EnumC3037e3.f33483n, 4);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.C average() {
        long j8 = ((long[]) collect(new C3039f0(2), new C3039f0(3), new C3039f0(4)))[0];
        return j8 > 0 ? j$.util.C.d(r0[1] / j8) : j$.util.C.a();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 b(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new C3059j0(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 0);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final Stream boxed() {
        return new C3117v(this, 0, new C3039f0(1), 2);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 c() {
        Objects.requireNonNull(null);
        return new C3129y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 3);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3107t c3107t = new C3107t(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c3107t);
        return z(new F1(EnumC3042f3.LONG_VALUE, (BinaryOperator) c3107t, (Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final long count() {
        return ((Long) z(new H1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 distinct() {
        return ((AbstractC3056i2) ((AbstractC3056i2) boxed()).distinct()).mapToLong(new C3083o(28));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.E findAny() {
        return (j$.util.E) z(K.f33299d);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.E findFirst() {
        return (j$.util.E) z(K.f33298c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final G h() {
        Objects.requireNonNull(null);
        return new A(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 5);
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final j$.util.Q iterator() {
        return j$.util.u0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final boolean j() {
        return ((Boolean) z(AbstractC3134z0.c0(EnumC3122w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3134z0.b0(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C3117v(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.E max() {
        return reduce(new C3039f0(5));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.E min() {
        return reduce(new C3083o(27));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final boolean n() {
        return ((Boolean) z(AbstractC3134z0.c0(EnumC3122w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C3059j0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z(new B1(EnumC3042f3.LONG_VALUE, longBinaryOperator, j8))).longValue();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.E) z(new D1(EnumC3042f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final boolean s() {
        return ((Boolean) z(AbstractC3134z0.c0(EnumC3122w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3134z0.b0(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 sorted() {
        return new AbstractC3069l0(this, EnumC3037e3.f33486q | EnumC3037e3.f33484o, 0);
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final j$.util.c0 spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final long sum() {
        return reduce(0L, new C3039f0(6));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new C3068l(23), new C3083o(26), new C3083o(29));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C3125x(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 4);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final long[] toArray() {
        return (long[]) AbstractC3134z0.Q((J0) A(new C3039f0(0))).d();
    }
}
