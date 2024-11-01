package r3;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import n2.p;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3889c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f37843a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f37844b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f37845c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f37846d;

    public C3889c(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f37843a = aVar;
        this.f37844b = aVar2;
        this.f37845c = aVar3;
        this.f37846d = aVar4;
    }

    public static C3889c a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new C3889c(aVar, aVar2, aVar3, aVar4);
    }

    public static com.stripe.android.payments.core.authentication.threeds2.b c(p pVar, boolean z8, Function0 function0, Set set) {
        return new com.stripe.android.payments.core.authentication.threeds2.b(pVar, z8, function0, set);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.core.authentication.threeds2.b get() {
        return c((p) this.f37843a.get(), ((Boolean) this.f37844b.get()).booleanValue(), (Function0) this.f37845c.get(), (Set) this.f37846d.get());
    }
}
