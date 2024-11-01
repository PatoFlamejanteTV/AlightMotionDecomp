package Q2;

import p3.i;

/* loaded from: classes4.dex */
public final class c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f8405a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f8406b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f8407c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f8408d;

    public c(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f8405a = aVar;
        this.f8406b = aVar2;
        this.f8407c = aVar3;
        this.f8408d = aVar4;
    }

    public static c a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new c(aVar, aVar2, aVar3, aVar4);
    }

    public static b c(P2.d dVar, U2.c cVar, R2.e eVar, i iVar) {
        return new b(dVar, cVar, eVar, iVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((P2.d) this.f8405a.get(), (U2.c) this.f8406b.get(), (R2.e) this.f8407c.get(), (i) this.f8408d.get());
    }
}
