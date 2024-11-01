package H3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class i implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f3211a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f3212b;

    public i(g gVar, N5.a aVar) {
        this.f3211a = gVar;
        this.f3212b = aVar;
    }

    public static i a(g gVar, N5.a aVar) {
        return new i(gVar, aVar);
    }

    public static Context c(g gVar, Application application) {
        return (Context) z5.h.d(gVar.b(application));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f3211a, (Application) this.f3212b.get());
    }
}
