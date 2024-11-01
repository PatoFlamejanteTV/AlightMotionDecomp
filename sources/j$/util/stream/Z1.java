package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class Z1 extends AbstractC3021b2 implements InterfaceC3091p2 {
    @Override // j$.util.stream.AbstractC3021b2, j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33451b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33451b += ((AbstractC3021b2) v12).f33451b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33451b);
    }

    @Override // j$.util.stream.InterfaceC3091p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3134z0.i(this, l8);
    }
}
