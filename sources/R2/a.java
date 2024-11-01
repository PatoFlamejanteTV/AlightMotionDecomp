package R2;

import B2.InterfaceC0951c;
import E2.d;
import Q5.I;
import Q5.p;
import Q5.t;
import Q5.x;
import R2.d;
import R2.e;
import R5.Q;
import U5.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import m6.EnumC3377d;
import n6.AbstractC3462k;
import n6.M;
import n6.N;
import p3.i;
import v2.f;
import x2.AbstractC4210d;
import x2.C4212f;

/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: g, reason: collision with root package name */
    private static final C0184a f9153g = new C0184a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f9154h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f9155a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f9156b;

    /* renamed from: c, reason: collision with root package name */
    private final i f9157c;

    /* renamed from: d, reason: collision with root package name */
    private final g f9158d;

    /* renamed from: e, reason: collision with root package name */
    private final v2.d f9159e;

    /* renamed from: f, reason: collision with root package name */
    private final E2.d f9160f;

    /* renamed from: R2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0184a {
        private C0184a() {
        }

        public /* synthetic */ C0184a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9161a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.f9198a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.f9199b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.f9200c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9161a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9162a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f9164c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f9165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Map map, U5.d dVar2) {
            super(2, dVar2);
            this.f9164c = dVar;
            this.f9165d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f9164c, this.f9165d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f9162a == 0) {
                t.b(obj);
                InterfaceC0951c interfaceC0951c = a.this.f9155a;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.f9156b;
                d dVar = this.f9164c;
                Map map = this.f9165d;
                if (map == null) {
                    map = Q.h();
                }
                interfaceC0951c.a(paymentAnalyticsRequestFactory.g(dVar, map));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, i errorReporter, g workContext, v2.d logger, E2.d durationProvider) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(durationProvider, "durationProvider");
        this.f9155a = analyticsRequestExecutor;
        this.f9156b = paymentAnalyticsRequestFactory;
        this.f9157c = errorReporter;
        this.f9158d = workContext;
        this.f9159e = logger;
        this.f9160f = durationProvider;
    }

    private final Map o(C3374a c3374a) {
        if (c3374a != null) {
            return Q.e(x.a(TypedValues.TransitionType.S_DURATION, Float.valueOf((float) C3374a.K(c3374a.P(), EnumC3377d.f35046e))));
        }
        return null;
    }

    private final void p(d dVar, Map map) {
        this.f9159e.b("Link event: " + dVar.a() + " " + map);
        AbstractC3462k.d(N.a(this.f9158d), null, null, new c(dVar, map, null), 3, null);
    }

    static /* synthetic */ void q(a aVar, d dVar, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        aVar.p(dVar, map);
    }

    private final String r(e.a aVar) {
        int i8 = b.f9161a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return "verified";
                }
                throw new p();
            }
            return "requiresVerification";
        }
        return "requiresSignUp";
    }

    @Override // R2.e
    public void a(boolean z8) {
        p(d.i.f9190a, o(this.f9160f.b(d.b.f1555c)));
    }

    @Override // R2.e
    public void b(boolean z8) {
        d.a.a(this.f9160f, d.b.f1555c, false, 2, null);
        q(this, d.l.f9196a, null, 2, null);
    }

    @Override // R2.e
    public void c() {
        q(this, d.b.f9176a, null, 2, null);
    }

    @Override // R2.e
    public void d() {
        q(this, d.f.f9184a, null, 2, null);
    }

    @Override // R2.e
    public void e(Throwable error) {
        AbstractC3292y.i(error, "error");
        p(d.c.f9178a, Q.e(x.a("error_message", AbstractC4210d.a(error))));
    }

    @Override // R2.e
    public void f(e.a state) {
        AbstractC3292y.i(state, "state");
        Map e8 = Q.e(x.a("sessionState", r(state)));
        i.b.a(this.f9157c, i.f.f36235f, null, null, 6, null);
        p(d.k.f9194a, e8);
    }

    @Override // R2.e
    public void g() {
        q(this, d.e.f9182a, null, 2, null);
    }

    @Override // R2.e
    public void h(boolean z8, Throwable error) {
        f d8;
        String i8;
        AbstractC3292y.i(error, "error");
        Map map = null;
        if ((error instanceof C4212f) && (d8 = ((C4212f) error).d()) != null && (i8 = d8.i()) != null) {
            map = Q.e(x.a("error_message", i8));
        }
        if (map == null) {
            map = Q.e(x.a("error_message", AbstractC4210d.a(error)));
        }
        p(d.j.f9192a, Q.q(map, i.f36196a.c(error)));
    }

    @Override // R2.e
    public void i(Throwable error) {
        AbstractC3292y.i(error, "error");
        p(d.a.f9174a, Q.q(Q.e(x.a("error_message", AbstractC4210d.a(error))), i.f36196a.c(error)));
    }

    @Override // R2.e
    public void j() {
        q(this, d.h.f9188a, null, 2, null);
    }

    @Override // R2.e
    public void k() {
        q(this, d.g.f9186a, null, 2, null);
    }

    @Override // R2.e
    public void l() {
        q(this, d.C0185d.f9180a, null, 2, null);
    }
}
