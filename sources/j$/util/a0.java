package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements c0 {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f33076a;

    private /* synthetic */ a0(Spliterator.OfLong ofLong) {
        this.f33076a = ofLong;
    }

    public static /* synthetic */ c0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof b0 ? ((b0) ofLong).f33079a : new a0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33076a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f33076a;
        if (obj instanceof a0) {
            obj = ((a0) obj).f33076a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33076a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33076a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33076a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f33076a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33076a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33076a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f33076a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33076a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33076a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33076a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f33076a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f33076a.trySplit());
    }

    @Override // j$.util.c0, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ c0 trySplit() {
        return a(this.f33076a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f33076a.trySplit());
    }
}
