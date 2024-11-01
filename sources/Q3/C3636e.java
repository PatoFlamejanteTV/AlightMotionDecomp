package q3;

import kotlin.jvm.functions.Function1;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3636e implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36678a;

    public C3636e(N5.a aVar) {
        this.f36678a = aVar;
    }

    public static C3636e a(N5.a aVar) {
        return new C3636e(aVar);
    }

    public static C3635d c(Function1 function1) {
        return new C3635d(function1);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3635d get() {
        return c((Function1) this.f36678a.get());
    }
}
