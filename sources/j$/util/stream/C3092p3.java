package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3092p3 extends AbstractC3047g3 implements j$.util.W {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.lang.Object, java.util.function.DoubleConsumer, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC3047g3
    final void d() {
        ?? z22 = new Z2();
        this.f33512h = z22;
        Objects.requireNonNull(z22);
        this.f33509e = this.f33506b.S(new C3087o3(z22, 0));
        this.f33510f = new C3013a(3, this);
    }

    @Override // j$.util.stream.AbstractC3047g3
    final AbstractC3047g3 e(Spliterator spliterator) {
        return new AbstractC3047g3(this.f33506b, spliterator, this.f33505a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.a(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f33512h != null || this.f33513i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C3087o3 c3087o3 = new C3087o3(doubleConsumer, 1);
        this.f33506b.R(this.f33508d, c3087o3);
        this.f33513i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a9 = a();
        if (a9) {
            T2 t22 = (T2) this.f33512h;
            long j8 = this.f33511g;
            int t8 = t22.t(j8);
            doubleConsumer.accept((t22.f33460c == 0 && t8 == 0) ? ((double[]) t22.f33431e)[(int) j8] : ((double[][]) t22.f33432f)[t8][(int) (j8 - t22.f33461d[t8])]);
        }
        return a9;
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }
}
