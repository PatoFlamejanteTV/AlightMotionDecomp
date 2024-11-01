package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3064k0 extends AbstractC3074m0 {
    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3074m0, j$.util.stream.InterfaceC3089p0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC3074m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3074m0, j$.util.stream.InterfaceC3089p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC3074m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3089p0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3089p0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        return !H() ? this : new C3129y(this, EnumC3037e3.f33487r, 4);
    }
}
