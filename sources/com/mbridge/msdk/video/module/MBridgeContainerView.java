package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.dynview.moffer.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.module.a.a.k;
import com.mbridge.msdk.video.module.a.a.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {

    /* renamed from: A, reason: collision with root package name */
    private int f23523A;

    /* renamed from: B, reason: collision with root package name */
    private int f23524B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f23525C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f23526D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f23527E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f23528F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23529G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23530H;

    /* renamed from: I, reason: collision with root package name */
    private int f23531I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f23532J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f23533K;

    /* renamed from: L, reason: collision with root package name */
    private int f23534L;

    /* renamed from: M, reason: collision with root package name */
    private int f23535M;

    /* renamed from: N, reason: collision with root package name */
    private int f23536N;

    /* renamed from: O, reason: collision with root package name */
    private int f23537O;

    /* renamed from: P, reason: collision with root package name */
    private int f23538P;

    /* renamed from: Q, reason: collision with root package name */
    private String f23539Q;

    /* renamed from: R, reason: collision with root package name */
    private b f23540R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f23541S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f23542T;

    /* renamed from: U, reason: collision with root package name */
    private List<CampaignEx> f23543U;

    /* renamed from: n, reason: collision with root package name */
    private MBridgePlayableView f23544n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickCTAView f23545o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeClickMiniCardView f23546p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeNativeEndCardView f23547q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeH5EndCardView f23548r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVastEndCardView f23549s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeLandingPageView f23550t;

    /* renamed from: u, reason: collision with root package name */
    private MBridgeVideoEndCoverView f23551u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeAlertWebview f23552v;

    /* renamed from: w, reason: collision with root package name */
    private MBridgeOrderCampView f23553w;

    /* renamed from: x, reason: collision with root package name */
    private String f23554x;

    /* renamed from: y, reason: collision with root package name */
    private int f23555y;

    /* renamed from: z, reason: collision with root package name */
    private int f23556z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f23556z = 1;
        this.f23523A = 1;
        this.f23524B = 1;
        this.f23525C = false;
        this.f23526D = false;
        this.f23527E = false;
        this.f23528F = true;
        this.f23529G = false;
        this.f23530H = false;
        this.f23532J = false;
        this.f23533K = false;
        this.f23541S = false;
        this.f23542T = false;
        this.f23543U = new ArrayList();
    }

    private void b() {
        if (this.f23548r == null) {
            a(this.f23540R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f23532J = true;
            addView(this.f23548r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f23548r.excuteTask();
            this.f23548r.setNotchValue(this.f23539Q, this.f23534L, this.f23535M, this.f23536N, this.f23537O);
            n nVar = new n();
            nVar.f(this.f23494b.getRequestId());
            nVar.g(this.f23494b.getRequestIdNotice());
            nVar.e(this.f23494b.getId());
            nVar.d(this.f23494b.isMraid() ? n.f20587a : n.f20588b);
            com.mbridge.msdk.foundation.same.report.h.d(nVar, this.f23493a, this.f23554x);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23548r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f23548r.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f23548r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f23554x);
        }
    }

    private void e() {
        this.f23556z = 1;
        if (this.f23547q == null) {
            a(this.f23540R, 2);
        }
        addView(this.f23547q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23547q.notifyShowListener();
        this.f23542T = true;
        bringToFront();
    }

    private void f() {
        if (this.f23546p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f23527E && this.f23528F) {
            this.f23528F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f23546p, layoutParams);
    }

    private void g() {
        if (this.f23552v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f23493a);
            this.f23552v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f23554x);
            this.f23552v.setCampaign(this.f23494b);
        }
        this.f23552v.preLoadData(this.f23540R);
    }

    private void h() {
        this.f23526D = false;
        this.f23542T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i8 = 0;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i8);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i8++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            r11 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23494b
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r0.getendcard_url()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 404(0x194, float:5.66E-43)
            if (r1 != 0) goto L27
            java.lang.String r1 = "ecid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)     // Catch: java.lang.Throwable -> L1d
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1d
            r7 = r2
            goto L29
        L1d:
            r0 = move-exception
            java.lang.String r1 = "MBridgeBaseView"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L27:
            r7 = 404(0x194, float:5.66E-43)
        L29:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView
            android.content.Context r4 = r11.f23493a
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23494b
            int r1 = r1.getAdSpaceT()
            r2 = 2
            if (r1 != r2) goto L39
            r1 = 1
            r8 = 1
            goto L3b
        L39:
            r1 = 0
            r8 = 0
        L3b:
            int r9 = r11.f23504l
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23494b
            int r10 = r1.getMof_tplid()
            r5 = 0
            r6 = 1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.f23547q = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23494b
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L6b
            com.mbridge.msdk.video.module.a.a r0 = r11.f23497e
            if (r0 == 0) goto L63
            boolean r1 = r0 instanceof com.mbridge.msdk.video.module.a.a.k
            if (r1 == 0) goto L63
            com.mbridge.msdk.video.module.a.a.k r0 = (com.mbridge.msdk.video.module.a.a.k) r0
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23494b
            r0.a(r1)
        L63:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f23547q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23494b
            r0.setCampaign(r1)
            goto L72
        L6b:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f23547q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f23494b
            r0.setCampaign(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeContainerView.i():void");
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f23543U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.f23547q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23550t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f23546p.resizeMiniCard(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f23525C;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView == null) {
            return this.f23544n;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f23494b.isDynamicView() || !TextUtils.isEmpty(this.f23494b.getendcard_url())) {
            return null;
        }
        int size = this.f23543U.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (this.f23543U.get(i9) != null && this.f23543U.get(i9).getId() == this.f23494b.getId()) {
                    i8 = i9 - 1;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        if (i8 < 0 || i8 >= size || this.f23543U.get(i8) == null) {
            return null;
        }
        return this.f23543U.get(i8);
    }

    public boolean getShowingTransparent() {
        return this.f23527E;
    }

    public String getUnitID() {
        return this.f23554x;
    }

    public int getVideoInteractiveType() {
        return this.f23555y;
    }

    public int getVideoSkipTime() {
        return this.f23531I;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f23532J) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f23541S && !this.f23542T) {
                h();
                this.f23541S = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f23552v;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f23552v);
                MBridgeClickCTAView mBridgeClickCTAView = this.f23545o;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.f23497e.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.f23497e.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f23526D;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23544n, this.f23545o, this.f23546p, this.f23547q, this.f23548r, this.f23549s, this.f23550t, this.f23551u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f23547q == null && this.f23549s == null) {
            if (this.f23550t != null) {
                this.f23497e.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.f23497e.a(104, "");
        try {
            a.a().b();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f23526D) {
            this.f23497e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23544n, this.f23546p, this.f23548r, this.f23552v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.f23540R = bVar;
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f23544n == null) {
                    this.f23544n = new MBridgePlayableView(this.f23493a);
                }
                this.f23544n.setCloseDelayShowTime(this.f23523A);
                this.f23544n.setPlayCloseBtnTm(this.f23524B);
                this.f23544n.setCampaign(this.f23494b);
                this.f23544n.setNotifyListener(new i(this.f23497e) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i8, Object obj) {
                        int i9;
                        super.a(i8, obj);
                        if (i8 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.f23494b.getRequestId());
                            nVar.g(MBridgeContainerView.this.f23494b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.f23494b.getId());
                            if (MBridgeContainerView.this.f23494b.isMraid()) {
                                i9 = n.f20587a;
                            } else {
                                i9 = n.f20588b;
                            }
                            nVar.d(i9);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            com.mbridge.msdk.foundation.same.report.h.d(nVar, mBridgeContainerView2.f23493a, mBridgeContainerView2.f23554x);
                        }
                    }
                });
                this.f23544n.preLoadData(bVar);
            } else {
                b(this.f23555y);
                if (this.f23494b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f23494b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f23494b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.f23494b.getendcard_url())) {
                        try {
                            String a9 = ao.a(this.f23494b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a9) && Integer.parseInt(a9) == 1) {
                                a.a().a(this.f23494b, 2);
                            }
                        } catch (Exception e8) {
                            ad.b(MBridgeBaseView.TAG, e8.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f23494b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i8) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i8);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f23548r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23550t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23547q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f23547q.release();
        }
        if (this.f23497e != null) {
            this.f23497e = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i8, i9);
            this.f23546p.setRadius(i10);
            removeAllViews();
            setMatchParent();
            this.f23542T = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i8) {
        this.f23523A = i8;
    }

    public void setEndscreenType(int i8) {
        this.f23556z = i8;
    }

    public void setJSFactory(b bVar) {
        this.f23540R = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f23546p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i8)));
        this.f23538P = i8;
        this.f23534L = i9;
        this.f23535M = i10;
        this.f23536N = i11;
        this.f23537O = i12;
        this.f23539Q = r.a(i8, i9, i10, i11, i12);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23547q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f23582q != null) {
            mBridgeH5EndCardView.setNotchValue(this.f23539Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f23548r.f23582q, "oncutoutfetched", Base64.encodeToString(this.f23539Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView != null && mBridgePlayableView.f23582q != null) {
            mBridgePlayableView.setNotchValue(this.f23539Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f23544n.f23582q, "oncutoutfetched", Base64.encodeToString(this.f23539Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f23553w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i9, i10, i11, i12);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23544n, this.f23545o, this.f23546p, this.f23547q, this.f23548r, this.f23549s, this.f23550t, this.f23551u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f23546p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23547q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23547q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f23524B = i8;
    }

    public void setRewardStatus(boolean z8) {
        this.f23533K = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f23527E = z8;
    }

    public void setUnitID(String str) {
        this.f23554x = str;
    }

    public void setVideoInteractiveType(int i8) {
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a9 = com.mbridge.msdk.video.dynview.i.a.a(this.f23494b);
            if (a9 == 100) {
                this.f23555y = i8;
                return;
            } else {
                this.f23555y = a9;
                return;
            }
        }
        this.f23555y = i8;
    }

    public void setVideoSkipTime(int i8) {
        this.f23531I = i8;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f23552v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f23542T) {
            removeAllViews();
            bringToFront();
            this.f23541S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f23552v == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f23552v;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f23552v);
        }
        addView(this.f23552v);
        setBackgroundColor(0);
        this.f23552v.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i8) {
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx != null) {
            if (i8 != 1) {
                if (i8 != 100) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f23542T = true;
                                bringToFront();
                                a();
                                this.f23497e.a(117, "");
                            } else {
                                this.f23497e.a(106, "");
                            }
                        } else {
                            this.f23497e.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f23550t == null) {
                                a(this.f23540R, 4);
                            }
                            this.f23550t.setUnitId(this.f23554x);
                            this.f23550t.preLoadData(this.f23540R);
                            addView(this.f23550t);
                            this.f23542T = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f23549s == null) {
                            a(this.f23540R, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f23549s, layoutParams);
                        this.f23549s.notifyShowListener();
                        this.f23542T = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f23530H = true;
                    }
                    a(this.f23544n);
                    setMatchParent();
                    e();
                }
            } else {
                this.f23497e.a(104, "");
            }
        }
        this.f23525C = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i8, i9, i10, i11);
            this.f23546p.setRadius(i12);
            this.f23546p.setCloseVisible(8);
            this.f23546p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f23542T = true;
            bringToFront();
            f();
            if (!this.f23529G) {
                this.f23529G = true;
                this.f23497e.a(109, "");
                this.f23497e.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f23493a);
        this.f23553w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f23543U);
        com.mbridge.msdk.video.module.a.a aVar = this.f23497e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f23543U);
        }
        this.f23553w.setNotifyListener(new i(this.f23497e));
        this.f23553w.setRewarded(this.f23533K);
        this.f23553w.setNotchPadding(this.f23534L, this.f23535M, this.f23536N, this.f23537O);
        this.f23553w.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                com.mbridge.msdk.video.module.a.a aVar2 = MBridgeContainerView.this.f23497e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.f23494b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.f23494b.getVideo_end_type());
                }
            }
        });
        this.f23553w.createView(this);
    }

    public void showPlayableView() {
        if (this.f23494b != null && !this.f23530H) {
            removeAllViews();
            setMatchParent();
            if (this.f23544n == null) {
                preLoadData(this.f23540R);
            }
            addView(this.f23544n);
            MBridgePlayableView mBridgePlayableView = this.f23544n;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f23554x);
                CampaignEx campaignEx = this.f23494b;
                if (campaignEx != null && campaignEx.isMraid() && this.f23494b.getPlayable_ads_without_video() == 2) {
                    this.f23544n.setCloseVisible(0);
                }
                this.f23544n.setNotchValue(this.f23539Q, this.f23534L, this.f23535M, this.f23536N, this.f23537O);
            }
            this.f23542T = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i8) {
        CampaignEx campaignEx;
        if (this.f23494b != null) {
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f23545o;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f23545o);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f23552v;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f23494b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f23548r);
                            }
                            this.f23497e.a(112, "");
                            CampaignEx campaignEx3 = this.f23494b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f23494b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.f23493a, this.f23494b);
                            }
                            if (this.f23527E) {
                                this.f23497e.a(115, "");
                            } else {
                                this.f23542T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f23526D = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.f23525C) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23548r;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f23548r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f23546p;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f23546p);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f23545o;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.f23494b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.f23542T = true;
                            if (this.f23545o == null) {
                                b(-1);
                            }
                            if (this.f23545o != null && ((campaignEx = this.f23494b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f23545o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (!isLast() && !endCardShowing()) {
                h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f23551u;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.f23540R;
            this.f23540R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f23493a);
                this.f23551u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f23494b);
                this.f23551u.setNotifyListener(new i(this.f23497e));
                this.f23551u.preLoadData(bVar);
            }
        }
        addView(this.f23551u);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23542T = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f23544n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23548r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i8);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.f23494b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f23494b != null) {
            this.f23497e.a(122, "");
            this.f23497e.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.f23494b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23544n, this.f23546p, this.f23548r, this.f23552v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l8 = ai.l(this.f23494b.getendcard_url());
            if (isDynamicView && !l8 && !this.f23494b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f23556z == 2 && !this.f23532J) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        com.mbridge.msdk.video.module.a.a aVar;
        CampaignEx campaignEx;
        this.f23540R = bVar;
        CampaignEx campaignEx2 = this.f23494b;
        if (campaignEx2 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx2.getVideo_end_type());
            }
            if (!isLast()) {
                h();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f23549s == null) {
                        this.f23549s = new MBridgeVastEndCardView(this.f23493a);
                    }
                    this.f23549s.setCampaign(this.f23494b);
                    this.f23549s.setNotifyListener(new l(this.f23497e));
                    this.f23549s.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f23550t == null) {
                        this.f23550t = new MBridgeLandingPageView(this.f23493a);
                    }
                    this.f23550t.setCampaign(this.f23494b);
                    this.f23550t.setNotifyListener(new i(this.f23497e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f23556z == 2) {
                        boolean isDynamicView = this.f23494b.isDynamicView();
                        boolean l8 = ai.l(this.f23494b.getendcard_url());
                        if ((!isDynamicView || l8 || (campaignEx = this.f23494b) == null || campaignEx.isMraid()) && this.f23494b.getAdSpaceT() != 2) {
                            if (this.f23548r == null) {
                                this.f23548r = new MBridgeH5EndCardView(this.f23493a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.f23494b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.f23494b.getDynamicTempCode() == 5 && (aVar = this.f23497e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f23494b);
                            }
                            this.f23548r.setCampaign(this.f23494b);
                            this.f23548r.setCloseDelayShowTime(this.f23523A);
                            this.f23548r.setNotifyListener(new i(this.f23497e));
                            this.f23548r.setUnitId(this.f23554x);
                            this.f23548r.setNotchValue(this.f23539Q, this.f23534L, this.f23535M, this.f23536N, this.f23537O);
                            this.f23548r.preLoadData(bVar);
                            if (this.f23527E) {
                                return;
                            }
                            addView(this.f23548r);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.f23494b;
                    int b9 = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.f23494b.getRewardTemplateMode().b();
                    if (this.f23547q == null) {
                        if (this.f23494b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f23493a, null, false, -1, this.f23494b.getAdSpaceT() == 2, b9, this.f23494b.getMof_tplid());
                            this.f23547q = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f23494b);
                        }
                    }
                    this.f23547q.setLayout();
                    if (this.f23494b.isDynamicView()) {
                        if (a.a().a(this.f23494b.getRequestId() + "_" + this.f23494b.getId())) {
                            try {
                                a.a().a(this.f23547q, this.f23494b.getRequestId() + "_" + this.f23494b.getId(), new i(this.f23497e));
                            } catch (Exception e8) {
                                ad.b(MBridgeBaseView.TAG, e8.getMessage());
                            }
                        } else {
                            try {
                                String a9 = ao.a(this.f23494b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a9) && Integer.parseInt(a9) == 1) {
                                    a.a().a(this.f23494b, this.f23547q, new i(this.f23497e), 2);
                                }
                            } catch (Exception e9) {
                                ad.b(MBridgeBaseView.TAG, e9.getMessage());
                            }
                        }
                    }
                    this.f23547q.setUnitId(this.f23554x);
                    this.f23547q.setCloseBtnDelay(this.f23523A);
                    this.f23547q.setNotifyListener(new i(this.f23497e));
                    this.f23547q.preLoadData(bVar);
                    this.f23547q.setNotchPadding(this.f23534L, this.f23535M, this.f23536N, this.f23537O);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23556z = 1;
        this.f23523A = 1;
        this.f23524B = 1;
        this.f23525C = false;
        this.f23526D = false;
        this.f23527E = false;
        this.f23528F = true;
        this.f23529G = false;
        this.f23530H = false;
        this.f23532J = false;
        this.f23533K = false;
        this.f23541S = false;
        this.f23542T = false;
        this.f23543U = new ArrayList();
    }

    private void b(int i8) {
        if (i8 != -3) {
            if (i8 != -2) {
                if (this.f23545o == null) {
                    this.f23545o = new MBridgeClickCTAView(this.f23493a);
                }
                this.f23545o.setCampaign(this.f23494b);
                this.f23545o.setUnitId(this.f23554x);
                this.f23545o.setNotifyListener(new i(this.f23497e));
                this.f23545o.preLoadData(this.f23540R);
                return;
            }
            CampaignEx campaignEx = this.f23494b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f23546p == null) {
                this.f23546p = new MBridgeClickMiniCardView(this.f23493a);
            }
            this.f23546p.setCampaign(this.f23494b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23546p;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.f23497e));
            this.f23546p.preLoadData(this.f23540R);
            setMatchParent();
            f();
            h();
        }
    }
}
