package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3113u0 extends AbstractC3118v0 implements InterfaceC3081n2 {
    @Override // j$.util.stream.AbstractC3118v0, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        if (this.f33593a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d8);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
