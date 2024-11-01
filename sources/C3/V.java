package C3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class V implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f794a;

    public V(N5.a aVar) {
        this.f794a = aVar;
    }

    public static V a(N5.a aVar) {
        return new V(aVar);
    }

    public static Function0 c(N5.a aVar) {
        return (Function0) z5.h.d(M.f780a.j(aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f794a);
    }
}
