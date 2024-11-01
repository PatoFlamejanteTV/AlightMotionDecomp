package j$.util.stream;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3110t2 extends AbstractC3066k2 {

    /* renamed from: b, reason: collision with root package name */
    long f33583b;

    /* renamed from: c, reason: collision with root package name */
    long f33584c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3115u2 f33585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110t2(C3115u2 c3115u2, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33585d = c3115u2;
        this.f33583b = c3115u2.f33589m;
        long j8 = c3115u2.f33590n;
        this.f33584c = j8 < 0 ? Long.MAX_VALUE : j8;
    }

    @Override // j$.util.stream.InterfaceC3086o2, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        long j8 = this.f33583b;
        if (j8 != 0) {
            this.f33583b = j8 - 1;
            return;
        }
        long j9 = this.f33584c;
        if (j9 > 0) {
            this.f33584c = j9 - 1;
            this.f33529a.accept(i8);
        }
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33529a.k(AbstractC3134z0.A(j8, this.f33585d.f33589m, this.f33584c));
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        return this.f33584c == 0 || this.f33529a.m();
    }
}
