package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class S2 extends Y2 implements j$.util.W {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ T2 f33378g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i8, int i9, int i10, int i11) {
        super(t22, i8, i9, i10, i11);
        this.f33378g = t22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i8, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i8]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 b(Object obj, int i8, int i9) {
        return j$.util.u0.j((double[]) obj, i8, i9 + i8);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 c(int i8, int i9, int i10, int i11) {
        return new S2(this.f33378g, i8, i9, i10, i11);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.f(this, consumer);
    }
}
