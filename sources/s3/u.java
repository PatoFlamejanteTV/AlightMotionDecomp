package s3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class u implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f39052a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f39053b;

    public u(s sVar, N5.a aVar) {
        this.f39052a = sVar;
        this.f39053b = aVar;
    }

    public static u a(s sVar, N5.a aVar) {
        return new u(sVar, aVar);
    }

    public static boolean c(s sVar, Context context) {
        return sVar.b(context);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f39052a, (Context) this.f39053b.get()));
    }
}
