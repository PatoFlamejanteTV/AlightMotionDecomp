package j$.util.concurrent;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f33116i;

    /* renamed from: j, reason: collision with root package name */
    long f33117j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i8, int i9, int i10, long j8, int i11) {
        super(lVarArr, i8, i9, i10);
        this.f33116i = i11;
        this.f33117j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f33116i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f33116i) {
            case 0:
                return this.f33117j;
            default:
                return this.f33117j;
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f33116i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a9 = a();
                    if (a9 == null) {
                        return;
                    } else {
                        consumer.accept(a9.f33122b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    l a10 = a();
                    if (a10 == null) {
                        return;
                    } else {
                        consumer.accept(a10.f33123c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f33116i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f33116i) {
            case 0:
                return AbstractC2998d.d(this);
            default:
                return AbstractC2998d.d(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        switch (this.f33116i) {
            case 0:
                return AbstractC2998d.e(this, i8);
            default:
                return AbstractC2998d.e(this, i8);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f33116i) {
            case 0:
                consumer.getClass();
                l a9 = a();
                if (a9 == null) {
                    return false;
                }
                consumer.accept(a9.f33122b);
                return true;
            default:
                consumer.getClass();
                l a10 = a();
                if (a10 == null) {
                    return false;
                }
                consumer.accept(a10.f33123c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f33116i) {
            case 0:
                int i8 = this.f33134f;
                int i9 = this.f33135g;
                int i10 = (i8 + i9) >>> 1;
                if (i10 <= i8) {
                    return null;
                }
                l[] lVarArr = this.f33129a;
                this.f33135g = i10;
                long j8 = this.f33117j >>> 1;
                this.f33117j = j8;
                return new j(lVarArr, this.f33136h, i10, i9, j8, 0);
            default:
                int i11 = this.f33134f;
                int i12 = this.f33135g;
                int i13 = (i11 + i12) >>> 1;
                if (i13 <= i11) {
                    return null;
                }
                l[] lVarArr2 = this.f33129a;
                this.f33135g = i13;
                long j9 = this.f33117j >>> 1;
                this.f33117j = j9;
                return new j(lVarArr2, this.f33136h, i13, i12, j9, 1);
        }
    }
}
