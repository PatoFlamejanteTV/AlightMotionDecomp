package o2;

import B2.InterfaceC0951c;
import E2.d;
import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import o2.AbstractC3520b;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3519a implements InterfaceC3521c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f35903a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f35904b;

    /* renamed from: c, reason: collision with root package name */
    private final E2.d f35905c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f35906d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0816a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35907a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3520b f35909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0816a(AbstractC3520b abstractC3520b, U5.d dVar) {
            super(2, dVar);
            this.f35909c = abstractC3520b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0816a(this.f35909c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f35907a == 0) {
                t.b(obj);
                InterfaceC0951c interfaceC0951c = C3519a.this.f35903a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = C3519a.this.f35904b;
                AbstractC3520b abstractC3520b = this.f35909c;
                interfaceC0951c.a(paymentAnalyticsRequestFactory.g(abstractC3520b, abstractC3520b.b()));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0816a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3519a(InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, E2.d durationProvider, U5.g workContext) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(durationProvider, "durationProvider");
        AbstractC3292y.i(workContext, "workContext");
        this.f35903a = analyticsRequestExecutor;
        this.f35904b = paymentAnalyticsRequestFactory;
        this.f35905c = durationProvider;
        this.f35906d = workContext;
    }

    private final void h(AbstractC3520b abstractC3520b) {
        AbstractC3462k.d(N.a(this.f35906d), null, null, new C0816a(abstractC3520b, null), 3, null);
    }

    @Override // o2.InterfaceC3521c
    public void a() {
        h(new AbstractC3520b.a());
    }

    @Override // o2.InterfaceC3521c
    public void b(String code) {
        AbstractC3292y.i(code, "code");
        d.a.a(this.f35905c, d.b.f1556d, false, 2, null);
        h(new AbstractC3520b.e(code));
    }

    @Override // o2.InterfaceC3521c
    public void c() {
        d.a.a(this.f35905c, d.b.f1553a, false, 2, null);
        h(new AbstractC3520b.c());
    }

    @Override // o2.InterfaceC3521c
    public void d(String code) {
        AbstractC3292y.i(code, "code");
        h(new AbstractC3520b.f(code, this.f35905c.b(d.b.f1556d), null));
    }

    @Override // o2.InterfaceC3521c
    public void e(String code) {
        AbstractC3292y.i(code, "code");
        h(new AbstractC3520b.d(code));
    }
}
