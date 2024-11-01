package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC3021b2 implements InterfaceC3086o2 {
    @Override // j$.util.stream.AbstractC3021b2, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        this.f33451b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33451b += ((AbstractC3021b2) v12).f33451b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f33451b);
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }
}
