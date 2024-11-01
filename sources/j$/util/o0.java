package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class o0 extends AbstractC2998d implements Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.b(this, consumer);
    }

    @Override // j$.util.Z
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2998d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.g(this, consumer);
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // j$.util.AbstractC2998d, j$.util.W, j$.util.f0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Z trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC2998d, j$.util.W, j$.util.f0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ f0 trySplit() {
        return null;
    }
}
