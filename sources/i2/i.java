package I2;

import B2.C0953e;
import android.app.Application;

/* loaded from: classes4.dex */
public final class i implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3340a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f3341b;

    public i(N5.a aVar, N5.a aVar2) {
        this.f3340a = aVar;
        this.f3341b = aVar2;
    }

    public static i a(N5.a aVar, N5.a aVar2) {
        return new i(aVar, aVar2);
    }

    public static C0953e c(Application application, N5.a aVar) {
        return (C0953e) z5.h.d(d.f3329a.g(application, aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0953e get() {
        return c((Application) this.f3340a.get(), this.f3341b);
    }
}
