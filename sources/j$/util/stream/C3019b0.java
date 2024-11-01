package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3019b0 extends AbstractC3029d0 {
    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3029d0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            AbstractC3029d0.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3029d0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC3029d0.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        return !H() ? this : new C3125x(this, EnumC3037e3.f33487r, 2);
    }
}
