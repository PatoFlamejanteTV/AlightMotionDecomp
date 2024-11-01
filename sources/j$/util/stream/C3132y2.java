package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3132y2 extends C {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f33622m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f33623n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3132y2(AbstractC3018b abstractC3018b, int i8, long j8, long j9) {
        super(abstractC3018b, i8, 0);
        this.f33622m = j8;
        this.f33623n = j9;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3018b
    final L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        long j8;
        long j9;
        long C8 = abstractC3018b.C(spliterator);
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC3134z0.F(abstractC3018b, AbstractC3134z0.C(abstractC3018b.F(), spliterator, this.f33622m, this.f33623n), true);
        }
        if (EnumC3037e3.ORDERED.r(abstractC3018b.G())) {
            return (L0) new A2(this, abstractC3018b, spliterator, intFunction, this.f33622m, this.f33623n).invoke();
        }
        j$.util.W w8 = (j$.util.W) abstractC3018b.T(spliterator);
        long j10 = this.f33622m;
        long j11 = this.f33623n;
        if (j10 <= C8) {
            j8 = j11 >= 0 ? Math.min(j11, C8 - j10) : C8 - j10;
            j9 = 0;
        } else {
            j8 = j11;
            j9 = j10;
        }
        return AbstractC3134z0.F(this, new G3(w8, j9, j8), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.AbstractC3018b
    final Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        long j8;
        long j9;
        long C8 = abstractC3018b.C(spliterator);
        long j10 = this.f33623n;
        if (C8 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.W w8 = (j$.util.W) abstractC3018b.T(spliterator);
            long j11 = this.f33622m;
            return new x3(w8, j11, AbstractC3134z0.B(j11, j10));
        }
        if (EnumC3037e3.ORDERED.r(abstractC3018b.G())) {
            return ((L0) new A2(this, abstractC3018b, spliterator, new C3039f0(12), this.f33622m, this.f33623n).invoke()).spliterator();
        }
        j$.util.W w9 = (j$.util.W) abstractC3018b.T(spliterator);
        long j12 = this.f33622m;
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
        return new G3(w9, j9, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3018b
    public final InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2) {
        return new C3128x2(this, interfaceC3096q2);
    }
}
