package q3;

import android.content.Context;

/* renamed from: q3.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3648q implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36726a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f36727b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f36728c;

    public C3648q(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f36726a = aVar;
        this.f36727b = aVar2;
        this.f36728c = aVar3;
    }

    public static C3648q a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new C3648q(aVar, aVar2, aVar3);
    }

    public static C3647p c(C3650s c3650s, C3635d c3635d, Context context) {
        return new C3647p(c3650s, c3635d, context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3647p get() {
        return c((C3650s) this.f36726a.get(), (C3635d) this.f36727b.get(), (Context) this.f36728c.get());
    }
}
