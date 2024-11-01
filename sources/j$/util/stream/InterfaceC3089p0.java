package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3089p0 extends InterfaceC3048h {
    InterfaceC3089p0 a();

    G asDoubleStream();

    j$.util.C average();

    InterfaceC3089p0 b(C3013a c3013a);

    Stream boxed();

    InterfaceC3089p0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC3089p0 distinct();

    j$.util.E findAny();

    j$.util.E findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    G h();

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    j$.util.Q iterator();

    boolean j();

    InterfaceC3089p0 limit(long j8);

    Stream mapToObj(LongFunction longFunction);

    j$.util.E max();

    j$.util.E min();

    boolean n();

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    InterfaceC3089p0 parallel();

    InterfaceC3089p0 peek(LongConsumer longConsumer);

    long reduce(long j8, LongBinaryOperator longBinaryOperator);

    j$.util.E reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    InterfaceC3089p0 sequential();

    InterfaceC3089p0 skip(long j8);

    InterfaceC3089p0 sorted();

    @Override // j$.util.stream.InterfaceC3048h
    j$.util.c0 spliterator();

    long sum();

    j$.util.A summaryStatistics();

    IntStream t();

    long[] toArray();
}
