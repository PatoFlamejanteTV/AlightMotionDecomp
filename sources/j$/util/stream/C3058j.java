package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3058j implements Collector {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Collector f33523a;

    private /* synthetic */ C3058j(java.util.stream.Collector collector) {
        this.f33523a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3063k ? ((C3063k) collector).f33528a : new C3058j(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f33523a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3134z0.R(this.f33523a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f33523a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.f33523a;
        if (obj instanceof C3058j) {
            obj = ((C3058j) obj).f33523a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f33523a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33523a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f33523a.supplier();
    }
}
