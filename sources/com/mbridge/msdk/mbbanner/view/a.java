package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.b;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f21702a;

    /* renamed from: b, reason: collision with root package name */
    List<CampaignEx> f21703b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.mbbanner.common.b.a f21704c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21705d = "BannerWebViewClient";

    public a(String str, List<CampaignEx> list, com.mbridge.msdk.mbbanner.common.b.a aVar) {
        this.f21702a = str;
        this.f21703b = list;
        this.f21704c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.mbbanner.view.a.1
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            ad.a("BannerWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            ad.b("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.mbridge.msdk.click.b.a.f19344c && com.mbridge.msdk.click.b.a.a(this.f21703b.get(0), baseWebView.getUrl(), com.mbridge.msdk.click.b.a.f19343b)) {
                return false;
            }
            if (this.f21703b.size() > 1) {
                c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21704c;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable th) {
            ad.a("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
