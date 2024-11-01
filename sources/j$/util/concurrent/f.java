package j$.util.concurrent;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f33112i;

    /* renamed from: j, reason: collision with root package name */
    long f33113j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i8, int i9, int i10, long j8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, i9, i10);
        this.f33112i = concurrentHashMap;
        this.f33113j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33113j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a9 = a();
            if (a9 == null) {
                return;
            } else {
                consumer.accept(new k(a9.f33122b, a9.f33123c, this.f33112i));
            }
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
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a9 = a();
        if (a9 == null) {
            return false;
        }
        consumer.accept(new k(a9.f33122b, a9.f33123c, this.f33112i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33134f;
        int i9 = this.f33135g;
        int i10 = (i8 + i9) >>> 1;
        if (i10 <= i8) {
            return null;
        }
        l[] lVarArr = this.f33129a;
        this.f33135g = i10;
        long j8 = this.f33113j >>> 1;
        this.f33113j = j8;
        return new f(lVarArr, this.f33136h, i10, i9, j8, this.f33112i);
    }
}
