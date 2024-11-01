package com.stripe.android.view;

import B2.C0950b;
import B2.InterfaceC0951c;
import Q5.InterfaceC1416k;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j6.InterfaceC3214c;
import java.util.Map;
import k3.C3237c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3445b0;

/* renamed from: com.stripe.android.view.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2665n0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentBrowserAuthContract.a f29116a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0951c f29117b;

    /* renamed from: c, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f29118c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f29119d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f29120e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b f29121f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f29122g;

    /* renamed from: com.stripe.android.view.n0$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f29123a;

        /* renamed from: b, reason: collision with root package name */
        private final v2.d f29124b;

        /* renamed from: c, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f29125c;

        public a(Application application, v2.d logger, PaymentBrowserAuthContract.a args) {
            AbstractC3292y.i(application, "application");
            AbstractC3292y.i(logger, "logger");
            AbstractC3292y.i(args, "args");
            this.f29123a = application;
            this.f29124b = logger;
            this.f29125c = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return new C2665n0(this.f29125c, new B2.m(this.f29124b, C3445b0.b()), new PaymentAnalyticsRequestFactory(this.f29123a, this.f29125c.i(), R5.a0.d("PaymentAuthWebViewActivity")));
        }
    }

    /* renamed from: com.stripe.android.view.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f29126a;

        /* renamed from: b, reason: collision with root package name */
        private final Y3.k f29127b;

        public b(String text, Y3.k toolbarCustomization) {
            AbstractC3292y.i(text, "text");
            AbstractC3292y.i(toolbarCustomization, "toolbarCustomization");
            this.f29126a = text;
            this.f29127b = toolbarCustomization;
        }

        public final String a() {
            return this.f29126a;
        }

        public final Y3.k b() {
            return this.f29127b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f29126a, bVar.f29126a) && AbstractC3292y.d(this.f29127b, bVar.f29127b);
        }

        public int hashCode() {
            return (this.f29126a.hashCode() * 31) + this.f29127b.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.f29126a + ", toolbarCustomization=" + this.f29127b + ")";
        }
    }

    /* renamed from: com.stripe.android.view.n0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            C2665n0 c2665n0 = C2665n0.this;
            Map c8 = R5.Q.c();
            if (c2665n0.f29116a.l() != null) {
                c8.put("Referer", c2665n0.f29116a.l());
            }
            return R5.Q.q(new B2.D(null, 1, null).a(n2.I.f35286f.b()), R5.Q.b(c8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2665n0(com.stripe.android.auth.PaymentBrowserAuthContract.a r3, B2.InterfaceC0951c r4, com.stripe.android.networking.PaymentAnalyticsRequestFactory r5) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            java.lang.String r0 = "paymentAnalyticsRequestFactory"
            kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
            r2.<init>()
            r2.f29116a = r3
            r2.f29117b = r4
            r2.f29118c = r5
            com.stripe.android.view.n0$c r4 = new com.stripe.android.view.n0$c
            r4.<init>()
            Q5.k r4 = Q5.l.b(r4)
            r2.f29119d = r4
            Y3.k r4 = r3.x()
            r5 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = r4.v()
            if (r4 == 0) goto L36
            boolean r0 = l6.n.T(r4)
            if (r0 == 0) goto L37
        L36:
            r4 = r5
        L37:
            r2.f29120e = r4
            Y3.k r4 = r3.x()
            if (r4 == 0) goto L57
            java.lang.String r0 = r4.h()
            if (r0 == 0) goto L4b
            boolean r1 = l6.n.T(r0)
            if (r1 == 0) goto L4c
        L4b:
            r0 = r5
        L4c:
            if (r0 == 0) goto L57
            com.stripe.android.view.n0$b r1 = new com.stripe.android.view.n0$b
            kotlin.jvm.internal.AbstractC3292y.f(r0)
            r1.<init>(r0, r4)
            goto L58
        L57:
            r1 = r5
        L58:
            r2.f29121f = r1
            Y3.k r3 = r3.x()
            if (r3 == 0) goto L64
            java.lang.String r5 = r3.f()
        L64:
            r2.f29122g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2665n0.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$a, B2.c, com.stripe.android.networking.PaymentAnalyticsRequestFactory):void");
    }

    private final void b(C0950b c0950b) {
        this.f29117b.a(c0950b);
    }

    public final String c() {
        return this.f29120e;
    }

    public final /* synthetic */ Intent d() {
        int i8;
        Intent intent = new Intent();
        C3237c f8 = f();
        if (this.f29116a.s()) {
            i8 = 3;
        } else {
            i8 = 1;
        }
        Intent putExtras = intent.putExtras(C3237c.b(f8, null, i8, null, this.f29116a.u(), null, null, null, 117, null).u());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final Map e() {
        return (Map) this.f29119d.getValue();
    }

    public final /* synthetic */ C3237c f() {
        String d8 = this.f29116a.d();
        String lastPathSegment = Uri.parse(this.f29116a.y()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new C3237c(d8, 0, null, false, lastPathSegment, null, this.f29116a.w(), 46, null);
    }

    public final String g() {
        return this.f29122g;
    }

    public final b h() {
        return this.f29121f;
    }

    public final void i() {
        b(PaymentAnalyticsRequestFactory.v(this.f29118c, PaymentAnalyticsEvent.f26044J, null, null, null, null, null, 62, null));
    }

    public final void j() {
        b(PaymentAnalyticsRequestFactory.v(this.f29118c, PaymentAnalyticsEvent.f26043I, null, null, null, null, null, 62, null));
    }

    public final void k() {
        b(PaymentAnalyticsRequestFactory.v(this.f29118c, PaymentAnalyticsEvent.f26042H, null, null, null, null, null, 62, null));
        b(PaymentAnalyticsRequestFactory.v(this.f29118c, PaymentAnalyticsEvent.f26045K, null, null, null, null, null, 62, null));
    }
}
