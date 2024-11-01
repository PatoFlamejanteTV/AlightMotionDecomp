package com.mbridge.msdk.mbsignalcommon.b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.d;

/* loaded from: classes4.dex */
public class b implements d {
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, String str, Bitmap bitmap) {
        ad.a("WindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public boolean b(WebView webView, String str) {
        ad.a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void c(WebView webView, int i8) {
        ad.a("WindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, int i8, String str, String str2) {
        ad.a("WindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void b(WebView webView, int i8) {
        ad.a("WindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        ad.a("WindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, String str) {
        ad.a("WindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView, int i8) {
        ad.a("WindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.d
    public void a(WebView webView) {
        ad.a("WindVaneWebView", "onRenderProcessGone");
    }
}
