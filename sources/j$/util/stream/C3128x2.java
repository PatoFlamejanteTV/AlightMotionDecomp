package j$.util.stream;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3128x2 extends AbstractC3061j2 {

    /* renamed from: b, reason: collision with root package name */
    long f33617b;

    /* renamed from: c, reason: collision with root package name */
    long f33618c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3132y2 f33619d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3128x2(C3132y2 c3132y2, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33619d = c3132y2;
        this.f33617b = c3132y2.f33622m;
        long j8 = c3132y2.f33623n;
        this.f33618c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3081n2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        long j8 = this.f33617b;
        if (j8 != 0) {
            this.f33617b = j8 - 1;
            return;
        }
        long j9 = this.f33618c;
        if (j9 > 0) {
            this.f33618c = j9 - 1;
            this.f33526a.accept(d8);
        }
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33526a.k(AbstractC3134z0.A(j8, this.f33619d.f33622m, this.f33618c));
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        return this.f33618c == 0 || this.f33526a.m();
    }
}
