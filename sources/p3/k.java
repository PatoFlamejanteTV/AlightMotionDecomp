package p3;

import B2.C0953e;
import B2.InterfaceC0951c;

/* loaded from: classes4.dex */
public final class k implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36256a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f36257b;

    public k(N5.a aVar, N5.a aVar2) {
        this.f36256a = aVar;
        this.f36257b = aVar2;
    }

    public static k a(N5.a aVar, N5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j c(InterfaceC0951c interfaceC0951c, C0953e c0953e) {
        return new j(interfaceC0951c, c0953e);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((InterfaceC0951c) this.f36256a.get(), (C0953e) this.f36257b.get());
    }
}
