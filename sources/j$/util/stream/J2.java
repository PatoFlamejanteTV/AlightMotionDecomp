package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class J2 extends AbstractC3024c0 {
    @Override // j$.util.stream.AbstractC3018b
    public final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3037e3.SORTED.r(abstractC3018b.G())) {
            return abstractC3018b.y(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((H0) abstractC3018b.y(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C3050h1(iArr);
    }

    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        Objects.requireNonNull(interfaceC3096q2);
        return EnumC3037e3.SORTED.r(i8) ? interfaceC3096q2 : EnumC3037e3.SIZED.r(i8) ? new AbstractC3066k2(interfaceC3096q2) : new AbstractC3066k2(interfaceC3096q2);
    }
}
