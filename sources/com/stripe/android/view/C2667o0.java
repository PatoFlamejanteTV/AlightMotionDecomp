package com.stripe.android.view;

import Q5.s;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2667o0 extends WebViewClient {

    /* renamed from: i, reason: collision with root package name */
    public static final a f29129i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f29130j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f29131k = R5.a0.d("https://hooks.stripe.com/three_d_secure/authenticate");

    /* renamed from: l, reason: collision with root package name */
    private static final Set f29132l = R5.a0.i("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete");

    /* renamed from: a, reason: collision with root package name */
    private final v2.d f29133a;

    /* renamed from: b, reason: collision with root package name */
    private final q6.w f29134b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29135c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f29136d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f29137e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f29138f;

    /* renamed from: g, reason: collision with root package name */
    private String f29139g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29140h;

    /* renamed from: com.stripe.android.view.o0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            Set set = C2667o0.f29131k;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (l6.n.B(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(String url) {
            AbstractC3292y.i(url, "url");
            Set set = C2667o0.f29132l;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (l6.n.B(url, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2667o0(v2.d logger, q6.w isPageLoaded, String clientSecret, String str, Function1 activityStarter, Function1 activityFinisher) {
        Uri uri;
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(isPageLoaded, "isPageLoaded");
        AbstractC3292y.i(clientSecret, "clientSecret");
        AbstractC3292y.i(activityStarter, "activityStarter");
        AbstractC3292y.i(activityFinisher, "activityFinisher");
        this.f29133a = logger;
        this.f29134b = isPageLoaded;
        this.f29135c = clientSecret;
        this.f29136d = activityStarter;
        this.f29137e = activityFinisher;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        this.f29138f = uri;
    }

    private final void c() {
        this.f29133a.b("PaymentAuthWebViewClient#hideProgressBar()");
        this.f29134b.setValue(Boolean.TRUE);
    }

    private final boolean d(Uri uri) {
        if (!AbstractC3292y.d("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            String uri2 = uri.toString();
            AbstractC3292y.h(uri2, "toString(...)");
            if (!l6.n.B(uri2, "stripesdk://payment_return_url/", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    private final boolean e(Uri uri) {
        String str;
        this.f29133a.b("PaymentAuthWebViewClient#isReturnUrl()");
        if (d(uri)) {
            return true;
        }
        Uri uri2 = this.f29138f;
        if (uri2 != null) {
            if (uri2.getScheme() != null && AbstractC3292y.d(this.f29138f.getScheme(), uri.getScheme()) && this.f29138f.getHost() != null && AbstractC3292y.d(this.f29138f.getHost(), uri.getHost())) {
                return true;
            }
            return false;
        }
        if (uri.isOpaque()) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("payment_intent_client_secret")) {
            str = uri.getQueryParameter("payment_intent_client_secret");
        } else if (queryParameterNames.contains("setup_intent_client_secret")) {
            str = uri.getQueryParameter("setup_intent_client_secret");
        } else {
            str = null;
        }
        return AbstractC3292y.d(this.f29135c, str);
    }

    private final void f(Throwable th) {
        this.f29133a.b("PaymentAuthWebViewClient#onAuthCompleted()");
        this.f29137e.invoke(th);
    }

    static /* synthetic */ void g(C2667o0 c2667o0, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        c2667o0.f(th);
    }

    private final void h(Intent intent) {
        Object b9;
        this.f29133a.b("PaymentAuthWebViewClient#openIntent()");
        try {
            s.a aVar = Q5.s.f8810b;
            this.f29136d.invoke(intent);
            b9 = Q5.s.b(Q5.I.f8786a);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e8 = Q5.s.e(b9);
        if (e8 != null) {
            this.f29133a.a("Failed to start Intent.", e8);
            if (!AbstractC3292y.d(intent.getScheme(), "alipays")) {
                f(e8);
            }
        }
    }

    private final void i(Uri uri) {
        Object b9;
        this.f29133a.b("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            s.a aVar = Q5.s.f8810b;
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            AbstractC3292y.h(parseUri, "parseUri(...)");
            h(parseUri);
            b9 = Q5.s.b(Q5.I.f8786a);
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e8 = Q5.s.e(b9);
        if (e8 != null) {
            this.f29133a.a("Failed to start Intent.", e8);
            f(e8);
        }
    }

    private final void k(Uri uri) {
        String str;
        this.f29133a.b("PaymentAuthWebViewClient#updateCompletionUrl()");
        a aVar = f29129i;
        String uri2 = uri.toString();
        AbstractC3292y.h(uri2, "toString(...)");
        if (aVar.b(uri2)) {
            str = uri.getQueryParameter("return_url");
        } else {
            str = null;
        }
        if (str != null && !l6.n.T(str)) {
            this.f29139g = str;
        }
    }

    public final void j(boolean z8) {
        this.f29140h = z8;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        AbstractC3292y.i(view, "view");
        this.f29133a.b("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(view, str);
        if (!this.f29140h) {
            c();
        }
        if (str != null && f29129i.c(str)) {
            this.f29133a.b(str + " is a completion URL");
            g(this, null, 1, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(request, "request");
        Uri url = request.getUrl();
        this.f29133a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        AbstractC3292y.f(url);
        k(url);
        if (e(url)) {
            this.f29133a.b("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            g(this, null, 1, null);
            return true;
        }
        if (l6.n.s("intent", url.getScheme(), true)) {
            i(url);
            return true;
        }
        if (!URLUtil.isNetworkUrl(url.toString())) {
            h(new Intent("android.intent.action.VIEW", url));
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }
}
