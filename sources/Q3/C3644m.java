package q3;

import B2.InterfaceC0951c;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: q3.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3644m implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f36711a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f36712b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f36713c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f36714d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f36715e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f36716f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f36717g;

    /* renamed from: h, reason: collision with root package name */
    private final N5.a f36718h;

    public C3644m(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8) {
        this.f36711a = aVar;
        this.f36712b = aVar2;
        this.f36713c = aVar3;
        this.f36714d = aVar4;
        this.f36715e = aVar5;
        this.f36716f = aVar6;
        this.f36717g = aVar7;
        this.f36718h = aVar8;
    }

    public static C3644m a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8) {
        return new C3644m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static C3643l c(Function1 function1, Function1 function12, InterfaceC0951c interfaceC0951c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, U5.g gVar, Function0 function0, boolean z9) {
        return new C3643l(function1, function12, interfaceC0951c, paymentAnalyticsRequestFactory, z8, gVar, function0, z9);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3643l get() {
        return c((Function1) this.f36711a.get(), (Function1) this.f36712b.get(), (InterfaceC0951c) this.f36713c.get(), (PaymentAnalyticsRequestFactory) this.f36714d.get(), ((Boolean) this.f36715e.get()).booleanValue(), (U5.g) this.f36716f.get(), (Function0) this.f36717g.get(), ((Boolean) this.f36718h.get()).booleanValue());
    }
}
