package B2;

import B2.j;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class k implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f469a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f470b;

    public k(N5.a aVar, N5.a aVar2) {
        this.f469a = aVar;
        this.f470b = aVar2;
    }

    public static k a(N5.a aVar, N5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j.c c(Function0 function0, Function0 function02) {
        return new j.c(function0, function02);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.c get() {
        return c((Function0) this.f469a.get(), (Function0) this.f470b.get());
    }
}
