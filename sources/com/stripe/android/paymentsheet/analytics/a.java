package com.stripe.android.paymentsheet.analytics;

import B2.InterfaceC0951c;
import D3.f;
import E2.d;
import Q5.I;
import Q5.p;
import Q5.t;
import U5.g;
import c6.InterfaceC2072n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.c;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import g3.y;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import v3.EnumC4126f;
import y3.AbstractC4244b;
import y3.AbstractC4245c;

/* loaded from: classes4.dex */
public final class a implements EventReporter {

    /* renamed from: a, reason: collision with root package name */
    private final EventReporter.Mode f27041a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0951c f27042b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f27043c;

    /* renamed from: d, reason: collision with root package name */
    private final d f27044d;

    /* renamed from: e, reason: collision with root package name */
    private final g f27045e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27046f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27047g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27048h;

    /* renamed from: i, reason: collision with root package name */
    private String f27049i;

    /* renamed from: com.stripe.android.paymentsheet.analytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0600a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27050a;

        static {
            int[] iArr = new int[EventReporter.a.values().length];
            try {
                iArr[EventReporter.a.f27038b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.a.f27037a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27050a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27051a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f27053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, U5.d dVar) {
            super(2, dVar);
            this.f27053c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f27053c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f27051a == 0) {
                t.b(obj);
                InterfaceC0951c interfaceC0951c = a.this.f27042b;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f27043c;
                c cVar = this.f27053c;
                interfaceC0951c.a(paymentAnalyticsRequestFactory.g(cVar, cVar.e()));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(EventReporter.Mode mode, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d durationProvider, g workContext) {
        AbstractC3292y.i(mode, "mode");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(durationProvider, "durationProvider");
        AbstractC3292y.i(workContext, "workContext");
        this.f27041a = mode;
        this.f27042b = analyticsRequestExecutor;
        this.f27043c = paymentAnalyticsRequestFactory;
        this.f27044d = durationProvider;
        this.f27045e = workContext;
    }

    private final void A(c cVar) {
        AbstractC3462k.d(N.a(this.f27045e), null, null, new b(cVar, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void a() {
        A(new c.C0601c(this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void b(EnumC2906e selectedBrand, Throwable error) {
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        AbstractC3292y.i(error, "error");
        A(new c.x(selectedBrand, error, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void c(EnumC2906e selectedBrand) {
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        A(new c.y(selectedBrand, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void d() {
        A(new c.t(this.f27041a, this.f27049i, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void e(f fVar, y yVar, boolean z8, String str, w.l initializationMode, List orderedLpms, boolean z9) {
        boolean z10;
        AbstractC3292y.i(initializationMode, "initializationMode");
        AbstractC3292y.i(orderedLpms, "orderedLpms");
        this.f27049i = str;
        if (yVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27047g = z10;
        this.f27048h = z8;
        d.a.a(this.f27044d, d.b.f1554b, false, 2, null);
        A(new c.l(fVar, initializationMode, orderedLpms, this.f27044d.b(d.b.f1553a), yVar, this.f27046f, z8, z9, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void f(String type) {
        AbstractC3292y.i(type, "type");
        A(new c.a(type, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void g() {
        A(new c.s(this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void h(String code) {
        AbstractC3292y.i(code, "code");
        A(new c.q(code, this.f27049i, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void i(boolean z8) {
        d.a.a(this.f27044d, d.b.f1553a, false, 2, null);
        A(new c.k(this.f27046f, this.f27047g, this.f27048h, z8));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void j(f fVar, AbstractC4244b error) {
        AbstractC3292y.i(error, "error");
        A(new c.n(this.f27041a, new c.n.a.b(error), this.f27044d.b(d.b.f1554b), fVar, this.f27049i, this.f27046f, this.f27047g, this.f27048h, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void k(w.g configuration, boolean z8) {
        AbstractC3292y.i(configuration, "configuration");
        this.f27046f = z8;
        A(new c.i(this.f27041a, configuration, z8, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void l(f fVar) {
        A(new c.p(this.f27049i, this.f27044d.b(d.b.f1556d), AbstractC4245c.c(fVar), AbstractC4245c.e(fVar), this.f27046f, this.f27047g, this.f27048h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void m(Throwable error) {
        AbstractC3292y.i(error, "error");
        A(new c.f(error, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void n(String code) {
        AbstractC3292y.i(code, "code");
        d.a.a(this.f27044d, d.b.f1556d, false, 2, null);
        A(new c.w(code, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void o(f paymentSelection) {
        AbstractC3292y.i(paymentSelection, "paymentSelection");
        A(new c.r(this.f27041a, paymentSelection, this.f27049i, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        A(new c.e(this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void p(Throwable error) {
        AbstractC3292y.i(error, "error");
        A(new c.j(this.f27044d.b(d.b.f1553a), error, this.f27046f, this.f27047g, this.f27048h, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void q(EventReporter.a source, EnumC2906e enumC2906e) {
        c.h.a aVar;
        AbstractC3292y.i(source, "source");
        int i8 = C0600a.f27050a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.h.a.f27095b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.h.a.f27096c;
        }
        A(new c.h(aVar, enumC2906e, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void r(String str) {
        A(new c.m(this.f27046f, this.f27047g, this.f27048h, str));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void s(EventReporter.a source, EnumC2906e selectedBrand) {
        c.v.a aVar;
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        int i8 = C0600a.f27050a[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                aVar = c.v.a.f27175b;
            } else {
                throw new p();
            }
        } else {
            aVar = c.v.a.f27176c;
        }
        A(new c.v(aVar, selectedBrand, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void t() {
        A(new c.u(this.f27041a, this.f27049i, this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void u(f fVar, EnumC4126f enumC4126f) {
        f.C0023f c0023f;
        f fVar2;
        boolean z8;
        f.C0023f.b p8;
        f b9;
        if (fVar instanceof f.C0023f) {
            c0023f = (f.C0023f) fVar;
        } else {
            c0023f = null;
        }
        if (c0023f != null && (p8 = c0023f.p()) != null && (b9 = p8.b()) != null) {
            fVar2 = b9;
        } else {
            fVar2 = fVar;
        }
        C3374a b10 = this.f27044d.b(d.b.f1554b);
        EventReporter.Mode mode = this.f27041a;
        c.n.a.C0603c c0603c = c.n.a.C0603c.f27134a;
        String str = this.f27049i;
        if (enumC4126f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        A(new c.n(mode, c0603c, b10, fVar2, str, z8, this.f27047g, this.f27048h, enumC4126f, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void v() {
        A(new c.b(this.f27041a));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void w() {
        A(new c.g(this.f27046f, this.f27047g, this.f27048h));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void x(String code) {
        AbstractC3292y.i(code, "code");
        A(new c.o(code, this.f27046f, this.f27047g, this.f27048h));
    }
}
