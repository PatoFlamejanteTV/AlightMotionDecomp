package E2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class g implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f1573a;

    public g(N5.a aVar) {
        this.f1573a = aVar;
    }

    public static g a(N5.a aVar) {
        return new g(aVar);
    }

    public static f c(Context context) {
        return new f(context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c((Context) this.f1573a.get());
    }
}
