package r3;

import B2.B;
import B2.InterfaceC0951c;
import U5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j3.m;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3888b implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f37837a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f37838b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f37839c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f37840d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f37841e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f37842f;

    public C3888b(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        this.f37837a = aVar;
        this.f37838b = aVar2;
        this.f37839c = aVar3;
        this.f37840d = aVar4;
        this.f37841e = aVar5;
        this.f37842f = aVar6;
    }

    public static C3888b a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        return new C3888b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static C3887a c(m mVar, InterfaceC0951c interfaceC0951c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, B b9, v2.d dVar, g gVar) {
        return new C3887a(mVar, interfaceC0951c, paymentAnalyticsRequestFactory, b9, dVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3887a get() {
        return c((m) this.f37837a.get(), (InterfaceC0951c) this.f37838b.get(), (PaymentAnalyticsRequestFactory) this.f37839c.get(), (B) this.f37840d.get(), (v2.d) this.f37841e.get(), (g) this.f37842f.get());
    }
}
