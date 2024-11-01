package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3078n implements Collector {

    /* renamed from: a, reason: collision with root package name */
    private final Supplier f33540a;

    /* renamed from: b, reason: collision with root package name */
    private final BiConsumer f33541b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryOperator f33542c;

    /* renamed from: d, reason: collision with root package name */
    private final Function f33543d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f33544e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3078n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this(supplier, biConsumer, binaryOperator, new C3068l(2), Collectors.f33246a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3078n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f33540a = supplier;
        this.f33541b = biConsumer;
        this.f33542c = binaryOperator;
        this.f33543d = function;
        this.f33544e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f33541b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f33544e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f33542c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f33543d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f33540a;
    }
}
