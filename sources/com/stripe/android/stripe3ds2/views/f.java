package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class f extends WebViewClient {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28349b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private b f28350a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    public final void a(Uri uri) {
        b bVar;
        AbstractC3292y.i(uri, "uri");
        String uri2 = uri.toString();
        AbstractC3292y.h(uri2, "toString(...)");
        Locale ENGLISH = Locale.ENGLISH;
        AbstractC3292y.h(ENGLISH, "ENGLISH");
        String lowerCase = uri2.toLowerCase(ENGLISH);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (n.B(lowerCase, "https://emv3ds/challenge", false, 2, null) && (bVar = this.f28350a) != null) {
            bVar.a(uri.getQuery());
        }
    }

    public final void b(b bVar) {
        this.f28350a = bVar;
    }

    public final boolean c(Uri uri) {
        AbstractC3292y.i(uri, "uri");
        return URLUtil.isDataUrl(uri.toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(request, "request");
        Uri url = request.getUrl();
        AbstractC3292y.h(url, "getUrl(...)");
        a(url);
        Uri url2 = request.getUrl();
        AbstractC3292y.h(url2, "getUrl(...)");
        if (c(url2)) {
            return super.shouldInterceptRequest(view, request);
        }
        return new WebResourceResponse(null, null, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(request, "request");
        Uri url = request.getUrl();
        AbstractC3292y.h(url, "getUrl(...)");
        a(url);
        return true;
    }
}
