package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f21854a = new g();

    private g() {
    }

    public static g a() {
        return f21854a;
    }

    public final void b(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", aVar.f21837g);
            } else {
                str = j.c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", aVar.f21837g, str);
            WindVaneWebView windVaneWebView = aVar.f21832b;
            if (windVaneWebView != null && !windVaneWebView.isDestoryed()) {
                try {
                    aVar.f21832b.loadUrl(format);
                } catch (Exception e8) {
                    e8.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, j.c(str2));
            }
            WindVaneWebView windVaneWebView = aVar.f21832b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f21832b.loadUrl(format);
            } catch (Exception e8) {
                e8.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, j.c(str2));
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(format);
            } catch (Exception e8) {
                e8.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String format = TextUtils.isEmpty(str) ? String.format("javascript:window.WindVane.onSuccess(%s,'');", aVar.f21837g) : String.format("javascript:window.WindVane.onSuccess(%s,'%s');", aVar.f21837g, j.c(str));
            WindVaneWebView windVaneWebView = aVar.f21832b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f21832b.loadUrl(format);
            } catch (Exception e8) {
                e8.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            f21854a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f21730j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            f21854a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f21730j, "");
        } catch (Throwable unused2) {
            f21854a.a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f21730j, "");
        }
    }
}
