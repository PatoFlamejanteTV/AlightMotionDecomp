package P2;

import S2.b;

/* loaded from: classes4.dex */
public final class l implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f8065a;

    public l(N5.a aVar) {
        this.f8065a = aVar;
    }

    public static l a(N5.a aVar) {
        return new l(aVar);
    }

    public static k c(b.a aVar) {
        return new k(aVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((b.a) this.f8065a.get());
    }
}
