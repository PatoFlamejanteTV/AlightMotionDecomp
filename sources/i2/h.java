package I2;

import android.app.Application;

/* loaded from: classes4.dex */
public final class h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3339a;

    public h(N5.a aVar) {
        this.f3339a = aVar;
    }

    public static h a(N5.a aVar) {
        return new h(aVar);
    }

    public static n2.r c(Application application) {
        return (n2.r) z5.h.d(d.f3329a.e(application));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n2.r get() {
        return c((Application) this.f3339a.get());
    }
}
