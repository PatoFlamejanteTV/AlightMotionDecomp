package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements PrimitiveIterator.OfLong {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f33066a;

    private /* synthetic */ P(Q q8) {
        this.f33066a = q8;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(Q q8) {
        if (q8 == null) {
            return null;
        }
        return q8 instanceof O ? ((O) q8).f33065a : new P(q8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Q q8 = this.f33066a;
        if (obj instanceof P) {
            obj = ((P) obj).f33066a;
        }
        return q8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f33066a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33066a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f33066a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f33066a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33066a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f33066a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f33066a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f33066a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f33066a.remove();
    }
}
