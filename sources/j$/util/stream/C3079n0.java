package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3079n0 implements InterfaceC3089p0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f33545a;

    private /* synthetic */ C3079n0(LongStream longStream) {
        this.f33545a = longStream;
    }

    public static /* synthetic */ InterfaceC3089p0 w(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C3084o0 ? ((C3084o0) longStream).f33551a : new C3079n0(longStream);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 a() {
        return w(this.f33545a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ G asDoubleStream() {
        return E.w(this.f33545a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.C average() {
        return AbstractC2998d.j(this.f33545a.average());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final InterfaceC3089p0 b(C3013a c3013a) {
        LongStream longStream = this.f33545a;
        C3013a c3013a2 = new C3013a(10);
        c3013a2.f33434b = c3013a;
        return w(longStream.flatMap(c3013a2));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ Stream boxed() {
        return C3022b3.w(this.f33545a.boxed());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 c() {
        return w(this.f33545a.map(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33545a.close();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f33545a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ long count() {
        return this.f33545a.count();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 distinct() {
        return w(this.f33545a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f33545a;
        if (obj instanceof C3079n0) {
            obj = ((C3079n0) obj).f33545a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.E findAny() {
        return AbstractC2998d.l(this.f33545a.findAny());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.E findFirst() {
        return AbstractC2998d.l(this.f33545a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f33545a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f33545a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ G h() {
        return E.w(this.f33545a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f33545a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ boolean isParallel() {
        return this.f33545a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3089p0, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ j$.util.Q iterator() {
        return j$.util.O.a(this.f33545a.iterator());
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33545a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ boolean j() {
        return this.f33545a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 limit(long j8) {
        return w(this.f33545a.limit(j8));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C3022b3.w(this.f33545a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.E max() {
        return AbstractC2998d.l(this.f33545a.max());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.E min() {
        return AbstractC2998d.l(this.f33545a.min());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ boolean n() {
        return this.f33545a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h onClose(Runnable runnable) {
        return C3038f.w(this.f33545a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h parallel() {
        return C3038f.w(this.f33545a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3089p0, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3089p0 parallel() {
        return w(this.f33545a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 peek(LongConsumer longConsumer) {
        return w(this.f33545a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        return this.f33545a.reduce(j8, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC2998d.l(this.f33545a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ boolean s() {
        return this.f33545a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h sequential() {
        return C3038f.w(this.f33545a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3089p0, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3089p0 sequential() {
        return w(this.f33545a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 skip(long j8) {
        return w(this.f33545a.skip(j8));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ InterfaceC3089p0 sorted() {
        return w(this.f33545a.sorted());
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33545a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC3089p0, j$.util.stream.InterfaceC3048h
    public final /* synthetic */ j$.util.c0 spliterator() {
        return j$.util.a0.a(this.f33545a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ long sum() {
        return this.f33545a.sum();
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final j$.util.A summaryStatistics() {
        this.f33545a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.f33545a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC3089p0
    public final /* synthetic */ long[] toArray() {
        return this.f33545a.toArray();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h unordered() {
        return C3038f.w(this.f33545a.unordered());
    }
}
