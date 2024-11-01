package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class W2 extends Y2 implements j$.util.c0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ X2 f33417g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(X2 x22, int i8, int i9, int i10, int i11) {
        super(x22, i8, i9, i10, i11);
        this.f33417g = x22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i8, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i8]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 b(Object obj, int i8, int i9) {
        return j$.util.u0.l((long[]) obj, i8, i9 + i8);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 c(int i8, int i9, int i10, int i11) {
        return new W2(this.f33417g, i8, i9, i10, i11);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.h(this, consumer);
    }
}
