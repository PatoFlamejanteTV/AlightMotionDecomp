package j$.util.stream;

import j$.util.AbstractC2998d;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class U2 extends Y2 implements j$.util.Z {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ V2 f33408g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(V2 v22, int i8, int i9, int i10, int i11) {
        super(v22, i8, i9, i10, i11);
        this.f33408g = v22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i8, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i8]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 b(Object obj, int i8, int i9) {
        return j$.util.u0.k((int[]) obj, i8, i9 + i8);
    }

    @Override // j$.util.stream.Y2
    final j$.util.f0 c(int i8, int i9, int i10, int i11) {
        return new U2(this.f33408g, i8, i9, i10, i11);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2998d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2998d.g(this, consumer);
    }
}
