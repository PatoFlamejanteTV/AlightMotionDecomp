package H1;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public class b extends a {
    public b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        h(webView);
    }
}
