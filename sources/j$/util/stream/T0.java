package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T0 extends W0 implements F0 {
    @Override // j$.util.stream.L0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Double[] dArr, int i8) {
        AbstractC3134z0.n(this, dArr, i8);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i8) {
        return new double[i8];
    }

    @Override // j$.util.stream.L0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ F0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.t(this, j8, j9);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3134z0.q(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return new AbstractC3090p1(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.f0, j$.util.stream.p1] */
    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return new AbstractC3090p1(this);
    }
}
