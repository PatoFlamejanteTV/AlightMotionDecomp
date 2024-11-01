package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3101r3 extends AbstractC3047g3 implements j$.util.Z {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Z2, java.util.function.IntConsumer, java.lang.Object, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC3047g3
    final void d() {
        ?? z22 = new Z2();
        this.f33512h = z22;
        Objects.requireNonNull(z22);
        this.f33509e = this.f33506b.S(new C3097q3(z22, 0));
        this.f33510f = new C3013a(4, this);
    }

    @Override // j$.util.stream.AbstractC3047g3
    final AbstractC3047g3 e(Spliterator spliterator) {
        return new AbstractC3047g3(this.f33506b, spliterator, this.f33505a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.b(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f33512h != null || this.f33513i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C3097q3 c3097q3 = new C3097q3(intConsumer, 1);
        this.f33506b.R(this.f33508d, c3097q3);
        this.f33513i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a9 = a();
        if (a9) {
            V2 v22 = (V2) this.f33512h;
            long j8 = this.f33511g;
            int t8 = v22.t(j8);
            intConsumer.accept((v22.f33460c == 0 && t8 == 0) ? ((int[]) v22.f33431e)[(int) j8] : ((int[][]) v22.f33432f)[t8][(int) (j8 - v22.f33461d[t8])]);
        }
        return a9;
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC3047g3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }
}
