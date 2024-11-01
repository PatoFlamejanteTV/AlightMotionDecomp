package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public interface d {
    void a(WebView webView);

    void a(WebView webView, int i8);

    void a(WebView webView, int i8, String str, String str2);

    void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void a(WebView webView, String str);

    void a(WebView webView, String str, Bitmap bitmap);

    void b(WebView webView, int i8);

    boolean b(WebView webView, String str);

    void c(WebView webView, int i8);
}
