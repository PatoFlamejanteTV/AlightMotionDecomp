package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3103s0 extends AbstractC3118v0 implements InterfaceC3086o2 {
    @Override // j$.util.stream.AbstractC3118v0, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        if (this.f33593a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i8);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }
}
