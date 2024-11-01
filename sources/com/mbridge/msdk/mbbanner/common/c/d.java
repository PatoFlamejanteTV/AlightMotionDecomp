package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.common.b.f;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    private float f21606A;

    /* renamed from: B, reason: collision with root package name */
    private float f21607B;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.b.c f21611a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f21612b;

    /* renamed from: c, reason: collision with root package name */
    protected final MBBannerView f21613c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f21614d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f21615e;

    /* renamed from: f, reason: collision with root package name */
    com.mbridge.msdk.click.a f21616f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21617g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f21618h;

    /* renamed from: i, reason: collision with root package name */
    private MBBannerWebView f21619i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f21620j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f21621k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21622l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21623m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21624n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21625o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21626p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21627q;

    /* renamed from: r, reason: collision with root package name */
    private final String f21628r;

    /* renamed from: s, reason: collision with root package name */
    private List<CampaignEx> f21629s;

    /* renamed from: u, reason: collision with root package name */
    private int f21631u;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.communication.a f21633w;

    /* renamed from: x, reason: collision with root package name */
    private C1.b f21634x;

    /* renamed from: t, reason: collision with root package name */
    private int f21630t = 1;

    /* renamed from: v, reason: collision with root package name */
    private final long f21632v = 15000;

    /* renamed from: y, reason: collision with root package name */
    private final Handler f21635y = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.mbbanner.common.c.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (d.this.f21634x != null) {
                        C1.a.a(d.this.f21634x).b();
                        d.this.f21634x.c();
                        d.this.f21634x = null;
                    }
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage());
                }
            }
        }
    };

    /* renamed from: z, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.e.a f21636z = new com.mbridge.msdk.foundation.same.e.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.6
        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            d.this.a("banner render failed because render is timeout");
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f21608C = new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            if (dVar.f21614d) {
                d.b(dVar);
            }
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f21609D = new com.mbridge.msdk.mbbanner.common.b.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.8
        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(int i8) {
            if (i8 == 2) {
                d.c(d.this);
            } else {
                d.this.f();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void b(int i8) {
            if (i8 == 1) {
                d.this.d();
                d.this.a("", 1);
            } else {
                d.this.c();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(String str) {
            d.b(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a() {
            d.b(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8) {
            d dVar = d.this;
            if (dVar.f21611a != null) {
                dVar.f21627q = z8;
                if (z8) {
                    d.this.f21611a.c();
                } else {
                    d.this.f21611a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8, String str) {
            try {
                if (d.this.f21611a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f21611a.a();
                        d.this.f21611a.b();
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f21612b));
                        parseCampaignWithBackData.setClickURL(str);
                        d.this.a(parseCampaignWithBackData, z8, str);
                    }
                }
            } catch (Exception e8) {
                ad.b("BannerShowManager", e8.getMessage());
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.b.b f21610E = new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.c.d.4
        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            d.this.f21624n = true;
            ad.b("BannerCallJS", "fireOnJSBridgeConnected");
            g.a().a(webView);
            d.this.f21626p = true;
            CampaignEx campaignEx = d.this.f21612b;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.d();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            d.this.a(str);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            d.this.c();
        }
    };

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z8, k kVar) {
        this.f21617g = z8;
        this.f21613c = mBBannerView;
        this.f21615e = str2;
        this.f21628r = str;
        this.f21611a = new f(cVar, kVar);
    }

    static /* synthetic */ void l(d dVar) {
        if (dVar.f21618h != null) {
            MBBannerWebView mBBannerWebView = dVar.f21619i;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (dVar.f21618h.getVisibility() != 0) {
                dVar.f21618h.setVisibility(0);
            }
            if (dVar.f21613c != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                dVar.f21618h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (dVar.f21618h.getParent() == null) {
                    dVar.f21613c.addView(dVar.f21618h, layoutParams);
                }
                dVar.d(true);
            }
        }
    }

    public void a(CampaignEx campaignEx, boolean z8, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f21613c != null) {
            MBBannerWebView mBBannerWebView = this.f21619i;
            if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
                this.f21613c.removeView(this.f21619i);
            }
            if (this.f21618h == null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                this.f21618h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.10
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        d.this.f21606A = motionEvent.getRawX();
                        d.this.f21607B = motionEvent.getRawY();
                        ad.b("BannerShowManager", d.this.f21606A + "  " + d.this.f21607B);
                        return false;
                    }
                });
                this.f21618h.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.f21606A, d.this.f21607B), d.this.f21612b), false, "");
                    }
                });
            }
            String imageUrl = this.f21612b.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbbanner.common.c.d.12
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        d.this.a("banner show failed because banner default view is exception");
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (d.this.f21618h != null) {
                            d.this.f21618h.setImageBitmap(bitmap);
                        }
                        d.this.f21624n = true;
                        d.l(d.this);
                        d.this.f();
                        d.this.g();
                        d dVar = d.this;
                        if (!dVar.f21614d) {
                            dVar.d();
                        }
                    }
                });
                return;
            } else {
                a("banner show failed because campain is exception");
                return;
            }
        }
        a("banner show failed because banner view is exception");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.d():void");
    }

    private synchronized boolean e() {
        boolean isReport;
        isReport = this.f21612b.isReport();
        if (!isReport) {
            this.f21612b.setReport(true);
        }
        return isReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (!this.f21617g || (imageView = this.f21620j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f21620j.setVisibility(0);
            this.f21620j.setOnClickListener(this.f21608C);
        }
        if (this.f21620j.getParent() != null || this.f21613c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f21613c.addView(this.f21620j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f21613c == null) {
            return;
        }
        CampaignEx campaignEx = this.f21612b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
            mBAdChoice.setCampaign(this.f21612b);
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.2
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f21613c.addView(mBAdChoice, layoutParams);
        }
    }

    private boolean b() {
        String a9 = a(this.f21612b);
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        if (this.f21613c != null) {
            if (this.f21619i == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    this.f21619i = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f21619i.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f21615e, this.f21629s, this.f21609D));
                } catch (Throwable unused) {
                    a("banner show failed because WebView is not available and try to show default", 1);
                    return false;
                }
            }
            ImageView imageView = this.f21618h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f21619i.getVisibility() != 0) {
                this.f21619i.setVisibility(0);
            }
            if (this.f21619i.getParent() == null) {
                this.f21613c.addView(this.f21619i);
                d(this.f21612b.isMraid());
            }
            if (this.f21612b.isMraid()) {
                g();
            }
            f();
            com.mbridge.msdk.mbbanner.common.communication.a aVar = new com.mbridge.msdk.mbbanner.common.communication.a(this.f21613c.getContext(), this.f21628r, this.f21615e);
            this.f21633w = aVar;
            aVar.a(this.f21629s);
            this.f21633w.a(this.f21609D);
            this.f21633w.a(this.f21631u);
            this.f21619i.setWebViewListener(this.f21610E);
            this.f21619i.setObject(this.f21633w);
            if (!a9.startsWith("file")) {
                if (this.f21612b.isActiveOm()) {
                    a9 = com.mbridge.msdk.a.b.c(a9);
                }
                this.f21619i.loadDataWithBaseURL(this.f21612b.getBannerUrl(), a9, "text/html", "utf-8", null);
            } else {
                this.f21619i.loadUrl(a9);
            }
            MBBannerWebView mBBannerWebView2 = this.f21619i;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        try {
                            if (d.this.f21619i != null) {
                                if (d.this.f21630t == 2) {
                                    str = "false";
                                } else {
                                    str = "true";
                                }
                                d.this.f21619i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                }, 1000L);
            }
        } else {
            a("banner render failed because banner view is null", 2);
            a("banner show failed because banner view is exception");
        }
        return true;
    }

    public final void a(boolean z8, int i8) {
        this.f21631u = i8;
        if (i8 == 0) {
            k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21615e);
            if (d8 == null) {
                return;
            } else {
                z8 = d8.f() == 1;
            }
        }
        this.f21617g = z8;
    }

    public final void a(boolean z8) {
        this.f21617g = z8;
    }

    private String a(CampaignEx campaignEx) {
        String str;
        String str2 = "";
        if (campaignEx == null) {
            return "";
        }
        String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(htmlContentFromUrl)) {
            String bannerHtml = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(bannerHtml);
                    if (file.exists()) {
                        str2 = ab.b(file);
                    }
                    str = B1.b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, str2);
                } catch (Exception unused) {
                    File file2 = new File(bannerHtml);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        str = "file:////" + bannerHtml;
                    }
                }
                return str;
            }
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                str = "file:////" + bannerHtml;
                return str;
            }
            return bannerHtml;
        }
        return B1.b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, htmlContentFromUrl);
    }

    public final void c(boolean z8) {
        this.f21623m = z8;
        d();
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(context)).a(campaignEx.getId());
                    } catch (Exception e8) {
                        ad.b("BannerShowManager", e8.getMessage());
                    }
                }
            }).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f19311g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    static /* synthetic */ void c(d dVar) {
        ImageView imageView;
        if (dVar.f21617g && (imageView = dVar.f21620j) != null && imageView.getVisibility() == 0) {
            dVar.f21620j.setVisibility(8);
            dVar.f21620j.setOnClickListener(null);
            if (dVar.f21613c == null || dVar.f21620j.getParent() == null) {
                return;
            }
            dVar.f21613c.removeView(dVar.f21620j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f21612b == null || e()) {
            return;
        }
        this.f21635y.removeCallbacks(this.f21636z);
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.f21611a;
        if (cVar != null) {
            cVar.a(str);
        }
        com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f21612b, this.f21615e, str);
    }

    public final void a() {
        C1.b bVar = this.f21634x;
        if (bVar != null) {
            bVar.c();
            this.f21634x = null;
            ad.a("omsdk", " adSession.finish() ");
        }
        if (this.f21611a != null) {
            this.f21611a = null;
        }
        MBBannerWebView mBBannerWebView = this.f21619i;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.f21610E != null) {
            this.f21610E = null;
        }
        ImageView imageView = this.f21620j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f21618h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f21613c;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f21619i;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.a aVar = this.f21633w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f21609D != null) {
            this.f21609D = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f21615e);
    }

    public final void b(boolean z8) {
        this.f21622l = z8;
        d();
        if (z8) {
            return;
        }
        CampaignEx campaignEx = this.f21612b;
        String str = this.f21615e;
        if (campaignEx != null) {
            String a9 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            new i(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a9, campaignEx.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f19312h);
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    static /* synthetic */ void b(d dVar) {
        MBBannerWebView mBBannerWebView = dVar.f21619i;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            dVar.f21613c.removeView(dVar.f21619i);
        }
        ImageView imageView = dVar.f21618h;
        if (imageView != null && imageView.getParent() != null) {
            dVar.f21618h.setVisibility(8);
            dVar.f21613c.removeView(dVar.f21618h);
        }
        ImageView imageView2 = dVar.f21620j;
        if (imageView2 != null && imageView2.getParent() != null) {
            dVar.f21613c.removeView(dVar.f21620j);
            dVar.f21620j.setVisibility(8);
        }
        com.mbridge.msdk.foundation.d.b.a().c(dVar.f21615e);
        ImageView imageView3 = dVar.f21621k;
        if (imageView3 != null && imageView3.getParent() != null) {
            dVar.f21613c.removeView(dVar.f21621k);
            dVar.f21621k.setVisibility(8);
        }
        com.mbridge.msdk.mbbanner.common.a.a a9 = com.mbridge.msdk.mbbanner.common.a.a.a().b(dVar.f21615e).d(dVar.f21612b.getRequestId()).e(dVar.f21612b.getRequestIdNotice()).c(dVar.f21612b.getId()).f(dVar.f21612b.getCreativeId() + "").a(dVar.f21612b.isBidCampaign());
        String str = dVar.f21615e;
        if (a9 != null) {
            a9.a("2000069");
            if (e.a().b()) {
                e.a().a(a9.b());
            } else {
                com.mbridge.msdk.foundation.same.report.h.a(a9.b(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
        BannerUtils.inserCloseId(dVar.f21615e, dVar.f21629s);
        com.mbridge.msdk.mbbanner.common.b.c cVar = dVar.f21611a;
        if (cVar != null) {
            cVar.e();
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i8) {
        if (this.f21612b != null) {
            com.mbridge.msdk.mbbanner.common.d.a.a(com.mbridge.msdk.mbbanner.common.a.a.a().c(this.f21612b.getId()).b(this.f21615e).d(this.f21612b.getRequestId()).e(this.f21612b.getRequestIdNotice()).g(str).a(i8).a(this.f21612b.isBidCampaign()), this.f21615e);
        }
    }

    public final void a(int i8, int i9, int i10, int i11) {
        if (i8 == i10 && i9 == i11) {
            return;
        }
        MBBannerWebView mBBannerWebView = this.f21619i;
        ad.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBBannerWebView, i8, i9);
        } catch (Throwable th) {
            ad.a("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignUnit r5) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    private void d(boolean z8) {
        if (this.f21613c != null) {
            View b9 = com.mbridge.msdk.foundation.d.b.a().b(this.f21615e);
            if (com.mbridge.msdk.foundation.d.b.a().b() && z8 && b9 != null) {
                ViewGroup viewGroup = (ViewGroup) b9.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b9);
                }
                b9.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f20402b, com.mbridge.msdk.foundation.d.b.f20401a);
                }
                layoutParams.addRule(12);
                b9.setLayoutParams(layoutParams);
                this.f21613c.addView(b9);
            }
            com.mbridge.msdk.foundation.d.b.a().a(this.f21615e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.5
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    d.this.f21613c.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    d.this.f21613c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    d.this.f21613c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f21619i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.f21612b.setCampaignUnitId(this.f21615e);
            com.mbridge.msdk.foundation.d.b.a().a(this.f21615e, this.f21612b);
        }
    }
}
