package com.stripe.android.payments;

import B2.InterfaceC0951c;
import B2.m;
import Q5.p;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j6.InterfaceC3214c;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import n2.r;
import w2.C4153b;
import w2.EnumC4152a;
import x2.h;

/* loaded from: classes4.dex */
public final class a extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final C0532a f26274g = new C0532a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f26275h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0951c f26276a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26277b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4152a f26278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26279d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26280e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f26281f;

    /* renamed from: com.stripe.android.payments.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0532a {
        private C0532a() {
        }

        public /* synthetic */ C0532a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            Application a9 = E2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            r a10 = r.f35413c.a(a9);
            C4153b c4153b = new C4153b(a9);
            m mVar = new m();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(a9, a10.f(), null, 4, null);
            EnumC4152a a11 = c4153b.a();
            String string = a9.getString(AbstractC3394E.f35207N0);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = a9.getString(AbstractC3394E.f35247n0);
            AbstractC3292y.h(string2, "getString(...)");
            return new a(mVar, paymentAnalyticsRequestFactory, a11, string, string2, createSavedStateHandle);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26282a;

        static {
            int[] iArr = new int[EnumC4152a.values().length];
            try {
                iArr[EnumC4152a.f40675a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4152a.f40676b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26282a = iArr;
        }
    }

    public a(InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, EnumC4152a browserCapabilities, String intentChooserTitle, String resolveErrorMessage, SavedStateHandle savedStateHandle) {
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(browserCapabilities, "browserCapabilities");
        AbstractC3292y.i(intentChooserTitle, "intentChooserTitle");
        AbstractC3292y.i(resolveErrorMessage, "resolveErrorMessage");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        this.f26276a = analyticsRequestExecutor;
        this.f26277b = paymentAnalyticsRequestFactory;
        this.f26278c = browserCapabilities;
        this.f26279d = intentChooserTitle;
        this.f26280e = resolveErrorMessage;
        this.f26281f = savedStateHandle;
    }

    private final CustomTabsIntent a(PaymentBrowserAuthContract.a aVar, Uri uri) {
        CustomTabColorSchemeParams customTabColorSchemeParams;
        Integer v8 = aVar.v();
        if (v8 != null) {
            customTabColorSchemeParams = new CustomTabColorSchemeParams.Builder().setToolbarColor(v8.intValue()).build();
        } else {
            customTabColorSchemeParams = null;
        }
        CustomTabsIntent.Builder shareState = new CustomTabsIntent.Builder().setShareState(2);
        if (customTabColorSchemeParams != null) {
            shareState.setDefaultColorSchemeParams(customTabColorSchemeParams);
        }
        CustomTabsIntent build = shareState.build();
        AbstractC3292y.h(build, "build(...)");
        build.intent.setData(uri);
        return build;
    }

    private final void f() {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        int i8 = c.f26282a[this.f26278c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                paymentAnalyticsEvent = PaymentAnalyticsEvent.f26047M;
            } else {
                throw new p();
            }
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f26046L;
        }
        this.f26276a.a(PaymentAnalyticsRequestFactory.v(this.f26277b, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final Intent b(PaymentBrowserAuthContract.a args) {
        Intent intent;
        AbstractC3292y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        f();
        int i8 = c.f26282a[this.f26278c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                intent = new Intent("android.intent.action.VIEW", parse);
            } else {
                throw new p();
            }
        } else {
            AbstractC3292y.f(parse);
            intent = a(args, parse).intent;
        }
        AbstractC3292y.f(intent);
        Intent createChooser = Intent.createChooser(intent, this.f26279d);
        AbstractC3292y.h(createChooser, "createChooser(...)");
        return createChooser;
    }

    public final Intent c(PaymentBrowserAuthContract.a args) {
        AbstractC3292y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        h hVar = new h(this.f26280e, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String w8 = args.w();
        Intent putExtras = intent.putExtras(new C3237c(d8, 2, hVar, args.u(), lastPathSegment, null, w8, 32, null).u());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final boolean d() {
        Boolean bool = (Boolean) this.f26281f.get("has_launched");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Intent e(PaymentBrowserAuthContract.a args) {
        AbstractC3292y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String w8 = args.w();
        Intent putExtras = intent.putExtras(new C3237c(d8, 0, null, args.u(), lastPathSegment, null, w8, 38, null).u());
        AbstractC3292y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final void g(boolean z8) {
        this.f26281f.set("has_launched", Boolean.valueOf(z8));
    }
}
