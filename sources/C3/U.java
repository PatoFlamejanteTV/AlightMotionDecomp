package C3;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class U implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f792a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f793b;

    public U(N5.a aVar, N5.a aVar2) {
        this.f792a = aVar;
        this.f793b = aVar2;
    }

    public static U a(N5.a aVar, N5.a aVar2) {
        return new U(aVar, aVar2);
    }

    public static Function1 c(Context context, U5.g gVar) {
        return (Function1) z5.h.d(M.f780a.i(context, gVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c((Context) this.f792a.get(), (U5.g) this.f793b.get());
    }
}
