package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3012s implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f33218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3012s(Spliterator spliterator) {
        this.f33218a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33218a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33218a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f33218a.forEachRemaining(new C3011q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33218a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f33218a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i8) {
        return this.f33218a.hasCharacteristics(i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f33218a.tryAdvance(new C3011q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f33218a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C3012s(trySplit);
    }
}
