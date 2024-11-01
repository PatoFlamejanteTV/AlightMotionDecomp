package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes4.dex */
public class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private a f21718a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.windvane.d f21719b;

    public final void a(a aVar) {
        this.f21718a = aVar;
    }

    public final a b() {
        return this.f21718a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        com.mbridge.msdk.mbsignalcommon.windvane.d dVar = this.f21719b;
        if (dVar != null) {
            dVar.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i8, String str, String str2) {
        super.onReceivedError(webView, i8, str, str2);
        com.mbridge.msdk.mbsignalcommon.windvane.d dVar = this.f21719b;
        if (dVar != null) {
            dVar.a(webView, i8, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.mbsignalcommon.windvane.d dVar = this.f21719b;
        if (dVar != null) {
            dVar.a(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ad.b("BaseWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                ad.b("BaseWebViewClient", th.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.mbsignalcommon.windvane.d dVar = this.f21719b;
        if (dVar != null) {
            dVar.a(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a aVar = this.f21718a;
        if (aVar != null && aVar.a(str)) {
            return true;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.d dVar = this.f21719b;
        if (dVar != null) {
            dVar.b(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void a(com.mbridge.msdk.mbsignalcommon.windvane.d dVar) {
        this.f21719b = dVar;
    }
}
