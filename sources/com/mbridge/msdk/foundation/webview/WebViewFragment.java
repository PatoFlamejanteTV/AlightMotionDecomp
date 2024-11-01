package com.mbridge.msdk.foundation.webview;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;

/* loaded from: classes4.dex */
public class WebViewFragment extends BaseFragment {
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowserView browserView = new BrowserView(getActivity());
        browserView.loadUrl(getActivity().getIntent().getExtras().getString(NotificationCompat.CATEGORY_MESSAGE));
        browserView.setListener(new BrowserView.a() { // from class: com.mbridge.msdk.foundation.webview.WebViewFragment.1
            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final void a(WebView webView, int i8, String str, String str2) {
            }

            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final boolean b(WebView webView, String str) {
                return false;
            }

            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final void c(WebView webView, String str) {
            }

            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final void a(WebView webView, String str) {
            }

            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final void a() {
                WebViewFragment.this.getActivity().finish();
            }

            @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (ah.a.b(str) && ah.a.a(WebViewFragment.this.getActivity().getApplicationContext(), str, null)) {
                    WebViewFragment.this.getActivity().finish();
                }
            }
        });
        return browserView;
    }
}
