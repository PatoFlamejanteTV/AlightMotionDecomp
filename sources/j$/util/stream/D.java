package j$.util.stream;

import j$.util.C3141x;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class D extends AbstractC3018b implements G {
    public static /* bridge */ /* synthetic */ j$.util.W U(Spliterator spliterator) {
        return V(spliterator);
    }

    public static j$.util.W V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (!N3.f33328a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        N3.a(AbstractC3018b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC3018b
    final L0 B(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        return AbstractC3134z0.F(abstractC3018b, spliterator, z8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean D(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        DoubleConsumer c3102s;
        boolean m8;
        j$.util.W V8 = V(spliterator);
        if (interfaceC3096q2 instanceof DoubleConsumer) {
            c3102s = (DoubleConsumer) interfaceC3096q2;
        } else {
            if (N3.f33328a) {
                N3.a(AbstractC3018b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3096q2);
            c3102s = new C3102s(interfaceC3096q2);
        }
        do {
            m8 = interfaceC3096q2.m();
            if (m8) {
                break;
            }
        } while (V8.tryAdvance(c3102s));
        return m8;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final EnumC3042f3 E() {
        return EnumC3042f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC3018b
    public final D0 J(long j8, IntFunction intFunction) {
        return AbstractC3134z0.J(j8);
    }

    @Override // j$.util.stream.AbstractC3018b
    final Spliterator Q(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8) {
        return new AbstractC3047g3(abstractC3018b, supplier, z8);
    }

    @Override // j$.util.stream.G
    public final G a() {
        Objects.requireNonNull(null);
        return new A(this, EnumC3037e3.f33489t, 1);
    }

    @Override // j$.util.stream.G
    public final j$.util.C average() {
        double[] dArr = (double[]) collect(new C3083o(2), new C3068l(4), new C3068l(5));
        if (dArr[2] <= 0.0d) {
            return j$.util.C.a();
        }
        Set set = Collectors.f33246a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d8) && Double.isInfinite(d9)) {
            d8 = d9;
        }
        return j$.util.C.d(d8 / dArr[2]);
    }

    @Override // j$.util.stream.G
    public final G b(C3013a c3013a) {
        Objects.requireNonNull(c3013a);
        return new C3121w(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n | EnumC3037e3.f33489t, c3013a, 1);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return new C3117v(this, 0, new C3083o(5), 0);
    }

    @Override // j$.util.stream.G
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3107t c3107t = new C3107t(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c3107t);
        return z(new F1(EnumC3042f3.DOUBLE_VALUE, (BinaryOperator) c3107t, (Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((Long) z(new H1(1))).longValue();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((AbstractC3056i2) ((AbstractC3056i2) boxed()).distinct()).mapToDouble(new C3083o(6));
    }

    @Override // j$.util.stream.G
    public final boolean f() {
        return ((Boolean) z(AbstractC3134z0.Y(EnumC3122w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C findAny() {
        return (j$.util.C) z(I.f33285d);
    }

    @Override // j$.util.stream.G
    public final j$.util.C findFirst() {
        return (j$.util.C) z(I.f33284c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, true));
    }

    @Override // j$.util.stream.G
    public final InterfaceC3089p0 g() {
        Objects.requireNonNull(null);
        return new C3129y(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 0);
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final j$.util.I iterator() {
        return j$.util.u0.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final boolean l() {
        return ((Boolean) z(AbstractC3134z0.Y(EnumC3122w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final G limit(long j8) {
        if (j8 >= 0) {
            return AbstractC3134z0.X(this, 0L, j8);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new C3121w(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.G
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C3117v(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, doubleFunction, 0);
    }

    @Override // j$.util.stream.G
    public final j$.util.C max() {
        return reduce(new C3083o(8));
    }

    @Override // j$.util.stream.G
    public final j$.util.C min() {
        return reduce(new C3083o(1));
    }

    @Override // j$.util.stream.G
    public final G peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3121w(this, doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final IntStream q() {
        Objects.requireNonNull(null);
        return new C3125x(this, EnumC3037e3.f33485p | EnumC3037e3.f33483n, 0);
    }

    @Override // j$.util.stream.G
    public final double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z(new J1(EnumC3042f3.DOUBLE_VALUE, doubleBinaryOperator, d8))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C) z(new D1(EnumC3042f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.G
    public final G skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : AbstractC3134z0.X(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new C(this, EnumC3037e3.f33486q | EnumC3037e3.f33484o, 0);
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final j$.util.W spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) collect(new C3083o(9), new C3068l(6), new C3068l(3));
        Set set = Collectors.f33246a;
        double d8 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d8) && Double.isInfinite(d9)) ? d9 : d8;
    }

    @Override // j$.util.stream.G
    public final C3141x summaryStatistics() {
        return (C3141x) collect(new C3068l(19), new C3083o(3), new C3083o(4));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC3134z0.O((F0) A(new C3083o(7))).d();
    }

    @Override // j$.util.stream.G
    public final boolean u() {
        return ((Boolean) z(AbstractC3134z0.Y(EnumC3122w0.NONE))).booleanValue();
    }
}
