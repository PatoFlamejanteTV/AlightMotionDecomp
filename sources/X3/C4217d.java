package x3;

import B2.C0953e;
import B2.InterfaceC0951c;
import U5.g;
import z5.e;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4217d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f40966a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f40967b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f40968c;

    public C4217d(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f40966a = aVar;
        this.f40967b = aVar2;
        this.f40968c = aVar3;
    }

    public static C4217d a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new C4217d(aVar, aVar2, aVar3);
    }

    public static C4216c c(InterfaceC0951c interfaceC0951c, C0953e c0953e, g gVar) {
        return new C4216c(interfaceC0951c, c0953e, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4216c get() {
        return c((InterfaceC0951c) this.f40966a.get(), (C0953e) this.f40967b.get(), (g) this.f40968c.get());
    }
}
