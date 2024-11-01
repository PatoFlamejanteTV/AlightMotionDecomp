package p2;

import B2.InterfaceC0951c;
import B2.j;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes4.dex */
public final class n implements InterfaceC3562d {

    /* renamed from: a, reason: collision with root package name */
    private final j3.m f36172a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f36173b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3563e f36174c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0951c f36175d;

    /* renamed from: e, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f36176e;

    /* renamed from: f, reason: collision with root package name */
    private final w f36177f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f36178g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36179a;

        /* renamed from: b, reason: collision with root package name */
        Object f36180b;

        /* renamed from: c, reason: collision with root package name */
        Object f36181c;

        /* renamed from: d, reason: collision with root package name */
        Object f36182d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36183e;

        /* renamed from: g, reason: collision with root package name */
        int f36185g;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36183e = obj;
            this.f36185g |= Integer.MIN_VALUE;
            return n.this.b(null, this);
        }
    }

    public n(j3.m stripeRepository, j.c requestOptions, InterfaceC3563e cardAccountRangeStore, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        AbstractC3292y.i(requestOptions, "requestOptions");
        AbstractC3292y.i(cardAccountRangeStore, "cardAccountRangeStore");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f36172a = stripeRepository;
        this.f36173b = requestOptions;
        this.f36174c = cardAccountRangeStore;
        this.f36175d = analyticsRequestExecutor;
        this.f36176e = paymentAnalyticsRequestFactory;
        w a9 = AbstractC3815N.a(Boolean.FALSE);
        this.f36177f = a9;
        this.f36178g = AbstractC3823h.b(a9);
    }

    private final void c() {
        this.f36175d.a(PaymentAnalyticsRequestFactory.v(this.f36176e, PaymentAnalyticsEvent.f26036D0, null, null, null, null, null, 62, null));
    }

    @Override // p2.InterfaceC3562d
    public InterfaceC3813L a() {
        return this.f36178g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p2.InterfaceC3562d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p2.AbstractC3564f.b r7, U5.d r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.n.b(p2.f$b, U5.d):java.lang.Object");
    }
}
