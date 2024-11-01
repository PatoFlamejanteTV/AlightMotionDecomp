package q3;

import B2.InterfaceC0951c;
import B2.j;
import Q5.I;
import c6.InterfaceC2072n;
import com.stripe.android.a;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;

/* renamed from: q3.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3643l extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36693a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f36694b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0951c f36695c;

    /* renamed from: d, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f36696d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36697e;

    /* renamed from: f, reason: collision with root package name */
    private final U5.g f36698f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f36699g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36700h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f36701a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f36703c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f36704d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f36705e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2668p interfaceC2668p, Source source, String str, U5.d dVar) {
            super(2, dVar);
            this.f36703c = interfaceC2668p;
            this.f36704d = source;
            this.f36705e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f36703c, this.f36704d, this.f36705e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f36701a == 0) {
                Q5.t.b(obj);
                ((com.stripe.android.a) C3643l.this.f36694b.invoke(this.f36703c)).a(new a.AbstractC0445a.e(this.f36704d, this.f36705e));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f36706a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f36708c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Source f36709d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j.c f36710e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2668p interfaceC2668p, Source source, j.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f36708c = interfaceC2668p;
            this.f36709d = source;
            this.f36710e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f36708c, this.f36709d, this.f36710e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            V5.b.e();
            if (this.f36706a == 0) {
                Q5.t.b(obj);
                C3643l.this.f36695c.a(PaymentAnalyticsRequestFactory.v(C3643l.this.f36696d, PaymentAnalyticsEvent.f26086u0, null, null, null, null, null, 62, null));
                n2.q qVar = (n2.q) C3643l.this.f36693a.invoke(this.f36708c);
                String id = this.f36709d.getId();
                if (id == null) {
                    str = "";
                } else {
                    str = id;
                }
                String d8 = this.f36709d.d();
                if (d8 == null) {
                    str2 = "";
                } else {
                    str2 = d8;
                }
                Source.Redirect b9 = this.f36709d.b();
                if (b9 != null) {
                    str3 = b9.a();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                Source.Redirect b10 = this.f36709d.b();
                if (b10 != null) {
                    str5 = b10.A();
                } else {
                    str5 = null;
                }
                qVar.a(new PaymentBrowserAuthContract.a(str, 50002, str2, str4, str5, C3643l.this.f36697e, null, this.f36710e.l(), false, false, this.f36708c.a(), (String) C3643l.this.f36699g.invoke(), C3643l.this.f36700h, null, false, 25408, null));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3643l(Function1 paymentBrowserAuthStarterFactory, Function1 paymentRelayStarterFactory, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, U5.g uiContext, Function0 publishableKeyProvider, boolean z9) {
        AbstractC3292y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3292y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        this.f36693a = paymentBrowserAuthStarterFactory;
        this.f36694b = paymentRelayStarterFactory;
        this.f36695c = analyticsRequestExecutor;
        this.f36696d = paymentAnalyticsRequestFactory;
        this.f36697e = z8;
        this.f36698f = uiContext;
        this.f36699g = publishableKeyProvider;
        this.f36700h = z9;
    }

    private final Object m(InterfaceC2668p interfaceC2668p, Source source, String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.f36698f, new a(interfaceC2668p, source, str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final Object o(InterfaceC2668p interfaceC2668p, Source source, j.c cVar, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.f36698f, new b(interfaceC2668p, source, cVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.AbstractC3637f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2668p interfaceC2668p, Source source, j.c cVar, U5.d dVar) {
        if (source.a() == Source.Flow.f25260c) {
            Object o8 = o(interfaceC2668p, source, cVar, dVar);
            if (o8 == V5.b.e()) {
                return o8;
            }
            return I.f8786a;
        }
        Object m8 = m(interfaceC2668p, source, cVar.l(), dVar);
        if (m8 == V5.b.e()) {
            return m8;
        }
        return I.f8786a;
    }
}
