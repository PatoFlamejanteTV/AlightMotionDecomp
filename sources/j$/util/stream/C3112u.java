package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3112u extends AbstractC3061j2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33586b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3018b f33587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3112u(AbstractC3018b abstractC3018b, InterfaceC3096q2 interfaceC3096q2, int i8) {
        super(interfaceC3096q2);
        this.f33586b = i8;
        this.f33587c = abstractC3018b;
    }

    @Override // j$.util.stream.InterfaceC3081n2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        switch (this.f33586b) {
            case 0:
                this.f33526a.accept((InterfaceC3096q2) ((DoubleFunction) ((C3117v) this.f33587c).f33592n).apply(d8));
                return;
            case 1:
                this.f33526a.accept(((DoubleUnaryOperator) ((C3121w) this.f33587c).f33600n).applyAsDouble(d8));
                return;
            case 2:
                ((C3125x) this.f33587c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d8);
                throw null;
            case 3:
                ((C3129y) this.f33587c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d8);
                throw null;
            case 4:
                ((A) this.f33587c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d8);
                throw null;
            default:
                ((DoubleConsumer) ((C3121w) this.f33587c).f33600n).accept(d8);
                this.f33526a.accept(d8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        switch (this.f33586b) {
            case 4:
                this.f33526a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
