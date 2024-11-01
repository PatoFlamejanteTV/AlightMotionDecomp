package n2;

import com.stripe.android.googlepaylauncher.j;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class n implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f35390a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f35391b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f35392c;

    public n(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f35390a = aVar;
        this.f35391b = aVar2;
        this.f35392c = aVar3;
    }

    public static n a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new n(aVar, aVar2, aVar3);
    }

    public static m c(Function0 function0, Function0 function02, j.d dVar) {
        return new m(function0, function02, dVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((Function0) this.f35390a.get(), (Function0) this.f35391b.get(), (j.d) this.f35392c.get());
    }
}
