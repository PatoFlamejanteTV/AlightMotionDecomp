package s3;

import android.content.Context;
import k3.C3235a;

/* loaded from: classes4.dex */
public final class t implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f39050a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f39051b;

    public t(s sVar, N5.a aVar) {
        this.f39050a = sVar;
        this.f39051b = aVar;
    }

    public static t a(s sVar, N5.a aVar) {
        return new t(sVar, aVar);
    }

    public static C3235a c(s sVar, Context context) {
        return (C3235a) z5.h.d(sVar.a(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3235a get() {
        return c(this.f39050a, (Context) this.f39051b.get());
    }
}
