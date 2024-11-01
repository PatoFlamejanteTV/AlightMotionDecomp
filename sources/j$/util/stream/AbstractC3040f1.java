package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3040f1 implements L0 {
    @Override // j$.util.stream.L0
    public L0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.L0
    public /* synthetic */ L0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.L0
    public final Object[] n(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    public final void q(int i8, Object obj) {
    }
}
