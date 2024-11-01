package M3;

import j3.m;

/* loaded from: classes4.dex */
public final class h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f6164a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f6165b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f6166c;

    public h(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f6164a = aVar;
        this.f6165b = aVar2;
        this.f6166c = aVar3;
    }

    public static h a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static g c(m mVar, N5.a aVar, U5.g gVar) {
        return new g(mVar, aVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((m) this.f6164a.get(), this.f6165b, (U5.g) this.f6166c.get());
    }
}
