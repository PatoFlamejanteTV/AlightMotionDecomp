package com.stripe.android.paymentsheet.analytics;

import B2.InterfaceC0951c;
import E2.d;
import U5.g;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import z5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f27054a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f27055b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f27056c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f27057d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f27058e;

    public b(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f27054a = aVar;
        this.f27055b = aVar2;
        this.f27056c = aVar3;
        this.f27057d = aVar4;
        this.f27058e = aVar5;
    }

    public static b a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static a c(EventReporter.Mode mode, InterfaceC0951c interfaceC0951c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d dVar, g gVar) {
        return new a(mode, interfaceC0951c, paymentAnalyticsRequestFactory, dVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((EventReporter.Mode) this.f27054a.get(), (InterfaceC0951c) this.f27055b.get(), (PaymentAnalyticsRequestFactory) this.f27056c.get(), (d) this.f27057d.get(), (g) this.f27058e.get());
    }
}
