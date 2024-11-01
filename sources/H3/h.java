package H3;

import android.content.Context;
import n2.r;

/* loaded from: classes4.dex */
public final class h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final g f3209a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f3210b;

    public h(g gVar, N5.a aVar) {
        this.f3209a = gVar;
        this.f3210b = aVar;
    }

    public static h a(g gVar, N5.a aVar) {
        return new h(gVar, aVar);
    }

    public static r c(g gVar, Context context) {
        return (r) z5.h.d(gVar.a(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f3209a, (Context) this.f3210b.get());
    }
}
