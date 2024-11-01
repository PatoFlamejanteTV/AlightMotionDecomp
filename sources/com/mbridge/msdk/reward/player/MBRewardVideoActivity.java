package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.b.c;
import com.mbridge.msdk.videocommon.download.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* renamed from: A, reason: collision with root package name */
    private boolean f22919A;

    /* renamed from: I, reason: collision with root package name */
    private String f22927I;

    /* renamed from: J, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f22928J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f22930L;

    /* renamed from: a, reason: collision with root package name */
    private String f22933a;

    /* renamed from: b, reason: collision with root package name */
    private String f22934b;

    /* renamed from: c, reason: collision with root package name */
    private String f22935c;

    /* renamed from: d, reason: collision with root package name */
    private c f22936d;

    /* renamed from: h, reason: collision with root package name */
    private int f22940h;

    /* renamed from: i, reason: collision with root package name */
    private int f22941i;

    /* renamed from: j, reason: collision with root package name */
    private int f22942j;

    /* renamed from: m, reason: collision with root package name */
    private h f22945m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f22946n;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f22949q;

    /* renamed from: r, reason: collision with root package name */
    private CampaignEx f22950r;

    /* renamed from: s, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f22951s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f22952t;

    /* renamed from: u, reason: collision with root package name */
    private MBTempContainer f22953u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeBTContainer f22954v;

    /* renamed from: w, reason: collision with root package name */
    private WindVaneWebView f22955w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f22956x;

    /* renamed from: y, reason: collision with root package name */
    private String f22957y;

    /* renamed from: z, reason: collision with root package name */
    private String f22958z;

    /* renamed from: e, reason: collision with root package name */
    private int f22937e = 2;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22938f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22939g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22943k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22944l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22947o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22948p = false;

    /* renamed from: B, reason: collision with root package name */
    private int f22920B = 1;

    /* renamed from: C, reason: collision with root package name */
    private int f22921C = 0;

    /* renamed from: D, reason: collision with root package name */
    private int f22922D = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f22923E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f22924F = 0;

    /* renamed from: G, reason: collision with root package name */
    private int f22925G = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f22926H = 0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f22929K = false;

    /* renamed from: M, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f22931M = new com.mbridge.msdk.video.dynview.e.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.1
        @Override // com.mbridge.msdk.video.dynview.e.a
        public final void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f22937e = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int intValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f22952t != null && MBRewardVideoActivity.this.f22952t.size() > 0 && intValue >= 1) {
                    MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                    mBRewardVideoActivity.f22950r = (CampaignEx) mBRewardVideoActivity.f22952t.get(intValue);
                    MBRewardVideoActivity.b(MBRewardVideoActivity.this);
                    int i8 = intValue - 1;
                    if (MBRewardVideoActivity.this.f22952t.get(i8) != null) {
                        MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                        MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f22952t.get(i8)).getVideoLength());
                    }
                    MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.this.f22950r.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f22950r.getVideoCompleteTime(), MBRewardVideoActivity.this.f22920B));
                    MBRewardVideoActivity.this.f22950r.setShowIndex(MBRewardVideoActivity.this.f22920B);
                    MBRewardVideoActivity.this.f22950r.setShowType(1);
                    MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                    mBRewardVideoActivity4.a(mBRewardVideoActivity4.f22950r);
                }
            }
        }
    };

    /* renamed from: N, reason: collision with root package name */
    private d f22932N = new d() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.2
        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f22954v != null) {
                    new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f22954v, 500L);
                }
                MBRewardVideoActivity.this.f22950r = campaignEx;
                MBRewardVideoActivity.this.f22950r.setShowType(2);
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.a(mBRewardVideoActivity.f22950r);
                return;
            }
            MBRewardVideoActivity.this.a("campaign is null");
        }

        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a() {
            if (MBRewardVideoActivity.this.f22954v != null) {
                new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f22954v, 500L);
            }
            MBRewardVideoActivity.this.f22943k = true;
            MBRewardVideoActivity.this.b();
            if (MBRewardVideoActivity.this.f22953u != null) {
                MBRewardVideoActivity.this.f22953u.setNotchPadding(MBRewardVideoActivity.this.f22926H, MBRewardVideoActivity.this.f22922D, MBRewardVideoActivity.this.f22924F, MBRewardVideoActivity.this.f22923E, MBRewardVideoActivity.this.f22925G);
            }
        }
    };

    /* loaded from: classes4.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f22963a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22964b;

        /* renamed from: c, reason: collision with root package name */
        private final String f22965c;

        public a(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f22963a = list;
            this.f22964b = str;
            this.f22965c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f22963a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f22963a) {
                        if (aVar != null && aVar.l() != null) {
                            CampaignEx l8 = aVar.l();
                            try {
                                AppletModelManager.getInstance().remove(l8);
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.a("MBRewardVideoActivity", "AppletModelManager remove error", e8);
                                }
                            }
                            String str = l8.getRequestId() + l8.getId() + l8.getVideoUrlEncode();
                            j c8 = com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f22964b);
                            if (c8 != null) {
                                try {
                                    c8.b(str);
                                } catch (Exception e9) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("DownLoadManager", e9.getMessage());
                                    }
                                }
                            }
                            if (l8.getRewardTemplateMode() != null) {
                                if (!TextUtils.isEmpty(l8.getRewardTemplateMode().e())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f22964b + "_" + l8.getId() + "_" + this.f22965c + "_" + l8.getRewardTemplateMode().e());
                                    com.mbridge.msdk.videocommon.a.b(l8.getAdType(), l8);
                                }
                                if (!TextUtils.isEmpty(l8.getCMPTEntryUrl())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f22964b + "_" + this.f22965c + "_" + l8.getCMPTEntryUrl());
                                }
                                com.mbridge.msdk.videocommon.a.a.a().a(l8);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                ad.a("MBRewardVideoActivity", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f22966a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22967b;

        public b(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f22966a = list;
            this.f22967b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f22966a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f22966a) {
                        if (aVar != null && aVar.l() != null) {
                            com.mbridge.msdk.videocommon.a.a.a().a(aVar.l(), this.f22967b);
                        }
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    private void b(CampaignEx campaignEx) {
    }

    public void changeHalfScreenPadding(int i8) {
        try {
            CampaignEx campaignEx = this.f22950r;
            if (campaignEx != null && campaignEx.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackground(new ColorDrawable(0));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22953u.getLayoutParams();
                int a9 = ai.a(this, 58.0f);
                int a10 = ai.a(this, 104.0f);
                if (this.f22950r.getRewardTemplateMode().b() == 0) {
                    if (i8 == 2) {
                        layoutParams.setMargins(a10, a9, a10, a9);
                    } else {
                        layoutParams.setMargins(a9, a10, a9, a10);
                    }
                } else if (this.f22950r.getRewardTemplateMode().b() == 2) {
                    layoutParams.setMargins(a10, a9, a10, a9);
                } else {
                    layoutParams.setMargins(a9, a10, a9, a10);
                }
                this.f22953u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return v.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22953u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22954v = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f22933a);
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f22953u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f22953u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        WindVaneWebView windVaneWebView;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            Intent intent = getIntent();
            this.f22933a = intent.getStringExtra(INTENT_UNITID);
            this.f22934b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f22936d = c.b(intent.getStringExtra(INTENT_REWARD));
            this.f22935c = intent.getStringExtra(INTENT_USERID);
            this.f22937e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f22938f = intent.getBooleanExtra(INTENT_ISIV, false);
            com.mbridge.msdk.foundation.controller.c m8 = com.mbridge.msdk.foundation.controller.c.m();
            int i9 = 94;
            if (this.f22938f) {
                i8 = 287;
            } else {
                i8 = 94;
            }
            m8.b(i8);
            this.f22939g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.f22958z = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.f22929K = booleanExtra;
            if (booleanExtra) {
                this.f22945m = MBridgeGlobalCommon.showRewardListener;
            } else {
                this.f22945m = com.mbridge.msdk.reward.b.a.f22789f.get(this.f22933a);
            }
            if (this.f22938f) {
                this.f22940h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f22941i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f22942j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.f22943k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.f22951s = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f22933a);
            this.f22952t = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f22933a);
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (findLayout < 0) {
                a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            if (TextUtils.isEmpty(this.f22933a)) {
                a("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            if (this.f22945m == null) {
                a("showRewardListener is null");
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVar = RewardUnitCacheManager.getInstance().get(this.f22934b, this.f22933a);
            this.f22946n = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22933a);
                this.f22946n = a9;
                if (a9 == null) {
                    this.f22946n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22933a, this.f22938f);
                }
            }
            com.mbridge.msdk.videocommon.d.c cVar2 = this.f22946n;
            if (cVar2 != null) {
                this.f22936d.a(cVar2.m());
                this.f22936d.a(this.f22946n.n());
            }
            c cVar3 = this.f22936d;
            if (cVar3 != null && cVar3.b() <= 0) {
                this.f22936d.a(1);
            }
            int a10 = v.a(this, "mbridge_reward_activity_open", "anim");
            int a11 = v.a(this, "mbridge_reward_activity_stay", "anim");
            if (a10 > 1 && a11 > 1) {
                overridePendingTransition(a10, a11);
            }
            if (bundle != null) {
                try {
                    this.f22948p = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            ad.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f22943k);
            if (!this.f22943k) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f22951s;
                if (list2 != null && list2.size() > 0) {
                    this.f22949q = this.f22951s.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f22949q;
                if (aVar != null) {
                    this.f22950r = aVar.l();
                    this.f22949q.e(true);
                    this.f22949q.f(false);
                    CampaignEx campaignEx = this.f22950r;
                    if (campaignEx != null) {
                        this.f22927I = campaignEx.getCurrentLocalRid();
                        this.f22950r.setShowIndex(1);
                        this.f22950r.setShowType(1);
                        com.mbridge.msdk.reward.b.a.f22786b = this.f22950r.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22950r.getMaitve(), this.f22950r.getMaitve_src());
                    }
                }
                if (this.f22949q == null || this.f22950r == null || this.f22936d == null) {
                    a("data empty error");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f22950r);
                b(arrayList);
                b();
                if (!com.mbridge.msdk.f.b.a()) {
                    a();
                    return;
                }
                return;
            }
            b(this.f22952t);
            this.f22957y = "";
            List<CampaignEx> list3 = this.f22952t;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx2 = this.f22952t.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.f22957y = campaignEx2.getRequestId();
                this.f22927I = campaignEx2.getCurrentLocalRid();
                com.mbridge.msdk.reward.b.a.f22786b = campaignEx2.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx2.getMaitve(), campaignEx2.getMaitve_src());
            }
            a.C0440a a12 = com.mbridge.msdk.videocommon.a.a(this.f22933a + "_" + this.f22957y + "_" + str);
            com.mbridge.msdk.videocommon.download.a aVar2 = null;
            if (a12 != null) {
                windVaneWebView = a12.a();
            } else {
                windVaneWebView = null;
            }
            this.f22955w = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.f22949q == null && (list = this.f22951s) != null && list.size() > 0) {
                    this.f22949q = this.f22951s.get(0);
                }
                if (this.f22949q == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (this.f22938f) {
                        i9 = 287;
                    }
                    String str2 = this.f22933a;
                    boolean z8 = this.f22939g;
                    j c8 = bVar2.c(str2);
                    if (c8 != null) {
                        aVar2 = c8.b(i9, z8);
                    }
                    this.f22949q = aVar2;
                }
                com.mbridge.msdk.videocommon.download.a aVar3 = this.f22949q;
                if (aVar3 != null) {
                    this.f22950r = aVar3.l();
                    this.f22949q.e(true);
                    this.f22949q.f(false);
                }
                if (this.f22949q != null && this.f22950r != null && this.f22936d != null) {
                    this.f22943k = false;
                    List<CampaignEx> a13 = com.mbridge.msdk.videocommon.a.a.a().a(this.f22952t);
                    if (a13 == null) {
                        a("no available campaign");
                        return;
                    }
                    int size = a13.size();
                    if (size == 0) {
                        a("no available campaign");
                        return;
                    }
                    if (a13.get(0) != null && (this.f22929K || a13.get(0).isDynamicView())) {
                        if (size == 1) {
                            CampaignEx campaignEx3 = a13.get(0);
                            this.f22950r = campaignEx3;
                            if (campaignEx3 != null) {
                                this.f22927I = campaignEx3.getCurrentLocalRid();
                                this.f22950r.setCampaignIsFiltered(true);
                            }
                            a(this.f22950r);
                        } else {
                            a(a13);
                        }
                    } else {
                        b();
                    }
                }
                a("data empty error");
                return;
            }
            c();
            if (!com.mbridge.msdk.f.b.a()) {
                a();
            }
        } catch (Throwable th) {
            b(this.f22952t);
            a("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000151", this.f22950r);
        try {
            h hVar = this.f22945m;
            if (hVar instanceof com.mbridge.msdk.video.bt.module.b.b) {
                com.mbridge.msdk.video.bt.module.b.b bVar = (com.mbridge.msdk.video.bt.module.b.b) hVar;
                if (!bVar.f23209b && !bVar.f23210c) {
                    hVar.a(this.f22928J, "show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        com.mbridge.msdk.video.module.b.b.a(this.f22933a);
        try {
            List<CampaignEx> list = this.f22952t;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f22952t.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            CampaignEx campaignEx = this.f22950r;
            if (campaignEx != null) {
                c(campaignEx);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22953u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22954v = null;
        }
        this.f22931M = null;
        this.f22932N = null;
        com.mbridge.msdk.foundation.d.b.a().c(this.f22933a + "_1");
        com.mbridge.msdk.foundation.d.b.a().c(this.f22933a + "_2");
        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f22951s, this.f22933a, this.f22957y));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f20403c) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new b(this.f22933a, this.f22951s));
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f22948p);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (com.mbridge.msdk.foundation.d.b.f20403c) {
            return;
        }
        new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.4
            @Override // com.mbridge.msdk.foundation.d.a
            public final void a() {
                MBRewardVideoActivity.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void b() {
                MBRewardVideoActivity.this.onResume();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void a(String str) {
                MBRewardVideoActivity.this.onResume();
            }
        };
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f22950r.setCampaignUnitId(this.f22933a);
            com.mbridge.msdk.foundation.d.b.a().a(this.f22933a + "_1", this.f22950r);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f22952t;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f22952t.get(0);
                campaignEx.setCampaignUnitId(this.f22933a);
                com.mbridge.msdk.foundation.d.b.a().a(this.f22933a + "_1", campaignEx);
            }
        }
        if (!this.f22919A) {
            com.mbridge.msdk.foundation.d.b.a().a(this.f22933a + "_1", 1);
            com.mbridge.msdk.foundation.d.b.a().c(this.f22933a + "_2");
            this.f22919A = true;
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(v.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i8, int i9, int i10, int i11, int i12) {
        this.f22922D = i9;
        this.f22924F = i10;
        this.f22923E = i11;
        this.f22925G = i12;
        this.f22926H = i8;
        MBTempContainer mBTempContainer = this.f22953u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i8, i9, i10, i11, i12);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22954v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i8, i9, i10, i11, i12);
        }
        com.mbridge.msdk.video.dynview.a.a.f23236e = i8;
        com.mbridge.msdk.video.dynview.a.a.f23232a = i9;
        com.mbridge.msdk.video.dynview.a.a.f23233b = i10;
        com.mbridge.msdk.video.dynview.a.a.f23234c = i11;
        com.mbridge.msdk.video.dynview.a.a.f23235d = i12;
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i8 = mBRewardVideoActivity.f22920B;
        mBRewardVideoActivity.f22920B = i8 + 1;
        return i8;
    }

    private void c() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f22954v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            a("env error");
        }
        this.f22954v.setVisibility(0);
        com.mbridge.msdk.video.bt.module.a.a d8 = d();
        this.f22956x = d8;
        this.f22954v.setBTContainerCallback(d8);
        this.f22954v.setShowRewardVideoListener(this.f22945m);
        this.f22954v.setChoiceOneCallback(this.f22932N);
        this.f22954v.setCampaigns(this.f22952t);
        this.f22954v.setCampaignDownLoadTasks(this.f22951s);
        this.f22954v.setRewardUnitSetting(this.f22946n);
        this.f22954v.setUnitId(this.f22933a);
        this.f22954v.setPlacementId(this.f22934b);
        this.f22954v.setUserId(this.f22935c);
        this.f22954v.setActivity(this);
        CampaignEx campaignEx = this.f22950r;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f22952t.get(0) != null && (rewardPlus = this.f22952t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f22936d = cVar;
        }
        this.f22954v.setReward(this.f22936d);
        this.f22954v.setIVRewardEnable(this.f22940h, this.f22941i, this.f22942j);
        this.f22954v.setIV(this.f22938f);
        this.f22954v.setMute(this.f22937e);
        this.f22954v.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.f22954v.setDeveloperExtraData(this.f22958z);
        this.f22954v.init(this);
        this.f22954v.onCreate(this.f22929K);
        if (!com.mbridge.msdk.f.b.a() || (list = this.f22952t) == null || list.size() <= 0 || this.f22952t.get(0) == null) {
            return;
        }
        b(this.f22952t.get(0));
    }

    private com.mbridge.msdk.video.bt.module.a.a d() {
        if (this.f22956x == null) {
            this.f22956x = new com.mbridge.msdk.video.bt.module.a.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.3
                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a() {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(MBRewardVideoActivity.this.f22928J);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.b(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, c cVar) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(MBRewardVideoActivity.this.f22928J, z8, cVar);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, int i8) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(z8, i8);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(MBRewardVideoActivity.this.f22928J, str);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(z8, str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(int i8, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22945m != null) {
                        MBRewardVideoActivity.this.f22945m.a(i8, str, str2);
                    }
                }
            };
        }
        return this.f22956x;
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i8) {
        int i9 = mBRewardVideoActivity.f22921C - i8;
        mBRewardVideoActivity.f22921C = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f22953u = mBTempContainer;
        if (mBTempContainer == null) {
            a("env error");
        }
        List<CampaignEx> list3 = this.f22952t;
        if (list3 != null && list3.size() > 0 && this.f22952t.get(0).isDynamicView()) {
            new com.mbridge.msdk.video.dynview.h.b().c(this.f22953u, 500L);
        } else {
            this.f22953u.setVisibility(0);
        }
        changeHalfScreenPadding(-1);
        this.f22953u.setActivity(this);
        this.f22953u.setBidCampaign(this.f22939g);
        this.f22953u.setBigOffer(this.f22943k);
        this.f22953u.setUnitId(this.f22933a);
        this.f22953u.setCampaign(this.f22950r);
        if (this.f22950r.getDynamicTempCode() == 5 && (list2 = this.f22952t) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f22953u.removeAllViews();
            this.f22953u.setCampOrderViewData(this.f22952t, this.f22921C);
            this.f22953u.setCamPlayOrderCallback(this.f22931M, this.f22920B);
        }
        this.f22953u.setCampaignDownLoadTask(this.f22949q);
        this.f22953u.setIV(this.f22938f);
        CampaignEx campaignEx2 = this.f22950r;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
            this.f22953u.setIVRewardEnable(0, 0, 0);
        } else {
            this.f22953u.setIVRewardEnable(this.f22940h, this.f22941i, this.f22942j);
        }
        this.f22953u.setMute(this.f22937e);
        CampaignEx campaignEx3 = this.f22950r;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f22952t) != null && list.size() > 0 && this.f22952t.get(0) != null && (rewardPlus = this.f22952t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f22936d = cVar;
        }
        this.f22953u.setReward(this.f22936d);
        this.f22953u.setRewardUnitSetting(this.f22946n);
        this.f22953u.setPlacementId(this.f22934b);
        this.f22953u.setUserId(this.f22935c);
        this.f22953u.setShowRewardListener(this.f22945m);
        this.f22953u.setDeveloperExtraData(this.f22958z);
        this.f22953u.init(this);
        this.f22953u.onCreate();
        if (!com.mbridge.msdk.f.b.a() || (campaignEx = this.f22950r) == null) {
            return;
        }
        b(campaignEx);
    }

    private void a() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable a9 = com.mbridge.msdk.foundation.controller.c.m().a(this.f22933a, this.f22938f ? 287 : 94);
            if (a9 != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                ai.a(imageView, a9, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private void a(List<CampaignEx> list) {
        int i8;
        if (list == null) {
            a("no available campaign");
            return;
        }
        if (list.size() == 0) {
            a("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            i8 = list.get(0).getDynamicTempCode();
            this.f22927I = list.get(0).getCurrentLocalRid();
        } else {
            i8 = 0;
        }
        if (i8 != 5) {
            c();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.f22921C += campaignEx.getVideoLength();
            }
        }
        CampaignEx campaignEx2 = list.get(0);
        if (campaignEx2 != null) {
            int a9 = a(campaignEx2.getVideoCompleteTime(), this.f22920B);
            this.f22950r = campaignEx2;
            campaignEx2.setCampaignIsFiltered(true);
            this.f22920B = 1;
            this.f22950r.setVideoCompleteTime(a9);
            this.f22950r.setShowIndex(this.f22920B);
            this.f22950r.setShowType(1);
            a(this.f22950r);
            return;
        }
        a("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx) {
        CampaignEx l8;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f22951s;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f22951s) {
                    if (aVar != null && (l8 = aVar.l()) != null && TextUtils.equals(l8.getId(), campaignEx.getId()) && TextUtils.equals(l8.getRequestId(), campaignEx.getRequestId())) {
                        this.f22949q = aVar;
                    }
                }
            }
            this.f22943k = true;
            b();
            MBTempContainer mBTempContainer = this.f22953u;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.f22926H, this.f22922D, this.f22924F, this.f22923E, this.f22925G);
            }
        } catch (Exception e8) {
            ad.b("MBRewardVideoActivity", e8.getMessage());
            a("more offer to one offer exception");
        }
    }

    private void c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getIconUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ad.b("MBRewardVideoActivity", str);
        b(this.f22952t);
        h hVar = this.f22945m;
        if (hVar != null) {
            hVar.a(this.f22928J, str);
        }
        finish();
    }

    private void b(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.f22930L) {
            return;
        }
        if (list == null) {
            try {
                if (this.f22943k) {
                    list = this.f22952t;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f22951s;
                    if (list2 != null && list2.get(0) != null && this.f22951s.get(0).l() != null) {
                        list.add(this.f22951s.get(0).l());
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        String str = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            str = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f22928J = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.f22928J == null) {
            this.f22928J = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22933a);
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f22939g ? 1 : 0));
            dVar.a("adtp", Integer.valueOf(this.f22938f ? 287 : 94));
            dVar.a("lrid", this.f22927I);
            dVar.a("his_reason", "show campaign is null");
            this.f22928J.a("2000129", dVar);
        }
        if (list != null) {
            this.f22928J.b(list);
        }
        this.f22930L = true;
        com.mbridge.msdk.reward.c.a.a.a().a("2000129", this.f22928J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i8, int i9) {
        List<CampaignEx> list = this.f22952t;
        if (list == null || list.size() == 0) {
            return i8;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f22952t.size(); i12++) {
            if (this.f22952t.get(0) != null) {
                if (i12 == 0) {
                    i11 = this.f22952t.get(0).getVideoCompleteTime();
                }
                i10 += this.f22952t.get(i12).getVideoLength();
            }
        }
        if (i9 == 1) {
            if (i8 == 0) {
                if (i10 >= 45) {
                    return 45;
                }
            } else if (i10 > i8) {
                if (i8 > 45) {
                    return 45;
                }
                return i8;
            }
            return i10;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i9 - 1; i14++) {
            if (this.f22952t.get(i14) != null) {
                i13 += this.f22952t.get(i14).getVideoLength();
            }
        }
        if (i11 > i13) {
            return i11 - i13;
        }
        return 0;
    }
}
