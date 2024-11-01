package q3;

import B2.InterfaceC0951c;
import Q5.I;
import c6.InterfaceC2072n;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2668p;
import java.util.Map;
import k3.C3235a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;

/* renamed from: q3.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3650s extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36735a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0951c f36736b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f36737c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36738d;

    /* renamed from: e, reason: collision with root package name */
    private final U5.g f36739e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f36740f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f36741g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36742h;

    /* renamed from: i, reason: collision with root package name */
    private final C3235a f36743i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3642k f36744j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f36745a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2668p f36747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeIntent f36748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f36749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f36750f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f36751g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f36752h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f36753i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f36754j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f36755k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f36756l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f36757m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, U5.d dVar) {
            super(2, dVar);
            this.f36747c = interfaceC2668p;
            this.f36748d = stripeIntent;
            this.f36749e = i8;
            this.f36750f = str;
            this.f36751g = str2;
            this.f36752h = str3;
            this.f36753i = str4;
            this.f36754j = z8;
            this.f36755k = z9;
            this.f36756l = str5;
            this.f36757m = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f36747c, this.f36748d, this.f36749e, this.f36750f, this.f36751g, this.f36752h, this.f36753i, this.f36754j, this.f36755k, this.f36756l, this.f36757m, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f36745a == 0) {
                Q5.t.b(obj);
                n2.q qVar = (n2.q) C3650s.this.f36735a.invoke(this.f36747c);
                String id = this.f36748d.getId();
                if (id == null) {
                    id = "";
                }
                qVar.a(new PaymentBrowserAuthContract.a(id, this.f36749e, this.f36750f, this.f36751g, this.f36752h, C3650s.this.f36738d, null, this.f36753i, this.f36754j, this.f36755k, this.f36747c.a(), (String) C3650s.this.f36741g.invoke(), C3650s.this.f36742h, this.f36756l, this.f36757m, 64, null));
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
    /* renamed from: q3.s$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36758a;

        /* renamed from: b, reason: collision with root package name */
        Object f36759b;

        /* renamed from: c, reason: collision with root package name */
        Object f36760c;

        /* renamed from: d, reason: collision with root package name */
        Object f36761d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36762e;

        /* renamed from: g, reason: collision with root package name */
        int f36764g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36762e = obj;
            this.f36764g |= Integer.MIN_VALUE;
            return C3650s.this.e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.s$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36765a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36766b;

        /* renamed from: d, reason: collision with root package name */
        int f36768d;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36766b = obj;
            this.f36768d |= Integer.MIN_VALUE;
            return C3650s.this.m(null, null, this);
        }
    }

    public C3650s(Function1 paymentBrowserAuthStarterFactory, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z8, U5.g uiContext, Map threeDs1IntentReturnUrlMap, Function0 publishableKeyProvider, boolean z9, C3235a defaultReturnUrl, InterfaceC3642k redirectResolver) {
        AbstractC3292y.i(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3292y.i(redirectResolver, "redirectResolver");
        this.f36735a = paymentBrowserAuthStarterFactory;
        this.f36736b = analyticsRequestExecutor;
        this.f36737c = paymentAnalyticsRequestFactory;
        this.f36738d = z8;
        this.f36739e = uiContext;
        this.f36740f = threeDs1IntentReturnUrlMap;
        this.f36741g = publishableKeyProvider;
        this.f36742h = z9;
        this.f36743i = defaultReturnUrl;
        this.f36744j = redirectResolver;
    }

    private final Object k(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, int i8, String str, String str2, String str3, String str4, boolean z8, boolean z9, String str5, boolean z10, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.f36739e, new a(interfaceC2668p, stripeIntent, i8, str, str2, str4, str3, z8, z9, str5, z10, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.stripe.android.model.StripeIntent.a.i r22, com.stripe.android.model.StripeIntent r23, U5.d r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof q3.C3650s.c
            if (r2 == 0) goto L17
            r2 = r1
            q3.s$c r2 = (q3.C3650s.c) r2
            int r3 = r2.f36768d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f36768d = r3
            goto L1c
        L17:
            q3.s$c r2 = new q3.s$c
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f36766b
            java.lang.Object r3 = V5.b.e()
            int r4 = r2.f36768d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f36765a
            com.stripe.android.model.StripeIntent$a$i r2 = (com.stripe.android.model.StripeIntent.a.i) r2
            Q5.t.b(r1)
            goto L82
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            Q5.t.b(r1)
            B2.c r1 = r0.f36736b
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r6 = r0.f36737c
            com.stripe.android.networking.PaymentAnalyticsEvent r7 = com.stripe.android.networking.PaymentAnalyticsEvent.f26080r0
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            B2.b r4 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.v(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a(r4)
            com.stripe.android.model.o r1 = r23.r()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.f25634d
            goto L5b
        L5a:
            r1 = 0
        L5b:
            com.stripe.android.model.o$p r4 = com.stripe.android.model.o.p.f25733C
            java.lang.String r4 = r4.f25773a
            boolean r1 = kotlin.jvm.internal.AbstractC3292y.d(r1, r4)
            java.lang.String r4 = "toString(...)"
            if (r1 == 0) goto L9d
            q3.k r1 = r0.f36744j
            android.net.Uri r6 = r22.b()
            java.lang.String r6 = r6.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r6, r4)
            r7 = r22
            r2.f36765a = r7
            r2.f36768d = r5
            java.lang.Object r1 = r1.a(r6, r2)
            if (r1 != r3) goto L81
            return r3
        L81:
            r2 = r7
        L82:
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.A()
            android.net.Uri r1 = r2.b()
            java.lang.String r8 = r1.toString()
            q3.r r1 = new q3.r
            r7 = 0
            r9 = 1
            r6 = 0
            r10 = 4
            r11 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lbf
        L9d:
            r7 = r22
            q3.r r1 = new q3.r
            android.net.Uri r2 = r22.b()
            java.lang.String r13 = r2.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r13, r4)
            java.lang.String r14 = r22.A()
            r19 = 60
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C3650s.m(com.stripe.android.model.StripeIntent$a$i, com.stripe.android.model.StripeIntent, U5.d):java.lang.Object");
    }

    private final C3649r n(StripeIntent.a.C0478a c0478a) {
        this.f36736b.a(PaymentAnalyticsRequestFactory.v(this.f36737c, PaymentAnalyticsEvent.f26080r0, null, null, null, null, null, 62, null));
        String uri = c0478a.b().toString();
        AbstractC3292y.h(uri, "toString(...)");
        return new C3649r(uri, c0478a.A(), false, false, null, false, 60, null);
    }

    private final C3649r o(StripeIntent.a.c cVar) {
        return new C3649r(cVar.b(), this.f36743i.a(), false, false, null, false, 52, null);
    }

    private final C3649r p(StripeIntent.a.h hVar, StripeIntent stripeIntent) {
        String str;
        String a9 = hVar.a();
        AbstractC3292y.f(a9);
        String str2 = null;
        if (a9.length() > 0) {
            str = a9;
        } else {
            str = null;
        }
        if (str == null) {
            StripeIntent.NextActionType k8 = stripeIntent.k();
            if (k8 != null) {
                str2 = k8.b();
            }
            throw new IllegalArgumentException("null hostedVoucherUrl for " + str2);
        }
        return new C3649r(str, null, false, false, null, false, 52, null);
    }

    private final C3649r q(StripeIntent.a.j.C0487a c0487a, StripeIntent stripeIntent) {
        String str;
        this.f36736b.a(PaymentAnalyticsRequestFactory.v(this.f36737c, PaymentAnalyticsEvent.f26041G, null, null, null, null, null, 62, null));
        String b9 = c0487a.b();
        String id = stripeIntent.getId();
        if (id != null) {
            str = (String) this.f36740f.remove(id);
        } else {
            str = null;
        }
        return new C3649r(b9, str, true, false, null, false, 56, null);
    }

    private final C3649r r(StripeIntent.a.k kVar) {
        return new C3649r(kVar.b(), this.f36743i.a(), false, false, null, false, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // q3.AbstractC3637f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2668p r19, com.stripe.android.model.StripeIntent r20, B2.j.c r21, U5.d r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C3650s.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, B2.j$c, U5.d):java.lang.Object");
    }
}
