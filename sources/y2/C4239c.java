package y2;

import z5.h;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4239c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4237a f41151a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f41152b;

    public C4239c(C4237a c4237a, N5.a aVar) {
        this.f41151a = c4237a;
        this.f41152b = aVar;
    }

    public static C4239c a(C4237a c4237a, N5.a aVar) {
        return new C4239c(c4237a, aVar);
    }

    public static v2.d c(C4237a c4237a, boolean z8) {
        return (v2.d) h.d(c4237a.b(z8));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v2.d get() {
        return c(this.f41151a, ((Boolean) this.f41152b.get()).booleanValue());
    }
}
