package I2;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class e implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3336a;

    public e(N5.a aVar) {
        this.f3336a = aVar;
    }

    public static Context a(Application application) {
        return (Context) z5.h.d(d.f3329a.b(application));
    }

    public static e b(N5.a aVar) {
        return new e(aVar);
    }

    @Override // N5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a((Application) this.f3336a.get());
    }
}
