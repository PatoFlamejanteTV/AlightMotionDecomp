package N2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class b implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f6433a;

    public b(N5.a aVar) {
        this.f6433a = aVar;
    }

    public static b a(N5.a aVar) {
        return new b(aVar);
    }

    public static a c(Context context) {
        return new a(context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Context) this.f6433a.get());
    }
}
