package j$.util.concurrent;

import j$.util.AbstractC2998d;
import j$.util.W;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class y implements W {

    /* renamed from: a, reason: collision with root package name */
    long f33150a;

    /* renamed from: b, reason: collision with root package name */
    final long f33151b;

    /* renamed from: c, reason: collision with root package name */
    final double f33152c;

    /* renamed from: d, reason: collision with root package name */
    final double f33153d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j8, long j9, double d8, double d9) {
        this.f33150a = j8;
        this.f33151b = j9;
        this.f33152c = d8;
        this.f33153d = d9;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j8 = this.f33150a;
        long j9 = (this.f33151b + j8) >>> 1;
        if (j9 <= j8) {
            return null;
        }
        this.f33150a = j9;
        return new y(j8, j9, this.f33152c, this.f33153d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33151b - this.f33150a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.a(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f33150a;
        long j9 = this.f33151b;
        if (j8 < j9) {
            this.f33150a = j9;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.c(this.f33152c, this.f33153d));
                j8++;
            } while (j8 < j9);
        }
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
        return AbstractC2998d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j8 = this.f33150a;
        if (j8 >= this.f33151b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().c(this.f33152c, this.f33153d));
        this.f33150a = j8 + 1;
        return true;
    }
}
