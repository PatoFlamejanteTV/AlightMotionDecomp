package p2;

import B2.InterfaceC0951c;
import B2.j;
import Q5.InterfaceC1416k;
import Q5.s;
import Q5.t;
import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.r;
import p2.AbstractC3564f;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;

/* renamed from: p2.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3568j implements InterfaceC3560b.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f36151a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36152b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f36153c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3562d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3813L f36154a = A4.g.n(Boolean.FALSE);

        @Override // p2.InterfaceC3562d
        public InterfaceC3813L a() {
            return this.f36154a;
        }

        @Override // p2.InterfaceC3562d
        public Object b(AbstractC3564f.b bVar, U5.d dVar) {
            return null;
        }
    }

    /* renamed from: p2.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3567i invoke() {
            m mVar = new m();
            return new C3567i(new C3570l(mVar), C3568j.this.c(mVar), new o(null, 1, 0 == true ? 1 : 0), mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f36156a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f36156a;
        }
    }

    public C3568j(Context context, InterfaceC0951c analyticsRequestExecutor) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f36151a = analyticsRequestExecutor;
        this.f36152b = context.getApplicationContext();
        this.f36153c = Q5.l.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3562d c(InterfaceC3563e interfaceC3563e) {
        Object obj;
        try {
            s.a aVar = s.f8810b;
            r.a aVar2 = r.f35413c;
            Context appContext = this.f36152b;
            AbstractC3292y.h(appContext, "appContext");
            obj = s.b(aVar2.a(appContext).f());
        } catch (Throwable th) {
            s.a aVar3 = s.f8810b;
            obj = s.b(t.a(th));
        }
        if (s.h(obj)) {
            d((String) obj, PaymentAnalyticsEvent.f26096z0);
        }
        if (s.e(obj) != null) {
            d("pk_undefined", PaymentAnalyticsEvent.f26030A0);
        }
        if (s.e(obj) == null) {
            String str = (String) obj;
            Context appContext2 = this.f36152b;
            AbstractC3292y.h(appContext2, "appContext");
            com.stripe.android.networking.a aVar4 = new com.stripe.android.networking.a(appContext2, new c(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            j.c cVar = new j.c(str, null, null, 6, null);
            B2.m mVar = new B2.m();
            Context appContext3 = this.f36152b;
            AbstractC3292y.h(appContext3, "appContext");
            return new n(aVar4, cVar, interfaceC3563e, mVar, new PaymentAnalyticsRequestFactory(appContext3, str, null, 4, null));
        }
        return new a();
    }

    private final void d(String str, PaymentAnalyticsEvent paymentAnalyticsEvent) {
        InterfaceC0951c interfaceC0951c = this.f36151a;
        Context appContext = this.f36152b;
        AbstractC3292y.h(appContext, "appContext");
        interfaceC0951c.a(PaymentAnalyticsRequestFactory.v(new PaymentAnalyticsRequestFactory(appContext, str, null, 4, null), paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    @Override // p2.InterfaceC3560b.a
    public InterfaceC3560b a() {
        return (InterfaceC3560b) this.f36153c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3568j(Context context) {
        this(context, new B2.m());
        AbstractC3292y.i(context, "context");
    }
}
