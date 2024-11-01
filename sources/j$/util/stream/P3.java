package j$.util.stream;

/* loaded from: classes2.dex */
final class P3 extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    long f33345b;

    /* renamed from: c, reason: collision with root package name */
    boolean f33346c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f33347d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q3 f33348e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(Q3 q32, InterfaceC3096q2 interfaceC3096q2, boolean z8) {
        super(interfaceC3096q2);
        this.f33348e = q32;
        this.f33347d = z8;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8 = true;
        if (!this.f33346c) {
            boolean z9 = !this.f33348e.f33355m.test(obj);
            this.f33346c = z9;
            if (!z9) {
                z8 = false;
            }
        }
        boolean z10 = this.f33347d;
        if (z10 && !z8) {
            this.f33345b++;
        }
        if (z10 || z8) {
            this.f33538a.accept((InterfaceC3096q2) obj);
        }
    }
}
