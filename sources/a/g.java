package A;

import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class g implements InterfaceC4139b {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f64a;

    public g(N5.a aVar) {
        this.f64a = aVar;
    }

    public static B.f a(E.a aVar) {
        return (B.f) w.d.d(f.a(aVar));
    }

    public static g b(N5.a aVar) {
        return new g(aVar);
    }

    @Override // N5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public B.f get() {
        return a((E.a) this.f64a.get());
    }
}
