package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class a implements BrowserView.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f21417a = "a";

    /* renamed from: b, reason: collision with root package name */
    private int f21418b;

    /* renamed from: d, reason: collision with root package name */
    private String f21420d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21421e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f21422f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f21423g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f21424h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f21425i;

    /* renamed from: j, reason: collision with root package name */
    private Context f21426j;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f21428l;

    /* renamed from: o, reason: collision with root package name */
    private long f21431o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21419c = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21429m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f21430n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.f21417a, "webview js！超时上限：" + a.this.f21418b + "ms");
            if (a.this.f21425i != null && a.this.f21428l != null) {
                a.this.f21428l.setSuccess(false);
                a.this.f21428l.setUrl(a.this.f21420d);
                a.this.f21428l.setType(2);
                a.this.f21428l.setExceptionMsg("linktype 8 time out");
                a.this.f21425i.a(a.this.f21428l, a.this.f21424h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f21420d) && !a.this.f21429m) {
                a.this.f21429m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f21426j, a.this.f21420d, a.this.f21424h);
            }
            if (a.this.f21422f != null) {
                a.this.f21422f.onFinishRedirection(a.this.f21424h, a.this.f21420d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f21427k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f21418b = 10000;
        this.f21428l = null;
        this.f21426j = context;
        this.f21424h = campaignEx;
        this.f21423g = browserView;
        this.f21422f = baseTrackingListener;
        g b9 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 == null) {
            h.a();
            b9 = i.a();
        }
        this.f21425i = aVar;
        this.f21428l = new JumpLoaderResult();
        this.f21418b = (int) b9.aq();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f21426j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f21417a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http")) {
                                if (!parse2.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th2) {
                        ad.b(f21417a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f21426j, str)) {
                    ad.b(f21417a, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            ad.b(f21417a, th3.getMessage());
            return true;
        }
    }

    private boolean e(WebView webView, String str) {
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
                        if (!TextUtils.isEmpty(str2) && this.f21426j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            this.f21426j.startActivity(parseUri);
                            this.f21429m = true;
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b(f21417a, th.getMessage());
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
                        ad.b(f21417a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f21426j, str)) {
                    ad.b(f21417a, "openDeepLink");
                    this.f21429m = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b(f21417a, th3.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        ad.b(f21417a, "onPageFinished1  " + str);
        if (this.f21419c) {
            this.f21431o = 0L;
            this.f21419c = false;
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f21422f != null) {
                        a.this.f21422f.onFinishRedirection(a.this.f21424h, str);
                    }
                    if (a.this.f21425i != null && a.this.f21428l != null) {
                        a.this.f21428l.setSuccess(true);
                        a.this.f21428l.setUrl(str);
                        a.this.f21428l.setType(2);
                        a.this.f21425i.a(a.this.f21428l, a.this.f21424h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if ((parse.getScheme().equals("http") || parse.getScheme().equals("https")) && !this.f21429m) {
                this.f21429m = true;
                a(this.f21426j, str, this.f21424h);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        ad.b(f21417a, "shouldOverrideUrlLoading1  " + str);
        this.f21419c = false;
        if (ah.a.b(str) && ah.a.a(this.f21426j, str, null)) {
            this.f21429m = true;
        }
        boolean e8 = e(webView, str);
        if (e8) {
            this.f21431o = 0L;
            this.f21419c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f21425i != null && a.this.f21428l != null) {
                        a.this.f21428l.setSuccess(true);
                        a.this.f21428l.setUrl(str);
                        a.this.f21428l.setType(2);
                        a.this.f21425i.a(a.this.f21428l, a.this.f21424h, 1, true);
                    }
                    if (a.this.f21422f != null) {
                        a.this.f21422f.onFinishRedirection(a.this.f21424h, str);
                    }
                }
            });
        }
        return e8;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f21431o == 0) {
            this.f21431o = System.currentTimeMillis();
            if (!this.f21421e) {
                this.f21421e = true;
                d();
            }
        }
        this.f21420d = str;
        this.f21419c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f21431o == 0) {
            this.f21431o = System.currentTimeMillis();
            if (!this.f21421e) {
                this.f21421e = true;
                d();
            }
            this.f21429m = false;
        }
        this.f21420d = str;
        this.f21419c = true;
    }

    private void c() {
        this.f21427k.removeCallbacks(this.f21430n);
    }

    private void d() {
        this.f21427k.postDelayed(this.f21430n, this.f21418b);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i8, final String str, final String str2) {
        ad.d(f21417a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f21422f != null) {
                    a.this.f21422f.onFinishRedirection(a.this.f21424h, str2);
                }
                if (a.this.f21425i != null && a.this.f21428l != null) {
                    a.this.f21428l.setSuccess(false);
                    a.this.f21428l.setUrl(str2);
                    a.this.f21428l.setType(2);
                    a.this.f21428l.setExceptionMsg(str);
                    a.this.f21425i.a(a.this.f21428l, a.this.f21424h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.f21429m) {
            return;
        }
        this.f21429m = true;
        a(this.f21426j, str2, this.f21424h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i8 = MBCommonActivity.f19106d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f21440a.put(str, this.f21423g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f21422f, campaignEx, new ArrayList());
        }
    }
}
