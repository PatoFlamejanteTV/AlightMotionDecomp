package C3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class W implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f795a;

    public W(N5.a aVar) {
        this.f795a = aVar;
    }

    public static W a(N5.a aVar) {
        return new W(aVar);
    }

    public static Function0 c(N5.a aVar) {
        return (Function0) z5.h.d(M.f780a.k(aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f795a);
    }
}
