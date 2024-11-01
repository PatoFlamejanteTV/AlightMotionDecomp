package G2;

import B2.C0953e;
import B2.InterfaceC0951c;
import U5.g;
import z5.e;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f2823a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f2824b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f2825c;

    public d(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f2823a = aVar;
        this.f2824b = aVar2;
        this.f2825c = aVar3;
    }

    public static d a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new d(aVar, aVar2, aVar3);
    }

    public static c c(InterfaceC0951c interfaceC0951c, C0953e c0953e, g gVar) {
        return new c(interfaceC0951c, c0953e, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((InterfaceC0951c) this.f2823a.get(), (C0953e) this.f2824b.get(), (g) this.f2825c.get());
    }
}
