package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class X1 extends AbstractC3021b2 implements InterfaceC3081n2 {
    @Override // j$.util.stream.AbstractC3021b2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        this.f33451b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33451b += ((AbstractC3021b2) v12).f33451b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33451b);
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
