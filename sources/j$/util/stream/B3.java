package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class B3 extends D3 implements j$.util.Z, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    int f33239f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f33239f = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3((j$.util.Z) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f33239f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.b(this, consumer);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC3067k3 g(int i8) {
        return new C3057i3(i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.g(this, consumer);
    }
}
