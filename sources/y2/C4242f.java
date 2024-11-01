package y2;

import U5.g;
import z5.h;

/* renamed from: y2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4242f implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4240d f41154a;

    public C4242f(C4240d c4240d) {
        this.f41154a = c4240d;
    }

    public static C4242f a(C4240d c4240d) {
        return new C4242f(c4240d);
    }

    public static g c(C4240d c4240d) {
        return (g) h.d(c4240d.b());
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f41154a);
    }
}
