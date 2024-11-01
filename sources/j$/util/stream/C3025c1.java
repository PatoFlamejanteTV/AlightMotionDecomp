package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3025c1 extends AbstractC3040f1 implements H0 {
    @Override // j$.util.stream.L0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Integer[] numArr, int i8) {
        AbstractC3134z0.o(this, numArr, i8);
    }

    @Override // j$.util.stream.AbstractC3040f1, j$.util.stream.L0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC3040f1, j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.K0
    public final Object d() {
        int[] iArr;
        iArr = AbstractC3134z0.f33631e;
        return iArr;
    }

    @Override // j$.util.stream.AbstractC3040f1, j$.util.stream.L0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.u(this, j8, j9);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3134z0.r(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return j$.util.u0.c();
    }

    @Override // j$.util.stream.L0
    public final j$.util.f0 spliterator() {
        return j$.util.u0.c();
    }
}
