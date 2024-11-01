package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3111t3 extends AbstractC3047g3 implements j$.util.c0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, j$.util.stream.d, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC3047g3
    final void d() {
        ?? z22 = new Z2();
        this.f33512h = z22;
        Objects.requireNonNull(z22);
        this.f33509e = this.f33506b.S(new C3106s3(z22, 0));
        this.f33510f = new C3013a(5, this);
    }

    @Override // j$.util.stream.AbstractC3047g3
    final AbstractC3047g3 e(Spliterator spliterator) {
        return new AbstractC3047g3(this.f33506b, spliterator, this.f33505a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.c(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f33512h != null || this.f33513i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C3106s3 c3106s3 = new C3106s3(longConsumer, 1);
        this.f33506b.R(this.f33508d, c3106s3);
        this.f33513i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.h(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a9 = a();
        if (a9) {
            X2 x22 = (X2) this.f33512h;
            long j8 = this.f33511g;
            int t8 = x22.t(j8);
            longConsumer.accept((x22.f33460c == 0 && t8 == 0) ? ((long[]) x22.f33431e)[(int) j8] : ((long[][]) x22.f33432f)[t8][(int) (j8 - x22.f33461d[t8])]);
        }
        return a9;
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }
}
