package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebChromeClient> f21784a = new CopyOnWriteArrayList<>();

    public final void a(WebChromeClient webChromeClient) {
        this.f21784a.add(webChromeClient);
    }

    public final void b(WebChromeClient webChromeClient) {
        this.f21784a.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i8, String str2) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, i8, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().onCreateWindow(webView, z8, z9, message);
        }
        return z10;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j8, j9, j10, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onJsTimeout();
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f21784a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e8) {
            ad.b("CommonWebChromeClient", e8.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f21784a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e8) {
            ad.b("CommonWebChromeClient", e8.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i8) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i8);
        }
    }

    public final void onReachedMaxAppCacheSize(long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onReachedMaxAppCacheSize(j8, j9, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z8) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z8);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z8 = false;
        try {
            Iterator<WebChromeClient> it = this.f21784a.iterator();
            while (it.hasNext()) {
                z8 = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        } catch (Exception e8) {
            ad.b("CommonWebChromeClient", e8.getMessage());
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = it.next().onConsoleMessage(consoleMessage);
        }
        return z8;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f21784a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, i8, customViewCallback);
        }
    }
}
