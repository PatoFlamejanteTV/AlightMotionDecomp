package I2;

import B2.C0953e;
import B2.InterfaceC0951c;

/* loaded from: classes4.dex */
public final class s implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3351a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f3352b;

    public s(N5.a aVar, N5.a aVar2) {
        this.f3351a = aVar;
        this.f3352b = aVar2;
    }

    public static s a(N5.a aVar, N5.a aVar2) {
        return new s(aVar, aVar2);
    }

    public static p3.i c(C0953e c0953e, InterfaceC0951c interfaceC0951c) {
        return (p3.i) z5.h.d(d.f3329a.q(c0953e, interfaceC0951c));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p3.i get() {
        return c((C0953e) this.f3351a.get(), (InterfaceC0951c) this.f3352b.get());
    }
}
