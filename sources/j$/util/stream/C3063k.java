package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3063k implements java.util.stream.Collector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f33528a;

    private /* synthetic */ C3063k(Collector collector) {
        this.f33528a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3058j ? ((C3058j) collector).f33523a : new C3063k(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f33528a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3134z0.R(this.f33528a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f33528a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f33528a;
        if (obj instanceof C3063k) {
            obj = ((C3063k) obj).f33528a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f33528a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33528a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f33528a.supplier();
    }
}
