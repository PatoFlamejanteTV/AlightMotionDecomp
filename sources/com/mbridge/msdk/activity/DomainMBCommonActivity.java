package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.webview.BrowserView;

/* loaded from: classes4.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    String f19097a = "";

    /* renamed from: b, reason: collision with root package name */
    private final BrowserView.a f19098b = new BrowserView.a() { // from class: com.mbridge.msdk.activity.DomainMBCommonActivity.1
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, int i8, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final boolean b(WebView webView, String str) {
            ad.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (ah.a.b(str) && ah.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void c(WebView webView, String str) {
            ad.b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str, Bitmap bitmap) {
            ad.b("MBCommonActivity", "onPageStarted  " + str);
        }
    };
    protected BrowserView browserView;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f19099c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            ad.b("MBCommonActivity", th.getMessage());
        }
        if (c.m().c() == null) {
            c.m().b(getApplicationContext());
        }
        c.m().a(this);
        String stringExtra = getIntent().getStringExtra("url");
        this.f19097a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f19099c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            if (com.mbridge.msdk.foundation.webview.b.f21440a.containsKey(this.f19097a)) {
                BrowserView browserView = com.mbridge.msdk.foundation.webview.b.f21440a.get(this.f19097a);
                this.browserView = browserView;
                if (browserView != null) {
                    browserView.setListener(this.f19098b);
                }
            } else {
                BrowserView browserView2 = new BrowserView(this, this.f19099c);
                this.browserView = browserView2;
                browserView2.setListener(this.f19098b);
                this.browserView.loadUrl(this.f19097a);
            }
            BrowserView browserView3 = this.browserView;
            if (browserView3 != null) {
                ar.a(browserView3);
                setContentView(this.browserView);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            startActivityForResult(parseUri, 0);
                            finish();
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b("MBCommonActivity", th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        ad.b("MBCommonActivity", th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this, str)) {
                    ad.b("MBCommonActivity", "openDeepLink");
                    finish();
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b("MBCommonActivity", th3.getMessage());
            return false;
        }
    }
}
