package B2;

/* loaded from: classes4.dex */
public final class n implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f486a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f487b;

    public n(N5.a aVar, N5.a aVar2) {
        this.f486a = aVar;
        this.f487b = aVar2;
    }

    public static n a(N5.a aVar, N5.a aVar2) {
        return new n(aVar, aVar2);
    }

    public static m c(v2.d dVar, U5.g gVar) {
        return new m(dVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((v2.d) this.f486a.get(), (U5.g) this.f487b.get());
    }
}
