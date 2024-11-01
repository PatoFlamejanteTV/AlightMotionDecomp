package j3;

import B2.InterfaceC0951c;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class k implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f33703a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f33704b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f33705c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f33706d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f33707e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f33708f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f33709g;

    public k(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        this.f33703a = aVar;
        this.f33704b = aVar2;
        this.f33705c = aVar3;
        this.f33706d = aVar4;
        this.f33707e = aVar5;
        this.f33708f = aVar6;
        this.f33709g = aVar7;
    }

    public static k a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static com.stripe.android.networking.a c(Context context, Function0 function0, U5.g gVar, Set set, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0951c interfaceC0951c, v2.d dVar) {
        return new com.stripe.android.networking.a(context, function0, gVar, set, paymentAnalyticsRequestFactory, interfaceC0951c, dVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.networking.a get() {
        return c((Context) this.f33703a.get(), (Function0) this.f33704b.get(), (U5.g) this.f33705c.get(), (Set) this.f33706d.get(), (PaymentAnalyticsRequestFactory) this.f33707e.get(), (InterfaceC0951c) this.f33708f.get(), (v2.d) this.f33709g.get());
    }
}
