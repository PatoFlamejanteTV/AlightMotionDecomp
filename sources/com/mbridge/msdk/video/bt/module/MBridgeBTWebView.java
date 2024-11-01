package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.f.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.mbsignalcommon.b.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* renamed from: p, reason: collision with root package name */
    private String f23193p;

    /* renamed from: q, reason: collision with root package name */
    private String f23194q;

    /* renamed from: r, reason: collision with root package name */
    private String f23195r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23196s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f23197t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23198u;

    /* renamed from: v, reason: collision with root package name */
    private c f23199v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f23200w;

    /* renamed from: x, reason: collision with root package name */
    private WebView f23201x;

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f23196s = false;
        this.f23198u = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f23018n);
                jSONObject2.put("id", this.f23023d);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                g.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a((WebView) this.webView, "broadcast", this.f23023d);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.f23201x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f23023d);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f23200w;
    }

    public String getFilePath() {
        return this.f23194q;
    }

    public String getFileURL() {
        return this.f23193p;
    }

    public String getHtml() {
        return this.f23195r;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f23021b;
    }

    public c getRewardUnitSetting() {
        return this.f23199v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int i8;
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.f23021b, this.f23200w);
        this.jsCommon = kVar;
        kVar.a(this.f23022c);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.a
            public final void a(Object obj) {
                super.a(obj);
                try {
                    k kVar2 = MBridgeBTWebView.this.jsCommon;
                    String str = "";
                    String c8 = kVar2 != null ? kVar2.c() : "";
                    if (TextUtils.isEmpty(c8)) {
                        ad.a("RVWindVaneWebView", "getEndScreenInfo failed");
                    } else {
                        str = Base64.encodeToString(c8.getBytes(), 2);
                        ad.a("RVWindVaneWebView", "getEndScreenInfo success");
                    }
                    g.a().a(obj, str);
                } catch (Throwable th) {
                    ad.a("RVWindVaneWebView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                if (MBridgeBTWebView.this.f23201x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject.put("code", BTBaseView.f23018n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject2.put("result", 1);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f23201x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(MBridgeBTWebView.this.f23201x, e8.getMessage());
                        ad.a("RVWindVaneWebView", e8.getMessage());
                    }
                }
                g.a().a(MBridgeBTWebView.this.webView);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i9, String str, String str2) {
                super.a(webView, i9, str, str2);
                if (MBridgeBTWebView.this.f23201x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject.put("code", BTBaseView.f23018n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f23201x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(MBridgeBTWebView.this.f23201x, e8.getMessage());
                        ad.a("RVWindVaneWebView", e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f23201x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject.put("code", BTBaseView.f23018n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f23023d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, sslError.toString());
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f23201x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(MBridgeBTWebView.this.f23201x, e8.getMessage());
                        ad.a("RVWindVaneWebView", e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i9) {
                super.a(webView, i9);
            }
        });
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f23201x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f23018n);
                        jSONObject.put("id", MBridgeBTWebView.this.f23023d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f23201x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        d.c().a(MBridgeBTWebView.this.f23201x, "onClicked", MBridgeBTWebView.this.f23023d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f23197t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f23197t.setLayoutParams(layoutParams);
            ImageView imageView2 = this.f23197t;
            if (this.f23196s) {
                i8 = 4;
            } else {
                i8 = 8;
            }
            imageView2.setVisibility(i8);
            CampaignEx campaignEx = this.f23021b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f23197t.setVisibility(4);
            }
            this.f23197t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f23197t);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            d.c().a((WebView) this.webView, "onSystemBackPressed", this.f23023d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f23023d);
                g.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f23198u) {
            return;
        }
        this.f23198u = true;
        try {
            if (this.webView != null) {
                d.c().a((WebView) this.webView, "onSystemDestory", this.f23023d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                        if (windVaneWebView != null) {
                            windVaneWebView.clearWebView();
                            MBridgeBTWebView.this.webView.release();
                        }
                        MBridgeBTWebView.this.f23193p = null;
                        MBridgeBTWebView.this.f23194q = null;
                        MBridgeBTWebView.this.f23195r = null;
                        if (MBridgeBTWebView.this.f23201x != null) {
                            MBridgeBTWebView.this.f23201x = null;
                        }
                    } catch (Throwable th) {
                        ad.a(BTBaseView.TAG, th.getMessage());
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.f23021b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f23021b.setClickURL(str);
                reportOpen(str);
            }
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f23022c);
            aVar.a(this);
            aVar.a(this.f23021b);
            this.f23021b.setClickURL(clickURL);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f23193p)) {
            this.webView.loadUrl(this.f23193p);
        } else if (!TextUtils.isEmpty(this.f23194q)) {
            this.webView.loadUrl(this.f23194q);
        } else if (!TextUtils.isEmpty(this.f23195r)) {
            this.webView.loadDataWithBaseURL("", this.f23195r, "text/html", C.UTF8_NAME, null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new i(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f23022c, str, this.f23021b.isBidCampaign());
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f23200w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f23201x = webView;
    }

    public void setFilePath(String str) {
        this.f23194q = str;
    }

    public void setFileURL(String str) {
        this.f23193p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                com.mbridge.msdk.mbsignalcommon.base.c cVar = new com.mbridge.msdk.mbsignalcommon.base.c();
                WindVaneWebView windVaneWebView = this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public void setHtml(String str) {
        this.f23195r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(c cVar) {
        this.f23199v = cVar;
    }

    public void setTempTypeForMetrics(int i8) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i8);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z8) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z8);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z8) {
        int i8;
        try {
            ImageView imageView = this.f23197t;
            if (z8) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            imageView.setVisibility(i8);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null && windVaneWebView.canGoBack()) {
            this.webView.goBack();
            return true;
        }
        return false;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null && windVaneWebView.canGoForward()) {
            this.webView.goForward();
            return true;
        }
        return false;
    }

    public void webviewLoad(int i8) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.f23021b, this.f23200w);
        }
        CampaignEx campaignEx = this.f23021b;
        if (campaignEx != null) {
            this.jsCommon.a(campaignEx);
        } else {
            List<CampaignEx> list = this.f23200w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f23200w);
                if (this.f23200w.size() == 1) {
                    this.jsCommon.a(this.f23200w.get(0));
                }
            }
        }
        c cVar = this.f23199v;
        if (cVar != null) {
            this.jsCommon.a(cVar);
        }
        this.jsCommon.a(this.f23022c);
        this.jsCommon.c(this.f23023d);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i8 == 1) {
            this.jsCommon.n();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f23021b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f23197t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.reload();
            return true;
        }
        return false;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23196s = false;
        this.f23198u = false;
    }
}
