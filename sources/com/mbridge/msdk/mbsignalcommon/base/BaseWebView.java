package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class BaseWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    protected Context f21714a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnTouchListener f21715b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnTouchListener f21716c;
    public long lastTouchTime;
    public b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f21716c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f21715b != null) {
                    return BaseWebView.this.f21715b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f21714a = context;
        a();
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(a aVar) {
        b bVar = this.mWebViewClient;
        if (bVar != null && (bVar instanceof b)) {
            bVar.a(aVar);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f21715b = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof b) {
            this.mWebViewClient = (b) webViewClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (this.mWebViewClient == null) {
            b bVar = new b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable th) {
            ad.b("BaseWebView", th.getMessage());
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e8) {
            ad.b("BaseWebView", e8.getMessage());
        }
        settings.setDatabaseEnabled(true);
        String path = this.f21714a.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception e9) {
            ad.b("BaseWebView", e9.getMessage());
        }
        super.setOnTouchListener(this.f21716c);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f21716c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f21715b != null) {
                    return BaseWebView.this.f21715b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f21714a = context;
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.lastTouchTime = 0L;
        this.f21716c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f21715b != null) {
                    return BaseWebView.this.f21715b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.f21714a = context;
        a();
    }
}
