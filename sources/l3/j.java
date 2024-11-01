package L3;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class j implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f5395a;

    public j(N5.a aVar) {
        this.f5395a = aVar;
    }

    public static j a(N5.a aVar) {
        return new j(aVar);
    }

    public static Context c(Application application) {
        return (Context) z5.h.d(g.f5391a.c(application));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c((Application) this.f5395a.get());
    }
}
