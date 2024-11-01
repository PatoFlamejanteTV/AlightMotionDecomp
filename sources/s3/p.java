package s3;

import android.content.Context;
import k3.C3235a;

/* loaded from: classes4.dex */
public final class p implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f39046a;

    public p(N5.a aVar) {
        this.f39046a = aVar;
    }

    public static p a(N5.a aVar) {
        return new p(aVar);
    }

    public static C3235a c(Context context) {
        return (C3235a) z5.h.d(o.f39042a.a(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3235a get() {
        return c((Context) this.f39046a.get());
    }
}
