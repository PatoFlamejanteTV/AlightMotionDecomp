package I2;

/* loaded from: classes4.dex */
public final class l implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3344a;

    public l(N5.a aVar) {
        this.f3344a = aVar;
    }

    public static l a(N5.a aVar) {
        return new l(aVar);
    }

    public static v2.d c(boolean z8) {
        return (v2.d) z5.h.d(d.f3329a.j(z8));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v2.d get() {
        return c(((Boolean) this.f3344a.get()).booleanValue());
    }
}
