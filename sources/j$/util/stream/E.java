package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.C3141x;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f33251a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.f33251a = doubleStream;
    }

    public static /* synthetic */ G w(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).f33259a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G a() {
        return w(this.f33251a.filter(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C average() {
        return AbstractC2998d.j(this.f33251a.average());
    }

    @Override // j$.util.stream.G
    public final G b(C3013a c3013a) {
        DoubleStream doubleStream = this.f33251a;
        C3013a c3013a2 = new C3013a(8);
        c3013a2.f33434b = c3013a;
        return w(doubleStream.flatMap(c3013a2));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return C3022b3.w(this.f33251a.boxed());
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33251a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f33251a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.f33251a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return w(this.f33251a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f33251a;
        if (obj instanceof E) {
            obj = ((E) obj).f33251a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean f() {
        return this.f33251a.allMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC2998d.j(this.f33251a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC2998d.j(this.f33251a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f33251a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f33251a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC3089p0 g() {
        return C3079n0.w(this.f33251a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f33251a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ boolean isParallel() {
        return this.f33251a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.I iterator() {
        return j$.util.G.a(this.f33251a.iterator());
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33251a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean l() {
        return this.f33251a.anyMatch(null);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j8) {
        return w(this.f33251a.limit(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G map(DoubleUnaryOperator doubleUnaryOperator) {
        return w(this.f33251a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C3022b3.w(this.f33251a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C max() {
        return AbstractC2998d.j(this.f33251a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C min() {
        return AbstractC2998d.j(this.f33251a.min());
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h onClose(Runnable runnable) {
        return C3038f.w(this.f33251a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return w(this.f33251a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h parallel() {
        return C3038f.w(this.f33251a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G peek(DoubleConsumer doubleConsumer) {
        return w(this.f33251a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream q() {
        return IntStream.VivifiedWrapper.convert(this.f33251a.mapToInt(null));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double reduce(double d8, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f33251a.reduce(d8, doubleBinaryOperator);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC2998d.j(this.f33251a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return w(this.f33251a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h sequential() {
        return C3038f.w(this.f33251a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j8) {
        return w(this.f33251a.skip(j8));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return w(this.f33251a.sorted());
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33251a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.G, j$.util.stream.InterfaceC3048h
    public final /* synthetic */ j$.util.W spliterator() {
        return j$.util.U.a(this.f33251a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.f33251a.sum();
    }

    @Override // j$.util.stream.G
    public final C3141x summaryStatistics() {
        this.f33251a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.f33251a.toArray();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean u() {
        return this.f33251a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h unordered() {
        return C3038f.w(this.f33251a.unordered());
    }
}
