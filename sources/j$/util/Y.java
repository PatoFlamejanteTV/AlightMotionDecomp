package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y implements Spliterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ Z f33072a;

    private /* synthetic */ Y(Z z8) {
        this.f33072a = z8;
    }

    public static /* synthetic */ Spliterator.OfInt a(Z z8) {
        if (z8 == null) {
            return null;
        }
        return z8 instanceof X ? ((X) z8).f33071a : new Y(z8);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33072a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Z z8 = this.f33072a;
        if (obj instanceof Y) {
            obj = ((Y) obj).f33072a;
        }
        return z8.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33072a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f33072a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33072a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f33072a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33072a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33072a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f33072a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33072a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f33072a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33072a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f33072a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return a(this.f33072a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return e0.a(this.f33072a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f33072a.trySplit());
    }
}
