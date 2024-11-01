package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements PrimitiveIterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f33063a;

    private /* synthetic */ L(M m8) {
        this.f33063a = m8;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(M m8) {
        if (m8 == null) {
            return null;
        }
        return m8 instanceof K ? ((K) m8).f33062a : new L(m8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        M m8 = this.f33063a;
        if (obj instanceof L) {
            obj = ((L) obj).f33063a;
        }
        return m8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f33063a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33063a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f33063a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f33063a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33063a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f33063a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f33063a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f33063a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f33063a.remove();
    }
}
