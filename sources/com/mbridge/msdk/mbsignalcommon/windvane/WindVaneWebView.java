package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

/* loaded from: classes4.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: b, reason: collision with root package name */
    protected k f21816b;

    /* renamed from: c, reason: collision with root package name */
    protected c f21817c;

    /* renamed from: d, reason: collision with root package name */
    protected f f21818d;

    /* renamed from: e, reason: collision with root package name */
    private Object f21819e;

    /* renamed from: f, reason: collision with root package name */
    private Object f21820f;

    /* renamed from: g, reason: collision with root package name */
    private String f21821g;

    /* renamed from: h, reason: collision with root package name */
    private d f21822h;

    /* renamed from: i, reason: collision with root package name */
    private String f21823i;

    /* renamed from: j, reason: collision with root package name */
    private String f21824j;

    /* renamed from: k, reason: collision with root package name */
    private CampaignEx f21825k;

    /* renamed from: l, reason: collision with root package name */
    private int f21826l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21827m;

    /* renamed from: n, reason: collision with root package name */
    private float f21828n;

    /* renamed from: o, reason: collision with root package name */
    private float f21829o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f21827m = false;
        this.f21828n = 0.0f;
        this.f21829o = 0.0f;
    }

    public void clearWebView() {
        if (!this.f21827m) {
            loadUrl("about:blank");
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f21825k;
    }

    public String getCampaignId() {
        return this.f21821g;
    }

    public Object getJsObject(String str) {
        f fVar = this.f21818d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f21824j;
    }

    public Object getMraidObject() {
        return this.f21820f;
    }

    public Object getObject() {
        return this.f21819e;
    }

    public String getRid() {
        return this.f21823i;
    }

    public c getSignalCommunication() {
        return this.f21817c;
    }

    public d getWebViewListener() {
        return this.f21822h;
    }

    public boolean isDestoryed() {
        return this.f21827m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f21828n = motionEvent.getRawX();
                    this.f21829o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f21828n;
                    float y8 = motionEvent.getY() - this.f21829o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y8 >= 0.0f || (-1.0f) * y8 <= 48) && (y8 <= 0.0f || y8 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        f fVar = this.f21818d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f21827m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.f21826l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.f21825k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f21819e = null;
            if (ai.b(getContext()) == 0) {
                this.f21827m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.f21827m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.f21818d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.f21818d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f21825k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f21821g = str;
    }

    public void setLocalRequestId(String str) {
        this.f21824j = str;
    }

    public void setMraidObject(Object obj) {
        this.f21820f = obj;
    }

    public void setObject(Object obj) {
        this.f21819e = obj;
    }

    public void setRid(String str) {
        this.f21823i = str;
    }

    public void setSignalCommunication(c cVar) {
        this.f21817c = cVar;
        cVar.a(this);
    }

    public void setTempTypeForMetrics(int i8) {
        this.f21826l = i8;
    }

    public void setWebViewChromeClient(k kVar) {
        this.f21816b = kVar;
        setWebChromeClient(kVar);
    }

    public void setWebViewListener(d dVar) {
        this.f21822h = dVar;
        k kVar = this.f21816b;
        if (kVar != null) {
            kVar.a(dVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f21816b == null) {
            this.f21816b = new k(this);
        }
        setWebViewChromeClient(this.f21816b);
        l lVar = new l();
        this.mWebViewClient = lVar;
        setWebViewClient(lVar);
        if (this.f21817c == null) {
            c iVar = new i(this.f21714a);
            this.f21817c = iVar;
            setSignalCommunication(iVar);
        }
        this.f21818d = new f(this.f21714a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21827m = false;
        this.f21828n = 0.0f;
        this.f21829o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f21827m = false;
        this.f21828n = 0.0f;
        this.f21829o = 0.0f;
    }
}
