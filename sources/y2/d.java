package Y2;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f11830a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f11831b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f11832c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f11833d;

    public d(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f11830a = aVar;
        this.f11831b = aVar2;
        this.f11832c = aVar3;
        this.f11833d = aVar4;
    }

    public static d a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(k kVar, P2.d dVar, Q2.b bVar, R2.e eVar, v2.d dVar2) {
        return new c(kVar, dVar, bVar, eVar, dVar2);
    }

    public c b(k kVar) {
        return c(kVar, (P2.d) this.f11830a.get(), (Q2.b) this.f11831b.get(), (R2.e) this.f11832c.get(), (v2.d) this.f11833d.get());
    }
}
