package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B extends D {
    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEach(doubleConsumer);
        } else {
            D.U(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
        } else {
            D.U(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        return !H() ? this : new A(this, EnumC3037e3.f33487r, 0);
    }
}
