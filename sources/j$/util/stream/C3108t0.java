package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3108t0 extends AbstractC3118v0 implements InterfaceC3091p2 {
    @Override // j$.util.stream.AbstractC3118v0, j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        if (this.f33593a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j8);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3091p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3134z0.i(this, l8);
    }
}
