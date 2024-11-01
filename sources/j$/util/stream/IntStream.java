package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.C3142y;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public interface IntStream extends InterfaceC3048h {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f33290a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f33290a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.f33290a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G asDoubleStream() {
            return E.w(this.f33290a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC3089p0 asLongStream() {
            return C3079n0.w(this.f33290a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C average() {
            return AbstractC2998d.j(this.f33290a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C3022b3.w(this.f33290a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.f33290a.map(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f33290a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f33290a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f33290a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G d() {
            return E.w(this.f33290a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f33290a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean e() {
            return this.f33290a.noneMatch(null);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f33290a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f33290a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D findAny() {
            return AbstractC2998d.k(this.f33290a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D findFirst() {
            return AbstractC2998d.k(this.f33290a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f33290a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f33290a.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.f33290a.hashCode();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC3089p0 i() {
            return C3079n0.w(this.f33290a.mapToLong(null));
        }

        @Override // j$.util.stream.InterfaceC3048h
        public final /* synthetic */ boolean isParallel() {
            return this.f33290a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ j$.util.M iterator() {
            return j$.util.K.a(this.f33290a.iterator());
        }

        @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ Iterator iterator() {
            return this.f33290a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j8) {
            return convert(this.f33290a.limit(j8));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [j$.util.stream.R0, java.lang.Object, java.util.function.IntFunction] */
        @Override // j$.util.stream.IntStream
        public final IntStream m(R0 r02) {
            java.util.stream.IntStream intStream = this.f33290a;
            ?? obj = new Object();
            obj.f33356a = r02;
            return convert(intStream.flatMap(obj));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C3022b3.w(this.f33290a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D max() {
            return AbstractC2998d.k(this.f33290a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D min() {
            return AbstractC2998d.k(this.f33290a.min());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean o() {
            return this.f33290a.anyMatch(null);
        }

        @Override // j$.util.stream.InterfaceC3048h
        public final /* synthetic */ InterfaceC3048h onClose(Runnable runnable) {
            return C3038f.w(this.f33290a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f33290a.parallel());
        }

        @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ InterfaceC3048h parallel() {
            return C3038f.w(this.f33290a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f33290a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean r() {
            return this.f33290a.allMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i8, IntBinaryOperator intBinaryOperator) {
            return this.f33290a.reduce(i8, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC2998d.k(this.f33290a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f33290a.sequential());
        }

        @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
        public final /* synthetic */ InterfaceC3048h sequential() {
            return C3038f.w(this.f33290a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j8) {
            return convert(this.f33290a.skip(j8));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f33290a.sorted());
        }

        @Override // j$.util.stream.InterfaceC3048h
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.g0.a(this.f33290a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC3048h
        public final /* synthetic */ j$.util.Z spliterator() {
            return j$.util.X.a(this.f33290a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f33290a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C3142y summaryStatistics() {
            this.f33290a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f33290a.toArray();
        }

        @Override // j$.util.stream.InterfaceC3048h
        public final /* synthetic */ InterfaceC3048h unordered() {
            return C3038f.w(this.f33290a.unordered());
        }
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f33290a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.r();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.o();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return F.w(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C3084o0.w(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC2998d.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC2998d.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC2998d.o(IntStream.this.findFirst());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [j$.util.stream.R0, java.lang.Object] */
        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            ?? obj = new Object();
            obj.f33356a = intFunction;
            return convert(intStream.m(obj));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return j$.util.L.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j8) {
            return convert(IntStream.this.limit(j8));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.c());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return F.w(IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C3084o0.w(IntStream.this.i());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC2998d.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC2998d.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.e();
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C3043g.w(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C3043g.w(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i8, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i8, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC2998d.o(IntStream.this.reduce(intBinaryOperator));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C3043g.w(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j8) {
            return convert(IntStream.this.skip(j8));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.Y.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C3043g.w(IntStream.this.unordered());
        }
    }

    IntStream a();

    G asDoubleStream();

    InterfaceC3089p0 asLongStream();

    j$.util.C average();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    G d();

    IntStream distinct();

    boolean e();

    j$.util.D findAny();

    j$.util.D findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    InterfaceC3089p0 i();

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    j$.util.M iterator();

    IntStream limit(long j8);

    IntStream m(R0 r02);

    Stream mapToObj(IntFunction intFunction);

    j$.util.D max();

    j$.util.D min();

    boolean o();

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    boolean r();

    int reduce(int i8, IntBinaryOperator intBinaryOperator);

    j$.util.D reduce(IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    IntStream sequential();

    IntStream skip(long j8);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC3048h
    j$.util.Z spliterator();

    int sum();

    C3142y summaryStatistics();

    int[] toArray();
}
