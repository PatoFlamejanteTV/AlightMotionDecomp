package L3;

import android.content.Context;
import n2.r;

/* loaded from: classes4.dex */
public final class h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f5394a;

    public h(N5.a aVar) {
        this.f5394a = aVar;
    }

    public static h a(N5.a aVar) {
        return new h(aVar);
    }

    public static r c(Context context) {
        return (r) z5.h.d(g.f5391a.a(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f5394a.get());
    }
}
