package j$.util.stream;

import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class L2 extends AbstractC3051h2 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f33308m;

    /* renamed from: n, reason: collision with root package name */
    private final Comparator f33309n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3018b abstractC3018b) {
        super(abstractC3018b, EnumC3037e3.f33486q | EnumC3037e3.f33484o, 0);
        this.f33308m = true;
        this.f33309n = Comparator$CC.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3018b abstractC3018b, Comparator comparator) {
        super(abstractC3018b, EnumC3037e3.f33486q | EnumC3037e3.f33485p, 0);
        this.f33308m = false;
        this.f33309n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC3018b
    public final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3037e3.SORTED.r(abstractC3018b.G()) && this.f33308m) {
            return abstractC3018b.y(spliterator, false, intFunction);
        }
        Object[] n8 = abstractC3018b.y(spliterator, true, intFunction).n(intFunction);
        Arrays.sort(n8, this.f33309n);
        return new O0(n8);
    }

    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        Objects.requireNonNull(interfaceC3096q2);
        if (EnumC3037e3.SORTED.r(i8) && this.f33308m) {
            return interfaceC3096q2;
        }
        boolean r8 = EnumC3037e3.SIZED.r(i8);
        Comparator comparator = this.f33309n;
        return r8 ? new E2(interfaceC3096q2, comparator) : new E2(interfaceC3096q2, comparator);
    }
}
