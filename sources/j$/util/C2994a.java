package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f33073a;

    /* renamed from: b, reason: collision with root package name */
    private int f33074b;

    /* renamed from: c, reason: collision with root package name */
    private int f33075c;

    private C2994a(C2994a c2994a, int i8, int i9) {
        this.f33073a = c2994a.f33073a;
        this.f33074b = i8;
        this.f33075c = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2994a(java.util.List list) {
        this.f33073a = list;
        this.f33074b = 0;
        this.f33075c = -1;
    }

    private int a() {
        int i8 = this.f33075c;
        if (i8 >= 0) {
            return i8;
        }
        int size = this.f33073a.size();
        this.f33075c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f33074b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a9 = a();
        this.f33074b = a9;
        for (int i8 = this.f33074b; i8 < a9; i8++) {
            try {
                consumer.accept(this.f33073a.get(i8));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
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
        int a9 = a();
        int i8 = this.f33074b;
        if (i8 >= a9) {
            return false;
        }
        this.f33074b = i8 + 1;
        try {
            consumer.accept(this.f33073a.get(i8));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a9 = a();
        int i8 = this.f33074b;
        int i9 = (a9 + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33074b = i9;
        return new C2994a(this, i8, i9);
    }
}
