package F1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f2119a = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f2120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2121b;

        a(g gVar, WebView webView, String str) {
            this.f2120a = webView;
            this.f2121b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2120a.loadUrl(this.f2121b);
        }
    }

    private g() {
    }

    public static final g a() {
        return f2119a;
    }

    public void b(WebView webView) {
        h(webView, "finishSession", new Object[0]);
    }

    public void c(WebView webView, float f8) {
        h(webView, "setDeviceVolume", Float.valueOf(f8));
    }

    public void d(WebView webView, String str) {
        h(webView, "setNativeViewHierarchy", str);
    }

    public void e(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            p(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    public void f(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            h(webView, "publishMediaEvent", str, jSONObject);
        } else {
            h(webView, "publishMediaEvent", str);
        }
    }

    public void g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        h(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void h(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            k(sb, objArr);
            sb.append(")}");
            i(webView, sb);
            return;
        }
        I1.d.a("The WebView is null for " + str);
    }

    void i(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler != null && Looper.myLooper() != handler.getLooper()) {
            handler.post(new a(this, webView, sb2));
        } else {
            webView.loadUrl(sb2);
        }
    }

    public void j(WebView webView, JSONObject jSONObject) {
        h(webView, "init", jSONObject);
    }

    void k(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    public void l(WebView webView) {
        h(webView, "publishImpressionEvent", new Object[0]);
    }

    public void m(WebView webView, String str) {
        h(webView, "setState", str);
    }

    public void n(WebView webView, JSONObject jSONObject) {
        h(webView, "publishLoadedEvent", jSONObject);
    }

    public void o(WebView webView, JSONObject jSONObject) {
        h(webView, "setLastActivity", jSONObject);
    }

    public boolean p(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
        return false;
    }
}
