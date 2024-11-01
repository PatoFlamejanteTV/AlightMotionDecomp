package C3;

import B2.C0953e;
import android.content.Context;

/* loaded from: classes4.dex */
public final class N implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f785a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f786b;

    public N(N5.a aVar, N5.a aVar2) {
        this.f785a = aVar;
        this.f786b = aVar2;
    }

    public static N a(N5.a aVar, N5.a aVar2) {
        return new N(aVar, aVar2);
    }

    public static C0953e c(Context context, N5.a aVar) {
        return (C0953e) z5.h.d(M.f780a.b(context, aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0953e get() {
        return c((Context) this.f785a.get(), this.f786b);
    }
}
