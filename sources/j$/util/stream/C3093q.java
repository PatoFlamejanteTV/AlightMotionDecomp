package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3093q extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33562b;

    /* renamed from: c, reason: collision with root package name */
    Object f33563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3093q(AbstractC3018b abstractC3018b, InterfaceC3096q2 interfaceC3096q2, int i8) {
        super(interfaceC3096q2);
        this.f33562b = i8;
        this.f33563c = abstractC3018b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3093q(InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33562b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f33562b) {
            case 0:
                if (((HashSet) this.f33563c).contains(obj)) {
                    return;
                }
                ((HashSet) this.f33563c).add(obj);
                this.f33538a.accept((InterfaceC3096q2) obj);
                return;
            case 1:
                ((Consumer) ((C3117v) this.f33563c).f33592n).accept(obj);
                this.f33538a.accept((InterfaceC3096q2) obj);
                return;
            case 2:
                if (((Predicate) ((C3117v) this.f33563c).f33592n).test(obj)) {
                    this.f33538a.accept((InterfaceC3096q2) obj);
                    return;
                }
                return;
            case 3:
                this.f33538a.accept((InterfaceC3096q2) ((C3041f2) this.f33563c).f33500n.apply(obj));
                return;
            case 4:
                this.f33538a.accept(((ToIntFunction) ((Y) this.f33563c).f33421n).applyAsInt(obj));
                return;
            case 5:
                this.f33538a.accept(((ToLongFunction) ((C3059j0) this.f33563c).f33525n).applyAsLong(obj));
                return;
            default:
                this.f33538a.accept(((ToDoubleFunction) ((C3121w) this.f33563c).f33600n).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public void j() {
        switch (this.f33562b) {
            case 0:
                this.f33563c = null;
                this.f33538a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        switch (this.f33562b) {
            case 0:
                this.f33563c = new HashSet();
                this.f33538a.k(-1L);
                return;
            case 1:
            default:
                super.k(j8);
                return;
            case 2:
                this.f33538a.k(-1L);
                return;
        }
    }
}
