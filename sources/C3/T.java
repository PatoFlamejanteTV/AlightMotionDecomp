package C3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class T implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f791a;

    public T(N5.a aVar) {
        this.f791a = aVar;
    }

    public static T a(N5.a aVar) {
        return new T(aVar);
    }

    public static n2.r c(Context context) {
        return (n2.r) z5.h.d(M.f780a.h(context));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n2.r get() {
        return c((Context) this.f791a.get());
    }
}
