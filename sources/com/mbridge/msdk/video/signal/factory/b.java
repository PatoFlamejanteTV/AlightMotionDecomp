package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.i;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.a.m;
import com.mbridge.msdk.video.signal.a.n;
import com.mbridge.msdk.video.signal.a.o;
import com.mbridge.msdk.video.signal.a.q;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f24178h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f24179i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f24180j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f24181k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f24182l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f24183m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0438a f24184n;

    /* renamed from: o, reason: collision with root package name */
    private String f24185o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f24186p;

    public b(Activity activity) {
        this.f24178h = activity;
    }

    public final void a(k kVar) {
        this.f24172b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f24179i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f24171a == null) {
            this.f24171a = new i(webView);
        }
        return this.f24171a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f24181k;
        if (mBridgeContainerView != null && (activity = this.f24178h) != null) {
            if (this.f24176f == null) {
                this.f24176f = new o(activity, mBridgeContainerView);
            }
            return this.f24176f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f24178h != null && this.f24183m != null) {
            if (this.f24177g == null) {
                this.f24177g = new j(this.f24178h, this.f24183m);
            }
            return this.f24177g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f24178h;
        if (activity != null && (campaignEx = this.f24182l) != null) {
            if (this.f24172b == null) {
                this.f24172b = new k(activity, campaignEx);
            }
            if (this.f24182l.getDynamicTempCode() == 5 && (list = this.f24186p) != null) {
                d dVar = this.f24172b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.f24172b.a(this.f24178h);
            this.f24172b.a(this.f24185o);
            this.f24172b.a(this.f24184n);
            return this.f24172b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f24181k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f24175e == null) {
            this.f24175e = new m(mBridgeContainerView);
        }
        return this.f24175e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f24179i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f24174d == null) {
            this.f24174d = new n(webView);
        }
        return this.f24174d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f24180j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f24173c == null) {
            this.f24173c = new q(mBridgeVideoView);
        }
        return this.f24173c;
    }

    public final void a(List<CampaignEx> list) {
        this.f24186p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f24178h = activity;
        this.f24183m = mBridgeBTContainer;
        this.f24179i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0438a interfaceC0438a) {
        this.f24178h = activity;
        this.f24179i = webView;
        this.f24180j = mBridgeVideoView;
        this.f24181k = mBridgeContainerView;
        this.f24182l = campaignEx;
        this.f24184n = interfaceC0438a;
        this.f24185o = mBridgeVideoView.getUnitId();
    }
}
