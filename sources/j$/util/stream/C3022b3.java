package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3022b3 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f33452a;

    private /* synthetic */ C3022b3(java.util.stream.Stream stream) {
        this.f33452a = stream;
    }

    public static /* synthetic */ Stream w(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C3022b3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f33452a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f33452a.anyMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream b(C3013a c3013a) {
        return w(this.f33452a.flatMap(AbstractC3134z0.S(c3013a)));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33452a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f33452a.collect(C3063k.a(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f33452a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f33452a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return w(this.f33452a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return w(this.f33452a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f33452a;
        if (obj instanceof C3022b3) {
            obj = ((C3022b3) obj).f33452a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return w(this.f33452a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC2998d.i(this.f33452a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC2998d.i(this.f33452a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f33452a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f33452a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33452a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ boolean isParallel() {
        return this.f33452a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33452a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC3089p0 k(C3013a c3013a) {
        return C3079n0.w(this.f33452a.flatMapToLong(AbstractC3134z0.S(c3013a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j8) {
        return w(this.f33452a.limit(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return w(this.f33452a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G mapToDouble(ToDoubleFunction toDoubleFunction) {
        return E.w(this.f33452a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f33452a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC3089p0 mapToLong(ToLongFunction toLongFunction) {
        return C3079n0.w(this.f33452a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B max(Comparator comparator) {
        return AbstractC2998d.i(this.f33452a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B min(Comparator comparator) {
        return AbstractC2998d.i(this.f33452a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f33452a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h onClose(Runnable runnable) {
        return C3038f.w(this.f33452a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream p(C3013a c3013a) {
        return IntStream.VivifiedWrapper.convert(this.f33452a.flatMapToInt(AbstractC3134z0.S(c3013a)));
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h parallel() {
        return C3038f.w(this.f33452a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return w(this.f33452a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B reduce(BinaryOperator binaryOperator) {
        return AbstractC2998d.i(this.f33452a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f33452a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f33452a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h sequential() {
        return C3038f.w(this.f33452a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j8) {
        return w(this.f33452a.skip(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return w(this.f33452a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return w(this.f33452a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33452a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return w(this.f33452a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f33452a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f33452a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h unordered() {
        return C3038f.w(this.f33452a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G v(C3013a c3013a) {
        return E.w(this.f33452a.flatMapToDouble(AbstractC3134z0.S(c3013a)));
    }
}
