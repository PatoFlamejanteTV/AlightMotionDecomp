package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class l0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f33199a;

    /* renamed from: b, reason: collision with root package name */
    private int f33200b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33201c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33202d;

    public l0(Object[] objArr, int i8, int i9, int i10) {
        this.f33199a = objArr;
        this.f33200b = i8;
        this.f33201c = i9;
        this.f33202d = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33202d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33201c - this.f33200b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i8;
        consumer.getClass();
        Object[] objArr = this.f33199a;
        int length = objArr.length;
        int i9 = this.f33201c;
        if (length < i9 || (i8 = this.f33200b) < 0) {
            return;
        }
        this.f33200b = i9;
        if (i8 >= i9) {
            return;
        }
        do {
            consumer.accept(objArr[i8]);
            i8++;
        } while (i8 < i9);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2998d.e(this, 4)) {
            return null;
        }
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
        int i8 = this.f33200b;
        if (i8 < 0 || i8 >= this.f33201c) {
            return false;
        }
        this.f33200b = i8 + 1;
        consumer.accept(this.f33199a[i8]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33200b;
        int i9 = (this.f33201c + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33200b = i9;
        return new l0(this.f33199a, i8, i9, this.f33202d);
    }
}
