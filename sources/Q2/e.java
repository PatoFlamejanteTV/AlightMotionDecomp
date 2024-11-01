package Q2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f8413a;

    public e(N5.a aVar) {
        this.f8413a = aVar;
    }

    public static e a(N5.a aVar) {
        return new e(aVar);
    }

    public static d c(Context context) {
        return new d(context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((Context) this.f8413a.get());
    }
}
