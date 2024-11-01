package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class A3 extends D3 implements j$.util.W, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    double f33235f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f33235f = d8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3((j$.util.W) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f33235f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.a(this, consumer);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC3067k3 g(int i8) {
        return new C3052h3(i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.f(this, consumer);
    }
}
