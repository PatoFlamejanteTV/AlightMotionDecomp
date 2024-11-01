package q3;

import kotlin.jvm.functions.Function1;

/* renamed from: q3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3646o implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36722a;

    public C3646o(N5.a aVar) {
        this.f36722a = aVar;
    }

    public static C3646o a(N5.a aVar) {
        return new C3646o(aVar);
    }

    public static C3645n c(Function1 function1) {
        return new C3645n(function1);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3645n get() {
        return c((Function1) this.f36722a.get());
    }
}
