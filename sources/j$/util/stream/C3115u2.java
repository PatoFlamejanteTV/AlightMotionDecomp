package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115u2 extends AbstractC3024c0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f33589m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f33590n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115u2(AbstractC3018b abstractC3018b, int i8, long j8, long j9) {
        super(abstractC3018b, i8, 0);
        this.f33589m = j8;
        this.f33590n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3018b
    final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC3018b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3134z0.G(abstractC3018b, AbstractC3134z0.C(abstractC3018b.F(), spliterator, this.f33589m, this.f33590n), true);
        }
        if (EnumC3037e3.ORDERED.r(abstractC3018b.G())) {
            return (L0) new A2(this, abstractC3018b, spliterator, intFunction, this.f33589m, this.f33590n).invoke();
        }
        j$.util.Z z8 = (j$.util.Z) abstractC3018b.T(spliterator);
        long j10 = this.f33589m;
        long j11 = this.f33590n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3134z0.G(this, new G3(z8, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3018b
    final Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC3018b.C(spliterator);
        long j10 = this.f33590n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Z z8 = (j$.util.Z) abstractC3018b.T(spliterator);
            long j11 = this.f33589m;
            return new x3(z8, j11, AbstractC3134z0.B(j11, j10));
        }
        if (EnumC3037e3.ORDERED.r(abstractC3018b.G())) {
            return ((L0) new A2(this, abstractC3018b, spliterator, new C3039f0(10), this.f33589m, this.f33590n).invoke()).spliterator();
        }
        j$.util.Z z9 = (j$.util.Z) abstractC3018b.T(spliterator);
        long j12 = this.f33589m;
        if (j12 <= C8) {
            long j13 = C8 - j12;
            if (j10 >= 0) {
                j13 = Math.min(j10, j13);
            }
            j8 = j13;
            j9 = 0;
        } else {
            j8 = j10;
            j9 = j12;
        }
        return new G3(z9, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        return new C3110t2(this, interfaceC3096q2);
    }
}
