package j$.util.stream;

/* renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3100r2 extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    long f33572b;

    /* renamed from: c, reason: collision with root package name */
    long f33573c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3105s2 f33574d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3100r2(C3105s2 c3105s2, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33574d = c3105s2;
        this.f33572b = c3105s2.f33576m;
        long j8 = c3105s2.f33577n;
        this.f33573c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        long j8 = this.f33572b;
        if (j8 != 0) {
            this.f33572b = j8 - 1;
            return;
        }
        long j9 = this.f33573c;
        if (j9 > 0) {
            this.f33573c = j9 - 1;
            this.f33538a.o((InterfaceC3096q2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33538a.k(AbstractC3134z0.A(j8, this.f33574d.f33576m, this.f33573c));
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        return this.f33573c == 0 || this.f33538a.m();
    }
}
