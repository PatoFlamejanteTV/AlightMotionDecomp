package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3044g0 extends AbstractC3071l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33503b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3018b f33504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3044g0(AbstractC3018b abstractC3018b, InterfaceC3096q2 interfaceC3096q2, int i8) {
        super(interfaceC3096q2);
        this.f33503b = i8;
        this.f33504c = abstractC3018b;
    }

    @Override // j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        switch (this.f33503b) {
            case 0:
                this.f33533a.accept((InterfaceC3096q2) ((LongFunction) ((C3117v) this.f33504c).f33592n).apply(j8));
                return;
            case 1:
                ((C3129y) this.f33504c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j8);
                throw null;
            case 2:
                ((C3125x) this.f33504c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j8);
                throw null;
            case 3:
                ((A) this.f33504c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j8);
                throw null;
            case 4:
                ((C3129y) this.f33504c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j8);
                throw null;
            default:
                ((LongConsumer) ((C3059j0) this.f33504c).f33525n).accept(j8);
                this.f33533a.accept(j8);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        switch (this.f33503b) {
            case 4:
                this.f33533a.k(-1L);
                return;
            default:
                super.k(j8);
                return;
        }
    }
}
