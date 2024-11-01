package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3046g2 extends AbstractC3056i2 {
    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3056i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC3056i2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        return !H() ? this : new AbstractC3051h2(this, EnumC3037e3.f33487r, 1);
    }
}
