package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class X extends AbstractC3066k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33418b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3018b f33419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC3018b abstractC3018b, InterfaceC3096q2 interfaceC3096q2, int i8) {
        super(interfaceC3096q2);
        this.f33418b = i8;
        this.f33419c = abstractC3018b;
    }

    @Override // j$.util.stream.InterfaceC3086o2, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        switch (this.f33418b) {
            case 0:
                this.f33529a.accept((InterfaceC3096q2) ((IntFunction) ((C3117v) this.f33419c).f33592n).apply(i8));
                return;
            case 1:
                ((IntConsumer) ((Y) this.f33419c).f33421n).accept(i8);
                this.f33529a.accept(i8);
                return;
            case 2:
                ((C3125x) this.f33419c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i8);
                throw null;
            case 3:
                ((C3129y) this.f33419c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i8);
                throw null;
            case 4:
                ((A) this.f33419c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i8);
                throw null;
            default:
                ((C3125x) this.f33419c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i8);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        switch (this.f33418b) {
            case 5:
                this.f33529a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
