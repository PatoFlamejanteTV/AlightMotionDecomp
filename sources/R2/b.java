package R2;

import B2.InterfaceC0951c;
import U5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import p3.i;

/* loaded from: classes4.dex */
public final class b implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f9166a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f9167b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f9168c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f9169d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f9170e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f9171f;

    public b(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        this.f9166a = aVar;
        this.f9167b = aVar2;
        this.f9168c = aVar3;
        this.f9169d = aVar4;
        this.f9170e = aVar5;
        this.f9171f = aVar6;
    }

    public static b a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(InterfaceC0951c interfaceC0951c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i iVar, g gVar, v2.d dVar, E2.d dVar2) {
        return new a(interfaceC0951c, paymentAnalyticsRequestFactory, iVar, gVar, dVar, dVar2);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((InterfaceC0951c) this.f9166a.get(), (PaymentAnalyticsRequestFactory) this.f9167b.get(), (i) this.f9168c.get(), (g) this.f9169d.get(), (v2.d) this.f9170e.get(), (E2.d) this.f9171f.get());
    }
}
