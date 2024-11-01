package j$.util.stream;

import j$.util.C3142y;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.d0 */
/* loaded from: classes2.dex */
abstract class AbstractC3029d0 extends AbstractC3018b implements IntStream {
    public static /* bridge */ /* synthetic */ j$.util.Z U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.Z V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Z) {
            return (j$.util.Z) spliterator;
        }
        if (!N3.f33328a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        N3.a(AbstractC3018b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 B(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3134z0.G(abstractC3018b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean D(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        IntConsumer w8;
        boolean m8;
        j$.util.Z V8 = V(spliterator);
        if (interfaceC3096q2 instanceof IntConsumer) {
            w8 = (IntConsumer) interfaceC3096q2;
        } else {
            if (N3.f33328a) {
                N3.a(AbstractC3018b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3096q2);
            w8 = new W(interfaceC3096q2);
        }
        do {
            m8 = interfaceC3096q2.m();
            if (m8) {
                break;
            }
        } while (V8.tryAdvance(w8));
        return m8;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final EnumC3042f3 E() {
        return EnumC3042f3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3134z0.T(j8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator Q(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8) {
        return new AbstractC3047g3(abstractC3018b, supplier, z8);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new C3125x(this, EnumC3037e3.f33489t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new A(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC3089p0 asLongStream() {
        return new C3129y(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C average() {
        long j8 = ((long[]) collect(new C3083o(23), new C3083o(24), new C3083o(25)))[0];
        return j8 > 0 ? j$.util.C.d(r0[1] / j8) : j$.util.C.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C3117v(this, 0, new C3083o(17), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new C3125x(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3107t c3107t = new C3107t(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c3107t);
        return z(new F1(EnumC3042f3.INT_VALUE, (BinaryOperator) c3107t, (Object) objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) z(new H1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final G d() {
        Objects.requireNonNull(null);
        return new A(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC3056i2) ((AbstractC3056i2) boxed()).distinct()).mapToInt(new C3083o(16));
    }

    @Override // j$.util.stream.IntStream
    public final boolean e() {
        return ((Boolean) z(AbstractC3134z0.a0(EnumC3122w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findAny() {
        return (j$.util.D) z(J.f33293d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findFirst() {
        return (j$.util.D) z(J.f33292c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC3089p0 i() {
        Objects.requireNonNull(null);
        return new C3129y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 2);
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final j$.util.M iterator() {
        return j$.util.u0.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3134z0.Z(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream m(R0 r02) {
        Objects.requireNonNull(r02);
        return new Y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, r02, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C3117v(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D max() {
        return reduce(new C3083o(22));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D min() {
        return reduce(new C3083o(18));
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((Boolean) z(AbstractC3134z0.a0(EnumC3122w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new Y(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) z(AbstractC3134z0.a0(EnumC3122w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i8, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) z(new Q1(EnumC3042f3.INT_VALUE, intBinaryOperator, i8))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.D) z(new D1(EnumC3042f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3134z0.Z(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new AbstractC3024c0(this, EnumC3037e3.f33486q | EnumC3037e3.f33484o, 0);
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final j$.util.Z spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C3083o(21));
    }

    @Override // j$.util.stream.IntStream
    public final C3142y summaryStatistics() {
        return (C3142y) collect(new C3068l(22), new C3083o(19), new C3083o(20));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC3134z0.P((H0) A(new C3083o(15))).d();
    }
}
