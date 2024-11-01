package O2;

import com.stripe.android.googlepaylauncher.j;
import r0.C3875m;

/* loaded from: classes4.dex */
public final class k implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f7140a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f7141b;

    public k(N5.a aVar, N5.a aVar2) {
        this.f7140a = aVar;
        this.f7141b = aVar2;
    }

    public static k a(N5.a aVar, N5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static C3875m c(j.d dVar, N2.g gVar) {
        return (C3875m) z5.h.d(j.f7139a.a(dVar, gVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3875m get() {
        return c((j.d) this.f7140a.get(), (N2.g) this.f7141b.get());
    }
}
