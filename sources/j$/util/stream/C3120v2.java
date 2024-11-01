package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3120v2 extends AbstractC3071l2 {

    /* renamed from: b, reason: collision with root package name */
    long f33596b;

    /* renamed from: c, reason: collision with root package name */
    long f33597c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3124w2 f33598d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3120v2(C3124w2 c3124w2, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33598d = c3124w2;
        this.f33596b = c3124w2.f33605m;
        long j8 = c3124w2.f33606n;
        this.f33597c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long j9 = this.f33596b;
        if (j9 != 0) {
            this.f33596b = j9 - 1;
            return;
        }
        long j10 = this.f33597c;
        if (j10 > 0) {
            this.f33597c = j10 - 1;
            this.f33533a.accept(j8);
        }
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33533a.k(AbstractC3134z0.A(j8, this.f33598d.f33605m, this.f33597c));
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        return this.f33597c == 0 || this.f33533a.m();
    }
}
