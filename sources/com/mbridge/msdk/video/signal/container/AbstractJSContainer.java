package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f24154a;

    /* renamed from: b, reason: collision with root package name */
    private int f24155b;

    /* renamed from: i, reason: collision with root package name */
    protected Activity f24156i;

    /* renamed from: j, reason: collision with root package name */
    protected String f24157j;

    /* renamed from: k, reason: collision with root package name */
    protected String f24158k;

    /* renamed from: l, reason: collision with root package name */
    protected c f24159l;

    /* renamed from: m, reason: collision with root package name */
    protected String f24160m;

    /* renamed from: n, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f24161n;

    /* renamed from: o, reason: collision with root package name */
    protected String f24162o;

    /* renamed from: p, reason: collision with root package name */
    protected int f24163p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f24164q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f24165r;

    /* renamed from: s, reason: collision with root package name */
    protected int f24166s;

    /* renamed from: t, reason: collision with root package name */
    protected int f24167t;

    /* renamed from: u, reason: collision with root package name */
    protected int f24168u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f24169v;

    /* renamed from: w, reason: collision with root package name */
    protected IJSFactory f24170w;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f24154a = 0;
        this.f24155b = 1;
        this.f24163p = 2;
        this.f24164q = false;
        this.f24165r = false;
        this.f24169v = false;
        this.f24170w = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj) {
        g.a().a(obj, a(this.f24154a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0440a a9 = com.mbridge.msdk.videocommon.a.a(this.f24164q ? 287 : 94, campaignEx);
        if (a9 != null && a9.c()) {
            WindVaneWebView a10 = a9.a();
            if (a10.getObject() instanceof k) {
                return (k) a10.getObject();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int c(CampaignEx campaignEx) {
        k b9 = b(campaignEx);
        if (b9 != null) {
            return b9.l();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f24170w.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f24170w.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f24170w.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f24170w.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.f24170w.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f24170w.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f24170w.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f24158k;
    }

    public String getUnitId() {
        return this.f24157j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().b()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().b()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().b()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.d.b.f20403c) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().b()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f24170w = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f24156i = activity;
    }

    public void setBidCampaign(boolean z8) {
        this.f24165r = z8;
    }

    public void setBigOffer(boolean z8) {
        this.f24169v = z8;
    }

    public void setIV(boolean z8) {
        this.f24164q = z8;
    }

    public void setIVRewardEnable(int i8, int i9, int i10) {
        this.f24166s = i8;
        this.f24167t = i9;
        this.f24168u = i10;
    }

    public void setMute(int i8) {
        this.f24163p = i8;
    }

    public void setPlacementId(String str) {
        this.f24158k = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.b.c cVar) {
        this.f24161n = cVar;
    }

    public void setRewardId(String str) {
        this.f24162o = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f24159l = cVar;
    }

    public void setUnitId(String str) {
        this.f24157j = str;
    }

    public void setUserId(String str) {
        this.f24160m = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Object obj, String str) {
        g.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private String a(int i8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i8);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    private boolean b(int i8) {
        boolean z8 = true;
        try {
            if (i8 == 1) {
                this.f24156i.setRequestedOrientation(12);
            } else {
                if (i8 != 2) {
                    z8 = false;
                    return z8;
                }
                this.f24156i.setRequestedOrientation(11);
            }
            return z8;
        } catch (Throwable th) {
            ad.a("AbstractJSContainer", th.getMessage(), th);
            return false;
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24154a = 0;
        this.f24155b = 1;
        this.f24163p = 2;
        this.f24164q = false;
        this.f24165r = false;
        this.f24169v = false;
        this.f24170w = new com.mbridge.msdk.video.signal.factory.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        ad.b("AbstractJSContainer", str);
        Activity activity = this.f24156i;
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b() {
        c cVar;
        if (TextUtils.isEmpty(this.f24158k) && (cVar = this.f24159l) != null && !TextUtils.isEmpty(cVar.z())) {
            return this.f24159l.z();
        }
        return this.f24158k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (c(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : b(rewardTemplateMode.b())) || cVar == null) {
            return;
        }
        b(this.f24159l.c());
    }
}
