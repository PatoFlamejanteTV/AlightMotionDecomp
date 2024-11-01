package S2;

import U5.g;
import z5.h;

/* loaded from: classes4.dex */
public final class f implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f9404a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f9405b;

    public f(N5.a aVar, N5.a aVar2) {
        this.f9404a = aVar;
        this.f9405b = aVar2;
    }

    public static f a(N5.a aVar, N5.a aVar2) {
        return new f(aVar, aVar2);
    }

    public static T3.a c(v2.d dVar, g gVar) {
        return (T3.a) h.d(e.f9402a.a(dVar, gVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T3.a get() {
        return c((v2.d) this.f9404a.get(), (g) this.f9405b.get());
    }
}
