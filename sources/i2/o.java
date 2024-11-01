package I2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class o implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f3347a;

    public o(N5.a aVar) {
        this.f3347a = aVar;
    }

    public static o a(N5.a aVar) {
        return new o(aVar);
    }

    public static Function0 c(N5.a aVar) {
        return (Function0) z5.h.d(d.f3329a.m(aVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return c(this.f3347a);
    }
}
