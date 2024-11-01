package y2;

import U5.g;
import z5.h;

/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4241e implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4240d f41153a;

    public C4241e(C4240d c4240d) {
        this.f41153a = c4240d;
    }

    public static C4241e a(C4240d c4240d) {
        return new C4241e(c4240d);
    }

    public static g c(C4240d c4240d) {
        return (g) h.d(c4240d.a());
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f41153a);
    }
}
