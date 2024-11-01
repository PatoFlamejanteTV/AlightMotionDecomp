package v3;

import com.stripe.android.paymentsheet.C2634a;
import kotlin.jvm.functions.Function0;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4123c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f40464a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f40465b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f40466c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f40467d;

    public C4123c(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f40464a = aVar;
        this.f40465b = aVar2;
        this.f40466c = aVar3;
        this.f40467d = aVar4;
    }

    public static C4123c a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new C4123c(aVar, aVar2, aVar3, aVar4);
    }

    public static C2634a c(j3.m mVar, boolean z8, Function0 function0, Function0 function02) {
        return new C2634a(mVar, z8, function0, function02);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2634a get() {
        return c((j3.m) this.f40464a.get(), ((Boolean) this.f40465b.get()).booleanValue(), (Function0) this.f40466c.get(), (Function0) this.f40467d.get());
    }
}
